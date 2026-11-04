package b8;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p1 {
    public final nb a;
    public final Boolean b;
    public final cf c;

    public /* synthetic */ p1(android.support.v4.media.session.a0 a0Var) {
        this.a = (nb) a0Var.b;
        this.b = (Boolean) a0Var.c;
        this.c = (cf) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return p6.m.k(this.a, p1Var.a) && p6.m.k(this.b, p1Var.b) && p6.m.k(null, null) && p6.m.k(this.c, p1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
