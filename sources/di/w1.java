package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zz;
import org.telegram.ui.aq0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                bz bzVar = (bz) this.d;
                wz wzVar = bzVar.Y;
                if (i10 == 0) {
                    wzVar.n0.getClass();
                }
                s4.g0 adapter = wzVar.h0.getAdapter();
                az azVar = wzVar.j0;
                if (adapter == azVar && azVar.x.isEmpty()) {
                    return bzVar.J;
                }
                wzVar.n0.getClass();
                bzVar.B1();
                return bzVar.R.get(i10);
            case 5:
                ty0 ty0Var = (ty0) this.d;
                if ((ty0Var.W == null || !(ty0Var.d.e.get(i10) instanceof Integer)) && i10 != ty0Var.d.h) {
                    return 1;
                }
                return ty0Var.d.d;
            case 6:
                aq0 aq0Var = (aq0) this.d;
                if (i10 < aq0Var.b0 || i10 >= aq0Var.c0) {
                    return (i10 < aq0Var.d0 || i10 >= aq0Var.e0) ? 3 : 1;
                }
                return 1;
            case 7:
                l61 G = ((yh.f4) this.d).i0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            default:
                zh.r0 r0Var = (zh.r0) this.d;
                zz zzVar = r0Var.h0;
                zh.m0 m0Var = r0Var.k0;
                if (m0Var == null || i10 == 0) {
                    return zzVar.J;
                }
                l61 G2 = m0Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? zzVar.J : i12;
        }
    }
}
