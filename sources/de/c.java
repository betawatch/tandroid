package de;

import rd.p;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c implements id.h {
    public final Throwable a;
    public final /* synthetic */ id.h b;

    public c(id.h hVar, Throwable th2) {
        this.a = th2;
        this.b = hVar;
    }

    @Override // id.h
    public final Object fold(Object obj, p pVar) {
        return this.b.fold(obj, pVar);
    }

    @Override // id.h
    public final id.f get(id.g gVar) {
        return this.b.get(gVar);
    }

    @Override // id.h
    public final id.h minusKey(id.g gVar) {
        return this.b.minusKey(gVar);
    }

    @Override // id.h
    public final id.h plus(id.h hVar) {
        return this.b.plus(hVar);
    }
}
