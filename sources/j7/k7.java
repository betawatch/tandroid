package j7;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k7 {
    public final j7 a;
    public final Integer b;

    public /* synthetic */ k7(g9.l lVar) {
        this.a = (j7) lVar.b;
        this.b = (Integer) lVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return z5.l.l(this.a, k7Var.a) && z5.l.l(this.b, k7Var.b) && z5.l.l(null, null) && z5.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
