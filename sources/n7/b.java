package n7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class b {
    public final Object a;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
    }

    public Object a() {
        if (a.b == null) {
            a.b = new cc.k();
        }
        synchronized (a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
