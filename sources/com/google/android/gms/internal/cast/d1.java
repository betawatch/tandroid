package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d1 {
    public static final s5.b d = new s5.b("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public d1(String str, Bundle bundle) {
        this.a = str;
        this.b = h7.q5.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = h7.q5.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t1 a(c1 c1Var, int i10) {
        int i11;
        Map map;
        int i12;
        s1 b10 = b(c1Var);
        n1 m10 = o1.m(b10.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i10);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                z5.l.h(num);
                i11 = num.intValue();
                m10.c();
                o1.r((o1) m10.b, i11);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i10);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        z5.l.h(num2);
                        i12 = num2.intValue();
                        m10.c();
                        o1.s((o1) m10.b, i12);
                        b10.e((o1) m10.a());
                        return (t1) b10.a();
                    }
                }
                i12 = i10 + 10000;
                m10.c();
                o1.s((o1) m10.b, i12);
                b10.e((o1) m10.a());
                return (t1) b10.a();
            }
        }
        i11 = i10 + 10000;
        m10.c();
        o1.r((o1) m10.b, i11);
        map = this.b;
        if (map != null) {
        }
        i12 = i10 + 10000;
        m10.c();
        o1.s((o1) m10.b, i12);
        b10.e((o1) m10.a());
        return (t1) b10.a();
    }

    public final s1 b(c1 c1Var) {
        long j10;
        s1 m10 = t1.m();
        long j11 = c1Var.d;
        m10.c();
        t1.t((t1) m10.b, j11);
        int i10 = c1Var.e;
        c1Var.e = i10 + 1;
        m10.c();
        t1.o((t1) m10.b, i10);
        String str = c1Var.c;
        if (str != null) {
            m10.c();
            t1.y((t1) m10.b, str);
        }
        String str2 = c1Var.h;
        if (str2 != null) {
            m10.c();
            t1.u((t1) m10.b, str2);
        }
        l1 l10 = m1.l();
        l10.c();
        m1.n((m1) l10.b, e);
        l10.c();
        m1.m((m1) l10.b, this.a);
        m1 m1Var = (m1) l10.a();
        m10.c();
        t1.r((t1) m10.b, m1Var);
        n1 l11 = o1.l();
        if (c1Var.b != null) {
            k2 l12 = l2.l();
            String str3 = c1Var.b;
            l12.c();
            l2.m((l2) l12.b, str3);
            l2 l2Var = (l2) l12.a();
            l11.c();
            o1.o((o1) l11.b, l2Var);
        }
        l11.c();
        o1.p((o1) l11.b, false);
        String str4 = c1Var.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e10) {
                Object[] objArr = {str4};
                s5.b bVar = d;
                Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", objArr), e10);
                j10 = 0;
            }
            l11.c();
            o1.q((o1) l11.b, j10);
        }
        int i11 = c1Var.g;
        l11.c();
        o1.t((o1) l11.b, i11);
        boolean z10 = c1Var.a.d == 2;
        l11.c();
        o1.u((o1) l11.b, z10);
        boolean z11 = c1Var.i;
        l11.c();
        o1.x((o1) l11.b, z11);
        m10.c();
        t1.p((t1) m10.b, (o1) l11.a());
        return m10;
    }
}
