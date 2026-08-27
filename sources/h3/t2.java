package h3;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t2 implements g {
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
        int i10 = d5.g0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = Integer.toString(3, 36);
        r = Integer.toString(4, 36);
    }

    public t2(j4.i1 i1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = i1Var.a;
        this.a = i10;
        boolean z11 = false;
        d5.a.f(i10 == iArr.length && i10 == zArr.length);
        this.b = i1Var;
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
        if (obj != null && t2.class == obj.getClass()) {
            t2 t2Var = (t2) obj;
            if (this.c == t2Var.c && this.b.equals(t2Var.b) && Arrays.equals(this.d, t2Var.d) && Arrays.equals(this.e, t2Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
