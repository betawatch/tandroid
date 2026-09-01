package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k2 extends f2 {
    public static final String e;
    public static final String f;
    public static final q0 h;
    public final boolean c;
    public final boolean d;

    static {
        int i10 = h5.d0.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new q0(12);
    }

    public k2() {
        this.c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.d == k2Var.d && this.c == k2Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public k2(boolean z4) {
        this.c = true;
        this.d = z4;
    }
}
