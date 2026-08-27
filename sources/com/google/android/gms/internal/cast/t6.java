package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t6 {
    public static final r5.b n = new r5.b("SessionFlowSummary", null);
    public static final String o = "21.4.0";
    public static long p = System.currentTimeMillis();
    public final c0 a;
    public final List b;
    public final List c;
    public final List d;
    public final Map e;
    public final o0 f;
    public final String g;
    public final long h;
    public final long i;
    public n5.c j;
    public String k;
    public String l;
    public String m;

    public t6(o0 o0Var, String str) {
        d1 d1Var = d1.b;
        c0 c0Var = new c0(0);
        c0Var.c = d1Var;
        this.a = c0Var;
        this.b = DesugarCollections.synchronizedList(new ArrayList());
        this.c = DesugarCollections.synchronizedList(new ArrayList());
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.e = DesugarCollections.synchronizedMap(new HashMap());
        this.f = o0Var;
        this.g = str;
        this.h = System.currentTimeMillis();
        long j10 = p;
        p = 1 + j10;
        this.i = j10;
    }

    public final void a(n5.c cVar) {
        if (cVar == null) {
            b(2);
            return;
        }
        y5.l.e("Must be called from the main thread.");
        CastDevice castDevice = cVar.k;
        if (castDevice == null) {
            b(3);
            return;
        }
        String str = castDevice.w;
        this.j = cVar;
        String str2 = this.l;
        if (str2 == null) {
            this.l = str;
            this.m = castDevice.e;
            cVar.e();
        } else {
            if (TextUtils.equals(str2, str)) {
                return;
            }
            b(5);
        }
    }

    public final void b(int i10) {
        Integer valueOf = Integer.valueOf(i10 - 1);
        Map map = this.e;
        c cVar = (c) map.get(valueOf);
        if (cVar != null) {
            cVar.d.incrementAndGet();
            cVar.b = System.currentTimeMillis();
        } else {
            c cVar2 = new c(new a(i10));
            cVar2.c = this.h;
            map.put(valueOf, cVar2);
        }
    }
}
