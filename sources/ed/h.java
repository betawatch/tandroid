package ed;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class h extends a {
    public h(cd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != cd.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // cd.c
    public final cd.h getContext() {
        return cd.i.a;
    }
}
