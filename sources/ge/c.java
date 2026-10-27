package ge;

import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements ld.h {
    public final Throwable a;
    public final /* synthetic */ ld.h b;

    public c(Throwable th2, ld.h hVar) {
        this.a = th2;
        this.b = hVar;
    }

    @Override // ld.h
    public final Object fold(Object obj, p pVar) {
        return this.b.fold(obj, pVar);
    }

    @Override // ld.h
    public final ld.f get(ld.g gVar) {
        return this.b.get(gVar);
    }

    @Override // ld.h
    public final ld.h minusKey(ld.g gVar) {
        return this.b.minusKey(gVar);
    }

    @Override // ld.h
    public final ld.h plus(ld.h hVar) {
        return this.b.plus(hVar);
    }
}
