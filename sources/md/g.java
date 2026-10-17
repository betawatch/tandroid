package md;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
