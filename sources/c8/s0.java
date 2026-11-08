package c8;

import java.math.RoundingMode;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class s0 {
    public static long a(long j3, long j10) {
        long j11 = j3 + j10;
        if (((j3 ^ j10) < 0) || ((j3 ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException(a8.p0.r(a8.p0.t(j3, "overflow: checkedAdd(", ", "), j10, ")"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long b(long j3, long j10, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j3 / j10;
        long j12 = j3 - (j10 * j11);
        if (j12 == 0) {
            return j11;
        }
        int i7 = ((int) ((j3 ^ j10) >> 63)) | 1;
        switch (j9.e.a[roundingMode.ordinal()]) {
            case 1:
                t0.b(j12 == 0);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i7 >= 0) {
                    return j11;
                }
                return j11 + i7;
            case 4:
                return j11 + i7;
            case 5:
                if (i7 <= 0) {
                    return j11;
                }
                return j11 + i7;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j12);
                long abs2 = abs - (Math.abs(j10) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (abs2 <= 0) {
                    return j11;
                }
                return j11 + i7;
            default:
                throw new AssertionError();
        }
    }

    public static long c(long j3, long j10) {
        t0.a(j3, "a");
        t0.a(j10, "b");
        if (j3 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j3;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
        long j11 = j3 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros2;
        while (j11 != j12) {
            long j13 = j11 - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            j11 = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return j11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long d(long j3, long j10) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3);
        if (numberOfLeadingZeros > 65) {
            return j3 * j10;
        }
        long j11 = ((j3 ^ j10) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j10 == Long.MIN_VALUE) & (j3 < 0)))) {
            long j12 = j3 * j10;
            if (j3 == 0 || j12 / j3 == j10) {
                return j12;
            }
        }
        return j11;
    }
}
