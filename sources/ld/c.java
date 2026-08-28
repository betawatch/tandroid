package ld;

import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements qc.h {
    public final Throwable a;
    public final /* synthetic */ qc.h b;

    public c(Throwable th, qc.h hVar) {
        this.a = th;
        this.b = hVar;
    }

    @Override // qc.h
    public final Object fold(Object obj, p pVar) {
        return this.b.fold(obj, pVar);
    }

    @Override // qc.h
    public final qc.f get(qc.g gVar) {
        return this.b.get(gVar);
    }

    @Override // qc.h
    public final qc.h minusKey(qc.g gVar) {
        return this.b.minusKey(gVar);
    }

    @Override // qc.h
    public final qc.h plus(qc.h hVar) {
        return this.b.plus(hVar);
    }
}
