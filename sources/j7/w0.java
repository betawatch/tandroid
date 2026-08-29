package j7;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w0 {
    public final t7 a;
    public final Boolean b;
    public final n8 c;

    public /* synthetic */ w0(androidx.biometric.e eVar) {
        this.a = (t7) eVar.b;
        this.b = (Boolean) eVar.c;
        this.c = (n8) eVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return z5.l.l(this.a, w0Var.a) && z5.l.l(this.b, w0Var.b) && z5.l.l(null, null) && z5.l.l(this.c, w0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
