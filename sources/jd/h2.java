package jd;

import i7.s7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h2 implements sc.f, sc.g {
    public static final h2 a = new h2();

    @Override // sc.h
    public final Object fold(Object obj, bd.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // sc.h
    public final sc.f get(sc.g gVar) {
        return s7.a(this, gVar);
    }

    @Override // sc.h
    public final sc.h minusKey(sc.g gVar) {
        return s7.b(this, gVar);
    }

    @Override // sc.h
    public final sc.h plus(sc.h hVar) {
        return s7.c(this, hVar);
    }

    @Override // sc.f
    public final sc.g getKey() {
        return this;
    }
}
