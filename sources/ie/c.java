package ie;

import ee.t;
import zd.i2;
import zd.l;
import zd.m;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
    public final com.google.android.gms.internal.clearcut.e b(rd.l lVar, Object obj) {
        d dVar = this.b;
        b bVar = new b(dVar, this, 1);
        com.google.android.gms.internal.clearcut.e F = this.a.F(bVar, (gd.i) obj);
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
