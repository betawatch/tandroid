package d5;

import f5.d0;
import java.util.Collections;
import java.util.List;
import l4.j1;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v implements j3.g {
    public static final String c;
    public static final String d;
    public final j1 a;
    public final z b;

    static {
        int i10 = d0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public v(j1 j1Var, int i10) {
        this(j1Var, z.y(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.a.equals(vVar.a) && this.b.equals(vVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public v(j1 j1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= j1Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = j1Var;
        this.b = z.u(list);
    }
}
