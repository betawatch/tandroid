package com.google.android.gms.internal.cast;

import a8.r7;
import a8.wa;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class s {
    public static final j6.b i = new j6.b("SessionTransController", null);
    public final g6.b a;
    public g6.g f;
    public c0.i g;
    public f6.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final y c = new y(Looper.getMainLooper(), 0);
    public final r d = new r(this, 0);

    public s(g6.b bVar) {
        this.a = bVar;
    }

    public final h6.h a() {
        g6.g gVar = this.f;
        j6.b bVar = i;
        if (gVar == null) {
            bVar.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        g6.c c10 = gVar.c();
        if (c10 == null) {
            bVar.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        q6.m.d("Must be called from the main thread.");
        return c10.j;
    }

    public final void b(int i7) {
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
        i.b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.e), Integer.valueOf(i7));
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            int i10 = this.e;
            switch (v0Var.a) {
                case 0:
                    x0.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i10), Integer.valueOf(i7));
                    x0 x0Var = (x0) v0Var.b;
                    x0Var.c();
                    o1 b10 = x0Var.c.b(x0Var.g);
                    j1 m10 = k1.m(b10.d());
                    m10.c();
                    k1.v((k1) m10.b, i10);
                    m10.c();
                    k1.w((k1) m10.b, i7);
                    b10.e((k1) m10.a());
                    x0Var.a.a((p1) b10.a(), qs.I3);
                    x0Var.i = false;
                    break;
                default:
                    wa waVar = new wa(11, 4);
                    waVar.c = Integer.valueOf(i7);
                    r7 r7Var = (r7) v0Var.b;
                    waVar.d = Boolean.valueOf(((c) r7Var.c).d == 2);
                    r7.K(r7Var, new s6(waVar));
                    break;
            }
        }
        c();
    }

    public final void c() {
        y yVar = this.c;
        q6.m.g(yVar);
        r rVar = this.d;
        q6.m.g(rVar);
        yVar.removeCallbacks(rVar);
        this.e = 0;
        this.h = null;
    }
}
