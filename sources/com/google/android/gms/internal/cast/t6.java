package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class t6 {
    public static final u5.b n = new u5.b("SessionFlowSummary", null);
    public static final String o = "21.4.0";
    public static long p = System.currentTimeMillis();
    public final b0 a;
    public final List b;
    public final List c;
    public final List d;
    public final Map e;
    public final n0 f;
    public final String g;
    public final long h;
    public final long i;
    public r5.c j;
    public String k;
    public String l;
    public String m;

    public t6(n0 n0Var, String str) {
        d1 d1Var = d1.b;
        b0 b0Var = new b0(0);
        b0Var.c = d1Var;
        this.a = b0Var;
        this.b = DesugarCollections.synchronizedList(new ArrayList());
        this.c = DesugarCollections.synchronizedList(new ArrayList());
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.e = DesugarCollections.synchronizedMap(new HashMap());
        this.f = n0Var;
        this.g = str;
        this.h = System.currentTimeMillis();
        long j10 = p;
        p = 1 + j10;
        this.i = j10;
    }

    public final void a(r5.c cVar) {
        if (cVar == null) {
            b(2);
            return;
        }
        b6.m.e("Must be called from the main thread.");
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
        b bVar = (b) map.get(valueOf);
        if (bVar != null) {
            bVar.d.incrementAndGet();
            bVar.b = System.currentTimeMillis();
        } else {
            b bVar2 = new b(new c5.c(i10));
            bVar2.c = this.h;
            map.put(valueOf, bVar2);
        }
    }
}
