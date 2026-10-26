package ce;

import a8.yd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
