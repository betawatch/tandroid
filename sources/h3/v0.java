package h3;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v0 extends g2 {
    public static final String e;
    public static final String f;
    public static final f9.z h;
    public final boolean c;
    public final boolean d;

    static {
        int i10 = d5.g0.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new f9.z(19);
    }

    public v0() {
        this.c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.d == v0Var.d && this.c == v0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public v0(boolean z10) {
        this.c = true;
        this.d = z10;
    }
}
