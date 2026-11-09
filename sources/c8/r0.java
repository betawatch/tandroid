package c8;

import java.math.RoundingMode;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class r0 {
    public static int a(int i7, int i10) {
        long j3 = i7 + i10;
        int i11 = (int) j3;
        if (j3 == ((long) i11)) {
            return i11;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i7 + ", " + i10 + ")");
    }

    public static int b(int i7, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i7 / i10;
        int i12 = i7 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i7 ^ i10) >> 31) | 1;
        switch (j9.d.a[roundingMode.ordinal()]) {
            case 1:
                t0.b(i12 == 0);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i12);
                int abs2 = abs - (Math.abs(i10) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i11;
                }
                if (abs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static int c(int i7) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i7 <= 0) {
            throw new IllegalArgumentException(jg.g.k(i7, "x (", ") must be > 0"));
        }
        switch (j9.d.a[roundingMode.ordinal()]) {
            case 1:
                t0.b((i7 > 0) & (((i7 + (-1)) & i7) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i7 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i7))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i7);
    }
}
