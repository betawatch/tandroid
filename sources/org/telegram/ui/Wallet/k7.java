package org.telegram.ui.Wallet;

import android.graphics.Color;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public abstract class k7 {
    public static final float[] a = {0.017513232f, 0.2844959f, 1.2347647f, 0.012535676f, 0.21663007f, 0.8356014f, 0.02682078f, 0.40080056f, 2.4040875f, 0.0032399998f, 0.171f, 0.47039998f};
    public static final float[] b = {0.0f, 0.47809f, 1.0f};

    public static int a(float[] fArr, int i10) {
        int i11 = i10 * 4;
        int i12 = i11 + 10;
        if (fArr == null || fArr.length < 18 || fArr[i12] < 0.0f) {
            return i0.b.f(0.2f, -16611884, -16748084);
        }
        return i0.b.f(0.2f, ((int) fArr[i11 + 12]) | (-16777216), ((int) fArr[i11 + 11]) | (-16777216));
    }

    public static int b(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return Math.max(0, Math.min(255, (int) (((max <= 0.0031308f ? max * 12.92f : (((float) Math.pow(max, 0.4166666666666667d)) * 1.055f) - 0.055f) * 255.0f) + 0.5f)));
    }

    public static float[] c(int i10) {
        double[] s10 = org.telegram.ui.ActionBar.g5.s(org.telegram.ui.ActionBar.g5.t(org.telegram.ui.ActionBar.g5.r(i10)));
        return new float[]{(float) s10[0], (float) s10[1], Double.isNaN(s10[2]) ? 0.0f : (float) Math.toRadians(s10[2])};
    }

    public static float d(float f7) {
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4d);
    }

    public static float e(int i10, int i11) {
        float f7 = ((i10 >> i11) & 255) / 255.0f;
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4d);
    }

    public static float[] f(float[] fArr) {
        int i10;
        float[] fArr2 = new float[42];
        int i11 = 0;
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 * 4;
            int i14 = i13 + 10;
            int length = fArr.length;
            float[] fArr3 = b;
            if (length < 18 || fArr[i14] < 0.0f) {
                i10 = 0;
                System.arraycopy(a, 0, fArr2, i12 * 12, 12);
                fArr2[i12 + 28] = 1.0f;
                System.arraycopy(fArr3, 0, fArr2, (i12 * 3) + 30, 3);
            } else {
                fArr2[i12 + 28] = 0.6f;
                int i15 = (int) fArr[i14];
                int i16 = i12 * 3;
                int i17 = i16 + 30;
                float f7 = ((i15 >> 16) & 255) / 255.0f;
                float f10 = ((i15 >> 8) & 255) / 255.0f;
                float f11 = (i15 & 255) / 255.0f;
                float min = Math.min(f7, Math.min(f10, f11));
                float max = Math.max(f7, Math.max(f10, f11)) - min;
                float f12 = (fArr3[2] * 0.0722f) + (fArr3[1] * 0.7152f) + (fArr3[i11] * 0.2126f);
                float min2 = Math.min(1.0f, max / 0.15f);
                fArr2[i17] = com.google.android.gms.internal.cast.a6.x(max > 0.0f ? (f7 - min) / max : 0.0f, f12, min2, f12);
                fArr2[i16 + 31] = com.google.android.gms.internal.cast.a6.x(max > 0.0f ? (f10 - min) / max : 0.0f, f12, min2, f12);
                fArr2[i16 + 32] = com.google.android.gms.internal.cast.a6.x(max > 0.0f ? (f11 - min) / max : 0.0f, f12, min2, f12);
                int i18 = (int) fArr[i14];
                int i19 = (int) fArr[i13 + 11];
                int l4 = l(-16216082, i18, i19);
                int l10 = l(-15291399, i18, i19);
                for (int i20 = 0; i20 < 3; i20++) {
                    int i21 = 16 - (i20 * 8);
                    float e = e(l4, i21) * 0.73f;
                    float e7 = e(l10, i21) * 0.73f;
                    int i22 = i12 * 12;
                    fArr2[i22 + i20] = (e + e7) / 2.0f;
                    fArr2[i22 + 3 + i20] = e;
                    fArr2[i22 + 6 + i20] = e7;
                    fArr2[i22 + 9 + i20] = e;
                }
                i10 = 0;
            }
            i12++;
            i11 = i10;
        }
        while (i11 < 2) {
            int a2 = a(fArr, i11);
            int i23 = i11 * 3;
            fArr2[i23 + 36] = ((a2 >> 16) & 255) / 255.0f;
            fArr2[i23 + 37] = ((a2 >> 8) & 255) / 255.0f;
            fArr2[i23 + 38] = (a2 & 255) / 255.0f;
            i11++;
        }
        System.arraycopy(fArr, 6, fArr2, 24, 4);
        return fArr2;
    }

    public static float[] g(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return new float[]{0.0f, 1.0f, 1.0f};
        }
        float[] c10 = c(i0.b.f(0.5f, stargiftattributebackdrop.center_color | (-16777216), (-16777216) | stargiftattributebackdrop.edge_color));
        float[] c11 = c(-16216082);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(c10[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        return new float[]{c10[2] - c11[2], Math.min(com.google.android.gms.internal.cast.a6.A(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (c10[1] * 1.5f) / 0.155f))), (c(stargiftattributebackdrop.center_color)[1] * 1.2f) / 0.173f), ((((Math.max(0.1f, c10[0] - 0.02f) / c11[0]) - 1.0f) * Math.max(0.0f, Math.min(1.0f, (0.6f - c10[0]) / 0.15f))) + 1.0f) - (exp * 0.025f)};
    }

    public static float[] h(int i10) {
        float d = d(Color.red(i10) / 255.0f);
        float d10 = d(Color.green(i10) / 255.0f);
        float d11 = d(Color.blue(i10) / 255.0f);
        float cbrt = (float) Math.cbrt((0.051445995f * d11) + (0.53633255f * d10) + (0.41222146f * d));
        float cbrt2 = (float) Math.cbrt((0.10739696f * d11) + (0.6806995f * d10) + (0.2119035f * d));
        float cbrt3 = (float) Math.cbrt((d11 * 0.6299787f) + (d10 * 0.28171885f) + (d * 0.08830246f));
        float f7 = ((0.7936178f * cbrt2) + (0.21045426f * cbrt)) - (0.004072047f * cbrt3);
        double d12 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        double d13 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        return new float[]{f7, (float) Math.hypot(d12, d13), (float) Math.atan2(d13, d12)};
    }

    public static float[] i(float f7, float f10, float f11) {
        double d = f11;
        float cos = ((float) Math.cos(d)) * f10;
        float sin = f10 * ((float) Math.sin(d));
        float f12 = (0.21580376f * sin) + (0.39633778f * cos) + f7;
        float f13 = (f7 - (0.105561346f * cos)) - (0.06385417f * sin);
        float f14 = (f7 - (cos * 0.08948418f)) - (sin * 1.2914855f);
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        return new float[]{(0.23096994f * f17) + ((4.0767417f * f15) - (3.3077116f * f16)), ((2.6097574f * f16) + ((-1.268438f) * f15)) - (0.34131938f * f17), (f17 * 1.7076147f) + ((f15 * (-0.0041960864f)) - (f16 * 0.7034186f))};
    }

    public static int j(float f7, float f10, float f11) {
        float[] i10 = i(f7, f10, f11);
        loop0: for (int i11 = 0; i11 < 40; i11++) {
            for (float f12 : i10) {
                if (f12 < -0.001f || f12 > 1.001f) {
                    f10 *= 0.95f;
                    i10 = i(f7, f10, f11);
                }
            }
        }
        return Color.rgb(b(i10[0]), b(i10[1]), b(i10[2]));
    }

    public static void k(float[] fArr, int i10, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        int i11 = i10 * 4;
        fArr[i11 + 10] = stargiftattributebackdrop == null ? -1.0f : stargiftattributebackdrop.center_color & 16777215;
        fArr[i11 + 11] = stargiftattributebackdrop == null ? -1.0f : stargiftattributebackdrop.edge_color & 16777215;
        fArr[i11 + 12] = stargiftattributebackdrop == null ? -1.0f : stargiftattributebackdrop.pattern_color & 16777215;
        fArr[i11 + 13] = stargiftattributebackdrop != null ? stargiftattributebackdrop.text_color & 16777215 : -1.0f;
    }

    public static int l(int i10, int i11, int i12) {
        int i13 = i11 | (-16777216);
        int i14 = i12 | (-16777216);
        float[] h = h(i0.b.f(0.5f, i13, i14));
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(h[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float A = com.google.android.gms.internal.cast.a6.A(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (h[1] * 1.5f) / 0.155f)));
        float[] h10 = h(i13);
        float[] h11 = h(i14);
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((h10[0] + h11[0]) / 2.0f)) / 0.15f));
        float f7 = h(-16216082)[0];
        float f10 = h(-15291399)[0];
        float[] h12 = h(i10);
        float max2 = Math.max(-2.0f, Math.min(3.0f, (h12[0] - f7) / (f10 - f7)));
        float f11 = h11[0];
        float x10 = com.google.android.gms.internal.cast.a6.x(h10[0], f11, max2, f11 - 0.02f);
        float f12 = h12[0];
        float f13 = ((x10 - f12) * max) + f12 + (exp * (-0.025f));
        float f14 = h10[1] * 1.2f;
        float f15 = h12[1];
        return j(Math.max(0.05f, Math.min(0.97f, f13)), com.google.android.gms.internal.cast.a6.t(h10[1], 1.1f, max, (1.0f - max) * Math.min(f15 * A, (f15 / 0.173f) * f14)), h[2]);
    }

    public static int m(float[] fArr, int i10, int i11) {
        double d;
        double d10;
        int i12 = 3;
        int C = a1.g.C(i11, 3, 4, 10);
        if (fArr.length >= 18 && fArr[C] >= 0.0f) {
            int i13 = i10 & 16777215;
            if (i13 == 165332) {
                i12 = 2;
            } else if (i13 == 29132 || i13 == 561134) {
                i12 = 1;
            } else if (i13 == 2267888 || i13 == 1485817) {
                i12 = 0;
            }
            return (((int) fArr[C + i12]) & 16777215) | (Color.alpha(i10) << 24);
        }
        if (fArr[i11] == 0.0f && fArr[i11 + 1] == 1.0f && fArr[i11 + 2] == 1.0f) {
            return i10;
        }
        double[] s10 = org.telegram.ui.ActionBar.g5.s(org.telegram.ui.ActionBar.g5.t(org.telegram.ui.ActionBar.g5.r(i10)));
        double d11 = s10[0];
        s10[0] = Math.max(d11 < 0.8d ? 0.0d : 0.8d, d11 * fArr[i11 + 2]);
        s10[1] = s10[1] * fArr[i11 + 1];
        s10[2] = Math.toDegrees(fArr[i11]) + (Double.isNaN(s10[2]) ? 0.0d : s10[2]);
        double[] dArr = null;
        for (int i14 = 0; i14 < 40; i14++) {
            double d12 = s10[0];
            double d13 = s10[1];
            double d14 = s10[2];
            double[] j10 = org.telegram.ui.ActionBar.g5.j(org.telegram.ui.ActionBar.g5.d, new double[]{d12, Double.isNaN(d14) ? 0.0d : Math.cos((d14 * 3.141592653589793d) / 180.0d) * d13, Double.isNaN(d14) ? 0.0d : Math.sin((d14 * 3.141592653589793d) / 180.0d) * d13});
            for (int i15 = 0; i15 < 3; i15++) {
                j10[i15] = Math.pow(j10[i15], 3.0d);
            }
            dArr = org.telegram.ui.ActionBar.g5.j(org.telegram.ui.ActionBar.g5.f, org.telegram.ui.ActionBar.g5.j(org.telegram.ui.ActionBar.g5.b, j10));
            double d15 = dArr[0];
            if (d15 >= 0.0d) {
                double d16 = dArr[1];
                if (d16 >= 0.0d) {
                    double d17 = dArr[2];
                    if (d17 >= 0.0d && d15 <= 1.0d && d16 <= 1.0d && d17 <= 1.0d) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            s10[1] = s10[1] * 0.95d;
        }
        double[] dArr2 = new double[3];
        for (int i16 = 0; i16 < dArr.length; i16++) {
            if (Math.abs(dArr[i16]) > 0.0031308d) {
                double d18 = dArr[i16];
                d10 = d18 < 0.0d ? -1 : 1;
                d = (Math.pow(Math.abs(d18), 0.4166666666666667d) * 1.055d) - 0.055d;
            } else {
                d = 12.92d;
                d10 = dArr[i16];
            }
            dArr2[i16] = d * d10;
        }
        return i0.b.o(Color.rgb((int) Math.round(Utilities.clamp(dArr2[0], 1.0d, 0.0d) * 255.0d), (int) Math.round(Utilities.clamp(dArr2[1], 1.0d, 0.0d) * 255.0d), (int) Math.round(Utilities.clamp(dArr2[2], 1.0d, 0.0d) * 255.0d)), Color.alpha(i10));
    }
}
