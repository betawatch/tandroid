package ai;

import android.text.TextUtils;
import bi.p1;
import bi.w1;
import fi.e5;
import fi.f3;
import fi.s1;
import fi.z1;
import org.telegram.messenger.aj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.bm0;
import org.telegram.ui.c21;
import org.telegram.ui.jl;
import org.telegram.ui.xm0;
import zh.k3;
import zh.n3;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        int i11;
        ij ijVar;
        dj s9;
        ij ijVar2;
        dj a10;
        int i12;
        aj d;
        int i13;
        int i14;
        int i15;
        switch (this.c) {
            case 0:
                q0 q0Var = (q0) this.d;
                if (q0Var.e.d(i7) == 0) {
                    return q0Var.r;
                }
                return 1;
            case 1:
                w1 w1Var = (w1) this.d;
                ky kyVar = w1Var.Z1;
                p1 p1Var = w1Var.c2;
                if (p1Var == null || i7 == 0) {
                    return kyVar.J;
                }
                x31 G = p1Var.G(i7 - 1);
                return (G == null || (i10 = G.u) == -1) ? kyVar.J : i10;
            case 2:
                s1 s1Var = (s1) this.d;
                if (s1Var.Y.c.F(i7) == null) {
                    return s1Var.J;
                }
                s1Var.B1();
                return s1Var.R.get(i7);
            case 3:
                z1 z1Var = (z1) this.d;
                if (z1Var.c.d(i7) != 2) {
                    return z1Var.h;
                }
                return 1;
            case 4:
                return (i7 == 0 || i7 == 1 || i7 == ((f3) this.d).f.b() - 1) ? 3 : 1;
            case 5:
                an anVar = (an) this.d;
                jl jlVar = anVar.C0;
                int i16 = jlVar.J;
                if (i7 < i16 || i7 >= jlVar.K || (i11 = i7 - i16) < 0 || i11 >= jlVar.L().size() || (s9 = anVar.s9((ijVar = (ij) anVar.C0.L().get(i11)))) == null) {
                    return 1000;
                }
                return s9.d(ijVar).i;
            case 6:
                qi qiVar = (qi) this.d;
                int i17 = qiVar.r;
                int i18 = qiVar.x;
                return i17 + (i7 % i18 != i18 + (-1) ? org.telegram.messenger.g0.L(5.0f) : 0);
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i7 == chatAttachAlertPhotoLayout.G.n - 1 || ((chatAttachAlertPhotoLayout.P0 || chatAttachAlertPhotoLayout.O0) && i7 == 0)) {
                    return chatAttachAlertPhotoLayout.F.J;
                }
                if (chatAttachAlertPhotoLayout.O0) {
                    i7--;
                }
                int i19 = chatAttachAlertPhotoLayout.K0;
                int i20 = chatAttachAlertPhotoLayout.M0;
                return i19 + (i7 % i20 != i20 + (-1) ? org.telegram.messenger.g0.L(2.0f) : 0);
            case 8:
                nx nxVar = (nx) this.d;
                hy hyVar = nxVar.Y;
                if (i7 == 0) {
                    hyVar.n0.getClass();
                }
                v4.g0 adapter = hyVar.h0.getAdapter();
                mx mxVar = hyVar.j0;
                if (adapter == mxVar && mxVar.y.isEmpty()) {
                    return nxVar.J;
                }
                hyVar.n0.getClass();
                nxVar.B1();
                return nxVar.R.get(i7);
            case 9:
                ca0 ca0Var = (ca0) this.d;
                if (i7 < 0 || i7 >= ca0Var.r.f.size() || (a10 = ca0.a(ca0Var, (ijVar2 = (ij) ca0Var.r.f.get(i7)))) == null) {
                    return 1000;
                }
                return a10.d(ijVar2).i;
            case 10:
                yv0 yv0Var = (yv0) this.d;
                if ((yv0Var.N1 == null || !(yv0Var.k1.e.get(i7) instanceof Integer)) && i7 != yv0Var.k1.h) {
                    return 1;
                }
                return yv0Var.k1.d;
            case 11:
                bg0 bg0Var = (bg0) this.d;
                ij ijVar3 = (ij) bg0Var.M.get((r1.size() - 1) - i7);
                dj k10 = bg0Var.k(ijVar3);
                if (k10 != null) {
                    return k10.d(ijVar3).i;
                }
                return 1000;
            case 12:
                bm0 bm0Var = (bm0) this.d;
                if (i7 < bm0Var.b0 || i7 >= bm0Var.c0) {
                    return (i7 < bm0Var.d0 || i7 >= bm0Var.e0) ? 3 : 1;
                }
                return 1;
            case 13:
                xm0 xm0Var = (xm0) this.d;
                if (xm0Var.L.d(i7) == 1 || xm0Var.Y || (xm0Var.J == null && TextUtils.isEmpty(xm0Var.w))) {
                    return xm0Var.M.J;
                }
                int i21 = xm0Var.R;
                int i22 = xm0Var.g0;
                return i21 + (i7 % i22 != i22 - 1 ? org.telegram.messenger.g0.L(2.0f) : 0);
            case 14:
                c21 c21Var = (c21) this.d;
                ky kyVar2 = c21Var.P1;
                l41 l41Var = c21Var.V1;
                if (l41Var == null) {
                    return kyVar2.J;
                }
                x31 G2 = l41Var.G(i7 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? kyVar2.J : i12;
            case 15:
                int size = (r0.s0.size() - 1) - i7;
                dj djVar = ((e5) this.d).t0;
                if (djVar == null || size < 0 || size >= djVar.d.size() || (d = djVar.d((ij) djVar.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
            case 16:
                zh.g1 g1Var = (zh.g1) this.d;
                ky kyVar3 = g1Var.a2;
                l41 l41Var2 = g1Var.Q1;
                if (l41Var2 == null || i7 == 0) {
                    return kyVar3.J;
                }
                x31 G3 = l41Var2.G(i7 - 1);
                return (G3 == null || (i13 = G3.u) == -1) ? kyVar3.J : i13;
            case 17:
                x31 G4 = ((k3) this.d).a2.G(i7 - 1);
                if (G4 == null || (i14 = G4.u) == -1) {
                    return 3;
                }
                return i14;
            default:
                n3 n3Var = (n3) this.d;
                ky kyVar4 = n3Var.S1;
                l41 l41Var3 = n3Var.Y1;
                if (l41Var3 == null) {
                    return kyVar4.J;
                }
                x31 G5 = l41Var3.G(i7 - 1);
                return (G5 == null || (i15 = G5.u) == -1) ? kyVar4.J : i15;
        }
    }
}
