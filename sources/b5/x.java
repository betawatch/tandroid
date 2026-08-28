package b5;

import d5.f0;
import j4.i1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x implements h3.g {
    public static final String c;
    public static final String d;
    public final i1 a;
    public final o8.z b;

    static {
        int i9 = f0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public x(i1 i1Var, int i9) {
        this(i1Var, o8.z.y(Integer.valueOf(i9)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.a.equals(xVar.a) && this.b.equals(xVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public x(i1 i1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= i1Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = i1Var;
        this.b = o8.z.u(list);
    }
}
