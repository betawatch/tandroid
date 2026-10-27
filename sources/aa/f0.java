package aa;

import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f0 extends l1 {
    public final List a;
    public final String b;

    public f0(String str, List list) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            f0 f0Var = (f0) ((l1) obj);
            String str2 = f0Var.b;
            if (this.a.equals(f0Var.a) && ((str = this.b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.a);
        sb2.append(", orgId=");
        return a1.g.s(sb2, this.b, "}");
    }
}
