package b2;

import java.util.Arrays;
import v7.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class v1 {
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
        String str = e2.l0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public v1(p1 p1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = p1Var.a;
        this.a = i10;
        boolean z11 = false;
        t6.f(i10 == iArr.length && i10 == zArr.length);
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
