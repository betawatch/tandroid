package ih;

import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q3 extends f2.v {
    public final /* synthetic */ s3 c;

    public q3(s3 s3Var) {
        this.c = s3Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        s3 s3Var = this.c;
        iz izVar = s3Var.W;
        k51 k51Var = s3Var.Z;
        if (k51Var == null) {
            return izVar.J;
        }
        w41 G = k51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? izVar.J : i11;
    }
}
