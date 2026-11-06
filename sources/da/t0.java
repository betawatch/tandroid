package da;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class t0 extends q2 {
    public final long a;
    public final String b;
    public final k2 c;
    public final l2 d;
    public final m2 e;
    public final p2 f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.a = j3;
        this.b = str;
        this.c = k2Var;
        this.d = l2Var;
        this.e = m2Var;
        this.f = p2Var;
    }

    public final s0 a() {
        s0 s0Var = new s0();
        s0Var.a = this.a;
        s0Var.b = this.b;
        s0Var.c = this.c;
        s0Var.d = this.d;
        s0Var.e = this.e;
        s0Var.f = this.f;
        s0Var.g = (byte) 1;
        return s0Var;
    }

    public final boolean equals(Object obj) {
        m2 m2Var;
        p2 p2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q2) {
            t0 t0Var = (t0) ((q2) obj);
            p2 p2Var2 = t0Var.f;
            m2 m2Var2 = t0Var.e;
            if (this.a == t0Var.a && this.b.equals(t0Var.b) && this.c.equals(t0Var.c) && this.d.equals(t0Var.d) && ((m2Var = this.e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        int hashCode = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        m2 m2Var = this.e;
        int hashCode2 = (hashCode ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        p2 p2Var = this.f;
        return hashCode2 ^ (p2Var != null ? p2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
