package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.op0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                kj kjVar = (kj) this.d;
                int i13 = kjVar.r;
                int i14 = kjVar.w;
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
                ry ryVar = (ry) this.d;
                lz lzVar = ryVar.Y;
                if (i10 == 0) {
                    lzVar.n0.getClass();
                }
                s4.h0 adapter = lzVar.h0.getAdapter();
                qy qyVar = lzVar.j0;
                if (adapter == qyVar && qyVar.x.isEmpty()) {
                    return ryVar.J;
                }
                lzVar.n0.getClass();
                ryVar.B1();
                return ryVar.R.get(i10);
            case 5:
                ux0 ux0Var = (ux0) this.d;
                if ((ux0Var.W == null || !(ux0Var.d.e.get(i10) instanceof Integer)) && i10 != ux0Var.d.h) {
                    return 1;
                }
                return ux0Var.d.d;
            case 6:
                op0 op0Var = (op0) this.d;
                if (i10 < op0Var.b0 || i10 >= op0Var.c0) {
                    return (i10 < op0Var.d0 || i10 >= op0Var.e0) ? 3 : 1;
                }
                return 1;
            case 7:
                h51 G = ((xh.h4) this.d).i0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            default:
                yh.s0 s0Var = (yh.s0) this.d;
                oz ozVar = s0Var.h0;
                yh.n0 n0Var = s0Var.k0;
                if (n0Var == null || i10 == 0) {
                    return ozVar.J;
                }
                h51 G2 = n0Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? ozVar.J : i12;
        }
    }
}
