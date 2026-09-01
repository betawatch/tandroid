package c2;

import android.os.Bundle;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o {
    public final Bundle a;
    public v b;

    public o(v vVar, boolean z4) {
        if (vVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = vVar;
        bundle.putBundle("selector", vVar.a);
        bundle.putBoolean("activeScan", z4);
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
