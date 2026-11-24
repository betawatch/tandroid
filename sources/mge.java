// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class mge {
    public static boolean a(double d) {
        if (rge.b(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(rge.a(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && rge.b(d)) {
            long a = rge.a(d);
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
        jte.e("x must be positive and finite", d > 0.0d && rge.b(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return c(d * 4.503599627370496E15d) - 52;
        }
        switch (nq3.a[roundingMode.ordinal()]) {
            case 1:
                lqe.b(b(d));
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
                zo4.f();
                return 0;
        }
    }
}
