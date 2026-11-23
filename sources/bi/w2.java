package bi;

import android.text.TextUtils;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yx;
import org.telegram.ui.bn;
import org.telegram.ui.cn0;
import org.telegram.ui.e21;
import org.telegram.ui.eg0;
import org.telegram.ui.fm0;
import org.telegram.ui.kl;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class w2 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w2(Object obj, int i7) {
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
                n3 n3Var = (n3) this.d;
                wy wyVar = n3Var.d2;
                c51 c51Var = n3Var.U1;
                if (c51Var == null || i7 == 0) {
                    return wyVar.J;
                }
                o41 G = c51Var.G(i7 - 1);
                return (G == null || (i10 = G.v) == -1) ? wyVar.J : i10;
            case 1:
                o41 G2 = ((i8) this.d).e2.G(i7 - 1);
                if (G2 == null || (i11 = G2.v) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                n8 n8Var = (n8) this.d;
                wy wyVar2 = n8Var.W1;
                c51 c51Var2 = n8Var.c2;
                if (c51Var2 == null) {
                    return wyVar2.J;
                }
                o41 G3 = c51Var2.G(i7 - 1);
                return (G3 == null || (i12 = G3.v) == -1) ? wyVar2.J : i12;
            case 3:
                ci.h0 h0Var = (ci.h0) this.d;
                if (h0Var.e.d(i7) == 0) {
                    return h0Var.r;
                }
                return 1;
            case 4:
                di.h1 h1Var = (di.h1) this.d;
                wy wyVar3 = h1Var.d2;
                di.a1 a1Var = h1Var.g2;
                if (a1Var == null || i7 == 0) {
                    return wyVar3.J;
                }
                o41 G4 = a1Var.G(i7 - 1);
                return (G4 == null || (i13 = G4.v) == -1) ? wyVar3.J : i13;
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
                bn bnVar = (bn) this.d;
                kl klVar = bnVar.D0;
                int i16 = klVar.K;
                if (i7 < i16 || i7 >= klVar.L || (i14 = i7 - i16) < 0 || i14 >= klVar.L().size() || (u92 = bnVar.u9((gjVar = (gj) bnVar.D0.L().get(i14)))) == null) {
                    return 1000;
                }
                return u92.d(gjVar).i;
            case 9:
                hj hjVar = (hj) this.d;
                int i17 = hjVar.r;
                int i18 = hjVar.x;
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
                yx yxVar = (yx) this.d;
                ty tyVar = yxVar.Y;
                if (i7 == 0) {
                    tyVar.o0.getClass();
                }
                v4.i0 adapter = tyVar.i0.getAdapter();
                xx xxVar = tyVar.k0;
                if (adapter == xxVar && xxVar.y.isEmpty()) {
                    return yxVar.J;
                }
                tyVar.o0.getClass();
                yxVar.B1();
                return yxVar.R.get(i7);
            case 12:
                qa0 qa0Var = (qa0) this.d;
                if (i7 < 0 || i7 >= qa0Var.r.f.size() || (a10 = qa0.a(qa0Var, (gjVar2 = (gj) qa0Var.r.f.get(i7)))) == null) {
                    return 1000;
                }
                return a10.d(gjVar2).i;
            case 13:
                kw0 kw0Var = (kw0) this.d;
                if ((kw0Var.R1 == null || !(kw0Var.o1.e.get(i7) instanceof Integer)) && i7 != kw0Var.o1.h) {
                    return 1;
                }
                return kw0Var.o1.d;
            case 14:
                eg0 eg0Var = (eg0) this.d;
                gj gjVar3 = (gj) eg0Var.N.get((r1.size() - 1) - i7);
                bj l10 = eg0Var.l(gjVar3);
                if (l10 != null) {
                    return l10.d(gjVar3).i;
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
                e21 e21Var = (e21) this.d;
                wy wyVar4 = e21Var.T1;
                c51 c51Var3 = e21Var.Z1;
                if (c51Var3 == null) {
                    return wyVar4.J;
                }
                o41 G5 = c51Var3.G(i7 - 1);
                return (G5 == null || (i15 = G5.v) == -1) ? wyVar4.J : i15;
            default:
                int size = (r0.t0.size() - 1) - i7;
                bj bjVar = ((hi.a5) this.d).u0;
                if (bjVar == null || size < 0 || size >= bjVar.d.size() || (d = bjVar.d((gj) bjVar.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
        }
    }
}
