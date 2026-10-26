package com.google.android.gms.internal.cast;

import a8.ca;
import android.os.Bundle;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class z0 {
    public static final h6.b d = new h6.b("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public z0(String str, Bundle bundle) {
        this.a = str;
        this.b = ca.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = ca.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p1 a(y0 y0Var, int i10) {
        int i11;
        Map map;
        int i12;
        o1 b10 = b(y0Var);
        j1 m10 = k1.m(b10.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i10);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                o6.l.h(num);
                i11 = num.intValue();
                m10.c();
                k1.r((k1) m10.b, i11);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i10);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        o6.l.h(num2);
                        i12 = num2.intValue();
                        m10.c();
                        k1.s((k1) m10.b, i12);
                        b10.e((k1) m10.a());
                        return (p1) b10.a();
                    }
                }
                i12 = i10 + 10000;
                m10.c();
                k1.s((k1) m10.b, i12);
                b10.e((k1) m10.a());
                return (p1) b10.a();
            }
        }
        i11 = i10 + 10000;
        m10.c();
        k1.r((k1) m10.b, i11);
        map = this.b;
        if (map != null) {
        }
        i12 = i10 + 10000;
        m10.c();
        k1.s((k1) m10.b, i12);
        b10.e((k1) m10.a());
        return (p1) b10.a();
    }

    public final o1 b(y0 y0Var) {
        long j10;
        o1 m10 = p1.m();
        long j11 = y0Var.d;
        m10.c();
        p1.t((p1) m10.b, j11);
        int i10 = y0Var.e;
        y0Var.e = i10 + 1;
        m10.c();
        p1.o((p1) m10.b, i10);
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
        h1 l4 = i1.l();
        l4.c();
        i1.n((i1) l4.b, e);
        l4.c();
        i1.m((i1) l4.b, this.a);
        i1 i1Var = (i1) l4.a();
        m10.c();
        p1.r((p1) m10.b, i1Var);
        j1 l10 = k1.l();
        if (y0Var.b != null) {
            g2 l11 = h2.l();
            String str3 = y0Var.b;
            l11.c();
            h2.m((h2) l11.b, str3);
            h2 h2Var = (h2) l11.a();
            l10.c();
            k1.o((k1) l10.b, h2Var);
        }
        l10.c();
        k1.p((k1) l10.b, false);
        String str4 = y0Var.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e10) {
                Object[] objArr = {str4};
                h6.b bVar = d;
                Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", objArr), e10);
                j10 = 0;
            }
            l10.c();
            k1.q((k1) l10.b, j10);
        }
        int i11 = y0Var.g;
        l10.c();
        k1.t((k1) l10.b, i11);
        boolean z10 = y0Var.a.d == 2;
        l10.c();
        k1.u((k1) l10.b, z10);
        boolean z11 = y0Var.i;
        l10.c();
        k1.x((k1) l10.b, z11);
        m10.c();
        p1.p((p1) m10.b, (k1) l10.a());
        return m10;
    }
}
