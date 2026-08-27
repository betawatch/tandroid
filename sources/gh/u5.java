package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.yy;
import org.telegram.ui.vo0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u5 extends f2.w {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u5(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // f2.w
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                n41 G = ((x5) this.d).e0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            case 1:
                hh.l1 l1Var = (hh.l1) this.d;
                bz bzVar = l1Var.d0;
                hh.e1 e1Var = l1Var.g0;
                if (e1Var == null || i10 == 0) {
                    return bzVar.J;
                }
                n41 G2 = e1Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? bzVar.J : i12;
            case 2:
                lh.t1 t1Var = (lh.t1) this.d;
                if (t1Var.Y.c.F(i10) == null) {
                    return t1Var.J;
                }
                t1Var.B1();
                return t1Var.R.get(i10);
            case 3:
                lh.z1 z1Var = (lh.z1) this.d;
                if (z1Var.c.j(i10) != 2) {
                    return z1Var.h;
                }
                return 1;
            case 4:
                ui uiVar = (ui) this.d;
                int i13 = uiVar.r;
                int i14 = uiVar.w;
                return i13 + (i10 % i14 != i14 + (-1) ? AndroidUtilities.dp(5.0f) : 0);
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 == chatAttachAlertPhotoLayout.C.n - 1 || ((chatAttachAlertPhotoLayout.L0 || chatAttachAlertPhotoLayout.K0) && i10 == 0)) {
                    return chatAttachAlertPhotoLayout.B.J;
                }
                if (chatAttachAlertPhotoLayout.K0) {
                    i10--;
                }
                int i15 = chatAttachAlertPhotoLayout.G0;
                int i16 = chatAttachAlertPhotoLayout.I0;
                return i15 + (i10 % i16 != i16 + (-1) ? AndroidUtilities.dp(2.0f) : 0);
            case 6:
                dy dyVar = (dy) this.d;
                yy yyVar = dyVar.Y;
                if (i10 == 0) {
                    yyVar.j0.getClass();
                }
                f2.q0 adapter = yyVar.d0.getAdapter();
                cy cyVar = yyVar.f0;
                if (adapter == cyVar && cyVar.x.isEmpty()) {
                    return dyVar.J;
                }
                yyVar.j0.getClass();
                dyVar.B1();
                return dyVar.R.get(i10);
            case 7:
                ex0 ex0Var = (ex0) this.d;
                if ((ex0Var.S == null || !(ex0Var.d.e.get(i10) instanceof Integer)) && i10 != ex0Var.d.h) {
                    return 1;
                }
                return ex0Var.d.d;
            default:
                vo0 vo0Var = (vo0) this.d;
                if (i10 < vo0Var.P || i10 >= vo0Var.Q) {
                    return (i10 < vo0Var.R || i10 >= vo0Var.S) ? 3 : 1;
                }
                return 1;
        }
    }
}
