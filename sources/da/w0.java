package da;

import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class w0 extends i2 {
    public final List a;
    public final e2 b;
    public final u1 c;
    public final z1 d;
    public final z0 e;
    public final List f;

    public w0(List list, e2 e2Var, u1 u1Var, z1 z1Var, z0 z0Var, List list2) {
        this.a = list;
        this.b = e2Var;
        this.c = u1Var;
        this.d = z1Var;
        this.e = z0Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        List list = this.a;
        if (list == null) {
            if (((w0) i2Var).a != null) {
                return false;
            }
        } else if (!list.equals(((w0) i2Var).a)) {
            return false;
        }
        e2 e2Var = this.b;
        if (e2Var == null) {
            if (((w0) i2Var).b != null) {
                return false;
            }
        } else if (!e2Var.equals(((w0) i2Var).b)) {
            return false;
        }
        u1 u1Var = this.c;
        if (u1Var == null) {
            if (((w0) i2Var).c != null) {
                return false;
            }
        } else if (!u1Var.equals(((w0) i2Var).c)) {
            return false;
        }
        z1 z1Var = this.d;
        if (z1Var == null) {
            if (((w0) i2Var).d != null) {
                return false;
            }
        } else if (!z1Var.equals(((w0) i2Var).d)) {
            return false;
        }
        w0 w0Var = (w0) i2Var;
        return this.e.equals(w0Var.e) && this.f.equals(w0Var.f);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        e2 e2Var = this.b;
        int hashCode2 = (hashCode ^ (e2Var == null ? 0 : e2Var.hashCode())) * 1000003;
        u1 u1Var = this.c;
        int hashCode3 = (hashCode2 ^ (u1Var == null ? 0 : u1Var.hashCode())) * 1000003;
        z1 z1Var = this.d;
        return (((((z1Var != null ? z1Var.hashCode() : 0) ^ hashCode3) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", profilingManagerInfo=" + this.d + ", signal=" + this.e + ", binaries=" + this.f + "}";
    }
}
