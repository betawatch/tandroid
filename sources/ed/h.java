package ed;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
