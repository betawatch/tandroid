// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kx9 {
    public static final kx9 c = new kx9(0, 0);
    public final long a;
    public final long b;

    public kx9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kx9.class == obj.getClass()) {
            kx9 kx9Var = (kx9) obj;
            if (this.a == kx9Var.a && this.b == kx9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return kt6.q(sb, this.b, "]");
    }
}
