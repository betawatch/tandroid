// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h2 {
    public static final h2 c;
    public static final h2 d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (t2.d) {
            d = null;
            c = null;
        } else {
            d = new h2(false, null);
            c = new h2(true, null);
        }
    }

    public h2(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
