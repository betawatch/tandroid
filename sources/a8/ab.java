package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class ab {
    public final za a;
    public final Integer b;

    public /* synthetic */ ab(n4.s sVar) {
        this.a = (za) sVar.b;
        this.b = (Integer) sVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return o6.l.l(this.a, abVar.a) && o6.l.l(this.b, abVar.b) && o6.l.l(null, null) && o6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
