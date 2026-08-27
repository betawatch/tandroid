package b5;

import d5.g0;
import j4.i1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w implements h3.g {
    public static final String c;
    public static final String d;
    public final i1 a;
    public final p8.z b;

    static {
        int i10 = g0.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(i1 i1Var, int i10) {
        this(i1Var, p8.z.y(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.a.equals(wVar.a) && this.b.equals(wVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public w(i1 i1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= i1Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = i1Var;
        this.b = p8.z.u(list);
    }
}
