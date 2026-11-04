package b8;

import java.math.RoundingMode;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class xc {
    public static long a(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j10 ^ j11) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException(a1.g.r(a1.g.t(j10, "overflow: checkedAdd(", ", "), j11, ")"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long b(long j10, long j11, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        int i3 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (i9.e.a[roundingMode.ordinal()]) {
            case 1:
                yc.b(j13 == 0);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i3 >= 0) {
                    return j12;
                }
                return j12 + i3;
            case 4:
                return j12 + i3;
            case 5:
                if (i3 <= 0) {
                    return j12;
                }
                return j12 + i3;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j13);
                long abs2 = abs - (Math.abs(j11) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                        return j12;
                    }
                } else if (abs2 <= 0) {
                    return j12;
                }
                return j12 + i3;
            default:
                throw new AssertionError();
        }
    }

    public static long c(long j10, long j11) {
        yc.a(j10, "a");
        yc.a(j11, "b");
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j13 = j11 >> numberOfTrailingZeros2;
        while (j12 != j13) {
            long j14 = j12 - j13;
            long j15 = (j14 >> 63) & j14;
            long j16 = (j14 - j15) - j15;
            j13 += j15;
            j12 = j16 >> Long.numberOfTrailingZeros(j16);
        }
        return j12 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long d(long j10, long j11) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (numberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = ((j10 ^ j11) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j13 = j10 * j11;
            if (j10 == 0 || j13 / j10 == j11) {
                return j13;
            }
        }
        return j12;
    }
}
