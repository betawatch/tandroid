package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n2 extends g2 {
    public static final String e;
    public static final String f;
    public static final d0 h;
    public final boolean c;
    public final boolean d;

    static {
        int i10 = f5.d0.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new d0(11);
    }

    public n2() {
        this.c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.d == n2Var.d && this.c == n2Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public n2(boolean z10) {
        this.c = true;
        this.d = z10;
    }
}
