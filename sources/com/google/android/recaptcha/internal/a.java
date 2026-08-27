package com.google.android.recaptcha.internal;

import android.os.Bundle;
import g7.e;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static float A(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) / f12) + f13;
    }

    public static float B(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) * f13;
    }

    public static float C(float f10, float f11, float f12, float f13) {
        return f10 * f11 * f12 * f13;
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

    public static float d(float f10, float f11, float f12, float f13) {
        return (f10 * f11) + f12 + f13;
    }

    public static int e(int i10, int i11, int i12) {
        return zzqv.zzA(i10) + i11 + i12;
    }

    public static int f(long j10, ArrayList arrayList, int i10, int i11) {
        arrayList.add(Long.valueOf(j10));
        return i10 + i11;
    }

    public static int g(Float f10, float f11) {
        return AndroidUtilities.dp(f10.floatValue() * f11);
    }

    public static Bundle h(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static e i(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new e(i10);
    }

    public static h7.a j(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new h7.a(i10);
    }

    public static Object k(int i10, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i10);
    }

    public static String l(int i10, String str, int i11) {
        return i10 + str + i11;
    }

    public static String m(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String n(String str, int i10, int i11) {
        return str.substring(i11, str.length() - i10);
    }

    public static StringBuilder o(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder p(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap q(Class cls, e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap r(Class cls, h7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static void s(int i10, String str, String str2) {
        d5.a.K(str2, str + i10);
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
