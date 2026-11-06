package n5;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class v extends i0 {
    public final h0 a;
    public final g0 b;

    public v(h0 h0Var, g0 g0Var) {
        this.a = h0Var;
        this.b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).a) : ((v) i0Var).a == null) {
                g0 g0Var = this.b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).b) : ((v) i0Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h0 h0Var = this.a;
        int hashCode = ((h0Var == null ? 0 : h0Var.hashCode()) ^ 1000003) * 1000003;
        g0 g0Var = this.b;
        return (g0Var != null ? g0Var.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
