package com.google.android.recaptcha.internal;

import android.widget.TextView;
import com.googlecode.mp4parser.g;
import f3.j0;
import h2.x;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import ui.e;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static float A(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) / f12) + f13;
    }

    public static float B(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) * f13;
    }

    public static float C(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) * f13;
    }

    public static float D(float f10, float f11, float f12, float f13) {
        return f10 * f11 * f12 * f13;
    }

    public static void a(j0 j0Var, x xVar, int i7) {
        j0Var.a(xVar, i7, 0);
    }

    public static boolean b(int i7, int i10, int i11) {
        switch (i7) {
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
        return ((f10 / f11) * f12) + f13;
    }

    public static int d(int i7, int i10, int i11) {
        return zzqv.zzA(i7) + i10 + i11;
    }

    public static int e(int i7, int i10, int i11, int i12) {
        return ((i7 - i10) * i11) + i12;
    }

    public static int f(int i7, int i10, int i11, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i7));
        return i10 + i11;
    }

    public static int g(int i7, int i10, long j3, ArrayList arrayList) {
        arrayList.add(Long.valueOf(j3));
        return i7 + i10;
    }

    public static int h(int i7, int i10, String str) {
        return (str.hashCode() + i7) * i10;
    }

    public static String i(int i7, String str) {
        return i7 + str;
    }

    public static String j(int i7, String str, int i10) {
        return i7 + str + i10;
    }

    public static String k(String str, int i7, int i10) {
        return str.substring(i10, str.length() - i7);
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder m(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
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

    public static void o(int i7, String str, String str2) {
        h2.a.l(str2, str + i7);
    }

    public static void p(int i7, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i7));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static void q(TextView textView, int i7, float f10) {
        textView.setTextSize(i7, f10);
        textView.setTypeface(g0.o());
    }

    public static void r(String str, String str2, String str3) {
        h2.a.l(str3, str + str2);
    }

    public static void s(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void t(e eVar) {
        g.a().getClass();
        g.b(eVar);
    }

    public static /* synthetic */ boolean u(Object obj) {
        return obj != null;
    }

    public static float v(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 - f11) * f12);
    }

    public static float w(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 * f11)) / f13;
    }

    public static float x(float f10, float f11, float f12, float f13) {
        return (f10 * f11 * f12) + f13;
    }

    public static float y(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) / f13;
    }

    public static float z(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }
}
