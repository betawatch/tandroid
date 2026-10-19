package ke;

import be.j2;
import be.l;
import be.m;
import ge.t;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
    public final com.google.android.gms.internal.clearcut.e d(td.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        com.google.android.gms.internal.clearcut.e F = this.a.F(bVar, (id.i) obj);
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
