package l7;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class x0 {
    public final t7 a;
    public final Boolean b;
    public final n8 c;

    public /* synthetic */ x0(w0 w0Var) {
        this.a = (t7) w0Var.b;
        this.b = (Boolean) w0Var.c;
        this.c = (n8) w0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return b6.m.l(this.a, x0Var.a) && b6.m.l(this.b, x0Var.b) && b6.m.l(null, null) && b6.m.l(this.c, x0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
