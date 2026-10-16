package b2;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class r1 {
    public static final String c;
    public static final String d;
    public final q1 a;
    public final e9.n0 b;

    static {
        String str = e2.m0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public r1(q1 q1Var, int i10) {
        this(q1Var, e9.n0.y(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.a.equals(r1Var.a) && this.b.equals(r1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public r1(q1 q1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= q1Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = q1Var;
        this.b = e9.n0.u(list);
    }
}
