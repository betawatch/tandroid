package md;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class g extends a {
    public g(kd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != kd.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kd.c
    public final kd.h getContext() {
        return kd.i.a;
    }
}
