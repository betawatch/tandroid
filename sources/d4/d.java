package d4;

import android.graphics.Color;
import com.google.android.gms.internal.vision.e2;
import v7.y7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    public d(String str, int i10, Integer num, Integer num2, float f7, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.a = str;
        this.b = i10;
        this.c = num;
        this.d = num2;
        this.e = f7;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = z13;
        this.j = i11;
    }

    public static int a(String str) {
        boolean z10;
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
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        e2.s("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            e2.a.o("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            e2.d.b(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(y7.b(((parseLong >> 24) & 255) ^ 255), y7.b(parseLong & 255), y7.b((parseLong >> 8) & 255), y7.b((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            e2.a.o("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
