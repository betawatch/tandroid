package kd;

import td.p;
import w7.k;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        return k.a(this, gVar);
    }

    @Override // kd.f
    public final g getKey() {
        return this.a;
    }

    @Override // kd.h
    public h minusKey(g gVar) {
        return k.b(this, gVar);
    }

    @Override // kd.h
    public final h plus(h hVar) {
        return k.c(this, hVar);
    }
}
