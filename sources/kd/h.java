package kd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class h extends a {
    public h(id.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != id.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // id.c
    public final id.h getContext() {
        return id.i.a;
    }
}
