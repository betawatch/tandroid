package i7;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w0 {
    public final s7 a;
    public final Boolean b;
    public final m8 c;

    public /* synthetic */ w0(a5.n nVar) {
        this.a = (s7) nVar.b;
        this.b = (Boolean) nVar.c;
        this.c = (m8) nVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return y5.l.l(this.a, w0Var.a) && y5.l.l(this.b, w0Var.b) && y5.l.l(null, null) && y5.l.l(this.c, w0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
