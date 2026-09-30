package ie;

import ee.t;
import ee.v;
import zd.i2;
import zd.l;
import zd.m;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class c implements l, i2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // zd.i2
    public final void a(t tVar, int i10) {
        this.a.a(tVar, i10);
    }

    @Override // zd.l
    public final v b(rd.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        v F = this.a.F(bVar, (gd.i) obj);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // zd.l
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // id.c
    public final id.h getContext() {
        return this.a.e;
    }

    @Override // id.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
