package d9;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h implements g, Serializable {
    public final List a;

    public h(List list) {
        this.a = list;
    }

    @Override // d9.g
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((g) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.a.equals(((h) obj).a);
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
