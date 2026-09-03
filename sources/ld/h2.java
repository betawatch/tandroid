package ld;

import k7.b8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h2 implements uc.f, uc.g {
    public static final h2 a = new h2();

    @Override // uc.h
    public final Object fold(Object obj, dd.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // uc.h
    public final uc.f get(uc.g gVar) {
        return b8.a(this, gVar);
    }

    @Override // uc.h
    public final uc.h minusKey(uc.g gVar) {
        return b8.b(this, gVar);
    }

    @Override // uc.h
    public final uc.h plus(uc.h hVar) {
        return b8.c(this, hVar);
    }

    @Override // uc.f
    public final uc.g getKey() {
        return this;
    }
}
