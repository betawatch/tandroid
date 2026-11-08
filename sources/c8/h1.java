package c8;

import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class h1 {
    public final eb a;
    public final Boolean b;
    public final te c;

    public /* synthetic */ h1(android.support.v4.media.session.a0 a0Var) {
        this.a = (eb) a0Var.b;
        this.b = (Boolean) a0Var.c;
        this.c = (te) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return q6.m.k(this.a, h1Var.a) && q6.m.k(this.b, h1Var.b) && q6.m.k(null, null) && q6.m.k(this.c, h1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
