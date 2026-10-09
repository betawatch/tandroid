package ld;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class h extends a {
    public h(jd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != jd.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // jd.c
    public final jd.h getContext() {
        return jd.i.a;
    }
}
