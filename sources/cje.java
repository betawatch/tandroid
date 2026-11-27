// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class cje {
    public static boolean a(double d) {
        if (hje.b(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(hje.a(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && hje.b(d)) {
            long a = hje.a(d);
            if ((a & (a - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(double d) {
        boolean b;
        RoundingMode roundingMode = RoundingMode.CEILING;
        yve.e("x must be positive and finite", d > 0.0d && hje.b(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return c(d * 4.503599627370496E15d) - 52;
        }
        switch (up3.a[roundingMode.ordinal()]) {
            case 1:
                cte.b(b(d));
                return !r2 ? exponent + 1 : exponent;
            case 2:
                if (!r2) {
                }
                break;
            case 3:
                r2 = !b(d);
                if (!r2) {
                }
                break;
            case 4:
                r2 = exponent < 0;
                b = b(d);
                r2 &= !b;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                b = b(d);
                r2 &= !b;
                if (!r2) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                lq5.f();
                return 0;
        }
    }
}
