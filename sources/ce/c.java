package ce;

import td.j2;
import td.l;
import td.m;
import yd.t;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
