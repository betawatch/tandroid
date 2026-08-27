package com.google.android.gms.internal.cast;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s {
    public static final r5.b i = new r5.b("SessionTransController", null);
    public final n5.b a;
    public n5.h f;
    public c0.i g;
    public m5.s h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final c2.t0 c = new c2.t0(Looper.getMainLooper(), 1);
    public final r d = new r(this, 0);

    public s(n5.b bVar) {
        this.a = bVar;
    }

    public final o5.h a() {
        n5.h hVar = this.f;
        r5.b bVar = i;
        if (hVar == null) {
            bVar.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        n5.c c10 = hVar.c();
        if (c10 == null) {
            bVar.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        y5.l.e("Must be called from the main thread.");
        return c10.j;
    }

    public final void b(int i10) {
        c0.i iVar = this.g;
        if (iVar != null) {
            iVar.d = true;
            c0.k kVar = iVar.b;
            if (kVar != null && kVar.b.cancel(true)) {
                iVar.a = null;
                iVar.b = null;
                iVar.c = null;
            }
        }
        i.b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.e), Integer.valueOf(i10));
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            x0 x0Var = (x0) it.next();
            int i11 = this.e;
            switch (x0Var.a) {
                case 0:
                    z0.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i11), Integer.valueOf(i10));
                    z0 z0Var = (z0) x0Var.b;
                    z0Var.c();
                    q1 b10 = z0Var.c.b(z0Var.g);
                    l1 m10 = m1.m(b10.d());
                    m10.c();
                    m1.v((m1) m10.b, i11);
                    m10.c();
                    m1.w((m1) m10.b, i10);
                    b10.e((m1) m10.a());
                    z0Var.a.a((r1) b10.a(), 232);
                    z0Var.i = false;
                    break;
                default:
                    b6.a aVar = new b6.a(11, 3);
                    aVar.b = Integer.valueOf(i10);
                    af.h hVar = (af.h) x0Var.b;
                    aVar.d = Boolean.valueOf(((d) hVar.b).d == 2);
                    af.h.E(hVar, new u6(aVar));
                    break;
            }
        }
        c();
    }

    public final void c() {
        c2.t0 t0Var = this.c;
        y5.l.h(t0Var);
        r rVar = this.d;
        y5.l.h(rVar);
        t0Var.removeCallbacks(rVar);
        this.e = 0;
        this.h = null;
    }
}
