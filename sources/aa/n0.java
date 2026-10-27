package aa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n0 extends c2 {
    public final long a;
    public final String b;
    public final w1 c;
    public final x1 d;
    public final y1 e;
    public final b2 f;

    public n0(long j10, String str, w1 w1Var, x1 x1Var, y1 y1Var, b2 b2Var) {
        this.a = j10;
        this.b = str;
        this.c = w1Var;
        this.d = x1Var;
        this.e = y1Var;
        this.f = b2Var;
    }

    public final m0 a() {
        m0 m0Var = new m0();
        m0Var.a = Long.valueOf(this.a);
        m0Var.b = this.b;
        m0Var.c = this.c;
        m0Var.d = this.d;
        m0Var.e = this.e;
        m0Var.f = this.f;
        return m0Var;
    }

    public final boolean equals(Object obj) {
        y1 y1Var;
        b2 b2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            n0 n0Var = (n0) ((c2) obj);
            b2 b2Var2 = n0Var.f;
            y1 y1Var2 = n0Var.e;
            if (this.a == n0Var.a && this.b.equals(n0Var.b) && this.c.equals(n0Var.c) && this.d.equals(n0Var.d) && ((y1Var = this.e) != null ? y1Var.equals(y1Var2) : y1Var2 == null) && ((b2Var = this.f) != null ? b2Var.equals(b2Var2) : b2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        y1 y1Var = this.e;
        int hashCode2 = (hashCode ^ (y1Var == null ? 0 : y1Var.hashCode())) * 1000003;
        b2 b2Var = this.f;
        return hashCode2 ^ (b2Var != null ? b2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
