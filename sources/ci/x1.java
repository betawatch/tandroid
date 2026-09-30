package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.x51;
import org.telegram.ui.np0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class x1 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x1(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                y1 y1Var = (y1) this.d;
                if (y1Var.Y.c.F(i10) == null) {
                    return y1Var.J;
                }
                y1Var.B1();
                return y1Var.R.get(i10);
            case 1:
                e2 e2Var = (e2) this.d;
                if (e2Var.c.j(i10) != 2) {
                    return e2Var.h;
                }
                return 1;
            case 2:
                lj ljVar = (lj) this.d;
                int i13 = ljVar.r;
                int i14 = ljVar.w;
                return i13 + (i10 % i14 != i14 + (-1) ? AndroidUtilities.dp(5.0f) : 0);
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 == chatAttachAlertPhotoLayout.G.n - 1 || ((chatAttachAlertPhotoLayout.P0 || chatAttachAlertPhotoLayout.O0) && i10 == 0)) {
                    return chatAttachAlertPhotoLayout.F.J;
                }
                if (chatAttachAlertPhotoLayout.O0) {
                    i10--;
                }
                int i15 = chatAttachAlertPhotoLayout.K0;
                int i16 = chatAttachAlertPhotoLayout.M0;
                return i15 + (i10 % i16 != i16 + (-1) ? AndroidUtilities.dp(2.0f) : 0);
            case 4:
                sy syVar = (sy) this.d;
                mz mzVar = syVar.Y;
                if (i10 == 0) {
                    mzVar.n0.getClass();
                }
                s4.h0 adapter = mzVar.h0.getAdapter();
                ry ryVar = mzVar.j0;
                if (adapter == ryVar && ryVar.x.isEmpty()) {
                    return syVar.J;
                }
                mzVar.n0.getClass();
                syVar.B1();
                return syVar.R.get(i10);
            case 5:
                hy0 hy0Var = (hy0) this.d;
                if ((hy0Var.W == null || !(hy0Var.d.e.get(i10) instanceof Integer)) && i10 != hy0Var.d.h) {
                    return 1;
                }
                return hy0Var.d.d;
            case 6:
                np0 np0Var = (np0) this.d;
                if (i10 < np0Var.b0 || i10 >= np0Var.c0) {
                    return (i10 < np0Var.d0 || i10 >= np0Var.e0) ? 3 : 1;
                }
                return 1;
            case 7:
                x51 G = ((xh.h4) this.d).i0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            default:
                yh.s0 s0Var = (yh.s0) this.d;
                pz pzVar = s0Var.h0;
                yh.n0 n0Var = s0Var.k0;
                if (n0Var == null || i10 == 0) {
                    return pzVar.J;
                }
                x51 G2 = n0Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? pzVar.J : i12;
        }
    }
}
