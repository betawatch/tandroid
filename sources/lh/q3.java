package lh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        pz pzVar = s3Var.X;
        w51 w51Var = s3Var.a0;
        if (w51Var == null) {
            return pzVar.J;
        }
        h51 G = w51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? pzVar.J : i11;
    }
}
