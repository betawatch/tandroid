// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mq5 implements mv8, m0a {
    public final Object a;

    public final Object a() {
        if (igd.b == null) {
            igd.b = new v40();
        }
        synchronized (igd.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // mv8
    public final Object get() {
        return this.a;
    }
}
