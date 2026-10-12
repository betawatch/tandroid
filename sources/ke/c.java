package ke;

import be.j2;
import be.l;
import be.m;
import ge.t;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c implements l, j2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // be.j2
    public final void a(t tVar, int i10) {
        this.a.a(tVar, i10);
    }

    @Override // be.l
    public final a6.i d(td.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        a6.i F = this.a.F(bVar, (id.i) obj);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // be.l
    public final void f(Object obj) {
        this.a.f(obj);
    }

    @Override // kd.c
    public final kd.h getContext() {
        return this.a.e;
    }

    @Override // kd.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
