package b7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c implements td.a {
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
