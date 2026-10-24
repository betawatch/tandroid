package md;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
