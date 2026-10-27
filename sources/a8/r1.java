package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r1 {
    public final qb a;
    public final Boolean b;
    public final ef c;

    public /* synthetic */ r1(h0 h0Var) {
        this.a = (qb) h0Var.b;
        this.b = (Boolean) h0Var.c;
        this.c = (ef) h0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return o6.l.l(this.a, r1Var.a) && o6.l.l(this.b, r1Var.b) && o6.l.l(null, null) && o6.l.l(this.c, r1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
