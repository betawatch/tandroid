package je;

import ae.k2;
import ae.l;
import ae.m;
import fe.t;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c implements l, k2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // ae.l
    public final da.a a(sd.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        da.a F = this.a.F(bVar, (hd.i) obj);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // ae.k2
    public final void b(t tVar, int i10) {
        this.a.b(tVar, i10);
    }

    @Override // ae.l
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // jd.c
    public final jd.h getContext() {
        return this.a.e;
    }

    @Override // jd.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
