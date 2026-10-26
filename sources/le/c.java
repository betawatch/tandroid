package le;

import ce.j2;
import ce.l;
import ce.m;
import he.t;
import he.v;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c implements l, j2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // ce.j2
    public final void a(t tVar, int i10) {
        this.a.a(tVar, i10);
    }

    @Override // ce.l
    public final v d(ud.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        v F = this.a.F(bVar, (jd.i) obj);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // ce.l
    public final void f(Object obj) {
        this.a.f(obj);
    }

    @Override // ld.c
    public final ld.h getContext() {
        return this.a.e;
    }

    @Override // ld.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
