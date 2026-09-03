package c2;

import android.os.Bundle;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o {
    public final Bundle a;
    public w b;

    public o(w wVar, boolean z4) {
        if (wVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = wVar;
        bundle.putBundle("selector", wVar.a);
        bundle.putBoolean("activeScan", z4);
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
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.b.a();
        sb.append(!r1.b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
