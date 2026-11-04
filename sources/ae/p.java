package ae;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p implements fd.c, hd.d {
    public final fd.c a;
    public final fd.h b;

    public p(fd.c cVar, fd.h hVar) {
        this.a = cVar;
        this.b = hVar;
    }

    @Override // hd.d
    public final hd.d getCallerFrame() {
        fd.c cVar = this.a;
        if (cVar instanceof hd.d) {
            return (hd.d) cVar;
        }
        return null;
    }

    @Override // fd.c
    public final fd.h getContext() {
        return this.b;
    }

    @Override // fd.c
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
