package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.util.Log;
import b8.z9;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a1 {
    public static final i6.b d = new i6.b("ApplicationAnalyticsUtils", null);
    public static final String e = "21.4.0";
    public final String a;
    public final Map b;
    public final Map c;

    public a1(String str, Bundle bundle) {
        this.a = str;
        this.b = z9.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.c = z9.a("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q1 a(z0 z0Var, int i3) {
        int i10;
        Map map;
        int i11;
        p1 b10 = b(z0Var);
        k1 m10 = l1.m(b10.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i3);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                p6.m.g(num);
                i10 = num.intValue();
                m10.c();
                l1.r((l1) m10.b, i10);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i3);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        p6.m.g(num2);
                        i11 = num2.intValue();
                        m10.c();
                        l1.s((l1) m10.b, i11);
                        b10.e((l1) m10.a());
                        return (q1) b10.a();
                    }
                }
                i11 = i3 + 10000;
                m10.c();
                l1.s((l1) m10.b, i11);
                b10.e((l1) m10.a());
                return (q1) b10.a();
            }
        }
        i10 = i3 + 10000;
        m10.c();
        l1.r((l1) m10.b, i10);
        map = this.b;
        if (map != null) {
        }
        i11 = i3 + 10000;
        m10.c();
        l1.s((l1) m10.b, i11);
        b10.e((l1) m10.a());
        return (q1) b10.a();
    }

    public final p1 b(z0 z0Var) {
        long j10;
        p1 m10 = q1.m();
        long j11 = z0Var.d;
        m10.c();
        q1.t((q1) m10.b, j11);
        int i3 = z0Var.e;
        z0Var.e = i3 + 1;
        m10.c();
        q1.o((q1) m10.b, i3);
        String str = z0Var.c;
        if (str != null) {
            m10.c();
            q1.y((q1) m10.b, str);
        }
        String str2 = z0Var.h;
        if (str2 != null) {
            m10.c();
            q1.u((q1) m10.b, str2);
        }
        i1 l10 = j1.l();
        l10.c();
        j1.n((j1) l10.b, e);
        l10.c();
        j1.m((j1) l10.b, this.a);
        j1 j1Var = (j1) l10.a();
        m10.c();
        q1.r((q1) m10.b, j1Var);
        k1 l11 = l1.l();
        if (z0Var.b != null) {
            h2 l12 = i2.l();
            String str3 = z0Var.b;
            l12.c();
            i2.m((i2) l12.b, str3);
            i2 i2Var = (i2) l12.a();
            l11.c();
            l1.o((l1) l11.b, i2Var);
        }
        l11.c();
        l1.p((l1) l11.b, false);
        String str4 = z0Var.f;
        if (str4 != null) {
            try {
                String replace = str4.replace("-", "");
                j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e10) {
                Object[] objArr = {str4};
                i6.b bVar = d;
                Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", objArr), e10);
                j10 = 0;
            }
            l11.c();
            l1.q((l1) l11.b, j10);
        }
        int i10 = z0Var.g;
        l11.c();
        l1.t((l1) l11.b, i10);
        boolean z10 = z0Var.a.d == 2;
        l11.c();
        l1.u((l1) l11.b, z10);
        boolean z11 = z0Var.i;
        l11.c();
        l1.x((l1) l11.b, z11);
        m10.c();
        q1.p((q1) m10.b, (l1) l11.a());
        return m10;
    }
}
