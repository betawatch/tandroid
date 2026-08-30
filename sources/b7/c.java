package b7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c implements o8.n {
    public final Object a;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    @Override // o8.q
    public Object a() {
        return this.a;
    }

    public Object b() {
        if (b.b == null) {
            b.b = new a();
        }
        synchronized (b.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
