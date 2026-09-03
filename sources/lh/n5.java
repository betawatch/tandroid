package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.hp0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                h51 G = ((q5) this.d).f0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            case 1:
                mh.i1 i1Var = (mh.i1) this.d;
                pz pzVar = i1Var.e0;
                mh.c1 c1Var = i1Var.h0;
                if (c1Var == null || i10 == 0) {
                    return pzVar.J;
                }
                h51 G2 = c1Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? pzVar.J : i12;
            case 2:
                bj bjVar = (bj) this.d;
                int i13 = bjVar.r;
                int i14 = bjVar.w;
                return i13 + (i10 % i14 != i14 + (-1) ? AndroidUtilities.dp(5.0f) : 0);
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 == chatAttachAlertPhotoLayout.D.n - 1 || ((chatAttachAlertPhotoLayout.M0 || chatAttachAlertPhotoLayout.L0) && i10 == 0)) {
                    return chatAttachAlertPhotoLayout.C.J;
                }
                if (chatAttachAlertPhotoLayout.L0) {
                    i10--;
                }
                int i15 = chatAttachAlertPhotoLayout.H0;
                int i16 = chatAttachAlertPhotoLayout.J0;
                return i15 + (i10 % i16 != i16 + (-1) ? AndroidUtilities.dp(2.0f) : 0);
            case 4:
                ry ryVar = (ry) this.d;
                mz mzVar = ryVar.Y;
                if (i10 == 0) {
                    mzVar.k0.getClass();
                }
                f2.p0 adapter = mzVar.e0.getAdapter();
                qy qyVar = mzVar.g0;
                if (adapter == qyVar && qyVar.x.isEmpty()) {
                    return ryVar.J;
                }
                mzVar.k0.getClass();
                ryVar.B1();
                return ryVar.R.get(i10);
            case 5:
                xx0 xx0Var = (xx0) this.d;
                if ((xx0Var.T == null || !(xx0Var.d.e.get(i10) instanceof Integer)) && i10 != xx0Var.d.h) {
                    return 1;
                }
                return xx0Var.d.d;
            case 6:
                hp0 hp0Var = (hp0) this.d;
                if (i10 < hp0Var.V || i10 >= hp0Var.W) {
                    return (i10 < hp0Var.a0 || i10 >= hp0Var.b0) ? 3 : 1;
                }
                return 1;
            case 7:
                qh.g1 g1Var = (qh.g1) this.d;
                if (g1Var.Y.c.F(i10) == null) {
                    return g1Var.J;
                }
                g1Var.B1();
                return g1Var.R.get(i10);
            default:
                qh.n1 n1Var = (qh.n1) this.d;
                if (n1Var.c.j(i10) != 2) {
                    return n1Var.h;
                }
                return 1;
        }
    }
}
