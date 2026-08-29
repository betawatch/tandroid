package l7;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i1 {
    public final gb a;
    public final Boolean b;
    public final ve c;

    public /* synthetic */ i1(l3.g0 g0Var) {
        this.a = (gb) g0Var.b;
        this.b = (Boolean) g0Var.c;
        this.c = (ve) g0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return z5.l.l(this.a, i1Var.a) && z5.l.l(this.b, i1Var.b) && z5.l.l(null, null) && z5.l.l(this.c, i1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
