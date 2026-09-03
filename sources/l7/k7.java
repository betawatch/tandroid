package l7;

import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k7 {
    public final j7 a;
    public final Integer b;

    public /* synthetic */ k7(f7.b bVar) {
        this.a = (j7) bVar.b;
        this.b = (Integer) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return b6.m.l(this.a, k7Var.a) && b6.m.l(this.b, k7Var.b) && b6.m.l(null, null) && b6.m.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
