package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                jj jjVar = (jj) this.d;
                int i13 = jjVar.r;
                int i14 = jjVar.w;
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
                qy qyVar = (qy) this.d;
                kz kzVar = qyVar.Y;
                if (i10 == 0) {
                    kzVar.n0.getClass();
                }
                s4.h0 adapter = kzVar.h0.getAdapter();
                py pyVar = kzVar.j0;
                if (adapter == pyVar && pyVar.x.isEmpty()) {
                    return qyVar.J;
                }
                kzVar.n0.getClass();
                qyVar.B1();
                return qyVar.R.get(i10);
            case 5:
                vx0 vx0Var = (vx0) this.d;
                if ((vx0Var.W == null || !(vx0Var.d.e.get(i10) instanceof Integer)) && i10 != vx0Var.d.h) {
                    return 1;
                }
                return vx0Var.d.d;
            case 6:
                up0 up0Var = (up0) this.d;
                if (i10 < up0Var.b0 || i10 >= up0Var.c0) {
                    return (i10 < up0Var.d0 || i10 >= up0Var.e0) ? 3 : 1;
                }
                return 1;
            case 7:
                i51 G = ((xh.g4) this.d).i0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            default:
                yh.s0 s0Var = (yh.s0) this.d;
                nz nzVar = s0Var.h0;
                yh.n0 n0Var = s0Var.k0;
                if (n0Var == null || i10 == 0) {
                    return nzVar.J;
                }
                i51 G2 = n0Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? nzVar.J : i12;
        }
    }
}
