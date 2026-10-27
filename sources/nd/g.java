package nd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class g extends a {
    public g(ld.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != ld.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // ld.c
    public final ld.h getContext() {
        return ld.i.a;
    }
}
