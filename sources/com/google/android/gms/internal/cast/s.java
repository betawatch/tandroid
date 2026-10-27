package com.google.android.gms.internal.cast;

import a8.me;
import a8.ng;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s {
    public static final h6.b i = new h6.b("SessionTransController", null);
    public final e6.b a;
    public e6.g f;
    public c0.i g;
    public d6.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final y c = new y(Looper.getMainLooper(), 0);
    public final r d = new r(this, 0);

    public s(e6.b bVar) {
        this.a = bVar;
    }

    public final f6.h a() {
        e6.g gVar = this.f;
        h6.b bVar = i;
        if (gVar == null) {
            bVar.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        e6.c c10 = gVar.c();
        if (c10 == null) {
            bVar.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        o6.l.e("Must be called from the main thread.");
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
            v0 v0Var = (v0) it.next();
            int i11 = this.e;
            switch (v0Var.a) {
                case 0:
                    x0.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i11), Integer.valueOf(i10));
                    x0 x0Var = (x0) v0Var.b;
                    x0Var.c();
                    o1 b10 = x0Var.c.b(x0Var.g);
                    j1 m10 = k1.m(b10.d());
                    m10.c();
                    k1.v((k1) m10.b, i11);
                    m10.c();
                    k1.w((k1) m10.b, i10);
                    b10.e((k1) m10.a());
                    x0Var.a.a((p1) b10.a(), 232);
                    x0Var.i = false;
                    break;
                default:
                    ng ngVar = new ng(11, 4);
                    ngVar.c = Integer.valueOf(i10);
                    me meVar = (me) v0Var.b;
                    ngVar.d = Boolean.valueOf(((c) meVar.b).d == 2);
                    me.D(meVar, new t6(ngVar));
                    break;
            }
        }
        c();
    }

    public final void c() {
        y yVar = this.c;
        o6.l.h(yVar);
        r rVar = this.d;
        o6.l.h(rVar);
        yVar.removeCallbacks(rVar);
        this.e = 0;
        this.h = null;
    }
}
