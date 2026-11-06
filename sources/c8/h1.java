package c8;

import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
