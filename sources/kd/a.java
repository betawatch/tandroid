package kd;

import td.p;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
