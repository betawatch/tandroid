package aa;

import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r0 extends q1 {
    public final String a;
    public final String b;
    public final List c;
    public final q1 d;
    public final int e;

    public r0(String str, String str2, List list, q1 q1Var, int i10) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = q1Var;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        q1 q1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            r0 r0Var = (r0) ((q1) obj);
            q1 q1Var2 = r0Var.d;
            String str2 = r0Var.b;
            if (this.a.equals(r0Var.a) && ((str = this.b) != null ? str.equals(str2) : str2 == null) && this.c.equals(r0Var.c) && ((q1Var = this.d) != null ? q1Var.equals(q1Var2) : q1Var2 == null) && this.e == r0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        q1 q1Var = this.d;
        return ((hashCode2 ^ (q1Var != null ? q1Var.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.a);
        sb2.append(", reason=");
        sb2.append(this.b);
        sb2.append(", frames=");
        sb2.append(this.c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a1.g.n(this.e, "}", sb2);
    }
}
