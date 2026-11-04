package d2;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p1 {
    public static final String c;
    public static final String d;
    public final o1 a;
    public final g9.i0 b;

    static {
        String str = g2.n0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public p1(o1 o1Var, int i3) {
        this(o1Var, g9.i0.u(Integer.valueOf(i3)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.a.equals(p1Var.a) && this.b.equals(p1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public p1(o1 o1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= o1Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = o1Var;
        this.b = g9.i0.q(list);
    }
}
