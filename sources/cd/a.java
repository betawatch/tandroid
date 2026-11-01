package cd;

import ld.p;
import v7.g5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
