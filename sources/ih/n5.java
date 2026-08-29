package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.w41;
import org.telegram.ui.to0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n5 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n5(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                w41 G = ((q5) this.d).e0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            case 1:
                jh.j1 j1Var = (jh.j1) this.d;
                iz izVar = j1Var.d0;
                jh.d1 d1Var = j1Var.g0;
                if (d1Var == null || i10 == 0) {
                    return izVar.J;
                }
                w41 G2 = d1Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? izVar.J : i12;
            case 2:
                nh.s1 s1Var = (nh.s1) this.d;
                if (s1Var.Y.c.F(i10) == null) {
                    return s1Var.J;
                }
                s1Var.B1();
                return s1Var.R.get(i10);
            case 3:
                nh.y1 y1Var = (nh.y1) this.d;
                if (y1Var.c.j(i10) != 2) {
                    return y1Var.h;
                }
                return 1;
            case 4:
                bj bjVar = (bj) this.d;
                int i13 = bjVar.r;
                int i14 = bjVar.w;
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
                ky kyVar = (ky) this.d;
                fz fzVar = kyVar.Y;
                if (i10 == 0) {
                    fzVar.j0.getClass();
                }
                f2.p0 adapter = fzVar.d0.getAdapter();
                jy jyVar = fzVar.f0;
                if (adapter == jyVar && jyVar.x.isEmpty()) {
                    return kyVar.J;
                }
                fzVar.j0.getClass();
                kyVar.B1();
                return kyVar.R.get(i10);
            case 7:
                nx0 nx0Var = (nx0) this.d;
                if ((nx0Var.S == null || !(nx0Var.d.e.get(i10) instanceof Integer)) && i10 != nx0Var.d.h) {
                    return 1;
                }
                return nx0Var.d.d;
            default:
                to0 to0Var = (to0) this.d;
                if (i10 < to0Var.P || i10 >= to0Var.Q) {
                    return (i10 < to0Var.R || i10 >= to0Var.S) ? 3 : 1;
                }
                return 1;
        }
    }
}
