package com.google.android.gms.internal.cast;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u {
    public static final g6.b i = new g6.b("SessionTransController", null);
    public final d6.b a;
    public d6.g f;
    public c0.i g;
    public c6.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final c0 c = new c0(Looper.getMainLooper(), 0);
    public final t d = new t(this, 0);

    public u(d6.b bVar) {
        this.a = bVar;
    }

    public final e6.h a() {
        d6.g gVar = this.f;
        g6.b bVar = i;
        if (gVar == null) {
            bVar.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        d6.c c10 = gVar.c();
        if (c10 == null) {
            bVar.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        n6.l.e("Must be called from the main thread.");
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
            a1 a1Var = (a1) it.next();
            int i11 = this.e;
            switch (a1Var.a) {
                case 0:
                    c1.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i11), Integer.valueOf(i10));
                    c1 c1Var = (c1) a1Var.b;
                    c1Var.c();
                    t1 b10 = c1Var.c.b(c1Var.g);
                    o1 m10 = p1.m(b10.d());
                    m10.c();
                    p1.v((p1) m10.b, i11);
                    m10.c();
                    p1.w((p1) m10.b, i10);
                    b10.e((p1) m10.a());
                    c1Var.a.a((u1) b10.a(), 232);
                    c1Var.i = false;
                    break;
                default:
                    a5.a aVar = new a5.a(11, 2);
                    aVar.c = Integer.valueOf(i10);
                    cf.c cVar = (cf.c) a1Var.b;
                    aVar.d = Boolean.valueOf(((d) cVar.b).d == 2);
                    cf.c.y(cVar, new y6(aVar));
                    break;
            }
        }
        c();
    }

    public final void c() {
        c0 c0Var = this.c;
        n6.l.h(c0Var);
        t tVar = this.d;
        n6.l.h(tVar);
        c0Var.removeCallbacks(tVar);
        this.e = 0;
        this.h = null;
    }
}
