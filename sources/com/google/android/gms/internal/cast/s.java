package com.google.android.gms.internal.cast;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s {
    public static final u5.b i = new u5.b("SessionTransController", null);
    public final r5.b a;
    public r5.g f;
    public c0.i g;
    public q5.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final a7.e c = new a7.e(Looper.getMainLooper(), 2);
    public final r d = new r(this, 0);

    public s(r5.b bVar) {
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
            y0 y0Var = (y0) it.next();
            int i11 = this.e;
            switch (y0Var.a) {
                case 0:
                    a1.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i11), Integer.valueOf(i10));
                    a1 a1Var = (a1) y0Var.b;
                    a1Var.c();
                    r1 b10 = a1Var.c.b(a1Var.g);
                    m1 m9 = n1.m(b10.d());
                    m9.c();
                    n1.v((n1) m9.b, i11);
                    m9.c();
                    n1.w((n1) m9.b, i10);
                    b10.e((n1) m9.a());
                    a1Var.a.a((s1) b10.a(), 232);
                    a1Var.i = false;
                    break;
                default:
                    b4.e0 e0Var = new b4.e0(11, 3);
                    e0Var.c = Integer.valueOf(i10);
                    c5.j jVar = (c5.j) y0Var.b;
                    e0Var.d = Boolean.valueOf(((c) jVar.b).d == 2);
                    c5.j.D(jVar, new v6(e0Var));
                    break;
            }
        }
        c();
    }

    public final void c() {
        a7.e eVar = this.c;
        b6.m.h(eVar);
        r rVar = this.d;
        b6.m.h(rVar);
        eVar.removeCallbacks(rVar);
        this.e = 0;
        this.h = null;
    }
}
