package b7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
