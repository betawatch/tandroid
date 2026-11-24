// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public enum g3e implements eqe {
    b(0),
    c(1),
    d(2),
    e(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    g3e(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + g3e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
