package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.hp0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m5 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m5(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                i51 G = ((p5) this.d).f0.G(i10 - 1);
                if (G == null || (i11 = G.u) == -1) {
                    return 3;
                }
                return i11;
            case 1:
                lh.j1 j1Var = (lh.j1) this.d;
                nz nzVar = j1Var.e0;
                lh.d1 d1Var = j1Var.h0;
                if (d1Var == null || i10 == 0) {
                    return nzVar.J;
                }
                i51 G2 = d1Var.G(i10 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? nzVar.J : i12;
            case 2:
                zi ziVar = (zi) this.d;
                int i13 = ziVar.r;
                int i14 = ziVar.w;
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
                py pyVar = (py) this.d;
                kz kzVar = pyVar.Y;
                if (i10 == 0) {
                    kzVar.k0.getClass();
                }
                f2.o0 adapter = kzVar.e0.getAdapter();
                oy oyVar = kzVar.g0;
                if (adapter == oyVar && oyVar.x.isEmpty()) {
                    return pyVar.J;
                }
                kzVar.k0.getClass();
                pyVar.B1();
                return pyVar.R.get(i10);
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
                ph.g1 g1Var = (ph.g1) this.d;
                if (g1Var.Y.c.F(i10) == null) {
                    return g1Var.J;
                }
                g1Var.B1();
                return g1Var.R.get(i10);
            default:
                ph.n1 n1Var = (ph.n1) this.d;
                if (n1Var.c.j(i10) != 2) {
                    return n1Var.h;
                }
                return 1;
        }
    }
}
