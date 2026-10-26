package ge;

import ud.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
