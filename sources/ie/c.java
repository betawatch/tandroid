package ie;

import aa.b0;
import ee.r;
import gd.k;
import rd.q;
import zd.c2;
import zd.l;
import zd.m;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
    public final b0 d(Object obj, q qVar) {
        d dVar = this.b;
        b bVar = new b(dVar, this);
        b0 F = this.a.F((k) obj, bVar);
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
