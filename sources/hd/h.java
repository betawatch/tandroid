package hd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h extends a {
    public h(fd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != fd.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // fd.c
    public final fd.h getContext() {
        return fd.i.a;
    }
}
