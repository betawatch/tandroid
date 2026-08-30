package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
