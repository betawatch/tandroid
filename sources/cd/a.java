package cd;

import ld.p;
import v7.g5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // cd.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // cd.h
    public f get(g gVar) {
        return g5.a(this, gVar);
    }

    @Override // cd.f
    public final g getKey() {
        return this.a;
    }

    @Override // cd.h
    public h minusKey(g gVar) {
        return g5.b(this, gVar);
    }

    @Override // cd.h
    public final h plus(h hVar) {
        return g5.c(this, hVar);
    }
}
