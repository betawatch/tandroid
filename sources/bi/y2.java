package bi;

import android.text.TextUtils;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ux;
import org.telegram.ui.Components.vx;
import org.telegram.ui.an0;
import org.telegram.ui.bn;
import org.telegram.ui.c21;
import org.telegram.ui.dg0;
import org.telegram.ui.dm0;
import org.telegram.ui.kl;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y2 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y2(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        fj fjVar;
        aj u92;
        fj fjVar2;
        aj a10;
        int i15;
        xi d;
        switch (this.c) {
            case 0:
                p3 p3Var = (p3) this.d;
                ty tyVar = p3Var.d2;
                b51 b51Var = p3Var.U1;
                if (b51Var == null || i7 == 0) {
                    return tyVar.J;
                }
                n41 G = b51Var.G(i7 - 1);
                return (G == null || (i10 = G.v) == -1) ? tyVar.J : i10;
            case 1:
                n41 G2 = ((l8) this.d).e2.G(i7 - 1);
                if (G2 == null || (i11 = G2.v) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                q8 q8Var = (q8) this.d;
                ty tyVar2 = q8Var.W1;
                b51 b51Var2 = q8Var.c2;
                if (b51Var2 == null) {
                    return tyVar2.J;
                }
                n41 G3 = b51Var2.G(i7 - 1);
                return (G3 == null || (i12 = G3.v) == -1) ? tyVar2.J : i12;
            case 3:
                ci.h0 h0Var = (ci.h0) this.d;
                if (h0Var.e.d(i7) == 0) {
                    return h0Var.r;
                }
                return 1;
            case 4:
                di.h1 h1Var = (di.h1) this.d;
                ty tyVar3 = h1Var.d2;
                di.a1 a1Var = h1Var.g2;
                if (a1Var == null || i7 == 0) {
                    return tyVar3.J;
                }
                n41 G4 = a1Var.G(i7 - 1);
                return (G4 == null || (i13 = G4.v) == -1) ? tyVar3.J : i13;
            case 5:
                hi.a2 a2Var = (hi.a2) this.d;
                if (a2Var.Y.c.F(i7) == null) {
                    return a2Var.J;
                }
                a2Var.B1();
                return a2Var.R.get(i7);
            case 6:
                hi.g2 g2Var = (hi.g2) this.d;
                if (g2Var.c.d(i7) != 2) {
                    return g2Var.h;
                }
                return 1;
            case 7:
                return (i7 == 0 || i7 == 1 || i7 == ((hi.m3) this.d).f.b() - 1) ? 3 : 1;
            case 8:
                bn bnVar = (bn) this.d;
                kl klVar = bnVar.D0;
                int i16 = klVar.K;
                if (i7 < i16 || i7 >= klVar.L || (i14 = i7 - i16) < 0 || i14 >= klVar.L().size() || (u92 = bnVar.u9((fjVar = (fj) bnVar.D0.L().get(i14)))) == null) {
                    return 1000;
                }
                return u92.d(fjVar).i;
            case 9:
                gj gjVar = (gj) this.d;
                int i17 = gjVar.r;
                int i18 = gjVar.x;
                return i17 + (i7 % i18 != i18 + (-1) ? org.telegram.messenger.g0.L(5.0f) : 0);
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i7 == chatAttachAlertPhotoLayout.H.n - 1 || ((chatAttachAlertPhotoLayout.Q0 || chatAttachAlertPhotoLayout.P0) && i7 == 0)) {
                    return chatAttachAlertPhotoLayout.G.J;
                }
                if (chatAttachAlertPhotoLayout.P0) {
                    i7--;
                }
                int i19 = chatAttachAlertPhotoLayout.L0;
                int i20 = chatAttachAlertPhotoLayout.N0;
                return i19 + (i7 % i20 != i20 + (-1) ? org.telegram.messenger.g0.L(2.0f) : 0);
            case 11:
                vx vxVar = (vx) this.d;
                qy qyVar = vxVar.Y;
                if (i7 == 0) {
                    qyVar.o0.getClass();
                }
                v4.i0 adapter = qyVar.i0.getAdapter();
                ux uxVar = qyVar.k0;
                if (adapter == uxVar && uxVar.y.isEmpty()) {
                    return vxVar.J;
                }
                qyVar.o0.getClass();
                vxVar.B1();
                return vxVar.R.get(i7);
            case 12:
                na0 na0Var = (na0) this.d;
                if (i7 < 0 || i7 >= na0Var.r.f.size() || (a10 = na0.a(na0Var, (fjVar2 = (fj) na0Var.r.f.get(i7)))) == null) {
                    return 1000;
                }
                return a10.d(fjVar2).i;
            case 13:
                jw0 jw0Var = (jw0) this.d;
                if ((jw0Var.R1 == null || !(jw0Var.o1.e.get(i7) instanceof Integer)) && i7 != jw0Var.o1.h) {
                    return 1;
                }
                return jw0Var.o1.d;
            case 14:
                dg0 dg0Var = (dg0) this.d;
                fj fjVar3 = (fj) dg0Var.N.get((r1.size() - 1) - i7);
                aj l10 = dg0Var.l(fjVar3);
                if (l10 != null) {
                    return l10.d(fjVar3).i;
                }
                return 1000;
            case 15:
                dm0 dm0Var = (dm0) this.d;
                if (i7 < dm0Var.c0 || i7 >= dm0Var.d0) {
                    return (i7 < dm0Var.e0 || i7 >= dm0Var.f0) ? 3 : 1;
                }
                return 1;
            case 16:
                an0 an0Var = (an0) this.d;
                if (an0Var.M.d(i7) == 1 || an0Var.Z || (an0Var.K == null && TextUtils.isEmpty(an0Var.w))) {
                    return an0Var.N.J;
                }
                int i21 = an0Var.S;
                int i22 = an0Var.h0;
                return i21 + (i7 % i22 != i22 - 1 ? org.telegram.messenger.g0.L(2.0f) : 0);
            case 17:
                c21 c21Var = (c21) this.d;
                ty tyVar4 = c21Var.T1;
                b51 b51Var3 = c21Var.Z1;
                if (b51Var3 == null) {
                    return tyVar4.J;
                }
                n41 G5 = b51Var3.G(i7 - 1);
                return (G5 == null || (i15 = G5.v) == -1) ? tyVar4.J : i15;
            default:
                int size = (r0.u0.size() - 1) - i7;
                aj ajVar = ((hi.l5) this.d).v0;
                if (ajVar == null || size < 0 || size >= ajVar.d.size() || (d = ajVar.d((fj) ajVar.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
        }
    }
}
