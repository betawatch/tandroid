package j7;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i1 {
    public final gb a;
    public final Boolean b;
    public final ve c;

    public /* synthetic */ i1(j4.c cVar) {
        this.a = (gb) cVar.b;
        this.b = (Boolean) cVar.c;
        this.c = (ve) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return x5.l.l(this.a, i1Var.a) && x5.l.l(this.b, i1Var.b) && x5.l.l(null, null) && x5.l.l(this.c, i1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
