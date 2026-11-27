// default package

import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class la0 {
    public final pj2 a;
    public final HashMap b;

    public la0(pj2 pj2Var, HashMap hashMap) {
        this.a = pj2Var;
        this.b = hashMap;
    }

    public final long a(pm8 pm8Var, long j, int i) {
        long e = j - this.a.e();
        ma0 ma0Var = (ma0) this.b.get(pm8Var);
        long j2 = ma0Var.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, 9.210340371976184d / Math.log((j2 > 1 ? j2 : 2L) * r12))), e), ma0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0Var = (la0) obj;
        return this.a.equals(la0Var.a) && this.b.equals(la0Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
