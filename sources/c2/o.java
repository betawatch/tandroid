package c2;

import android.os.Bundle;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o {
    public final Bundle a;
    public w b;

    public o(w wVar, boolean z10) {
        if (wVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = wVar;
        bundle.putBundle("selector", wVar.a);
        bundle.putBoolean("activeScan", z10);
    }

    public final void a() {
        if (this.b == null) {
            w b10 = w.b(this.a.getBundle("selector"));
            this.b = b10;
            if (b10 == null) {
                this.b = w.c;
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
            w wVar = this.b;
            oVar.a();
            if (wVar.equals(oVar.b) && b() == oVar.b()) {
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
