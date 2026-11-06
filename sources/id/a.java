package id;

import c8.m0;
import rd.p;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // id.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // id.h
    public f get(g gVar) {
        return m0.a(this, gVar);
    }

    @Override // id.f
    public final g getKey() {
        return this.a;
    }

    @Override // id.h
    public h minusKey(g gVar) {
        return m0.b(this, gVar);
    }

    @Override // id.h
    public final h plus(h hVar) {
        return m0.c(this, hVar);
    }
}
