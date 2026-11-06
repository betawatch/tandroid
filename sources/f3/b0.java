package f3;

import a8.p0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class b0 {
    public final d0 a;
    public final d0 b;

    public b0(d0 d0Var, d0 d0Var2) {
        this.a = d0Var;
        this.b = d0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.a.equals(b0Var.a) && this.b.equals(b0Var.b)) {
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
        d0 d0Var = this.a;
        sb2.append(d0Var);
        d0 d0Var2 = this.b;
        if (d0Var.equals(d0Var2)) {
            str = "";
        } else {
            str = ", " + d0Var2;
        }
        return p0.s(sb2, str, "]");
    }
}
