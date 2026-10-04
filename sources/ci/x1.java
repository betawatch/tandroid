package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.ty;
import org.telegram.ui.qp0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                mj mjVar = (mj) this.d;
                int i13 = mjVar.r;
                int i14 = mjVar.w;
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
                ty tyVar = (ty) this.d;
                nz nzVar = tyVar.Y;
                if (i10 == 0) {
                    nzVar.n0.getClass();
                }
                s4.h0 adapter = nzVar.h0.getAdapter();
                sy syVar = nzVar.j0;
                if (adapter == syVar && syVar.x.isEmpty()) {
                    return tyVar.J;
                }
                nzVar.n0.getClass();
                tyVar.B1();
                return tyVar.R.get(i10);
            case 5:
                qy0 qy0Var = (qy0) this.d;
                if ((qy0Var.W == null || !(qy0Var.d.e.get(i10) instanceof Integer)) && i10 != qy0Var.d.h) {
                    return 1;
                }
                return qy0Var.d.d;
            case 6:
                qp0 qp0Var = (qp0) this.d;
                if (i10 < qp0Var.b0 || i10 >= qp0Var.c0) {
                    return (i10 < qp0Var.d0 || i10 >= qp0Var.e0) ? 3 : 1;
                }
                return 1;
            case 7:
                g61 G = ((xh.h4) this.d).i0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            default:
                yh.s0 s0Var = (yh.s0) this.d;
                qz qzVar = s0Var.h0;
                yh.n0 n0Var = s0Var.k0;
                if (n0Var == null || i10 == 0) {
                    return qzVar.J;
                }
                g61 G2 = n0Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? qzVar.J : i12;
        }
    }
}
