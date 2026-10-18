package n7;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
