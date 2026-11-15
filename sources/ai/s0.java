package ai;

import android.content.SharedPreferences;
import android.graphics.Color;
import java.util.ArrayList;
import org.telegram.messenger.np;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class s0 {
    public static boolean d;
    public static int e;
    public static final String[] a = {"hue", "chroma", "light", "haloW", "haloS", "lift", "rimW", "rimB", "speed", "spread", "buttonLean", "iconTint"};
    public static final float[] b = {150.0f, 0.26f, 0.82f, 1.0f, 1.1f, 0.6f, 1.0f, 1.15f, 1.0f, 40.0f, 0.0f, 0.25f};
    public static int c = 1;
    public static final float[] f = new float[12];
    public static final ArrayList g = new ArrayList();

    public static int a(float f10, float f11, float f12) {
        float f13 = ((f12 % 360.0f) + 360.0f) % 360.0f;
        float f14 = (f13 < 70.0f || f13 > 135.0f) ? 0.0f : f13 < 85.0f ? (f13 - 70.0f) / 15.0f : f13 > 120.0f ? (135.0f - f13) / 15.0f : 1.0f;
        return f14 <= 0.0f ? g(f10, f11, f12) : g(f10 - (0.04f * f14), com.google.android.gms.internal.vision.e2.C(f14, 0.4f, 1.0f, f11), (f14 * 12.0f) + f12);
    }

    public static int b(double d2) {
        double max = Math.max(0.0d, Math.min(1.0d, d2));
        return (int) Math.round((max <= 0.0031308d ? max * 12.92d : (Math.pow(max, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
    }

    public static float c(int i7) {
        f();
        return f[i7];
    }

    public static float d(float f10) {
        float f11 = ((f10 % 360.0f) + 360.0f) % 360.0f;
        return f10 - (((f11 < 145.0f || f11 > 205.0f) ? 0.0f : f11 < 160.0f ? (f11 - 145.0f) / 15.0f : f11 > 190.0f ? (205.0f - f11) / 15.0f : 1.0f) * 14.0f);
    }

    public static double e(double d2) {
        return d2 <= 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
    }

    public static void f() {
        if (d) {
            return;
        }
        d = true;
        SharedPreferences e12 = np.e1();
        e = e12.getInt("dict_glow_day2_preset", 0);
        e12.getBoolean("dict_glow_day2_contrast", true);
        c = e12.getInt("dict_glow_day2_rimMode", 1);
        for (int i7 = 0; i7 < 12; i7++) {
            f[i7] = e12.getFloat("dict_glow_day2_" + a[i7], b[i7]);
        }
    }

    public static int g(float f10, float f11, float f12) {
        double radians = Math.toRadians(((f12 % 360.0f) + 360.0f) % 360.0f);
        double d2 = f11;
        for (int i7 = 0; i7 < 24; i7++) {
            double cos = Math.cos(radians) * d2;
            double sin = Math.sin(radians) * d2;
            double d10 = f10;
            double d11 = (0.2158037573d * sin) + (0.3963377774d * cos) + d10;
            double d12 = (d10 - (0.1055613458d * cos)) - (0.0638541728d * sin);
            double d13 = (d10 - (cos * 0.0894841775d)) - (sin * 1.291485548d);
            double d14 = d11 * d11 * d11;
            double d15 = d12 * d12 * d12;
            double d16 = d13 * d13 * d13;
            double d17 = (0.2309699292d * d16) + ((4.0767416621d * d14) - (3.3077115913d * d15));
            double d18 = ((2.6097574011d * d15) + ((-1.2684380046d) * d14)) - (0.3413193965d * d16);
            double d19 = (d16 * 1.707614701d) + ((d14 * (-0.0041960863d)) - (d15 * 0.7034186147d));
            if (d17 >= -0.001d && d17 <= 1.001d && d18 >= -0.001d && d18 <= 1.001d && d19 >= -0.001d && d19 <= 1.001d) {
                return Color.rgb(b(d17), b(d18), b(d19));
            }
            d2 *= 0.9d;
        }
        int b10 = b(f10 * f10 * f10);
        return Color.rgb(b10, b10, b10);
    }

    public static float h(int i7) {
        float[] i10 = i(i7);
        float degrees = (float) Math.toDegrees(Math.atan2(i10[2], i10[1]));
        return degrees < 0.0f ? degrees + 360.0f : degrees;
    }

    public static float[] i(int i7) {
        double e10 = e(Color.red(i7) / 255.0d);
        double e11 = e(Color.green(i7) / 255.0d);
        double e12 = e(Color.blue(i7) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * e12) + (0.5363325363d * e11) + (0.4122214708d * e10));
        double cbrt2 = Math.cbrt((0.1073969566d * e12) + (0.6806995451d * e11) + (0.2119034982d * e10));
        double cbrt3 = Math.cbrt((e12 * 0.6299787005d) + (e11 * 0.2817188376d) + (e10 * 0.0883024619d));
        return new float[]{(float) (((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3)), (float) ((0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2))), (float) (((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d))};
    }
}
