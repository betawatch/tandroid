package com.google.android.gms.internal.cast;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r {
    public static final u5.b i = new u5.b("SessionTransController", null);
    public final r5.b a;
    public r5.g f;
    public c0.i g;
    public q5.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final a7.e c = new a7.e(Looper.getMainLooper(), 2);
    public final q d = new q(this, 0);

    public r(r5.b bVar) {
        this.a = bVar;
    }

    public final s5.h a() {
        r5.g gVar = this.f;
        u5.b bVar = i;
        if (gVar == null) {
            bVar.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        r5.c c3 = gVar.c();
        if (c3 == null) {
            bVar.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        b6.m.e("Must be called from the main thread.");
        return c3.j;
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
                    l1 m9 = m1.m(b10.d());
                    m9.c();
                    m1.v((m1) m9.b, i11);
                    m9.c();
                    m1.w((m1) m9.b, i10);
                    b10.e((m1) m9.a());
                    z0Var.a.a((r1) b10.a(), 232);
                    z0Var.i = false;
                    break;
                default:
                    b4.e0 e0Var = new b4.e0(11, 2);
                    e0Var.c = Integer.valueOf(i10);
                    c5.j jVar = (c5.j) x0Var.b;
                    e0Var.d = Boolean.valueOf(((c) jVar.b).d == 2);
                    c5.j.D(jVar, new u6(e0Var));
                    break;
            }
        }
        c();
    }

    public final void c() {
        a7.e eVar = this.c;
        b6.m.h(eVar);
        q qVar = this.d;
        b6.m.h(qVar);
        eVar.removeCallbacks(qVar);
        this.e = 0;
        this.h = null;
    }
}
