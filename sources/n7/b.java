package n7;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
