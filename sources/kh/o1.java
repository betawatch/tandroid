package kh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o1 extends f2.v {
    public final /* synthetic */ h2 c;

    public o1(h2 h2Var) {
        this.c = h2Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        h2 h2Var = this.c;
        nz nzVar = h2Var.g0;
        w51 w51Var = h2Var.V;
        if (w51Var == null || i10 == 0) {
            return nzVar.J;
        }
        i51 G = w51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
