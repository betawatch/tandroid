package i0;

import android.graphics.Color;
import c3.h0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class a {
    public static final ThreadLocal a = new ThreadLocal();

    public static int a(float[] fArr) {
        int round;
        int round2;
        int i10 = 0;
        float f7 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float abs = (1.0f - Math.abs((f11 * 2.0f) - 1.0f)) * f10;
        float f12 = f11 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f7 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f7) / 60) {
            case 0:
                i10 = Math.round((abs + f12) * 255.0f);
                round = Math.round((abs2 + f12) * 255.0f);
                round2 = Math.round(f12 * 255.0f);
                break;
            case 1:
                i10 = Math.round((abs2 + f12) * 255.0f);
                round = Math.round((abs + f12) * 255.0f);
                round2 = Math.round(f12 * 255.0f);
                break;
            case 2:
                i10 = Math.round(f12 * 255.0f);
                round = Math.round((abs + f12) * 255.0f);
                round2 = Math.round((abs2 + f12) * 255.0f);
                break;
            case 3:
                i10 = Math.round(f12 * 255.0f);
                round = Math.round((abs2 + f12) * 255.0f);
                round2 = Math.round((abs + f12) * 255.0f);
                break;
            case 4:
                i10 = Math.round((abs2 + f12) * 255.0f);
                round = Math.round(f12 * 255.0f);
                round2 = Math.round((abs + f12) * 255.0f);
                break;
            case 5:
            case 6:
                i10 = Math.round((abs + f12) * 255.0f);
                round = Math.round(f12 * 255.0f);
                round2 = Math.round((abs2 + f12) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(m(i10), m(round), m(round2));
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

    public static void c(float[] fArr, int i10, int i11, int i12) {
        float B;
        float abs;
        float f7 = i10 / 255.0f;
        float f10 = i11 / 255.0f;
        float f11 = i12 / 255.0f;
        float max = Math.max(f7, Math.max(f10, f11));
        float min = Math.min(f7, Math.min(f10, f11));
        float f12 = max - min;
        float f13 = (max + min) / 2.0f;
        if (max == min) {
            B = 0.0f;
            abs = 0.0f;
        } else {
            B = max == f7 ? ((f10 - f11) / f12) % 6.0f : max == f10 ? h0.B(f11, f7, f12, 2.0f) : h0.B(f7, f10, f12, 4.0f);
            abs = f12 / (1.0f - Math.abs((2.0f * f13) - 1.0f));
        }
        float f14 = (B * 60.0f) % 360.0f;
        if (f14 < 0.0f) {
            f14 += 360.0f;
        }
        fArr[0] = f14 < 0.0f ? 0.0f : Math.min(f14, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        fArr[2] = f13 >= 0.0f ? Math.min(f13, 1.0f) : 0.0f;
    }

    public static void d(int i10, int i11, int i12, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = i10 / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d10 = i11 / 255.0d;
        double pow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = i12 / 255.0d;
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

    public static int f(float f7, int i10, int i11) {
        float f10 = 1.0f - f7;
        return Color.argb((int) ((Color.alpha(i11) * f7) + (Color.alpha(i10) * f10)), (int) ((Color.red(i11) * f7) + (Color.red(i10) * f10)), (int) ((Color.green(i11) * f7) + (Color.green(i10) * f10)), (int) ((Color.blue(i11) * f7) + (Color.blue(i10) * f10)));
    }

    public static double g(int i10, int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        if (Color.alpha(i10) < 255) {
            i10 = k(i10, i11);
        }
        double h = h(i10) + 0.05d;
        double h10 = h(i11) + 0.05d;
        return Math.max(h, h10) / Math.min(h, h10);
    }

    public static double h(int i10) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        d(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
        return dArr[1] / 100.0d;
    }

    public static int i(float f7, int i10, int i11) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        double d = f7;
        if (g(o(i10, 255), i11) < d) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (g(o(i10, i15), i11) < d) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    public static void j(int i10, double[] dArr) {
        d(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
        double d = dArr[0];
        double d10 = dArr[1];
        double d11 = dArr[2];
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double n10 = n(d / 95.047d);
        double n11 = n(d10 / 100.0d);
        double n12 = n(d11 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * n11) - 16.0d);
        dArr[1] = (n10 - n11) * 500.0d;
        dArr[2] = (n11 - n12) * 200.0d;
    }

    public static int k(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i12, l(Color.red(i10), alpha2, Color.red(i11), alpha, i12), l(Color.green(i10), alpha2, Color.green(i11), alpha, i12), l(Color.blue(i10), alpha2, Color.blue(i11), alpha, i12));
    }

    public static int l(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return h0.w(255, i11, i12 * i13, (i10 * 255) * i11) / (i14 * 255);
    }

    public static int m(int i10) {
        if (i10 < 0) {
            return 0;
        }
        return Math.min(i10, 255);
    }

    public static double n(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    public static int o(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
