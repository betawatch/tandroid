package com.google.android.gms.internal.cast;

import android.os.Looper;
import b8.ke;
import b8.kg;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t {
    public static final i6.b i = new i6.b("SessionTransController", null);
    public final f6.b a;
    public f6.g f;
    public c0.i g;
    public e6.r h;
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
    public int e = 0;
    public final z c = new z(Looper.getMainLooper(), 0);
    public final s d = new s(this, 0);

    public t(f6.b bVar) {
        this.a = bVar;
    }

    public final g6.h a() {
        f6.g gVar = this.f;
        i6.b bVar = i;
        if (gVar == null) {
            bVar.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        f6.c c2 = gVar.c();
        if (c2 == null) {
            bVar.b("skip transferring as CastSession is null", new Object[0]);
            return null;
        }
        p6.m.d("Must be called from the main thread.");
        return c2.j;
    }

    public final void b(int i3) {
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
        i.b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.e), Integer.valueOf(i3));
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            int i10 = this.e;
            switch (w0Var.a) {
                case 0:
                    y0.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i10), Integer.valueOf(i3));
                    y0 y0Var = (y0) w0Var.b;
                    y0Var.c();
                    p1 b10 = y0Var.c.b(y0Var.g);
                    k1 m10 = l1.m(b10.d());
                    m10.c();
                    l1.v((l1) m10.b, i10);
                    m10.c();
                    l1.w((l1) m10.b, i3);
                    b10.e((l1) m10.a());
                    y0Var.a.a((q1) b10.a(), hs.I3);
                    y0Var.i = false;
                    break;
                default:
                    kg kgVar = new kg(11, 4);
                    kgVar.c = Integer.valueOf(i3);
                    ke keVar = (ke) w0Var.b;
                    kgVar.d = Boolean.valueOf(((c) keVar.c).d == 2);
                    ke.P(keVar, new t6(kgVar));
                    break;
            }
        }
        c();
    }

    public final void c() {
        z zVar = this.c;
        p6.m.g(zVar);
        s sVar = this.d;
        p6.m.g(sVar);
        zVar.removeCallbacks(sVar);
        this.e = 0;
        this.h = null;
    }
}
