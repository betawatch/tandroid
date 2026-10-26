package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
