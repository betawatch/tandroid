package com.google.android.recaptcha.internal;

import com.googlecode.mp4parser.g;
import e3.i0;
import g2.y;
import java.util.ArrayList;
import java.util.HashMap;
import ui.f;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static float A(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) * f13;
    }

    public static float B(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) * f13;
    }

    public static float C(float f10, float f11, float f12, float f13) {
        return f10 * f11 * f12 * f13;
    }

    public static void a(i0 i0Var, y yVar, int i3) {
        i0Var.f(yVar, i3, 0);
    }

    public static boolean b(int i3, int i10, int i11) {
        switch (i3) {
            case 1:
                if (((i10 + i11) & 1) == 0) {
                }
                break;
            case 2:
                if ((i10 & 1) == 0) {
                }
                break;
            case 3:
                if (i11 % 3 == 0) {
                }
                break;
            case 4:
                if ((i10 + i11) % 3 == 0) {
                }
                break;
            case 5:
                if ((((i11 / 3) + (i10 / 2)) & 1) == 0) {
                }
                break;
            case 6:
                if ((i10 * i11) % 6 == 0) {
                }
                break;
            case 7:
                if ((i10 * i11) % 6 < 3) {
                }
                break;
            default:
                if (((((i10 * i11) % 3) + i10 + i11) & 1) == 0) {
                }
                break;
        }
        return true;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) / f13;
    }

    public static int d(int i3, int i10, int i11) {
        return zzqv.zzA(i3) + i10 + i11;
    }

    public static int e(int i3, int i10, int i11, int i12) {
        return ((i3 - i10) * i11) + i12;
    }

    public static int f(int i3, int i10, int i11, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i3));
        return i10 + i11;
    }

    public static int g(int i3, int i10, String str) {
        return (str.hashCode() + i3) * i10;
    }

    public static String h(int i3, String str) {
        return i3 + str;
    }

    public static String i(int i3, String str, int i10) {
        return i3 + str + i10;
    }

    public static String j(String str, int i3, int i10) {
        return str.substring(i10, str.length() - i3);
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder l(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder m(String str, int i3, String str2, int i10, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i3);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder n(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static void o(int i3, String str, String str2) {
        g2.a.l(str2, str + i3);
    }

    public static void p(int i3, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i3));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static void q(String str, String str2, String str3) {
        g2.a.l(str3, str + str2);
    }

    public static void r(StringBuilder sb2, int i3, String str, int i10, String str2) {
        sb2.append(i3);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }

    public static void s(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void t(f fVar) {
        g.a().getClass();
        g.b(fVar);
    }

    public static /* synthetic */ boolean u(Object obj) {
        return obj != null;
    }

    public static float v(float f10, float f11, float f12, float f13) {
        return (f10 * f11 * f12) + f13;
    }

    public static void w(int i3, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(Integer.valueOf(i3), str);
        hashMap.put(Integer.valueOf(i10), str2);
    }

    public static float x(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) / f13;
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static float z(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) / f12) + f13;
    }
}
