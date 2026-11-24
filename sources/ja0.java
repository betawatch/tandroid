// default package

import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ja0 {
    public final ti2 a;
    public final HashMap b;

    public ja0(ti2 ti2Var, HashMap hashMap) {
        this.a = ti2Var;
        this.b = hashMap;
    }

    public final long a(cj8 cj8Var, long j, int i) {
        long e = j - this.a.e();
        ka0 ka0Var = (ka0) this.b.get(cj8Var);
        long j2 = ka0Var.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, 9.210340371976184d / Math.log((j2 > 1 ? j2 : 2L) * r12))), e), ka0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0Var = (ja0) obj;
        return this.a.equals(ja0Var.a) && this.b.equals(ja0Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
