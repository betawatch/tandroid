// default package

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cs2 extends at7 implements Serializable {
    public final Comparator[] a;

    public cs2(c61 c61Var, c61 c61Var2) {
        this.a = new Comparator[]{c61Var, c61Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cs2) {
            return Arrays.equals(this.a, ((cs2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return b10.j(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
