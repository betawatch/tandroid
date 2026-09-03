package kh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p3 extends f2.v {
    public final /* synthetic */ r3 c;

    public p3(r3 r3Var) {
        this.c = r3Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        r3 r3Var = this.c;
        nz nzVar = r3Var.X;
        w51 w51Var = r3Var.a0;
        if (w51Var == null) {
            return nzVar.J;
        }
        i51 G = w51Var.G(i10 - 1);
        return (G == null || (i11 = G.u) == -1) ? nzVar.J : i11;
    }
}
