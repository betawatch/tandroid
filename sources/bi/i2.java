package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xy;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class i2 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i2(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                j2 j2Var = (j2) this.d;
                if (j2Var.Y.c.F(i10) == null) {
                    return j2Var.J;
                }
                j2Var.B1();
                return j2Var.R.get(i10);
            case 1:
                q2 q2Var = (q2) this.d;
                if (q2Var.c.j(i10) != 2) {
                    return q2Var.h;
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
                xy xyVar = (xy) this.d;
                rz rzVar = xyVar.Y;
                if (i10 == 0) {
                    rzVar.n0.getClass();
                }
                s4.h0 adapter = rzVar.h0.getAdapter();
                wy wyVar = rzVar.j0;
                if (adapter == wyVar && wyVar.x.isEmpty()) {
                    return xyVar.J;
                }
                rzVar.n0.getClass();
                xyVar.B1();
                return xyVar.R.get(i10);
            case 5:
                hy0 hy0Var = (hy0) this.d;
                if ((hy0Var.W == null || !(hy0Var.d.e.get(i10) instanceof Integer)) && i10 != hy0Var.d.h) {
                    return 1;
                }
                return hy0Var.d.d;
            case 6:
                up0 up0Var = (up0) this.d;
                if (i10 < up0Var.b0 || i10 >= up0Var.c0) {
                    return (i10 < up0Var.d0 || i10 >= up0Var.e0) ? 3 : 1;
                }
                return 1;
            case 7:
                v51 G = ((wh.g4) this.d).i0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            default:
                xh.s0 s0Var = (xh.s0) this.d;
                uz uzVar = s0Var.h0;
                xh.n0 n0Var = s0Var.k0;
                if (n0Var == null || i10 == 0) {
                    return uzVar.J;
                }
                v51 G2 = n0Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? uzVar.J : i12;
        }
    }
}
