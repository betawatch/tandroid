package kd;

import td.p;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // kd.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // kd.h
    public f get(g gVar) {
        return w7.h.a(this, gVar);
    }

    @Override // kd.f
    public final g getKey() {
        return this.a;
    }

    @Override // kd.h
    public h minusKey(g gVar) {
        return w7.h.b(this, gVar);
    }

    @Override // kd.h
    public final h plus(h hVar) {
        return w7.h.c(this, hVar);
    }
}
