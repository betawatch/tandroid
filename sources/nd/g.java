package nd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
