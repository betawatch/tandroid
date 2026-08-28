package h3;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s2 implements g {
    public static final String f;
    public static final String h;
    public static final String n;
    public static final String r;
    public final int a;
    public final j4.i1 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        int i9 = d5.f0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = Integer.toString(3, 36);
        r = Integer.toString(4, 36);
    }

    public s2(j4.i1 i1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i9 = i1Var.a;
        this.a = i9;
        boolean z11 = false;
        d5.a.f(i9 == iArr.length && i9 == zArr.length);
        this.b = i1Var;
        if (z10 && i9 > 1) {
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
