package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w1 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w1(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                x1 x1Var = (x1) this.d;
                if (x1Var.Y.c.F(i10) == null) {
                    return x1Var.J;
                }
                x1Var.B1();
                return x1Var.R.get(i10);
            case 1:
                d2 d2Var = (d2) this.d;
                if (d2Var.c.j(i10) != 2) {
                    return d2Var.h;
                }
                return 1;
            case 2:
                nj njVar = (nj) this.d;
                int i13 = njVar.r;
                int i14 = njVar.w;
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
                fz fzVar = (fz) this.d;
                a00 a00Var = fzVar.Y;
                if (i10 == 0) {
                    a00Var.n0.getClass();
                }
                s4.i0 adapter = a00Var.h0.getAdapter();
                ez ezVar = a00Var.j0;
                if (adapter == ezVar && ezVar.x.isEmpty()) {
                    return fzVar.J;
                }
                a00Var.n0.getClass();
                fzVar.B1();
                return fzVar.R.get(i10);
            case 5:
                xy0 xy0Var = (xy0) this.d;
                if ((xy0Var.W == null || !(xy0Var.d.e.get(i10) instanceof Integer)) && i10 != xy0Var.d.h) {
                    return 1;
                }
                return xy0Var.d.d;
            case 6:
                up0 up0Var = (up0) this.d;
                if (i10 < up0Var.b0 || i10 >= up0Var.c0) {
                    return (i10 < up0Var.d0 || i10 >= up0Var.e0) ? 3 : 1;
                }
                return 1;
            case 7:
                p61 G = ((xh.h4) this.d).i0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            default:
                yh.r0 r0Var = (yh.r0) this.d;
                d00 d00Var = r0Var.h0;
                yh.m0 m0Var = r0Var.k0;
                if (m0Var == null || i10 == 0) {
                    return d00Var.J;
                }
                p61 G2 = m0Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? d00Var.J : i12;
        }
    }
}
