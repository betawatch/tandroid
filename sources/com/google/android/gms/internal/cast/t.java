package com.google.android.gms.internal.cast;

import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t {
    public static final s5.b i = new s5.b("SessionTransController", null);
    public final p5.b a;
    public p5.g f;
    public c0.i g;
    public o5.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final c2.v0 c = new c2.v0(Looper.getMainLooper(), 1);
    public final s d = new s(this, 0);

    public t(p5.b bVar) {
        this.a = bVar;
    }

    public final q5.h a() {
        p5.g gVar = this.f;
        s5.b bVar = i;
        if (gVar == null) {
            bVar.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        p5.c c3 = gVar.c();
        if (c3 == null) {
            bVar.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        z5.l.e("Must be called from the main thread.");
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
            z0 z0Var = (z0) it.next();
            int i11 = this.e;
            switch (z0Var.a) {
                case 0:
                    b1.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i11), Integer.valueOf(i10));
                    b1 b1Var = (b1) z0Var.b;
                    b1Var.c();
                    s1 b10 = b1Var.c.b(b1Var.g);
                    n1 m10 = o1.m(b10.d());
                    m10.c();
                    o1.v((o1) m10.b, i11);
                    m10.c();
                    o1.w((o1) m10.b, i10);
                    b10.e((o1) m10.a());
                    b1Var.a.a((t1) b10.a(), 232);
                    b1Var.i = false;
                    break;
                default:
                    ag.j2 j2Var = new ag.j2(11, 4);
                    j2Var.c = Integer.valueOf(i10);
                    a5.j jVar = (a5.j) z0Var.b;
                    j2Var.d = Boolean.valueOf(((d) jVar.b).d == 2);
                    a5.j.y(jVar, new w6(j2Var));
                    break;
            }
        }
        c();
    }

    public final void c() {
        c2.v0 v0Var = this.c;
        z5.l.h(v0Var);
        s sVar = this.d;
        z5.l.h(sVar);
        v0Var.removeCallbacks(sVar);
        this.e = 0;
        this.h = null;
    }
}
