package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o0 extends f2 {
    public static final String e;
    public static final String f;
    public static final f0.d h;
    public final boolean c;
    public final boolean d;

    static {
        int i10 = h5.d0.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new f0.d(28);
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
