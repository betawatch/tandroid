package jd;

import sd.p;
import v7.v8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // jd.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jd.h
    public f get(g gVar) {
        return v8.a(this, gVar);
    }

    @Override // jd.f
    public final g getKey() {
        return this.a;
    }

    @Override // jd.h
    public h minusKey(g gVar) {
        return v8.b(this, gVar);
    }

    @Override // jd.h
    public final h plus(h hVar) {
        return v8.c(this, hVar);
    }
}
