package g9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x extends q1 implements Serializable {
    public final Comparator[] a;

    public x(n nVar, n nVar2) {
        this.a = new Comparator[]{nVar, nVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i3 = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i3 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i3].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i3++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return Arrays.equals(this.a, ((x) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
