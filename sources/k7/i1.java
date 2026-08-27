package k7;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i1 {
    public final gb a;
    public final Boolean b;
    public final ve c;

    public /* synthetic */ i1(j9.a aVar) {
        this.a = (gb) aVar.b;
        this.b = (Boolean) aVar.c;
        this.c = (ve) aVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return y5.l.l(this.a, i1Var.a) && y5.l.l(this.b, i1Var.b) && y5.l.l(null, null) && y5.l.l(this.c, i1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
