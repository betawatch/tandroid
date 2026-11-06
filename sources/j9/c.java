package j9;

import a8.ia;
import c8.q0;
import c8.t0;
import java.math.RoundingMode;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (q0.b(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(q0.a(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && q0.b(d)) {
            long a10 = q0.a(d);
            if ((a10 & (a10 - 1)) == 0) {
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
        ia.e("x must be positive and finite", d > 0.0d && q0.b(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return c(d * 4.503599627370496E15d) - 52;
        }
        switch (b.a[roundingMode.ordinal()]) {
            case 1:
                t0.b(b(d));
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
