package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p7 {
    public final o7 a;
    public final Integer b;

    public /* synthetic */ p7(wf.b bVar) {
        this.a = (o7) bVar.b;
        this.b = (Integer) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return q6.m.k(this.a, p7Var.a) && q6.m.k(this.b, p7Var.b) && q6.m.k(null, null) && q6.m.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
