package g9;

import java.math.RoundingMode;
import v7.n7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (n7.b(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(n7.a(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && n7.b(d)) {
            long a2 = n7.a(d);
            if ((a2 & (a2 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(double d) {
        boolean b10;
        RoundingMode roundingMode = RoundingMode.CEILING;
        if (!(d > 0.0d && n7.b(d))) {
            throw new IllegalArgumentException("x must be positive and finite");
        }
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return c(d * 4.503599627370496E15d) - 52;
        }
        switch (b.a[roundingMode.ordinal()]) {
            case 1:
                if (!b(d)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                return !r3 ? exponent + 1 : exponent;
            case 2:
                if (!r3) {
                }
                break;
            case 3:
                r3 = !b(d);
                if (!r3) {
                }
                break;
            case 4:
                r3 = exponent < 0;
                b10 = b(d);
                r3 &= !b10;
                if (!r3) {
                }
                break;
            case 5:
                r3 = exponent >= 0;
                b10 = b(d);
                r3 &= !b10;
                if (!r3) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r3 = true;
                }
                if (!r3) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
