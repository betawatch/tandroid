package b2;

import java.util.Arrays;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class u1 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final p1 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = e2.m0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public u1(p1 p1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = p1Var.a;
        this.a = i10;
        boolean z11 = false;
        u6.g(i10 == iArr.length && i10 == zArr.length);
        this.b = p1Var;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.c = z11;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u1.class == obj.getClass()) {
            u1 u1Var = (u1) obj;
            if (this.c == u1Var.c && this.b.equals(u1Var.b) && Arrays.equals(this.d, u1Var.d) && Arrays.equals(this.e, u1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
