package kd;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
