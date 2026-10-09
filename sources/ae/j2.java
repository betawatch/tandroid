package ae;

import v7.v8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j2 implements jd.f, jd.g {
    public static final j2 a = new j2();

    @Override // jd.h
    public final Object fold(Object obj, sd.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jd.h
    public final jd.f get(jd.g gVar) {
        return v8.a(this, gVar);
    }

    @Override // jd.h
    public final jd.h minusKey(jd.g gVar) {
        return v8.b(this, gVar);
    }

    @Override // jd.h
    public final jd.h plus(jd.h hVar) {
        return v8.c(this, hVar);
    }

    @Override // jd.f
    public final jd.g getKey() {
        return this;
    }
}
