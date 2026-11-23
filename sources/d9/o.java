package d9;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class o implements n, he.b, ib.b {
    public final Object a;

    public /* synthetic */ o(Object obj) {
        this.a = obj;
    }

    public static o b(Object obj) {
        if (obj != null) {
            return new o(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // d9.r
    public Object a() {
        return this.a;
    }

    public Object c() {
        if (q7.a.b == null) {
            q7.a.b = new ab.b0();
        }
        synchronized (q7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // fd.a
    public Object get() {
        return this.a;
    }
}
