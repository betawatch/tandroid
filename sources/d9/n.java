package d9;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class n implements m, Serializable {
    public final List a;

    public n(List list) {
        this.a = list;
    }

    @Override // d9.m
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((m) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.a.equals(((n) obj).a);
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
