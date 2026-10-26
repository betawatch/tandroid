package aa;

import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o0 extends w1 {
    public final u1 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final v1 e;
    public final List f;
    public final int g;

    public o0(u1 u1Var, List list, List list2, Boolean bool, v1 v1Var, List list3, int i10) {
        this.a = u1Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = v1Var;
        this.f = list3;
        this.g = i10;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        v1 v1Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            o0 o0Var = (o0) ((w1) obj);
            List list4 = o0Var.f;
            v1 v1Var2 = o0Var.e;
            Boolean bool2 = o0Var.d;
            List list5 = o0Var.c;
            List list6 = o0Var.b;
            if (this.a.equals(o0Var.a) && ((list = this.b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((v1Var = this.e) != null ? v1Var.equals(v1Var2) : v1Var2 == null) && ((list3 = this.f) != null ? list3.equals(list4) : list4 == null) && this.g == o0Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        v1 v1Var = this.e;
        int hashCode5 = (hashCode4 ^ (v1Var == null ? 0 : v1Var.hashCode())) * 1000003;
        List list3 = this.f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.a);
        sb2.append(", customAttributes=");
        sb2.append(this.b);
        sb2.append(", internalKeys=");
        sb2.append(this.c);
        sb2.append(", background=");
        sb2.append(this.d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f);
        sb2.append(", uiOrientation=");
        return a1.g.n(this.g, "}", sb2);
    }
}
