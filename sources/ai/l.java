package ai;

import bi.x1;
import fi.z1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.yy;
import org.telegram.ui.lp0;
import zh.g4;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                x0 x0Var = (x0) this.d;
                if (x0Var.e.j(i10) == 0) {
                    return x0Var.r;
                }
                return 1;
            case 1:
                x1 x1Var = (x1) this.d;
                vz vzVar = x1Var.h0;
                bi.q1 q1Var = x1Var.k0;
                if (q1Var == null || i10 == 0) {
                    return vzVar.J;
                }
                t61 G = q1Var.G(i10 - 1);
                return (G == null || (i11 = G.u) == -1) ? vzVar.J : i11;
            case 2:
                fi.t1 t1Var = (fi.t1) this.d;
                if (t1Var.Y.c.F(i10) == null) {
                    return t1Var.J;
                }
                t1Var.C1();
                return t1Var.R.get(i10);
            case 3:
                z1 z1Var = (z1) this.d;
                if (z1Var.c.j(i10) != 2) {
                    return z1Var.h;
                }
                return 1;
            case 4:
                ij ijVar = (ij) this.d;
                int i13 = ijVar.r;
                int i14 = ijVar.w;
                return i13 + (i10 % i14 != i14 + (-1) ? AndroidUtilities.dp(5.0f) : 0);
            case 5:
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
            case 6:
                yy yyVar = (yy) this.d;
                sz szVar = yyVar.Y;
                if (i10 == 0) {
                    szVar.n0.getClass();
                }
                s4.h0 adapter = szVar.h0.getAdapter();
                xy xyVar = szVar.j0;
                if (adapter == xyVar && xyVar.x.isEmpty()) {
                    return yyVar.J;
                }
                szVar.n0.getClass();
                yyVar.C1();
                return yyVar.R.get(i10);
            case 7:
                cz0 cz0Var = (cz0) this.d;
                if ((cz0Var.W == null || !(cz0Var.d.e.get(i10) instanceof Integer)) && i10 != cz0Var.d.h) {
                    return 1;
                }
                return cz0Var.d.d;
            case 8:
                lp0 lp0Var = (lp0) this.d;
                if (i10 < lp0Var.b0 || i10 >= lp0Var.c0) {
                    return (i10 < lp0Var.d0 || i10 >= lp0Var.e0) ? 3 : 1;
                }
                return 1;
            default:
                t61 G2 = ((g4) this.d).i0.G(i10 - 1);
                if (G2 == null || (i12 = G2.u) == -1) {
                    return 3;
                }
                return i12;
        }
    }
}
