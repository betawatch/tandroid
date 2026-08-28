package h7;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w0 {
    public final s7 a;
    public final Boolean b;
    public final m8 c;

    public /* synthetic */ w0(a5.m mVar) {
        this.a = (s7) mVar.b;
        this.b = (Boolean) mVar.c;
        this.c = (m8) mVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return x5.l.l(this.a, w0Var.a) && x5.l.l(this.b, w0Var.b) && x5.l.l(null, null) && x5.l.l(this.c, w0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
