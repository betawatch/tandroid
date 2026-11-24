// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d44 {
    public final String a;

    public d44(String str) {
        if (str != null) {
            this.a = str;
        } else {
            gxc.d("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d44)) {
            return false;
        }
        return this.a.equals(((d44) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return b10.j(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
