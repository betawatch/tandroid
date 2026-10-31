package e9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c0 extends v1 implements Serializable {
    public final Comparator[] a;

    public c0(r rVar, r rVar2) {
        this.a = new Comparator[]{rVar, rVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i10].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return Arrays.equals(this.a, ((c0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return a1.g.r(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
