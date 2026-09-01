package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i1 {
    public final hb a;
    public final Boolean b;
    public final we c;

    public /* synthetic */ i1(l7.w0 w0Var) {
        this.a = (hb) w0Var.b;
        this.b = (Boolean) w0Var.c;
        this.c = (we) w0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return b6.m.l(this.a, i1Var.a) && b6.m.l(this.b, i1Var.b) && b6.m.l(null, null) && b6.m.l(this.c, i1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
