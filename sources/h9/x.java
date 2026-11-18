package h9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class x extends r1 implements Serializable {
    public final Comparator[] a;

    public x(n nVar, n nVar2) {
        this.a = new Comparator[]{nVar, nVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7 = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i7 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i7].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i7++;
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
        return a8.p0.s(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
