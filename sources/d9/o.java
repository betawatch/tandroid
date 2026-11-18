package d9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
