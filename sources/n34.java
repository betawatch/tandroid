// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n34 {
    public final String a;

    public n34(String str) {
        if (str != null) {
            this.a = str;
        } else {
            p3d.h("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n34)) {
            return false;
        }
        return this.a.equals(((n34) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return c00.k(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
