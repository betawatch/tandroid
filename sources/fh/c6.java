package fh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zy;
import org.telegram.ui.uo0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c6 extends f2.x {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c6(Object obj, int i9) {
        this.c = i9;
        this.d = obj;
    }

    @Override // f2.x
    public final int i(int i9) {
        int i10;
        int i11;
        switch (this.c) {
            case 0:
                l41 G = ((f6) this.d).e0.G(i9 - 1);
                if (G == null || (i10 = G.u) == -1) {
                    return 3;
                }
                return i10;
            case 1:
                gh.l1 l1Var = (gh.l1) this.d;
                zy zyVar = l1Var.d0;
                gh.e1 e1Var = l1Var.g0;
                if (e1Var == null || i9 == 0) {
                    return zyVar.J;
                }
                l41 G2 = e1Var.G(i9 - 1);
                return (G2 == null || (i11 = G2.u) == -1) ? zyVar.J : i11;
            case 2:
                kh.v1 v1Var = (kh.v1) this.d;
                if (v1Var.Y.c.F(i9) == null) {
                    return v1Var.J;
                }
                v1Var.B1();
                return v1Var.R.get(i9);
            case 3:
                kh.b2 b2Var = (kh.b2) this.d;
                if (b2Var.c.j(i9) != 2) {
                    return b2Var.h;
                }
                return 1;
            case 4:
                yi yiVar = (yi) this.d;
                int i12 = yiVar.r;
                int i13 = yiVar.w;
                return i12 + (i9 % i13 != i13 + (-1) ? AndroidUtilities.dp(5.0f) : 0);
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i9 == chatAttachAlertPhotoLayout.C.n - 1 || ((chatAttachAlertPhotoLayout.L0 || chatAttachAlertPhotoLayout.K0) && i9 == 0)) {
                    return chatAttachAlertPhotoLayout.B.J;
                }
                if (chatAttachAlertPhotoLayout.K0) {
                    i9--;
                }
                int i14 = chatAttachAlertPhotoLayout.G0;
                int i15 = chatAttachAlertPhotoLayout.I0;
                return i14 + (i9 % i15 != i15 + (-1) ? AndroidUtilities.dp(2.0f) : 0);
            case 6:
                cy cyVar = (cy) this.d;
                wy wyVar = cyVar.Y;
                if (i9 == 0) {
                    wyVar.j0.getClass();
                }
                f2.r0 adapter = wyVar.d0.getAdapter();
                ay ayVar = wyVar.f0;
                if (adapter == ayVar && ayVar.x.isEmpty()) {
                    return cyVar.J;
                }
                wyVar.j0.getClass();
                cyVar.B1();
                return cyVar.R.get(i9);
            case 7:
                cx0 cx0Var = (cx0) this.d;
                if ((cx0Var.S == null || !(cx0Var.d.e.get(i9) instanceof Integer)) && i9 != cx0Var.d.h) {
                    return 1;
                }
                return cx0Var.d.d;
            default:
                uo0 uo0Var = (uo0) this.d;
                if (i9 < uo0Var.P || i9 >= uo0Var.Q) {
                    return (i9 < uo0Var.R || i9 >= uo0Var.S) ? 3 : 1;
                }
                return 1;
        }
    }
}
