package ke;

import be.j2;
import be.l;
import be.m;
import ge.t;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
