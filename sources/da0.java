// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class da0 extends yi7 {
    public final xi7 a;
    public final wi7 b;

    public da0(xi7 xi7Var, wi7 wi7Var) {
        this.a = xi7Var;
        this.b = wi7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yi7) {
            yi7 yi7Var = (yi7) obj;
            xi7 xi7Var = this.a;
            if (xi7Var != null ? xi7Var.equals(((da0) yi7Var).a) : ((da0) yi7Var).a == null) {
                wi7 wi7Var = this.b;
                da0 da0Var = (da0) yi7Var;
                if (wi7Var != null ? wi7Var.equals(da0Var.b) : da0Var.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        xi7 xi7Var = this.a;
        int hashCode = ((xi7Var == null ? 0 : xi7Var.hashCode()) ^ 1000003) * 1000003;
        wi7 wi7Var = this.b;
        return hashCode ^ (wi7Var != null ? wi7Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
