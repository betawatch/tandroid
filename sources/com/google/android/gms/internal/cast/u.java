package com.google.android.gms.internal.cast;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u {
    public static final g6.b i = new g6.b("SessionTransController", null);
    public final d6.b a;
    public d6.g f;
    public c0.i g;
    public c6.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final a0 c = new a0(Looper.getMainLooper(), 0);
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
            y0 y0Var = (y0) it.next();
            int i11 = this.e;
            switch (y0Var.a) {
                case 0:
                    a1.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i11), Integer.valueOf(i10));
                    a1 a1Var = (a1) y0Var.b;
                    a1Var.c();
                    r1 b10 = a1Var.c.b(a1Var.g);
                    m1 m10 = n1.m(b10.d());
                    m10.c();
                    n1.v((n1) m10.b, i11);
                    m10.c();
                    n1.w((n1) m10.b, i10);
                    b10.e((n1) m10.a());
                    a1Var.a.a((s1) b10.a(), 232);
                    a1Var.i = false;
                    break;
                default:
                    a5.a aVar = new a5.a(11, 2);
                    aVar.c = Integer.valueOf(i10);
                    ci.u5 u5Var = (ci.u5) y0Var.b;
                    aVar.d = Boolean.valueOf(((d) u5Var.b).d == 2);
                    ci.u5.E(u5Var, new w6(aVar));
                    break;
            }
        }
        c();
    }

    public final void c() {
        a0 a0Var = this.c;
        n6.l.h(a0Var);
        t tVar = this.d;
        n6.l.h(tVar);
        a0Var.removeCallbacks(tVar);
        this.e = 0;
        this.h = null;
    }
}
