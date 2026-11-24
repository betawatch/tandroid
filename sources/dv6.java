// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dv6 {
    public final Object a;
    public final byte b;

    public dv6(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = (byte) 1;
        } else if (obj instanceof ew6) {
            this.b = (byte) 2;
        } else {
            i98.g();
            throw null;
        }
    }
}
