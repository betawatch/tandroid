package com.google.android.gms.internal.vision;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.recaptcha.internal.zzqv;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e2 {
    public static float A(float f7, float f10, float f11, float f12) {
        return ((f7 - f10) / f11) + f12;
    }

    public static float B(float f7, float f10, float f11, float f12) {
        return ((f7 * f10) + f11) * f12;
    }

    public static float C(float f7, float f10, float f11, float f12) {
        return f7 * f10 * f11 * f12;
    }

    public static boolean a(int i10, int i11, int i12) {
        switch (i10) {
            case 1:
                if (((i11 + i12) & 1) == 0) {
                }
                break;
            case 2:
                if ((i11 & 1) == 0) {
                }
                break;
            case 3:
                if (i12 % 3 == 0) {
                }
                break;
            case 4:
                if ((i11 + i12) % 3 == 0) {
                }
                break;
            case 5:
                if ((((i12 / 3) + (i11 / 2)) & 1) == 0) {
                }
                break;
            case 6:
                if ((i11 * i12) % 6 == 0) {
                }
                break;
            case 7:
                if ((i11 * i12) % 6 < 3) {
                }
                break;
            default:
                if (((((i11 * i12) % 3) + i11 + i12) & 1) == 0) {
                }
                break;
        }
        return true;
    }

    public static float b(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 - f10) * f11);
    }

    public static int c(int i10, int i11, int i12) {
        return zzqv.zzA(i10) + i11 + i12;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return r0.T(i10) + i11 + i12 + i13;
    }

    public static int e(int i10, int i11, int i12, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i10));
        return i11 + i12;
    }

    public static int f(int i10, int i11, ArrayList arrayList) {
        return i11 - (arrayList.size() + i10);
    }

    public static int g(long j3, ArrayList arrayList, int i10, int i11) {
        arrayList.add(Long.valueOf(j3));
        return i10 + i11;
    }

    public static TextView h(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static String i(int i10, int i11, String str) {
        return str.substring(i11, str.length() - i10);
    }

    public static String j(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static fl0 k(View view, View view2, int i10, int i11) {
        view.setLayoutParams(new s4.p0(i10, i11));
        return new fl0(view2);
    }

    public static void l(float f7, int i10, TextView textView) {
        textView.setTextSize(i10, f7);
        textView.setTypeface(AndroidUtilities.bold());
    }

    public static void m(int i10, String str, String str2) {
        e2.a.n(str2, str + i10);
    }

    public static void n(int i10, ArrayList arrayList) {
        arrayList.add(w51.t(LocaleController.getString(i10)));
    }

    public static void o(int i10, HashMap hashMap, String str, int i11, String str2) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
    }

    public static void p(int i10, boolean[] zArr, boolean z10, TextView textView, int i11) {
        textView.setTextColor(j6.w0(zArr, i10, z10));
        textView.setGravity(i11);
    }

    public static void q(com.google.firebase.messaging.t tVar) {
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(tVar);
    }

    public static void r(gg.m mVar, int i10, ArrayList arrayList) {
        arrayList.add(new gg.k(mVar, i10));
    }

    public static void s(String str, String str2, String str3) {
        e2.a.n(str3, str + str2);
    }

    public static void t(String str, StringBuilder sb2) {
        sb2.append(str);
        FileLog.d(sb2.toString());
    }

    public static /* synthetic */ boolean u(Object obj) {
        return obj != null;
    }

    public static float v(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 * f10)) / f12;
    }

    public static void w(int i10, ArrayList arrayList) {
        arrayList.add(w51.B(LocaleController.getString(i10)));
    }

    public static float x(float f7, float f10, float f11, float f12) {
        return (f7 * f10 * f11) + f12;
    }

    public static float y(float f7, float f10, float f11, float f12) {
        return ((f7 * f10) + f11) / f12;
    }

    public static float z(float f7, float f10, float f11, float f12) {
        return ((f7 - f10) * f11) + f12;
    }
}
