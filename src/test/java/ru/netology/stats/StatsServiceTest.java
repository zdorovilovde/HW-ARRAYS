package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = statsService.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgSumTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = statsService.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSumTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;
        long actual = statsService.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSumTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = statsService.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgMaxSumTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = statsService.lessThanAvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMaxSumTest() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = statsService.aboveThanAvgSales(sales);
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
}