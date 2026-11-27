// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
