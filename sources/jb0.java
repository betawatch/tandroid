// default package

import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jb0 {
    public final hk2 a;
    public final HashMap b;

    public jb0(hk2 hk2Var, HashMap hashMap) {
        this.a = hk2Var;
        this.b = hashMap;
    }

    public final long a(fl8 fl8Var, long j, int i) {
        long a = j - this.a.a();
        kb0 kb0Var = (kb0) this.b.get(fl8Var);
        long j2 = kb0Var.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, 9.210340371976184d / Math.log((j2 > 1 ? j2 : 2L) * r12))), a), kb0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jb0)) {
            return false;
        }
        jb0 jb0Var = (jb0) obj;
        return this.a.equals(jb0Var.a) && this.b.equals(jb0Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
