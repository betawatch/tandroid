package id;

import rd.p;
import v7.n8;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        return n8.a(this, gVar);
    }

    @Override // id.f
    public final g getKey() {
        return this.a;
    }

    @Override // id.h
    public h minusKey(g gVar) {
        return n8.b(this, gVar);
    }

    @Override // id.h
    public final h plus(h hVar) {
        return n8.c(this, hVar);
    }
}
