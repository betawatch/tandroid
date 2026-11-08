package da;

import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class y0 extends e2 {
    public final String a;
    public final String b;
    public final List c;
    public final e2 d;
    public final int e;

    public y0(String str, String str2, List list, e2 e2Var, int i7) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = e2Var;
        this.e = i7;
    }

    public final boolean equals(Object obj) {
        String str;
        e2 e2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            y0 y0Var = (y0) ((e2) obj);
            e2 e2Var2 = y0Var.d;
            String str2 = y0Var.b;
            if (this.a.equals(y0Var.a) && ((str = this.b) != null ? str.equals(str2) : str2 == null) && this.c.equals(y0Var.c) && ((e2Var = this.d) != null ? e2Var.equals(e2Var2) : e2Var2 == null) && this.e == y0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        e2 e2Var = this.d;
        return ((hashCode2 ^ (e2Var != null ? e2Var.hashCode() : 0)) * 1000003) ^ this.e;
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
        return a8.p0.n(this.e, "}", sb2);
    }
}
