// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hx9 {
    public final kx9 a;
    public final kx9 b;

    public hx9(kx9 kx9Var, kx9 kx9Var2) {
        this.a = kx9Var;
        this.b = kx9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hx9.class != obj.getClass()) {
            return false;
        }
        hx9 hx9Var = (hx9) obj;
        return this.a.equals(hx9Var.a) && this.b.equals(hx9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        kx9 kx9Var = this.a;
        sb.append(kx9Var);
        kx9 kx9Var2 = this.b;
        if (kx9Var.equals(kx9Var2)) {
            str = "";
        } else {
            str = ", " + kx9Var2;
        }
        return b10.j(sb, str, "]");
    }
}
