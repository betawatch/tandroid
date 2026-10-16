package md;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
