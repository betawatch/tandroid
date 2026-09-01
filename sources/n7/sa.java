package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class sa {
    public final ra a;
    public final Integer b;

    public /* synthetic */ sa(qa qaVar) {
        this.a = (ra) qaVar.b;
        this.b = (Integer) qaVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return b6.m.l(this.a, saVar.a) && b6.m.l(this.b, saVar.b) && b6.m.l(null, null) && b6.m.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
