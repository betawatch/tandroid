package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c1 {
    public static final q5.b d = new q5.b("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public c1(String str, Bundle bundle) {
        this.a = str;
        this.b = f7.j5.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = f7.j5.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s1 a(b1 b1Var, int i9) {
        int i10;
        Map map;
        int i11;
        r1 b10 = b(b1Var);
        m1 m10 = n1.m(b10.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i9);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                x5.l.h(num);
                i10 = num.intValue();
                m10.c();
                n1.r((n1) m10.b, i10);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i9);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        x5.l.h(num2);
                        i11 = num2.intValue();
                        m10.c();
                        n1.s((n1) m10.b, i11);
                        b10.e((n1) m10.a());
                        return (s1) b10.a();
                    }
                }
                i11 = i9 + 10000;
                m10.c();
                n1.s((n1) m10.b, i11);
                b10.e((n1) m10.a());
                return (s1) b10.a();
            }
        }
        i10 = i9 + 10000;
        m10.c();
        n1.r((n1) m10.b, i10);
        map = this.b;
        if (map != null) {
        }
        i11 = i9 + 10000;
        m10.c();
        n1.s((n1) m10.b, i11);
        b10.e((n1) m10.a());
        return (s1) b10.a();
    }

    public final r1 b(b1 b1Var) {
        long j10;
        r1 m10 = s1.m();
        long j11 = b1Var.d;
        m10.c();
        s1.t((s1) m10.b, j11);
        int i9 = b1Var.e;
        b1Var.e = i9 + 1;
        m10.c();
        s1.o((s1) m10.b, i9);
        String str = b1Var.c;
        if (str != null) {
            m10.c();
            s1.y((s1) m10.b, str);
        }
        String str2 = b1Var.h;
        if (str2 != null) {
            m10.c();
            s1.u((s1) m10.b, str2);
        }
        k1 l10 = l1.l();
        l10.c();
        l1.n((l1) l10.b, e);
        l10.c();
        l1.m((l1) l10.b, this.a);
        l1 l1Var = (l1) l10.a();
        m10.c();
        s1.r((s1) m10.b, l1Var);
        m1 l11 = n1.l();
        if (b1Var.b != null) {
            j2 l12 = k2.l();
            String str3 = b1Var.b;
            l12.c();
            k2.m((k2) l12.b, str3);
            k2 k2Var = (k2) l12.a();
            l11.c();
            n1.o((n1) l11.b, k2Var);
        }
        l11.c();
        n1.p((n1) l11.b, false);
        String str4 = b1Var.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e10) {
                Object[] objArr = {str4};
                q5.b bVar = d;
                Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", objArr), e10);
                j10 = 0;
            }
            l11.c();
            n1.q((n1) l11.b, j10);
        }
        int i10 = b1Var.g;
        l11.c();
        n1.t((n1) l11.b, i10);
        boolean z10 = b1Var.a.d == 2;
        l11.c();
        n1.u((n1) l11.b, z10);
        boolean z11 = b1Var.i;
        l11.c();
        n1.x((n1) l11.b, z11);
        m10.c();
        s1.p((s1) m10.b, (n1) l11.a());
        return m10;
    }
}
