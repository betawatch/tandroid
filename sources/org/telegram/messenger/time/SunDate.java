package org.telegram.messenger.time;

import java.util.Calendar;
import java.util.TimeZone;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class SunDate {
    private static final double DEGRAD = 0.017453292519943295d;
    private static final double INV360 = 0.002777777777777778d;
    private static final double RADEG = 57.29577951308232d;

    private static double GMST0(double d) {
        return revolution((d * 0.985647352d) + 818.9874d);
    }

    private static double acosd(double d) {
        return Math.acos(d) * RADEG;
    }

    private static double atan2d(double d, double d10) {
        return Math.atan2(d, d10) * RADEG;
    }

    public static int[] calculateSunriseSunset(double d, double d10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        double[] dArr = new double[2];
        sunRiseSetForYear(calendar.get(1), calendar.get(2) + 1, calendar.get(5), d10, d, dArr);
        int offset = (TimeZone.getDefault().getOffset(System.currentTimeMillis()) / MediaDataController.MAX_STYLE_RUNS_COUNT) / 60;
        int i10 = ((int) (dArr[0] * 60.0d)) + offset;
        int i11 = ((int) (dArr[1] * 60.0d)) + offset;
        if (i10 < 0) {
            i10 += 1440;
        } else if (i10 > 1440) {
            i10 -= 1440;
        }
        if (i11 < 0 || i11 > 1440) {
            i11 += 1440;
        }
        return new int[]{i10, i11};
    }

    private static double cosd(double d) {
        return Math.cos(d * DEGRAD);
    }

    private static long days_since_2000_Jan_0(int i10, int i11, int i12) {
        return ((((i10 * 367) - (((((i11 + 9) / 12) + i10) * 7) / 4)) + ((i11 * 275) / 9)) + i12) - 730530;
    }

    private static double rev180(double d) {
        return d - (Math.floor((INV360 * d) + 0.5d) * 360.0d);
    }

    private static double revolution(double d) {
        return d - (Math.floor(INV360 * d) * 360.0d);
    }

    private static double sind(double d) {
        return Math.sin(d * DEGRAD);
    }

    private static int sunRiseSetForYear(int i10, int i11, int i12, double d, double d10, double[] dArr) {
        return sunRiseSetHelperForYear(i10, i11, i12, d, d10, -0.5833333333333334d, 1, dArr);
    }

    private static int sunRiseSetHelperForYear(int i10, int i11, int i12, double d, double d10, double d11, int i13, double[] dArr) {
        int i14;
        double[] dArr2 = new double[1];
        double[] dArr3 = new double[1];
        double[] dArr4 = new double[1];
        double days_since_2000_Jan_0 = (days_since_2000_Jan_0(i10, i11, i12) + 0.5d) - (d / 360.0d);
        double revolution = revolution(GMST0(days_since_2000_Jan_0) + 180.0d + d);
        sun_RA_decAtDay(days_since_2000_Jan_0, dArr2, dArr3, dArr4);
        double d12 = 12.0d;
        double rev180 = 12.0d - (rev180(revolution - dArr2[0]) / 15.0d);
        double sind = (sind(i13 != 0 ? d11 - (0.2666d / dArr4[0]) : d11) - (sind(d10) * sind(dArr3[0]))) / (cosd(d10) * cosd(dArr3[0]));
        if (sind >= 1.0d) {
            i14 = -1;
            d12 = 0.0d;
        } else if (sind <= -1.0d) {
            i14 = 1;
        } else {
            d12 = acosd(sind) / 15.0d;
            i14 = 0;
        }
        dArr[0] = rev180 - d12;
        dArr[1] = rev180 + d12;
        return i14;
    }

    private static void sun_RA_decAtDay(double d, double[] dArr, double[] dArr2, double[] dArr3) {
        double[] dArr4 = new double[1];
        sunposAtDay(d, dArr4, dArr3);
        double cosd = dArr3[0] * cosd(dArr4[0]);
        double sind = dArr3[0] * sind(dArr4[0]);
        double d10 = 23.4393d - (d * 3.563E-7d);
        double cosd2 = cosd(d10) * sind;
        double sind2 = sind * sind(d10);
        dArr[0] = atan2d(cosd2, cosd);
        dArr2[0] = atan2d(sind2, Math.sqrt((cosd2 * cosd2) + (cosd * cosd)));
    }

    private static void sunposAtDay(double d, double[] dArr, double[] dArr2) {
        double revolution = revolution((0.9856002585d * d) + 356.047d);
        double d10 = (4.70935E-5d * d) + 282.9404d;
        double d11 = 0.016709d - (d * 1.151E-9d);
        double cosd = (((cosd(revolution) * d11) + 1.0d) * RADEG * d11 * sind(revolution)) + revolution;
        double cosd2 = cosd(cosd) - d11;
        double sqrt = Math.sqrt(1.0d - (d11 * d11)) * sind(cosd);
        dArr2[0] = Math.sqrt((sqrt * sqrt) + (cosd2 * cosd2));
        double atan2d = atan2d(sqrt, cosd2) + d10;
        dArr[0] = atan2d;
        if (atan2d >= 360.0d) {
            dArr[0] = atan2d - 360.0d;
        }
    }

    private static double tand(double d) {
        return Math.tan(d * DEGRAD);
    }
}
