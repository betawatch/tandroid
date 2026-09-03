package b7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c {
    public final Object a;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    public Object a() {
        if (b.b == null) {
            b.b = new a();
        }
        synchronized (b.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
