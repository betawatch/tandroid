package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
