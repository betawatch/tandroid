package lh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o1 extends f2.v {
    public final /* synthetic */ g2 c;

    public o1(g2 g2Var) {
        this.c = g2Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        g2 g2Var = this.c;
        pz pzVar = g2Var.g0;
        w51 w51Var = g2Var.V;
        if (w51Var == null || i10 == 0) {
            return pzVar.J;
        }
        h51 G = w51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? pzVar.J : i11;
    }
}
