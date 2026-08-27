package i7;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j7 {
    public final i7 a;
    public final Integer b;

    public /* synthetic */ j7(g5.b bVar) {
        this.a = (i7) bVar.b;
        this.b = (Integer) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return y5.l.l(this.a, j7Var.a) && y5.l.l(this.b, j7Var.b) && y5.l.l(null, null) && y5.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
