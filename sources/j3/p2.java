package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p2 implements g {
    public static final String f;
    public static final String h;
    public static final String n;
    public static final String r;
    public final int a;
    public final o4.s0 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        int i10 = h5.d0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = Integer.toString(3, 36);
        r = Integer.toString(4, 36);
    }

    public p2(o4.s0 s0Var, boolean z4, int[] iArr, boolean[] zArr) {
        int i10 = s0Var.a;
        this.a = i10;
        boolean z10 = false;
        h5.a.f(i10 == iArr.length && i10 == zArr.length);
        this.b = s0Var;
        if (z4 && i10 > 1) {
            z10 = true;
        }
        this.c = z10;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2.class == obj.getClass()) {
            p2 p2Var = (p2) obj;
            if (this.c == p2Var.c && this.b.equals(p2Var.b) && Arrays.equals(this.d, p2Var.d) && Arrays.equals(this.e, p2Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
