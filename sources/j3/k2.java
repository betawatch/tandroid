package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
