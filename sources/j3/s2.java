package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s2 implements g {
    public static final String f;
    public static final String h;
    public static final String n;
    public static final String r;
    public final int a;
    public final l4.j1 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        int i10 = f5.d0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = Integer.toString(3, 36);
        r = Integer.toString(4, 36);
    }

    public s2(l4.j1 j1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = j1Var.a;
        this.a = i10;
        boolean z11 = false;
        f5.a.f(i10 == iArr.length && i10 == zArr.length);
        this.b = j1Var;
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
        if (obj != null && s2.class == obj.getClass()) {
            s2 s2Var = (s2) obj;
            if (this.c == s2Var.c && this.b.equals(s2Var.b) && Arrays.equals(this.d, s2Var.d) && Arrays.equals(this.e, s2Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
