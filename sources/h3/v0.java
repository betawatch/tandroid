package h3;

import fh.y5;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v0 extends g2 {
    public static final String e;
    public static final String f;
    public static final y5 h;
    public final boolean c;
    public final boolean d;

    static {
        int i9 = d5.f0.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new y5(15);
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
