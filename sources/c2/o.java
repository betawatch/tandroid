package c2;

import android.os.Bundle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o {
    public final Bundle a;
    public v b;

    public o(v vVar, boolean z10) {
        if (vVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = vVar;
        bundle.putBundle("selector", vVar.a);
        bundle.putBoolean("activeScan", z10);
    }

    public final void a() {
        if (this.b == null) {
            v b10 = v.b(this.a.getBundle("selector"));
            this.b = b10;
            if (b10 == null) {
                this.b = v.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            a();
            v vVar = this.b;
            oVar.a();
            if (vVar.equals(oVar.b) && b() == oVar.b()) {
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
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        this.b.a();
        sb2.append(!r1.b.contains(null));
        sb2.append(" }");
        return sb2.toString();
    }
}
