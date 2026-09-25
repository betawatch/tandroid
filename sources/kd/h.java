package kd;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
