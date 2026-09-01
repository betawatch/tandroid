package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b1 {
    public static final u5.b d = new u5.b("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public b1(String str, Bundle bundle) {
        this.a = str;
        this.b = j7.r5.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = j7.r5.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r1 a(a1 a1Var, int i10) {
        int i11;
        Map map;
        int i12;
        q1 b10 = b(a1Var);
        l1 m9 = m1.m(b10.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i10);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                b6.m.h(num);
                i11 = num.intValue();
                m9.c();
                m1.r((m1) m9.b, i11);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i10);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        b6.m.h(num2);
                        i12 = num2.intValue();
                        m9.c();
                        m1.s((m1) m9.b, i12);
                        b10.e((m1) m9.a());
                        return (r1) b10.a();
                    }
                }
                i12 = i10 + 10000;
                m9.c();
                m1.s((m1) m9.b, i12);
                b10.e((m1) m9.a());
                return (r1) b10.a();
            }
        }
        i11 = i10 + 10000;
        m9.c();
        m1.r((m1) m9.b, i11);
        map = this.b;
        if (map != null) {
        }
        i12 = i10 + 10000;
        m9.c();
        m1.s((m1) m9.b, i12);
        b10.e((m1) m9.a());
        return (r1) b10.a();
    }

    public final q1 b(a1 a1Var) {
        long j10;
        q1 m9 = r1.m();
        long j11 = a1Var.d;
        m9.c();
        r1.t((r1) m9.b, j11);
        int i10 = a1Var.e;
        a1Var.e = i10 + 1;
        m9.c();
        r1.o((r1) m9.b, i10);
        String str = a1Var.c;
        if (str != null) {
            m9.c();
            r1.y((r1) m9.b, str);
        }
        String str2 = a1Var.h;
        if (str2 != null) {
            m9.c();
            r1.u((r1) m9.b, str2);
        }
        j1 l10 = k1.l();
        l10.c();
        k1.n((k1) l10.b, e);
        l10.c();
        k1.m((k1) l10.b, this.a);
        k1 k1Var = (k1) l10.a();
        m9.c();
        r1.r((r1) m9.b, k1Var);
        l1 l11 = m1.l();
        if (a1Var.b != null) {
            i2 l12 = j2.l();
            String str3 = a1Var.b;
            l12.c();
            j2.m((j2) l12.b, str3);
            j2 j2Var = (j2) l12.a();
            l11.c();
            m1.o((m1) l11.b, j2Var);
        }
        l11.c();
        m1.p((m1) l11.b, false);
        String str4 = a1Var.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e6) {
                Object[] objArr = {str4};
                u5.b bVar = d;
                Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", objArr), e6);
                j10 = 0;
            }
            l11.c();
            m1.q((m1) l11.b, j10);
        }
        int i11 = a1Var.g;
        l11.c();
        m1.t((m1) l11.b, i11);
        boolean z4 = a1Var.a.d == 2;
        l11.c();
        m1.u((m1) l11.b, z4);
        boolean z10 = a1Var.i;
        l11.c();
        m1.x((m1) l11.b, z10);
        m9.c();
        r1.p((r1) m9.b, (m1) l11.a());
        return m9;
    }
}
