package com.google.android.recaptcha.internal;

import h7.e;
import j$.util.DesugarCollections;
import j7.e0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static float A(float f9, float f10, float f11, float f12) {
        return ((f9 - f10) / f11) + f12;
    }

    public static float B(float f9, float f10, float f11, float f12) {
        return ((f9 * f10) + f11) * f12;
    }

    public static float C(float f9, float f10, float f11, float f12) {
        return f9 * f10 * f11 * f12;
    }

    public static /* synthetic */ int D(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("GET")) {
            return 1;
        }
        if (str.equals("PUT")) {
            return 2;
        }
        if (str.equals("POST")) {
            return 3;
        }
        if (str.equals("DELETE")) {
            return 4;
        }
        if (str.equals("HEAD")) {
            return 5;
        }
        if (str.equals("OPTIONS")) {
            return 6;
        }
        if (str.equals("TRACE")) {
            return 7;
        }
        if (str.equals("CONNECT")) {
            return 8;
        }
        if (str.equals("PATCH")) {
            return 9;
        }
        if (str.equals("PROPFIND")) {
            return 10;
        }
        if (str.equals("PROPPATCH")) {
            return 11;
        }
        if (str.equals("MKCOL")) {
            return 12;
        }
        if (str.equals("MOVE")) {
            return 13;
        }
        if (str.equals("COPY")) {
            return 14;
        }
        if (str.equals("LOCK")) {
            return 15;
        }
        if (str.equals("UNLOCK")) {
            return 16;
        }
        throw new IllegalArgumentException("No enum constant fi.iki.elonen.NanoHTTPD.Method.".concat(str));
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return D(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static int b(int i10, int i11, int i12) {
        return i10 | i11 | i12 | 128;
    }

    public static /* synthetic */ int c(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i11;
    }

    public static float d(float f9, float f10, float f11, float f12) {
        return (f9 * f10) + f11 + f12;
    }

    public static int e(int i10, int i11, int i12) {
        return zzqv.zzA(i10) + i11 + i12;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) * i12) + i13;
    }

    public static int g(Float f9, float f10) {
        return AndroidUtilities.dp(f9.floatValue() * f10);
    }

    public static e h(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new e(i10);
    }

    public static i7.a i(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new i7.a(i10);
    }

    public static Object j(int i10, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i10);
    }

    public static String k(int i10, String str, int i11) {
        return i10 + str + i11;
    }

    public static String l(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String m(String str, int i10, int i11) {
        return str.substring(i11, str.length() - i10);
    }

    public static StringBuilder n(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder o(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap p(Class cls, e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap q(Class cls, i7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static HashMap r(Class cls, e0 e0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, e0Var);
        return hashMap;
    }

    public static void s(int i10, String str, String str2) {
        f5.a.K(str2, str + i10);
    }

    public static void t(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ boolean u(Object obj) {
        return obj != null;
    }

    public static boolean v(String str) {
        return new File(str).exists();
    }

    public static float w(float f9, float f10, float f11, float f12) {
        return (f11 - (f9 * f10)) / f12;
    }

    public static float x(float f9, float f10, float f11, float f12) {
        return (f9 * f10 * f11) + f12;
    }

    public static float y(float f9, float f10, float f11, float f12) {
        return ((f9 * f10) + f11) / f12;
    }

    public static float z(float f9, float f10, float f11, float f12) {
        return ((f9 - f10) * f11) + f12;
    }
}
