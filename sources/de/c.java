package de;

import rd.p;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
