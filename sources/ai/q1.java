package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zy;
import org.telegram.ui.ep0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class q1 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q1(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                a2 a2Var = (a2) this.d;
                wz wzVar = a2Var.h0;
                t1 t1Var = a2Var.k0;
                if (t1Var == null || i10 == 0) {
                    return wzVar.J;
                }
                f61 G = t1Var.G(i10 - 1);
                return (G == null || (i11 = G.u) == -1) ? wzVar.J : i11;
            case 1:
                ei.u1 u1Var = (ei.u1) this.d;
                if (u1Var.Y.c.F(i10) == null) {
                    return u1Var.J;
                }
                u1Var.B1();
                return u1Var.R.get(i10);
            case 2:
                ei.b2 b2Var = (ei.b2) this.d;
                if (b2Var.c.j(i10) != 2) {
                    return b2Var.h;
                }
                return 1;
            case 3:
                ij ijVar = (ij) this.d;
                int i13 = ijVar.r;
                int i14 = ijVar.w;
                return i13 + (i10 % i14 != i14 + (-1) ? AndroidUtilities.dp(5.0f) : 0);
            case 4:
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
            case 5:
                zy zyVar = (zy) this.d;
                tz tzVar = zyVar.Y;
                if (i10 == 0) {
                    tzVar.n0.getClass();
                }
                s4.g0 adapter = tzVar.h0.getAdapter();
                yy yyVar = tzVar.j0;
                if (adapter == yyVar && yyVar.x.isEmpty()) {
                    return zyVar.J;
                }
                tzVar.n0.getClass();
                zyVar.B1();
                return zyVar.R.get(i10);
            case 6:
                oy0 oy0Var = (oy0) this.d;
                if ((oy0Var.W == null || !(oy0Var.d.e.get(i10) instanceof Integer)) && i10 != oy0Var.d.h) {
                    return 1;
                }
                return oy0Var.d.d;
            case 7:
                ep0 ep0Var = (ep0) this.d;
                if (i10 < ep0Var.b0 || i10 >= ep0Var.c0) {
                    return (i10 < ep0Var.d0 || i10 >= ep0Var.e0) ? 3 : 1;
                }
                return 1;
            case 8:
                f61 G2 = ((yh.g4) this.d).i0.G(i10 - 1);
                if (G2 == null || (i12 = G2.u) == -1) {
                    return 3;
                }
                return i12;
            default:
                zh.d0 d0Var = (zh.d0) this.d;
                if (d0Var.e.j(i10) == 0) {
                    return d0Var.r;
                }
                return 1;
        }
    }
}
