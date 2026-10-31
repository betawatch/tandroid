package com.google.android.gms.internal.cast;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t {
    public static final g6.b i = new g6.b("SessionTransController", null);
    public final d6.b a;
    public d6.g f;
    public c0.i g;
    public c6.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final z c = new z(Looper.getMainLooper(), 0);
    public final s d = new s(this, 0);

    public t(d6.b bVar) {
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
        n6.l.d("Must be called from the main thread.");
        return c10.j;
    }

    public final void b(int i10) {
        c0.i iVar = this.g;
        if (iVar != null) {
            iVar.d = true;
            c0.l lVar = iVar.b;
            if (lVar != null && lVar.b.cancel(true)) {
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
                    z0Var.a.a((r1) b10.a(), zs.I3);
                    z0Var.i = false;
                    break;
                default:
                    a5.a aVar = new a5.a(11, 3);
                    aVar.c = Integer.valueOf(i10);
                    bh.d dVar = (bh.d) x0Var.b;
                    aVar.d = Boolean.valueOf(((c) dVar.b).d == 2);
                    bh.d.O(dVar, new u6(aVar));
                    break;
            }
        }
        c();
    }

    public final void c() {
        z zVar = this.c;
        n6.l.g(zVar);
        s sVar = this.d;
        n6.l.g(sVar);
        zVar.removeCallbacks(sVar);
        this.e = 0;
        this.h = null;
    }
}
