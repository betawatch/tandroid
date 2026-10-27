package ld;

import a8.yd;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class a implements f {
    public final g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // ld.h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // ld.h
    public f get(g gVar) {
        return yd.a(this, gVar);
    }

    @Override // ld.f
    public final g getKey() {
        return this.a;
    }

    @Override // ld.h
    public h minusKey(g gVar) {
        return yd.b(this, gVar);
    }

    @Override // ld.h
    public final h plus(h hVar) {
        return yd.c(this, hVar);
    }
}
