package c3;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d0 {
    public final f0 a;
    public final f0 b;

    public d0(f0 f0Var, f0 f0Var2) {
        this.a = f0Var;
        this.b = f0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.a.equals(d0Var.a) && this.b.equals(d0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        f0 f0Var = this.a;
        sb2.append(f0Var);
        f0 f0Var2 = this.b;
        if (f0Var.equals(f0Var2)) {
            str = "";
        } else {
            str = ", " + f0Var2;
        }
        return a1.g.s(sb2, str, "]");
    }
}
