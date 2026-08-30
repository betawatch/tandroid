package f5;

import h5.d0;
import java.util.Collections;
import java.util.List;
import o4.s0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u implements j3.g {
    public static final String c;
    public static final String d;
    public final s0 a;
    public final s8.v b;

    static {
        int i10 = d0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public u(s0 s0Var, int i10) {
        this(s0Var, s8.v.x(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.a.equals(uVar.a) && this.b.equals(uVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public u(s0 s0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= s0Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = s0Var;
        this.b = s8.v.t(list);
    }
}
