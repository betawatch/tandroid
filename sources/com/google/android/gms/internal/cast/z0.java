package com.google.android.gms.internal.cast;

import a8.l8;
import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class z0 {
    public static final j6.b d = new j6.b("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public z0(String str, Bundle bundle) {
        this.a = str;
        this.b = l8.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = l8.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p1 a(y0 y0Var, int i7) {
        int i10;
        Map map;
        int i11;
        o1 b10 = b(y0Var);
        j1 m10 = k1.m(b10.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i7);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                q6.m.g(num);
                i10 = num.intValue();
                m10.c();
                k1.r((k1) m10.b, i10);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i7);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        q6.m.g(num2);
                        i11 = num2.intValue();
                        m10.c();
                        k1.s((k1) m10.b, i11);
                        b10.e((k1) m10.a());
                        return (p1) b10.a();
                    }
                }
                i11 = i7 + 10000;
                m10.c();
                k1.s((k1) m10.b, i11);
                b10.e((k1) m10.a());
                return (p1) b10.a();
            }
        }
        i10 = i7 + 10000;
        m10.c();
        k1.r((k1) m10.b, i10);
        map = this.b;
        if (map != null) {
        }
        i11 = i7 + 10000;
        m10.c();
        k1.s((k1) m10.b, i11);
        b10.e((k1) m10.a());
        return (p1) b10.a();
    }

    public final o1 b(y0 y0Var) {
        long j3;
        o1 m10 = p1.m();
        long j10 = y0Var.d;
        m10.c();
        p1.t((p1) m10.b, j10);
        int i7 = y0Var.e;
        y0Var.e = i7 + 1;
        m10.c();
        p1.o((p1) m10.b, i7);
        String str = y0Var.c;
        if (str != null) {
            m10.c();
            p1.y((p1) m10.b, str);
        }
        String str2 = y0Var.h;
        if (str2 != null) {
            m10.c();
            p1.u((p1) m10.b, str2);
        }
        h1 l10 = i1.l();
        l10.c();
        i1.n((i1) l10.b, e);
        l10.c();
        i1.m((i1) l10.b, this.a);
        i1 i1Var = (i1) l10.a();
        m10.c();
        p1.r((p1) m10.b, i1Var);
        j1 l11 = k1.l();
        if (y0Var.b != null) {
            g2 l12 = h2.l();
            String str3 = y0Var.b;
            l12.c();
            h2.m((h2) l12.b, str3);
            h2 h2Var = (h2) l12.a();
            l11.c();
            k1.o((k1) l11.b, h2Var);
        }
        l11.c();
        k1.p((k1) l11.b, false);
        String str4 = y0Var.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e10) {
                Object[] objArr = {str4};
                j6.b bVar = d;
                Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", objArr), e10);
                j3 = 0;
            }
            l11.c();
            k1.q((k1) l11.b, j3);
        }
        int i10 = y0Var.g;
        l11.c();
        k1.t((k1) l11.b, i10);
        boolean z9 = y0Var.a.d == 2;
        l11.c();
        k1.u((k1) l11.b, z9);
        boolean z10 = y0Var.i;
        l11.c();
        k1.x((k1) l11.b, z10);
        m10.c();
        p1.p((p1) m10.b, (k1) l11.a());
        return m10;
    }
}
