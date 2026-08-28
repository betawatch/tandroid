package n8;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g implements f, Serializable {
    public final List a;

    public g(List list) {
        this.a = list;
    }

    @Override // n8.f
    public final boolean apply(Object obj) {
        int i9 = 0;
        while (true) {
            List list = this.a;
            if (i9 >= list.size()) {
                return true;
            }
            if (!((f) list.get(i9)).apply(obj)) {
                return false;
            }
            i9++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.a.equals(((g) obj).a);
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
