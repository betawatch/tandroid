package g9;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n implements m, Serializable {
    public final List a;

    public n(List list) {
        this.a = list;
    }

    @Override // g9.m
    public final boolean apply(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.a;
            if (i7 >= list.size()) {
                return true;
            }
            if (!((m) list.get(i7)).apply(obj)) {
                return false;
            }
            i7++;
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
        boolean z9 = true;
        for (Object obj : this.a) {
            if (!z9) {
                sb2.append(',');
            }
            sb2.append(obj);
            z9 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
