package de;

import rd.p;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
