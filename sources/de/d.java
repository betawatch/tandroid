package de;

import rd.p;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class d implements id.h {
    public final /* synthetic */ id.h a;
    public final Throwable b;

    public d(id.h hVar, Throwable th2) {
        this.a = hVar;
        this.b = th2;
    }

    @Override // id.h
    public final Object fold(Object obj, p pVar) {
        return this.a.fold(obj, pVar);
    }

    @Override // id.h
    public final id.f get(id.g gVar) {
        return this.a.get(gVar);
    }

    @Override // id.h
    public final id.h minusKey(id.g gVar) {
        return this.a.minusKey(gVar);
    }

    @Override // id.h
    public final id.h plus(id.h hVar) {
        return this.a.plus(hVar);
    }
}
