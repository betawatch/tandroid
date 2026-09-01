package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o0 extends f2 {
    public static final String e;
    public static final String f;
    public static final f5.u h;
    public final boolean c;
    public final boolean d;

    static {
        int i10 = h5.d0.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new f5.u(28);
    }

    public o0() {
        this.c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.d == o0Var.d && this.c == o0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public o0(boolean z4) {
        this.c = true;
        this.d = z4;
    }
}
