// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fa0 extends hl7 {
    public final gl7 a;
    public final fl7 b;

    public fa0(gl7 gl7Var, fl7 fl7Var) {
        this.a = gl7Var;
        this.b = fl7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hl7) {
            hl7 hl7Var = (hl7) obj;
            gl7 gl7Var = this.a;
            if (gl7Var != null ? gl7Var.equals(((fa0) hl7Var).a) : ((fa0) hl7Var).a == null) {
                fl7 fl7Var = this.b;
                fa0 fa0Var = (fa0) hl7Var;
                if (fl7Var != null ? fl7Var.equals(fa0Var.b) : fa0Var.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        gl7 gl7Var = this.a;
        int hashCode = ((gl7Var == null ? 0 : gl7Var.hashCode()) ^ 1000003) * 1000003;
        fl7 fl7Var = this.b;
        return hashCode ^ (fl7Var != null ? fl7Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
