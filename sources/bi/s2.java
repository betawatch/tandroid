package bi;

import android.text.TextUtils;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.z41;
import org.telegram.ui.bn;
import org.telegram.ui.cn0;
import org.telegram.ui.d21;
import org.telegram.ui.eg0;
import org.telegram.ui.fm0;
import org.telegram.ui.kl;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s2 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s2(Object obj, int i7) {
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
                j3 j3Var = (j3) this.d;
                uy uyVar = j3Var.d2;
                z41 z41Var = j3Var.U1;
                if (z41Var == null || i7 == 0) {
                    return uyVar.J;
                }
                l41 G = z41Var.G(i7 - 1);
                return (G == null || (i10 = G.v) == -1) ? uyVar.J : i10;
            case 1:
                l41 G2 = ((g8) this.d).e2.G(i7 - 1);
                if (G2 == null || (i11 = G2.v) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                l8 l8Var = (l8) this.d;
                uy uyVar2 = l8Var.W1;
                z41 z41Var2 = l8Var.c2;
                if (z41Var2 == null) {
                    return uyVar2.J;
                }
                l41 G3 = z41Var2.G(i7 - 1);
                return (G3 == null || (i12 = G3.v) == -1) ? uyVar2.J : i12;
            case 3:
                ci.h0 h0Var = (ci.h0) this.d;
                if (h0Var.e.d(i7) == 0) {
                    return h0Var.r;
                }
                return 1;
            case 4:
                di.h1 h1Var = (di.h1) this.d;
                uy uyVar3 = h1Var.d2;
                di.a1 a1Var = h1Var.g2;
                if (a1Var == null || i7 == 0) {
                    return uyVar3.J;
                }
                l41 G4 = a1Var.G(i7 - 1);
                return (G4 == null || (i13 = G4.v) == -1) ? uyVar3.J : i13;
            case 5:
                hi.t1 t1Var = (hi.t1) this.d;
                if (t1Var.Y.c.F(i7) == null) {
                    return t1Var.J;
                }
                t1Var.B1();
                return t1Var.R.get(i7);
            case 6:
                hi.z1 z1Var = (hi.z1) this.d;
                if (z1Var.c.d(i7) != 2) {
                    return z1Var.h;
                }
                return 1;
            case 7:
                return (i7 == 0 || i7 == 1 || i7 == ((hi.e3) this.d).f.b() - 1) ? 3 : 1;
            case 8:
                bn bnVar = (bn) this.d;
                kl klVar = bnVar.D0;
                int i16 = klVar.K;
                if (i7 < i16 || i7 >= klVar.L || (i14 = i7 - i16) < 0 || i14 >= klVar.L().size() || (u92 = bnVar.u9((fjVar = (fj) bnVar.D0.L().get(i14)))) == null) {
                    return 1000;
                }
                return u92.d(fjVar).i;
            case 9:
                org.telegram.ui.Components.fj fjVar3 = (org.telegram.ui.Components.fj) this.d;
                int i17 = fjVar3.r;
                int i18 = fjVar3.x;
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
                wx wxVar = (wx) this.d;
                ry ryVar = wxVar.Y;
                if (i7 == 0) {
                    ryVar.o0.getClass();
                }
                v4.i0 adapter = ryVar.i0.getAdapter();
                vx vxVar = ryVar.k0;
                if (adapter == vxVar && vxVar.y.isEmpty()) {
                    return wxVar.J;
                }
                ryVar.o0.getClass();
                wxVar.B1();
                return wxVar.R.get(i7);
            case 12:
                oa0 oa0Var = (oa0) this.d;
                if (i7 < 0 || i7 >= oa0Var.r.f.size() || (a10 = oa0.a(oa0Var, (fjVar2 = (fj) oa0Var.r.f.get(i7)))) == null) {
                    return 1000;
                }
                return a10.d(fjVar2).i;
            case 13:
                iw0 iw0Var = (iw0) this.d;
                if ((iw0Var.R1 == null || !(iw0Var.o1.e.get(i7) instanceof Integer)) && i7 != iw0Var.o1.h) {
                    return 1;
                }
                return iw0Var.o1.d;
            case 14:
                eg0 eg0Var = (eg0) this.d;
                fj fjVar4 = (fj) eg0Var.N.get((r1.size() - 1) - i7);
                aj l10 = eg0Var.l(fjVar4);
                if (l10 != null) {
                    return l10.d(fjVar4).i;
                }
                return 1000;
            case 15:
                fm0 fm0Var = (fm0) this.d;
                if (i7 < fm0Var.c0 || i7 >= fm0Var.d0) {
                    return (i7 < fm0Var.e0 || i7 >= fm0Var.f0) ? 3 : 1;
                }
                return 1;
            case 16:
                cn0 cn0Var = (cn0) this.d;
                if (cn0Var.M.d(i7) == 1 || cn0Var.Z || (cn0Var.K == null && TextUtils.isEmpty(cn0Var.w))) {
                    return cn0Var.N.J;
                }
                int i21 = cn0Var.S;
                int i22 = cn0Var.h0;
                return i21 + (i7 % i22 != i22 - 1 ? org.telegram.messenger.g0.L(2.0f) : 0);
            case 17:
                d21 d21Var = (d21) this.d;
                uy uyVar4 = d21Var.T1;
                z41 z41Var3 = d21Var.Z1;
                if (z41Var3 == null) {
                    return uyVar4.J;
                }
                l41 G5 = z41Var3.G(i7 - 1);
                return (G5 == null || (i15 = G5.v) == -1) ? uyVar4.J : i15;
            default:
                int size = (r0.t0.size() - 1) - i7;
                aj ajVar = ((hi.b5) this.d).u0;
                if (ajVar == null || size < 0 || size >= ajVar.d.size() || (d = ajVar.d((fj) ajVar.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
        }
    }
}
