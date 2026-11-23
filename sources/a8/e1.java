package a8;

import java.util.Arrays;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e1 {
    public final z7 a;
    public final Boolean b;
    public final u8 c;

    public /* synthetic */ e1(android.support.v4.media.session.a0 a0Var) {
        this.a = (z7) a0Var.b;
        this.b = (Boolean) a0Var.c;
        this.c = (u8) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return q6.m.l(this.a, e1Var.a) && q6.m.l(this.b, e1Var.b) && q6.m.l(null, null) && q6.m.l(this.c, e1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
