package g9;

import java.math.RoundingMode;
import v7.m7;
import v7.p7;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (m7.b(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(m7.a(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && m7.b(d)) {
            long a2 = m7.a(d);
            if ((a2 & (a2 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(double d) {
        boolean b10;
        RoundingMode roundingMode = RoundingMode.CEILING;
        t6.e("x must be positive and finite", d > 0.0d && m7.b(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return c(d * 4.503599627370496E15d) - 52;
        }
        switch (b.a[roundingMode.ordinal()]) {
            case 1:
                p7.b(b(d));
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
                b10 = b(d);
                r2 &= !b10;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                b10 = b(d);
                r2 &= !b10;
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
                throw new AssertionError();
        }
    }
}
