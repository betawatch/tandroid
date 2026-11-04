package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s6 {
    public static final i6.b n = new i6.b("SessionFlowSummary", null);
    public static final String o = "21.4.0";
    public static long p = System.currentTimeMillis();
    public final c0 a;
    public final List b;
    public final List c;
    public final List d;
    public final Map e;
    public final n0 f;
    public final String g;
    public final long h;
    public final long i;
    public f6.c j;
    public String k;
    public String l;
    public String m;

    public s6(n0 n0Var, String str) {
        c1 c1Var = c1.b;
        c0 c0Var = new c0(0);
        c0Var.c = c1Var;
        this.a = c0Var;
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

    public final void a(f6.c cVar) {
        if (cVar == null) {
            b(2);
            return;
        }
        p6.m.d("Must be called from the main thread.");
        CastDevice castDevice = cVar.k;
        if (castDevice == null) {
            b(3);
            return;
        }
        String str = castDevice.x;
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

    public final void b(int i3) {
        Integer valueOf = Integer.valueOf(i3 - 1);
        Map map = this.e;
        b bVar = (b) map.get(valueOf);
        if (bVar != null) {
            bVar.d.incrementAndGet();
            bVar.b = System.currentTimeMillis();
        } else {
            b bVar2 = new b(new a7.l(i3));
            bVar2.c = this.h;
            map.put(valueOf, bVar2);
        }
    }
}
