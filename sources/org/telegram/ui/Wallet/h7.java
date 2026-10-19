package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.util.LruCache;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public abstract class h7 {
    public static final LruCache a = new LruCache(128);
    public static final float[] b = {0.017513232f, 0.2844959f, 1.2347647f, 0.012535676f, 0.21663007f, 0.8356014f, 0.02682078f, 0.40080056f, 2.4040875f, 0.0032399998f, 0.171f, 0.47039998f};
    public static final float[] c = {0.0f, 0.47809f, 1.0f};
    public static final LruCache d = new LruCache(64);
    public static final int e;

    static {
        float[] j10 = j(-16748084);
        float f7 = j10[0] * 0.876903f;
        float f10 = j10[2];
        float e7 = e(f7, f10);
        float f11 = f10;
        for (int i10 = -15; i10 <= 15; i10++) {
            float radians = ((float) Math.toRadians(i10)) + f10;
            float e10 = e(f7, radians);
            if (e10 > 0.002f + e7) {
                f11 = radians;
                e7 = e10;
            }
        }
        float y3 = com.google.android.gms.internal.play_billing.k3.y(f11, f10, 0.723f, f10);
        e = l(f7, e(f7, y3), y3);
    }

    public static int a(float[] fArr, int i10) {
        int i11 = i10 == -16216082 ? -14456619 : -14184457;
        if (fArr == null || fArr.length < 18) {
            return i11;
        }
        float f7 = fArr[10];
        int o10 = f7 < 0.0f ? i11 : o(i10, (int) f7, (int) fArr[11]);
        float f10 = fArr[14];
        if (f10 >= 0.0f) {
            i11 = o(i10, (int) f10, (int) fArr[15]);
        }
        return i0.a.f(fArr[8], o10, i11);
    }

    public static int b(float[] fArr, int i10) {
        int i11 = i10 * 4;
        int i12 = i11 + 10;
        int i13 = e;
        if (fArr != null && fArr.length >= 18) {
            float f7 = fArr[i12];
            float f10 = 0.0f;
            if (f7 >= 0.0f) {
                int n10 = n(-16216082, (int) f7, (int) fArr[i11 + 11]);
                Integer valueOf = Integer.valueOf(n10);
                LruCache lruCache = d;
                Integer num = (Integer) lruCache.get(valueOf);
                if (num != null) {
                    return num.intValue();
                }
                float[] j10 = j(n10);
                float d10 = (d(-16216082) + 0.05f) / (d(i13) + 0.05f);
                float d11 = d(n10);
                float f11 = ((d11 + 0.05f) / d10) - 0.05f;
                if (f11 < 0.004f) {
                    f11 = d11 * 0.3f;
                }
                float f12 = 1.0f;
                float max = Math.max(0.0f, Math.min(1.0f, j10[1] / 0.1f));
                for (int i14 = 0; i14 < 18; i14++) {
                    float f13 = (f10 + f12) / 2.0f;
                    if (d(l(f13, e(f13, j10[2]) * max, j10[2])) < f11) {
                        f10 = f13;
                    } else {
                        f12 = f13;
                    }
                }
                float f14 = (f10 + f12) / 2.0f;
                int l4 = l(f14, e(f14, j10[2]) * max, j10[2]);
                lruCache.put(Integer.valueOf(n10), Integer.valueOf(l4));
                return l4;
            }
        }
        return i13;
    }

    public static int c(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return Math.max(0, Math.min(255, (int) (((max <= 0.0031308f ? max * 12.92f : (((float) Math.pow(max, 0.4166666666666667d)) * 1.055f) - 0.055f) * 255.0f) + 0.5f)));
    }

    public static float d(int i10) {
        return (h(i10, 0) * 0.0722f) + (h(i10, 8) * 0.7152f) + (h(i10, 16) * 0.2126f);
    }

    public static float e(float f7, float f10) {
        float f11 = 0.5f;
        float f12 = 0.0f;
        for (int i10 = 0; i10 < 18; i10++) {
            float f13 = (f12 + f11) / 2.0f;
            float[] k10 = k(f7, f13, f10);
            float f14 = k10[0];
            if (f14 >= 0.0f) {
                float f15 = k10[1];
                if (f15 >= 0.0f) {
                    float f16 = k10[2];
                    if (f16 >= 0.0f && f14 <= 1.0f && f15 <= 1.0f && f16 <= 1.0f) {
                        f12 = f13;
                    }
                }
            }
            f11 = f13;
        }
        return f12;
    }

    public static float[] f(int i10) {
        double[] s10 = org.telegram.ui.ActionBar.g5.s(org.telegram.ui.ActionBar.g5.t(org.telegram.ui.ActionBar.g5.r(i10)));
        return new float[]{(float) s10[0], (float) s10[1], Double.isNaN(s10[2]) ? 0.0f : (float) Math.toRadians(s10[2])};
    }

    public static float g(float f7) {
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4d);
    }

    public static float h(int i10, int i11) {
        float f7 = ((i10 >> i11) & 255) / 255.0f;
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4d);
    }

    public static float[] i(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return new float[]{0.0f, 1.0f, 1.0f};
        }
        float[] f7 = f(i0.a.f(0.5f, stargiftattributebackdrop.center_color | (-16777216), (-16777216) | stargiftattributebackdrop.edge_color));
        float[] f10 = f(-16216082);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(f7[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        return new float[]{f7[2] - f10[2], Math.min(com.google.android.gms.internal.play_billing.k3.A(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (f7[1] * 1.5f) / 0.155f))), (f(stargiftattributebackdrop.center_color)[1] * 1.2f) / 0.173f), ((((Math.max(0.1f, f7[0] - 0.02f) / f10[0]) - 1.0f) * Math.max(0.0f, Math.min(1.0f, (0.6f - f7[0]) / 0.15f))) + 1.0f) - (exp * 0.025f)};
    }

    public static float[] j(int i10) {
        float g10 = g(Color.red(i10) / 255.0f);
        float g11 = g(Color.green(i10) / 255.0f);
        float g12 = g(Color.blue(i10) / 255.0f);
        float cbrt = (float) Math.cbrt((0.051445995f * g12) + (0.53633255f * g11) + (0.41222146f * g10));
        float cbrt2 = (float) Math.cbrt((0.10739696f * g12) + (0.6806995f * g11) + (0.2119035f * g10));
        float cbrt3 = (float) Math.cbrt((g12 * 0.6299787f) + (g11 * 0.28171885f) + (g10 * 0.08830246f));
        float f7 = ((0.7936178f * cbrt2) + (0.21045426f * cbrt)) - (0.004072047f * cbrt3);
        double d10 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        double d11 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        return new float[]{f7, (float) Math.hypot(d10, d11), (float) Math.atan2(d11, d10)};
    }

    public static float[] k(float f7, float f10, float f11) {
        double d10 = f11;
        float cos = ((float) Math.cos(d10)) * f10;
        float sin = f10 * ((float) Math.sin(d10));
        float f12 = (0.21580376f * sin) + (0.39633778f * cos) + f7;
        float f13 = (f7 - (0.105561346f * cos)) - (0.06385417f * sin);
        float f14 = (f7 - (cos * 0.08948418f)) - (sin * 1.2914855f);
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        return new float[]{(0.23096994f * f17) + ((4.0767417f * f15) - (3.3077116f * f16)), ((2.6097574f * f16) + ((-1.268438f) * f15)) - (0.34131938f * f17), (f17 * 1.7076147f) + ((f15 * (-0.0041960864f)) - (f16 * 0.7034186f))};
    }

    public static int l(float f7, float f10, float f11) {
        float[] k10 = k(f7, f10, f11);
        loop0: for (int i10 = 0; i10 < 40; i10++) {
            for (float f12 : k10) {
                if (f12 < -0.001f || f12 > 1.001f) {
                    f10 *= 0.95f;
                    k10 = k(f7, f10, f11);
                }
            }
        }
        return Color.rgb(c(k10[0]), c(k10[1]), c(k10[2]));
    }

    public static void m(float[] fArr, int i10, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        int i11 = i10 * 4;
        fArr[i11 + 10] = stargiftattributebackdrop == null ? -1.0f : stargiftattributebackdrop.center_color & 16777215;
        fArr[i11 + 11] = stargiftattributebackdrop == null ? -1.0f : stargiftattributebackdrop.edge_color & 16777215;
        fArr[i11 + 12] = stargiftattributebackdrop == null ? -1.0f : stargiftattributebackdrop.pattern_color & 16777215;
        fArr[i11 + 13] = stargiftattributebackdrop != null ? stargiftattributebackdrop.text_color & 16777215 : -1.0f;
    }

    public static int n(int i10, int i11, int i12) {
        int i13 = i11 | (-16777216);
        int i14 = i12 | (-16777216);
        float[] j10 = j(i0.a.f(0.5f, i13, i14));
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(j10[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float A = com.google.android.gms.internal.play_billing.k3.A(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (j10[1] * 1.5f) / 0.155f)));
        float[] j11 = j(i13);
        float[] j12 = j(i14);
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((j11[0] + j12[0]) / 2.0f)) / 0.15f));
        float f7 = j(-16216082)[0];
        float f10 = j(-15291399)[0];
        float[] j13 = j(i10);
        float max2 = Math.max(-2.0f, Math.min(3.0f, (j13[0] - f7) / (f10 - f7)));
        float f11 = j12[0];
        float y3 = com.google.android.gms.internal.play_billing.k3.y(j11[0], f11, max2, f11 - 0.02f);
        float f12 = j13[0];
        float f13 = ((y3 - f12) * max) + f12 + (exp * (-0.025f));
        float f14 = j11[1] * 1.2f;
        float f15 = j13[1];
        return l(Math.max(0.05f, Math.min(0.97f, f13)), com.google.android.gms.internal.play_billing.k3.t(j11[1], 1.1f, max, (1.0f - max) * Math.min(f15 * A, (f15 / 0.173f) * f14)), j10[2]);
    }

    public static int o(int i10, int i11, int i12) {
        String str = i10 + ":" + i11 + ":" + i12;
        LruCache lruCache = a;
        Integer num = (Integer) lruCache.get(str);
        if (num != null) {
            return num.intValue();
        }
        int i13 = i11 | (-16777216);
        int i14 = i12 | (-16777216);
        float[] j10 = j(i0.a.f(0.7f, i13, i14));
        float[] j11 = j(i13);
        float[] j12 = j(i14);
        float[] j13 = j(i10);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(j10[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float A = com.google.android.gms.internal.play_billing.k3.A(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (j10[1] * 1.5f) / 0.155f)));
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((j11[0] + j12[0]) / 2.0f)) / 0.15f));
        float f7 = j(-16216082)[0];
        float max2 = Math.max(-2.0f, Math.min(3.0f, (j13[0] - f7) / (j(-15291399)[0] - f7)));
        float f10 = j12[0];
        float y3 = com.google.android.gms.internal.play_billing.k3.y(j11[0], f10, max2, f10 - 0.02f);
        float f11 = j13[0];
        float y10 = com.google.android.gms.internal.play_billing.k3.y(y3, f11, max, f11) - (exp * 0.025f);
        float f12 = j13[1];
        float t10 = com.google.android.gms.internal.play_billing.k3.t(j11[1], 1.1f, max, (1.0f - max) * Math.min(A * f12, (f12 / 0.173f) * j11[1] * 1.2f));
        float[] j14 = i10 == -15291399 ? j(i0.a.f(0.5f, i13, i14)) : j12;
        float y11 = com.google.android.gms.internal.play_billing.k3.y(j14[0], y10, 0.399f, y10);
        float y12 = com.google.android.gms.internal.play_billing.k3.y(j14[1], t10, 0.399f, t10);
        float atan2 = (((float) Math.atan2(Math.sin(j14[2] - r9), Math.cos(j14[2] - j10[2]))) * 0.399f) + j10[2];
        float max3 = (1.0f - Math.max(0.0f, Math.min(1.0f, (j10[1] - 0.125f) / 0.015f))) * Math.max(0.0f, Math.min(1.0f, (j10[1] - 0.06f) / 0.055f));
        float exp2 = (float) Math.exp(-Math.pow(((((Math.toDegrees(atan2) % 360.0d) + 360.0d) % 360.0d) - 70.0d) / 35.0d, 2.0d));
        float f13 = (((1.0f - (0.75f * exp2)) * max3 * 0.35f) + 1.0f) * y12;
        float B = com.google.android.gms.internal.play_billing.k3.B(exp2, 0.15f, 1.0f, Math.max(j11[1], j12[1]) * 1.3f);
        if (f13 > B && B > 0.0f) {
            f13 = com.google.android.gms.internal.play_billing.k3.y(B, f13, 0.8f, f13);
        }
        int l4 = l(Math.max(0.05f, Math.min(0.97f, y11 - (exp2 * 0.025f))), f13, atan2);
        lruCache.put(str, Integer.valueOf(l4));
        return l4;
    }

    public static int p(float[] fArr, int i10, int i11) {
        double d10;
        double d11;
        int i12 = ((i11 / 3) * 4) + 10;
        int i13 = 0;
        if (fArr.length >= 18 && fArr[i12] >= 0.0f) {
            int i14 = i10 & 16777215;
            if (i14 == 165332) {
                i13 = 2;
            } else if (i14 == 29132 || i14 == 561134) {
                i13 = 1;
            } else if (i14 != 2267888 && i14 != 1485817) {
                i13 = 3;
            }
            return (((int) fArr[i12 + i13]) & 16777215) | (Color.alpha(i10) << 24);
        }
        if (fArr[i11] == 0.0f && fArr[i11 + 1] == 1.0f && fArr[i11 + 2] == 1.0f) {
            return i10;
        }
        double[] s10 = org.telegram.ui.ActionBar.g5.s(org.telegram.ui.ActionBar.g5.t(org.telegram.ui.ActionBar.g5.r(i10)));
        double d12 = s10[0];
        s10[0] = Math.max(d12 < 0.8d ? 0.0d : 0.8d, d12 * fArr[i11 + 2]);
        s10[1] = s10[1] * fArr[i11 + 1];
        s10[2] = Math.toDegrees(fArr[i11]) + (Double.isNaN(s10[2]) ? 0.0d : s10[2]);
        double[] dArr = null;
        for (int i15 = 0; i15 < 40; i15++) {
            double d13 = s10[0];
            double d14 = s10[1];
            double d15 = s10[2];
            double[] j10 = org.telegram.ui.ActionBar.g5.j(org.telegram.ui.ActionBar.g5.d, new double[]{d13, Double.isNaN(d15) ? 0.0d : Math.cos((d15 * 3.141592653589793d) / 180.0d) * d14, Double.isNaN(d15) ? 0.0d : Math.sin((d15 * 3.141592653589793d) / 180.0d) * d14});
            for (int i16 = 0; i16 < 3; i16++) {
                j10[i16] = Math.pow(j10[i16], 3.0d);
            }
            dArr = org.telegram.ui.ActionBar.g5.j(org.telegram.ui.ActionBar.g5.f, org.telegram.ui.ActionBar.g5.j(org.telegram.ui.ActionBar.g5.b, j10));
            double d16 = dArr[0];
            if (d16 >= 0.0d) {
                double d17 = dArr[1];
                if (d17 >= 0.0d) {
                    double d18 = dArr[2];
                    if (d18 >= 0.0d && d16 <= 1.0d && d17 <= 1.0d && d18 <= 1.0d) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            s10[1] = s10[1] * 0.95d;
        }
        double[] dArr2 = new double[3];
        for (int i17 = 0; i17 < dArr.length; i17++) {
            if (Math.abs(dArr[i17]) > 0.0031308d) {
                double d19 = dArr[i17];
                d11 = d19 < 0.0d ? -1 : 1;
                d10 = (Math.pow(Math.abs(d19), 0.4166666666666667d) * 1.055d) - 0.055d;
            } else {
                d10 = 12.92d;
                d11 = dArr[i17];
            }
            dArr2[i17] = d10 * d11;
        }
        return i0.a.o(Color.rgb((int) Math.round(Utilities.clamp(dArr2[0], 1.0d, 0.0d) * 255.0d), (int) Math.round(Utilities.clamp(dArr2[1], 1.0d, 0.0d) * 255.0d), (int) Math.round(Utilities.clamp(dArr2[2], 1.0d, 0.0d) * 255.0d)), Color.alpha(i10));
    }
}
