package bi;

import android.text.TextUtils;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.rx;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.cm0;
import org.telegram.ui.jl;
import org.telegram.ui.ym0;
import org.telegram.ui.z11;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y1 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y1(Object obj, int i7) {
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
        gj gjVar;
        bj u92;
        gj gjVar2;
        bj a10;
        int i15;
        yi d;
        switch (this.c) {
            case 0:
                s2 s2Var = (s2) this.d;
                oy oyVar = s2Var.e2;
                p41 p41Var = s2Var.U1;
                if (p41Var == null || i7 == 0) {
                    return oyVar.J;
                }
                b41 G = p41Var.G(i7 - 1);
                return (G == null || (i10 = G.u) == -1) ? oyVar.J : i10;
            case 1:
                b41 G2 = ((z5) this.d).e2.G(i7 - 1);
                if (G2 == null || (i11 = G2.u) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                e6 e6Var = (e6) this.d;
                oy oyVar2 = e6Var.W1;
                p41 p41Var2 = e6Var.c2;
                if (p41Var2 == null) {
                    return oyVar2.J;
                }
                b41 G3 = p41Var2.G(i7 - 1);
                return (G3 == null || (i12 = G3.u) == -1) ? oyVar2.J : i12;
            case 3:
                ci.g0 g0Var = (ci.g0) this.d;
                if (g0Var.e.d(i7) == 0) {
                    return g0Var.r;
                }
                return 1;
            case 4:
                di.i1 i1Var = (di.i1) this.d;
                oy oyVar3 = i1Var.d2;
                di.b1 b1Var = i1Var.g2;
                if (b1Var == null || i7 == 0) {
                    return oyVar3.J;
                }
                b41 G4 = b1Var.G(i7 - 1);
                return (G4 == null || (i13 = G4.u) == -1) ? oyVar3.J : i13;
            case 5:
                hi.s1 s1Var = (hi.s1) this.d;
                if (s1Var.Y.c.F(i7) == null) {
                    return s1Var.J;
                }
                s1Var.B1();
                return s1Var.R.get(i7);
            case 6:
                hi.y1 y1Var = (hi.y1) this.d;
                if (y1Var.c.d(i7) != 2) {
                    return y1Var.h;
                }
                return 1;
            case 7:
                return (i7 == 0 || i7 == 1 || i7 == ((hi.d3) this.d).f.b() - 1) ? 3 : 1;
            case 8:
                an anVar = (an) this.d;
                jl jlVar = anVar.D0;
                int i16 = jlVar.K;
                if (i7 < i16 || i7 >= jlVar.L || (i14 = i7 - i16) < 0 || i14 >= jlVar.L().size() || (u92 = anVar.u9((gjVar = (gj) anVar.D0.L().get(i14)))) == null) {
                    return 1000;
                }
                return u92.d(gjVar).i;
            case 9:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) this.d;
                int i17 = yiVar.r;
                int i18 = yiVar.x;
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
                rx rxVar = (rx) this.d;
                ly lyVar = rxVar.Y;
                if (i7 == 0) {
                    lyVar.o0.getClass();
                }
                v4.h0 adapter = lyVar.i0.getAdapter();
                qx qxVar = lyVar.k0;
                if (adapter == qxVar && qxVar.y.isEmpty()) {
                    return rxVar.J;
                }
                lyVar.o0.getClass();
                rxVar.B1();
                return rxVar.R.get(i7);
            case 12:
                da0 da0Var = (da0) this.d;
                if (i7 < 0 || i7 >= da0Var.r.f.size() || (a10 = da0.a(da0Var, (gjVar2 = (gj) da0Var.r.f.get(i7)))) == null) {
                    return 1000;
                }
                return a10.d(gjVar2).i;
            case 13:
                bw0 bw0Var = (bw0) this.d;
                if ((bw0Var.R1 == null || !(bw0Var.o1.e.get(i7) instanceof Integer)) && i7 != bw0Var.o1.h) {
                    return 1;
                }
                return bw0Var.o1.d;
            case 14:
                bg0 bg0Var = (bg0) this.d;
                gj gjVar3 = (gj) bg0Var.N.get((r1.size() - 1) - i7);
                bj l10 = bg0Var.l(gjVar3);
                if (l10 != null) {
                    return l10.d(gjVar3).i;
                }
                return 1000;
            case 15:
                cm0 cm0Var = (cm0) this.d;
                if (i7 < cm0Var.c0 || i7 >= cm0Var.d0) {
                    return (i7 < cm0Var.e0 || i7 >= cm0Var.f0) ? 3 : 1;
                }
                return 1;
            case 16:
                ym0 ym0Var = (ym0) this.d;
                if (ym0Var.M.d(i7) == 1 || ym0Var.Z || (ym0Var.K == null && TextUtils.isEmpty(ym0Var.w))) {
                    return ym0Var.N.J;
                }
                int i21 = ym0Var.S;
                int i22 = ym0Var.h0;
                return i21 + (i7 % i22 != i22 - 1 ? org.telegram.messenger.g0.L(2.0f) : 0);
            case 17:
                z11 z11Var = (z11) this.d;
                oy oyVar4 = z11Var.T1;
                p41 p41Var3 = z11Var.Z1;
                if (p41Var3 == null) {
                    return oyVar4.J;
                }
                b41 G5 = p41Var3.G(i7 - 1);
                return (G5 == null || (i15 = G5.u) == -1) ? oyVar4.J : i15;
            default:
                int size = (r0.t0.size() - 1) - i7;
                bj bjVar = ((hi.c5) this.d).u0;
                if (bjVar == null || size < 0 || size >= bjVar.d.size() || (d = bjVar.d((gj) bjVar.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
        }
    }
}
