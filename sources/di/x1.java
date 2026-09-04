package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                ux0 ux0Var = (ux0) this.d;
                if ((ux0Var.W == null || !(ux0Var.d.e.get(i10) instanceof Integer)) && i10 != ux0Var.d.h) {
                    return 1;
                }
                return ux0Var.d.d;
            case 6:
                vp0 vp0Var = (vp0) this.d;
                if (i10 < vp0Var.b0 || i10 >= vp0Var.c0) {
                    return (i10 < vp0Var.d0 || i10 >= vp0Var.e0) ? 3 : 1;
                }
                return 1;
            case 7:
                h51 G = ((yh.f4) this.d).i0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            default:
                zh.s0 s0Var = (zh.s0) this.d;
                nz nzVar = s0Var.h0;
                zh.n0 n0Var = s0Var.k0;
                if (n0Var == null || i10 == 0) {
                    return nzVar.J;
                }
                h51 G2 = n0Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? nzVar.J : i12;
        }
    }
}
