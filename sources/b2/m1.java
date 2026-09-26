package b2;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class m1 {
    public static final String c;
    public static final String d;
    public final l1 a;
    public final e9.i0 b;

    static {
        String str = e2.d0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public m1(l1 l1Var, int i10) {
        this(l1Var, e9.i0.z(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.a.equals(m1Var.a) && this.b.equals(m1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public m1(l1 l1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l1Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = l1Var;
        this.b = e9.i0.v(list);
    }
}
