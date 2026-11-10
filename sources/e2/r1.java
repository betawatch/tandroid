package e2;

import a8.ia;
import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r1 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final m1 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = h2.m0.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public r1(m1 m1Var, boolean z9, int[] iArr, boolean[] zArr) {
        int i7 = m1Var.a;
        this.a = i7;
        boolean z10 = false;
        ia.f(i7 == iArr.length && i7 == zArr.length);
        this.b = m1Var;
        if (z9 && i7 > 1) {
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
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.c == r1Var.c && this.b.equals(r1Var.b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.e, r1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
