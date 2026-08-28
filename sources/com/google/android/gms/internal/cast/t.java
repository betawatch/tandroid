package com.google.android.gms.internal.cast;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t {
    public static final q5.b i = new q5.b("SessionTransController", null);
    public final n5.b a;
    public n5.g f;
    public c0.i g;
    public m5.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final c2.u0 c = new c2.u0(Looper.getMainLooper(), 1);
    public final s d = new s(this, 0);

    public t(n5.b bVar) {
        this.a = bVar;
    }

    public final o5.h a() {
        n5.g gVar = this.f;
        q5.b bVar = i;
        if (gVar == null) {
            bVar.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        n5.c c10 = gVar.c();
        if (c10 == null) {
            bVar.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        x5.l.e("Must be called from the main thread.");
        return c10.j;
    }

    public final void b(int i9) {
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
        i.b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.e), Integer.valueOf(i9));
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            int i10 = this.e;
            switch (y0Var.a) {
                case 0:
                    a1.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i10), Integer.valueOf(i9));
                    a1 a1Var = (a1) y0Var.b;
                    a1Var.c();
                    r1 b10 = a1Var.c.b(a1Var.g);
                    m1 m10 = n1.m(b10.d());
                    m10.c();
                    n1.v((n1) m10.b, i10);
                    m10.c();
                    n1.w((n1) m10.b, i9);
                    b10.e((n1) m10.a());
                    a1Var.a.a((s1) b10.a(), 232);
                    a1Var.i = false;
                    break;
                default:
                    a6.a aVar = new a6.a(11, 3);
                    aVar.b = Integer.valueOf(i9);
                    b3.b bVar = (b3.b) y0Var.b;
                    aVar.d = Boolean.valueOf(((d) bVar.b).d == 2);
                    b3.b.D(bVar, new w6(aVar));
                    break;
            }
        }
        c();
    }

    public final void c() {
        c2.u0 u0Var = this.c;
        x5.l.h(u0Var);
        s sVar = this.d;
        x5.l.h(sVar);
        u0Var.removeCallbacks(sVar);
        this.e = 0;
        this.h = null;
    }
}
