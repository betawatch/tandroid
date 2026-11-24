// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class g80 extends ky2 {
    public final List a;
    public final String b;

    public g80(String str, List list) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ky2)) {
            return false;
        }
        g80 g80Var = (g80) ((ky2) obj);
        if (!this.a.equals(g80Var.a)) {
            return false;
        }
        String str = g80Var.b;
        String str2 = this.b;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return b00.j(sb, this.b, "}");
    }
}
