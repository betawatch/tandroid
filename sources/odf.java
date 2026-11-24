// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class odf {
    public static final odf c;
    public static final odf d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (wdf.d) {
            d = null;
            c = null;
        } else {
            d = new odf(false, null);
            c = new odf(true, null);
        }
    }

    public odf(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
