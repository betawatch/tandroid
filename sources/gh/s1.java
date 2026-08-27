package gh;

import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s1 extends f2.w {
    public final /* synthetic */ k2 c;

    public s1(k2 k2Var) {
        this.c = k2Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        int i11;
        k2 k2Var = this.c;
        bz bzVar = k2Var.f0;
        b51 b51Var = k2Var.U;
        if (b51Var == null || i10 == 0) {
            return bzVar.J;
        }
        n41 G = b51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? bzVar.J : i11;
    }
}
