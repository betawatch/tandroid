package ce;

import td.j2;
import td.l;
import td.m;
import yd.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements l, j2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // td.j2
    public final void a(t tVar, int i10) {
        this.a.a(tVar, i10);
    }

    @Override // td.l
    public final ea.a d(ld.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        ea.a F = this.a.F(bVar, (ad.j) obj);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // td.l
    public final void f(Object obj) {
        this.a.f(obj);
    }

    @Override // cd.c
    public final cd.h getContext() {
        return this.a.e;
    }

    @Override // cd.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
