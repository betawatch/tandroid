package gh;

import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w3 extends f2.w {
    public final /* synthetic */ y3 c;

    public w3(y3 y3Var) {
        this.c = y3Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        int i11;
        y3 y3Var = this.c;
        bz bzVar = y3Var.W;
        b51 b51Var = y3Var.Z;
        if (b51Var == null) {
            return bzVar.J;
        }
        n41 G = b51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? bzVar.J : i11;
    }
}
