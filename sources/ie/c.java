package ie;

import ee.r;
import ee.t;
import gd.k;
import rd.q;
import zd.c2;
import zd.l;
import zd.m;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    public final t d(Object obj, q qVar) {
        d dVar = this.b;
        b bVar = new b(dVar, this);
        t F = this.a.F((k) obj, bVar);
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
