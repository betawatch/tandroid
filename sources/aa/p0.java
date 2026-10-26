package aa;

import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class p0 extends u1 {
    public final List a;
    public final q1 b;
    public final i1 c;
    public final r1 d;
    public final List e;

    public p0(List list, r0 r0Var, i1 i1Var, s0 s0Var, List list2) {
        this.a = list;
        this.b = r0Var;
        this.c = i1Var;
        this.d = s0Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            List list = this.a;
            if (list != null ? list.equals(((p0) u1Var).a) : ((p0) u1Var).a == null) {
                q1 q1Var = this.b;
                if (q1Var != null ? q1Var.equals(((p0) u1Var).b) : ((p0) u1Var).b == null) {
                    i1 i1Var = this.c;
                    if (i1Var != null ? i1Var.equals(((p0) u1Var).c) : ((p0) u1Var).c == null) {
                        p0 p0Var = (p0) u1Var;
                        if (this.d.equals(p0Var.d) && this.e.equals(p0Var.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        q1 q1Var = this.b;
        int hashCode2 = (hashCode ^ (q1Var == null ? 0 : q1Var.hashCode())) * 1000003;
        i1 i1Var = this.c;
        return (((((i1Var != null ? i1Var.hashCode() : 0) ^ hashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
