package da;

import java.util.List;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class v0 extends k2 {
    public final i2 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final j2 e;
    public final List f;
    public final int g;

    public v0(i2 i2Var, List list, List list2, Boolean bool, j2 j2Var, List list3, int i7) {
        this.a = i2Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = j2Var;
        this.f = list3;
        this.g = i7;
    }

    @Override // da.k2
    public final u0 a() {
        u0 u0Var = new u0();
        u0Var.a = this.a;
        u0Var.b = this.b;
        u0Var.c = this.c;
        u0Var.d = this.d;
        u0Var.e = this.e;
        u0Var.f = this.f;
        u0Var.g = this.g;
        u0Var.h = (byte) 1;
        return u0Var;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        j2 j2Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            v0 v0Var = (v0) ((k2) obj);
            List list4 = v0Var.f;
            j2 j2Var2 = v0Var.e;
            Boolean bool2 = v0Var.d;
            List list5 = v0Var.c;
            List list6 = v0Var.b;
            if (this.a.equals(v0Var.a) && ((list = this.b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((j2Var = this.e) != null ? j2Var.equals(j2Var2) : j2Var2 == null) && ((list3 = this.f) != null ? list3.equals(list4) : list4 == null) && this.g == v0Var.g) {
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
        j2 j2Var = this.e;
        int hashCode5 = (hashCode4 ^ (j2Var == null ? 0 : j2Var.hashCode())) * 1000003;
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
        return a8.p0.n(this.g, "}", sb2);
    }
}
