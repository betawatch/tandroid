package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class x6 {
    public static final g6.b n = new g6.b("SessionFlowSummary", null);
    public static final String o = "21.4.0";
    public static long p = System.currentTimeMillis();
    public final f0 a;
    public final List b;
    public final List c;
    public final List d;
    public final Map e;
    public final r0 f;
    public final String g;
    public final long h;
    public final long i;
    public d6.c j;
    public String k;
    public String l;
    public String m;

    public x6(r0 r0Var, String str) {
        g1 g1Var = g1.b;
        f0 f0Var = new f0(0);
        f0Var.c = g1Var;
        this.a = f0Var;
        this.b = DesugarCollections.synchronizedList(new ArrayList());
        this.c = DesugarCollections.synchronizedList(new ArrayList());
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.e = DesugarCollections.synchronizedMap(new HashMap());
        this.f = r0Var;
        this.g = str;
        this.h = System.currentTimeMillis();
        long j3 = p;
        p = 1 + j3;
        this.i = j3;
    }

    public final void a(d6.c cVar) {
        if (cVar == null) {
            b(2);
            return;
        }
        n6.l.e("Must be called from the main thread.");
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
