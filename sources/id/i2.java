package id;

import h7.y6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i2 implements rc.f, rc.g {
    public static final i2 a = new i2();

    @Override // rc.h
    public final Object fold(Object obj, ad.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // rc.h
    public final rc.f get(rc.g gVar) {
        return y6.a(this, gVar);
    }

    @Override // rc.h
    public final rc.h minusKey(rc.g gVar) {
        return y6.b(this, gVar);
    }

    @Override // rc.h
    public final rc.h plus(rc.h hVar) {
        return y6.c(this, hVar);
    }

    @Override // rc.f
    public final rc.g getKey() {
        return this;
    }
}
