package ce;

import a8.yd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i2 implements ld.f, ld.g {
    public static final i2 a = new i2();

    @Override // ld.h
    public final Object fold(Object obj, ud.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // ld.h
    public final ld.f get(ld.g gVar) {
        return yd.a(this, gVar);
    }

    @Override // ld.h
    public final ld.h minusKey(ld.g gVar) {
        return yd.b(this, gVar);
    }

    @Override // ld.h
    public final ld.h plus(ld.h hVar) {
        return yd.c(this, hVar);
    }

    @Override // ld.f
    public final ld.g getKey() {
        return this;
    }
}
