// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ni8 {
    public final String a;

    public ni8(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ni8)) {
            return false;
        }
        return rr5.a(this.a, ((ni8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
