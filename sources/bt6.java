// default package

import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bt6 {
    public final Bundle a;
    public yt6 b;

    public bt6(yt6 yt6Var, boolean z) {
        if (yt6Var == null) {
            w26.j("selector must not be null");
            throw null;
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = yt6Var;
        bundle.putBundle("selector", yt6Var.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.b == null) {
            yt6 b = yt6.b(this.a.getBundle("selector"));
            this.b = b;
            if (b == null) {
                this.b = yt6.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bt6) {
            bt6 bt6Var = (bt6) obj;
            a();
            yt6 yt6Var = this.b;
            bt6Var.a();
            if (yt6Var.equals(bt6Var.b) && b() == bt6Var.b()) {
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
