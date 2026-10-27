package b2;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r1 {
    public static final String c;
    public static final String d;
    public final q1 a;
    public final f9.i0 b;

    static {
        String str = e2.n0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public r1(q1 q1Var, int i10) {
        this(q1Var, f9.i0.y(Integer.valueOf(i10)));
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
        this.b = f9.i0.u(list);
    }
}
