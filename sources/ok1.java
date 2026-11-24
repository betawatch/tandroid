// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ok1 {
    public static final nk1 b = new nk1();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof ok1) {
            return this.a.equals(((ok1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof mk1) {
            return ((mk1) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
