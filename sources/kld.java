// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kld {
    public static final kld c;
    public static final kld d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (cmd.f) {
            d = null;
            c = null;
        } else {
            d = new kld(false, null);
            c = new kld(true, null);
        }
    }

    public kld(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
