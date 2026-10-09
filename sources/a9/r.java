package a9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class r implements q, ie.a {
    public final Object a;

    public /* synthetic */ r(Object obj) {
        this.a = obj;
    }

    @Override // a9.u
    public Object a() {
        return this.a;
    }

    public Object b() {
        if (n7.a.b == null) {
            n7.a.b = new cc.k();
        }
        synchronized (n7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
