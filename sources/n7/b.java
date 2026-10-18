package n7;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class b {
    public final Object a;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
    }

    public Object a() {
        if (a.b == null) {
            a.b = new com.google.firebase.messaging.q();
        }
        synchronized (a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
