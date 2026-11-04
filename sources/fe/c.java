package fe;

import be.r;
import be.t;
import dd.k;
import od.q;
import wd.c2;
import wd.l;
import wd.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements l, c2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // wd.c2
    public final void a(r rVar, int i3) {
        this.a.a(rVar, i3);
    }

    @Override // wd.l
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // wd.l
    public final t f(Object obj, q qVar) {
        d dVar = this.b;
        b bVar = new b(dVar, this);
        t F = this.a.F((k) obj, bVar);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // fd.c
    public final fd.h getContext() {
        return this.a.e;
    }

    @Override // fd.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
