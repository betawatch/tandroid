package c3;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 c = new f0(0, 0);
    public final long a;
    public final long b;

    public f0(long j10, long j11) {
        this.a = j10;
        this.b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            f0 f0Var = (f0) obj;
            if (this.a == f0Var.a && this.b == f0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.a);
        sb2.append(", position=");
        return a1.g.r(sb2, this.b, "]");
    }
}
