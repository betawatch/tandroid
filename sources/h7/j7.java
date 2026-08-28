package h7;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        return x5.l.l(this.a, j7Var.a) && x5.l.l(this.b, j7Var.b) && x5.l.l(null, null) && x5.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
