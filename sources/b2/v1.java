package b2;

import a8.yb;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class v1 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final q1 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = e2.n0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public v1(q1 q1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = q1Var.a;
        this.a = i10;
        boolean z11 = false;
        yb.g(i10 == iArr.length && i10 == zArr.length);
        this.b = q1Var;
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
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.c == v1Var.c && this.b.equals(v1Var.b) && Arrays.equals(this.d, v1Var.d) && Arrays.equals(this.e, v1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
