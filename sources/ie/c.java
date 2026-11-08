package ie;

import ee.r;
import gd.k;
import rd.q;
import zd.c2;
import zd.l;
import zd.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c implements l, c2 {
    public final m a;
    public final /* synthetic */ d b;

    public c(d dVar, m mVar) {
        this.b = dVar;
        this.a = mVar;
    }

    @Override // zd.c2
    public final void a(r rVar, int i7) {
        this.a.a(rVar, i7);
    }

    @Override // zd.l
    public final com.google.android.gms.internal.clearcut.e d(Object obj, q qVar) {
        d dVar = this.b;
        b bVar = new b(dVar, this);
        com.google.android.gms.internal.clearcut.e F = this.a.F((k) obj, bVar);
        if (F != null) {
            d.g.set(dVar, null);
        }
        return F;
    }

    @Override // zd.l
    public final void f(Object obj) {
        this.a.f(obj);
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
