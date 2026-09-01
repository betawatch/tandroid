package lh;

import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        x51 x51Var = s3Var.a0;
        if (x51Var == null) {
            return pzVar.J;
        }
        j51 G = x51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? pzVar.J : i11;
    }
}
