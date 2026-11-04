package d2;

import b8.zb;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u1 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final o1 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = g2.n0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public u1(o1 o1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i3 = o1Var.a;
        this.a = i3;
        boolean z11 = false;
        zb.f(i3 == iArr.length && i3 == zArr.length);
        this.b = o1Var;
        if (z10 && i3 > 1) {
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
