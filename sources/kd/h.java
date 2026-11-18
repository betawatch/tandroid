package kd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
