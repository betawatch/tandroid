// default package

import android.os.Bundle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gv6 {
    public final Bundle a;
    public dw6 b;

    public gv6(dw6 dw6Var, boolean z) {
        if (dw6Var == null) {
            lq5.j("selector must not be null");
            throw null;
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = dw6Var;
        bundle.putBundle("selector", dw6Var.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.b == null) {
            dw6 b = dw6.b(this.a.getBundle("selector"));
            this.b = b;
            if (b == null) {
                this.b = dw6.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gv6) {
            gv6 gv6Var = (gv6) obj;
            a();
            dw6 dw6Var = this.b;
            gv6Var.a();
            if (dw6Var.equals(gv6Var.b) && b() == gv6Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode() ^ (b() ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.b.a();
        sb.append(!r2.b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
