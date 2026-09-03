package f5;

import h5.d0;
import java.util.Collections;
import java.util.List;
import o4.s0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class v implements j3.g {
    public static final String c;
    public static final String d;
    public final s0 a;
    public final s8.v b;

    static {
        int i10 = d0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public v(s0 s0Var, int i10) {
        this(s0Var, s8.v.x(Integer.valueOf(i10)));
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

    public v(s0 s0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= s0Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = s0Var;
        this.b = s8.v.t(list);
    }
}
