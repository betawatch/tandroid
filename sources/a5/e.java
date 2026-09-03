package a5;

import android.graphics.Color;
import k7.y7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e {
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

    public e(String str, int i10, Integer num, Integer num2, float f10, boolean z4, boolean z10, boolean z11, boolean z12, int i11) {
        this.a = str;
        this.b = i10;
        this.c = num;
        this.d = num2;
        this.e = f10;
        this.f = z4;
        this.g = z10;
        this.h = z11;
        this.i = z12;
        this.j = i11;
    }

    public static int a(String str) {
        boolean z4;
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
                    z4 = true;
                    break;
                default:
                    z4 = false;
                    break;
            }
            if (z4) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        android.support.v4.media.a.w("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e6) {
            h5.a.L("SsaStyle", "Failed to parse boolean value: '" + str + "'", e6);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            h5.a.f(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(y7.a(((parseLong >> 24) & 255) ^ 255), y7.a(parseLong & 255), y7.a((parseLong >> 8) & 255), y7.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e6) {
            h5.a.L("SsaStyle", "Failed to parse color expression: '" + str + "'", e6);
            return null;
        }
    }
}
