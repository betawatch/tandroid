package i9;

import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p0 extends o1 {
    public final String a;
    public final String b;
    public final List c;
    public final o1 d;
    public final int e;

    public p0(String str, String str2, List list, o1 o1Var, int i10) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = o1Var;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        o1 o1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            p0 p0Var = (p0) ((o1) obj);
            o1 o1Var2 = p0Var.d;
            String str2 = p0Var.b;
            if (this.a.equals(p0Var.a) && ((str = this.b) != null ? str.equals(str2) : str2 == null) && this.c.equals(p0Var.c) && ((o1Var = this.d) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && this.e == p0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        o1 o1Var = this.d;
        return ((hashCode2 ^ (o1Var != null ? o1Var.hashCode() : 0)) * 1000003) ^ this.e;
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
        return a4.w.l(this.e, "}", sb2);
    }
}
