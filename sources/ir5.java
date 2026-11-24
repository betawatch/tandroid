// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ir5 {
    public final int a;
    public final int b;

    public ir5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ir5.class == obj.getClass()) {
            ir5 ir5Var = (ir5) obj;
            if (this.a == ir5Var.a && this.b == ir5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntSize(");
        sb.append(this.a);
        sb.append(", ");
        return hg9.k(sb, this.b, ")");
    }
}
