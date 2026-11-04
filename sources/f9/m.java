package f9;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements l, Serializable {
    public final List a;

    public m(List list) {
        this.a = list;
    }

    @Override // f9.l
    public final boolean apply(Object obj) {
        int i3 = 0;
        while (true) {
            List list = this.a;
            if (i3 >= list.size()) {
                return true;
            }
            if (!((l) list.get(i3)).apply(obj)) {
                return false;
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.a.equals(((m) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
