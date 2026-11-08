package c8;

import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class te {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ te(a8.r7 r7Var) {
        this.a = (Boolean) r7Var.d;
        this.b = (Boolean) r7Var.e;
        this.c = (Boolean) r7Var.f;
        this.d = (Boolean) r7Var.b;
        this.e = (Boolean) r7Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return q6.m.k(this.a, teVar.a) && q6.m.k(this.b, teVar.b) && q6.m.k(this.c, teVar.c) && q6.m.k(this.d, teVar.d) && q6.m.k(this.e, teVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
