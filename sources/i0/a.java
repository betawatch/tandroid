package i0;

import android.graphics.Color;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a {
    public static final ThreadLocal a = new ThreadLocal();

    public static int a(float[] fArr) {
        int round;
        int round2;
        int i3 = 0;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float abs = (1.0f - Math.abs((f12 * 2.0f) - 1.0f)) * f11;
        float f13 = f12 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f10 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f10) / 60) {
            case 0:
                i3 = Math.round((abs + f13) * 255.0f);
                round = Math.round((abs2 + f13) * 255.0f);
                round2 = Math.round(f13 * 255.0f);
                break;
            case 1:
                i3 = Math.round((abs2 + f13) * 255.0f);
                round = Math.round((abs + f13) * 255.0f);
                round2 = Math.round(f13 * 255.0f);
                break;
            case 2:
                i3 = Math.round(f13 * 255.0f);
                round = Math.round((abs + f13) * 255.0f);
                round2 = Math.round((abs2 + f13) * 255.0f);
                break;
            case 3:
                i3 = Math.round(f13 * 255.0f);
                round = Math.round((abs2 + f13) * 255.0f);
                round2 = Math.round((abs + f13) * 255.0f);
                break;
            case 4:
                i3 = Math.round((abs2 + f13) * 255.0f);
                round = Math.round(f13 * 255.0f);
                round2 = Math.round((abs + f13) * 255.0f);
                break;
            case 5:
            case 6:
                i3 = Math.round((abs + f13) * 255.0f);
                round = Math.round(f13 * 255.0f);
                round2 = Math.round((abs2 + f13) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(m(i3), m(round), m(round2));
    }

    public static int b(double d, double d10, double d11) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        double d12 = (d + 16.0d) / 116.0d;
        double d13 = (d10 / 500.0d) + d12;
        double d14 = d12 - (d11 / 200.0d);
        double pow = Math.pow(d13, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d13 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d > 7.9996247999999985d ? Math.pow(d12, 3.0d) : d / 903.3d;
        double pow3 = Math.pow(d14, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d14 * 116.0d) - 16.0d) / 903.3d;
        }
        double d15 = pow * 95.047d;
        dArr[0] = d15;
        double d16 = pow2 * 100.0d;
        dArr[1] = d16;
        double d17 = pow3 * 108.883d;
        dArr[2] = d17;
        return e(d15, d16, d17);
    }

    public static void c(int i3, int i10, int i11, float[] fArr) {
        float z10;
        float abs;
        float f10 = i3 / 255.0f;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float max = Math.max(f10, Math.max(f11, f12));
        float min = Math.min(f10, Math.min(f11, f12));
        float f13 = max - min;
        float f14 = (max + min) / 2.0f;
        if (max == min) {
            z10 = 0.0f;
            abs = 0.0f;
        } else {
            z10 = max == f10 ? ((f11 - f12) / f13) % 6.0f : max == f11 ? com.google.android.recaptcha.internal.a.z(f12, f10, f13, 2.0f) : com.google.android.recaptcha.internal.a.z(f10, f11, f13, 4.0f);
            abs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (z10 * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = f15 < 0.0f ? 0.0f : Math.min(f15, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        fArr[2] = f14 >= 0.0f ? Math.min(f14, 1.0f) : 0.0f;
    }

    public static void d(int i3, int i10, int i11, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = i3 / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d10 = i10 / 255.0d;
        double pow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = i11 / 255.0d;
        double pow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
    }

    public static int e(double d, double d10, double d11) {
        double d12 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d))) / 100.0d;
        double d13 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d))) / 100.0d;
        double d14 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d))) / 100.0d;
        return Color.rgb(m((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d)), m((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d)), m((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d)));
    }

    public static int f(float f10, int i3, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f10) + (Color.alpha(i3) * f11)), (int) ((Color.red(i10) * f10) + (Color.red(i3) * f11)), (int) ((Color.green(i10) * f10) + (Color.green(i3) * f11)), (int) ((Color.blue(i10) * f10) + (Color.blue(i3) * f11)));
    }

    public static double g(int i3, int i10) {
        if (Color.alpha(i10) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
        }
        if (Color.alpha(i3) < 255) {
            i3 = k(i3, i10);
        }
        double h = h(i3) + 0.05d;
        double h7 = h(i10) + 0.05d;
        return Math.max(h, h7) / Math.min(h, h7);
    }

    public static double h(int i3) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        d(Color.red(i3), Color.green(i3), Color.blue(i3), dArr);
        return dArr[1] / 100.0d;
    }

    public static int i(float f10, int i3, int i10) {
        int alpha = Color.alpha(i10);
        int i11 = hs.e4;
        if (alpha != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
        }
        double d = f10;
        if (g(o(i3, hs.e4), i10) < d) {
            return -1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 <= 10 && i11 - i12 > 1; i13++) {
            int i14 = (i12 + i11) / 2;
            if (g(o(i3, i14), i10) < d) {
                i12 = i14;
            } else {
                i11 = i14;
            }
        }
        return i11;
    }

    public static void j(int i3, double[] dArr) {
        d(Color.red(i3), Color.green(i3), Color.blue(i3), dArr);
        double d = dArr[0];
        double d10 = dArr[1];
        double d11 = dArr[2];
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double n4 = n(d / 95.047d);
        double n10 = n(d10 / 100.0d);
        double n11 = n(d11 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * n10) - 16.0d);
        dArr[1] = (n4 - n10) * 500.0d;
        dArr[2] = (n10 - n11) * 200.0d;
    }

    public static int k(int i3, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i3);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / hs.e4);
        return Color.argb(i11, l(Color.red(i3), alpha2, Color.red(i10), alpha, i11), l(Color.green(i3), alpha2, Color.green(i10), alpha, i11), l(Color.blue(i3), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int l(int i3, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return com.google.android.recaptcha.internal.a.e(hs.e4, i10, i11 * i12, (i3 * hs.e4) * i10) / (i13 * hs.e4);
    }

    public static int m(int i3) {
        if (i3 < 0) {
            return 0;
        }
        return Math.min(i3, hs.e4);
    }

    public static double n(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    public static int o(int i3, int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i3 & 16777215) | (i10 << 24);
    }
}
