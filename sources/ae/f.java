package ae;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements fd.h {
    public final /* synthetic */ fd.h a;
    public final Throwable b;

    public f(fd.h hVar, Throwable th2) {
        this.a = hVar;
        this.b = th2;
    }

    @Override // fd.h
    public final Object fold(Object obj, od.p pVar) {
        return this.a.fold(obj, pVar);
    }

    @Override // fd.h
    public final fd.f get(fd.g gVar) {
        return this.a.get(gVar);
    }

    @Override // fd.h
    public final fd.h minusKey(fd.g gVar) {
        return this.a.minusKey(gVar);
    }

    @Override // fd.h
    public final fd.h plus(fd.h hVar) {
        return this.a.plus(hVar);
    }
}
