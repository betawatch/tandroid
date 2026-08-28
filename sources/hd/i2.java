package hd;

import g7.u6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i2 implements qc.f, qc.g {
    public static final i2 a = new i2();

    @Override // qc.h
    public final Object fold(Object obj, zc.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // qc.h
    public final qc.f get(qc.g gVar) {
        return u6.a(this, gVar);
    }

    @Override // qc.h
    public final qc.h minusKey(qc.g gVar) {
        return u6.b(this, gVar);
    }

    @Override // qc.h
    public final qc.h plus(qc.h hVar) {
        return u6.c(this, hVar);
    }

    @Override // qc.f
    public final qc.g getKey() {
        return this;
    }
}
