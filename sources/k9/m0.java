package k9;

import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m0 extends u1 {
    public final s1 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final t1 e;
    public final List f;
    public final int g;

    public m0(s1 s1Var, List list, List list2, Boolean bool, t1 t1Var, List list3, int i10) {
        this.a = s1Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = t1Var;
        this.f = list3;
        this.g = i10;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        t1 t1Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            m0 m0Var = (m0) ((u1) obj);
            List list4 = m0Var.f;
            t1 t1Var2 = m0Var.e;
            Boolean bool2 = m0Var.d;
            List list5 = m0Var.c;
            List list6 = m0Var.b;
            if (this.a.equals(m0Var.a) && ((list = this.b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((t1Var = this.e) != null ? t1Var.equals(t1Var2) : t1Var2 == null) && ((list3 = this.f) != null ? list3.equals(list4) : list4 == null) && this.g == m0Var.g) {
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
        t1 t1Var = this.e;
        int hashCode5 = (hashCode4 ^ (t1Var == null ? 0 : t1Var.hashCode())) * 1000003;
        List list3 = this.f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return android.support.v4.media.a.m(this.g, "}", sb);
    }
}
