package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e1 {
    public static final g6.b d = new g6.b("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public e1(String str, Bundle bundle) {
        this.a = str;
        this.b = v7.h5.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = v7.h5.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u1 a(d1 d1Var, int i10) {
        int i11;
        Map map;
        int i12;
        t1 b10 = b(d1Var);
        o1 m10 = p1.m(b10.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i10);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                n6.l.h(num);
                i11 = num.intValue();
                m10.c();
                p1.r((p1) m10.b, i11);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i10);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        n6.l.h(num2);
                        i12 = num2.intValue();
                        m10.c();
                        p1.s((p1) m10.b, i12);
                        b10.e((p1) m10.a());
                        return (u1) b10.a();
                    }
                }
                i12 = i10 + 10000;
                m10.c();
                p1.s((p1) m10.b, i12);
                b10.e((p1) m10.a());
                return (u1) b10.a();
            }
        }
        i11 = i10 + 10000;
        m10.c();
        p1.r((p1) m10.b, i11);
        map = this.b;
        if (map != null) {
        }
        i12 = i10 + 10000;
        m10.c();
        p1.s((p1) m10.b, i12);
        b10.e((p1) m10.a());
        return (u1) b10.a();
    }

    public final t1 b(d1 d1Var) {
        long j3;
        t1 m10 = u1.m();
        long j10 = d1Var.d;
        m10.c();
        u1.t((u1) m10.b, j10);
        int i10 = d1Var.e;
        d1Var.e = i10 + 1;
        m10.c();
        u1.o((u1) m10.b, i10);
        String str = d1Var.c;
        if (str != null) {
            m10.c();
            u1.y((u1) m10.b, str);
        }
        String str2 = d1Var.h;
        if (str2 != null) {
            m10.c();
            u1.u((u1) m10.b, str2);
        }
        m1 l4 = n1.l();
        l4.c();
        n1.n((n1) l4.b, e);
        l4.c();
        n1.m((n1) l4.b, this.a);
        n1 n1Var = (n1) l4.a();
        m10.c();
        u1.r((u1) m10.b, n1Var);
        o1 l10 = p1.l();
        if (d1Var.b != null) {
            l2 l11 = m2.l();
            String str3 = d1Var.b;
            l11.c();
            m2.m((m2) l11.b, str3);
            m2 m2Var = (m2) l11.a();
            l10.c();
            p1.o((p1) l10.b, m2Var);
        }
        l10.c();
        p1.p((p1) l10.b, false);
        String str4 = d1Var.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e7) {
                Object[] objArr = {str4};
                g6.b bVar = d;
                Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", objArr), e7);
                j3 = 0;
            }
            l10.c();
            p1.q((p1) l10.b, j3);
        }
        int i11 = d1Var.g;
        l10.c();
        p1.t((p1) l10.b, i11);
        boolean z10 = d1Var.a.d == 2;
        l10.c();
        p1.u((p1) l10.b, z10);
        boolean z11 = d1Var.i;
        l10.c();
        p1.x((p1) l10.b, z11);
        m10.c();
        u1.p((u1) m10.b, (p1) l10.a());
        return m10;
    }
}
