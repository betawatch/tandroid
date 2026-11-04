package fd;

import b8.cc;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // fd.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // fd.h
    public f get(g gVar) {
        return cc.a(this, gVar);
    }

    @Override // fd.f
    public final g getKey() {
        return this.a;
    }

    @Override // fd.h
    public h minusKey(g gVar) {
        return cc.b(this, gVar);
    }

    @Override // fd.h
    public final h plus(h hVar) {
        return cc.c(this, hVar);
    }
}
