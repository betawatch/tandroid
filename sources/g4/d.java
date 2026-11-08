package g4;

import a8.ia;
import android.graphics.Color;
import c8.e1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public d(String str, int i7, Integer num, Integer num2, float f10, boolean z9, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = str;
        this.b = i7;
        this.c = num;
        this.d = num2;
        this.e = f10;
        this.f = z9;
        this.g = z10;
        this.h = z11;
        this.i = z12;
        this.j = i10;
    }

    public static int a(String str) {
        boolean z9;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z9 = true;
                    break;
                default:
                    z9 = false;
                    break;
            }
            if (z9) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        com.google.android.recaptcha.internal.a.r("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            h2.a.m("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            ia.f(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(e1.b(((parseLong >> 24) & 255) ^ 255), e1.b(parseLong & 255), e1.b((parseLong >> 8) & 255), e1.b((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            h2.a.m("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
