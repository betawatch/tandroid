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
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.an0;
import org.telegram.ui.cn;
import org.telegram.ui.eg0;
import org.telegram.ui.em0;
import org.telegram.ui.f21;
import org.telegram.ui.ll;
import zh.l3;
import zh.o3;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        dj t92;
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
                jy jyVar = w1Var.c2;
                p1 p1Var = w1Var.f2;
                if (p1Var == null || i7 == 0) {
                    return jyVar.J;
                }
                x31 G = p1Var.G(i7 - 1);
                return (G == null || (i10 = G.u) == -1) ? jyVar.J : i10;
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
                cn cnVar = (cn) this.d;
                ll llVar = cnVar.C0;
                int i16 = llVar.J;
                if (i7 < i16 || i7 >= llVar.K || (i11 = i7 - i16) < 0 || i11 >= llVar.L().size() || (t92 = cnVar.t9((ijVar = (ij) cnVar.C0.L().get(i11)))) == null) {
                    return 1000;
                }
                return t92.d(ijVar).i;
            case 6:
                pi piVar = (pi) this.d;
                int i17 = piVar.r;
                int i18 = piVar.x;
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
                mx mxVar = (mx) this.d;
                gy gyVar = mxVar.Y;
                if (i7 == 0) {
                    gyVar.n0.getClass();
                }
                v4.g0 adapter = gyVar.h0.getAdapter();
                lx lxVar = gyVar.j0;
                if (adapter == lxVar && lxVar.y.isEmpty()) {
                    return mxVar.J;
                }
                gyVar.n0.getClass();
                mxVar.B1();
                return mxVar.R.get(i7);
            case 9:
                ca0 ca0Var = (ca0) this.d;
                if (i7 < 0 || i7 >= ca0Var.r.f.size() || (a10 = ca0.a(ca0Var, (ijVar2 = (ij) ca0Var.r.f.get(i7)))) == null) {
                    return 1000;
                }
                return a10.d(ijVar2).i;
            case 10:
                yv0 yv0Var = (yv0) this.d;
                if ((yv0Var.Q1 == null || !(yv0Var.n1.e.get(i7) instanceof Integer)) && i7 != yv0Var.n1.h) {
                    return 1;
                }
                return yv0Var.n1.d;
            case 11:
                eg0 eg0Var = (eg0) this.d;
                ij ijVar3 = (ij) eg0Var.M.get((r1.size() - 1) - i7);
                dj k10 = eg0Var.k(ijVar3);
                if (k10 != null) {
                    return k10.d(ijVar3).i;
                }
                return 1000;
            case 12:
                em0 em0Var = (em0) this.d;
                if (i7 < em0Var.b0 || i7 >= em0Var.c0) {
                    return (i7 < em0Var.d0 || i7 >= em0Var.e0) ? 3 : 1;
                }
                return 1;
            case 13:
                an0 an0Var = (an0) this.d;
                if (an0Var.L.d(i7) == 1 || an0Var.Y || (an0Var.J == null && TextUtils.isEmpty(an0Var.w))) {
                    return an0Var.M.J;
                }
                int i21 = an0Var.R;
                int i22 = an0Var.g0;
                return i21 + (i7 % i22 != i22 - 1 ? org.telegram.messenger.g0.L(2.0f) : 0);
            case 14:
                f21 f21Var = (f21) this.d;
                jy jyVar2 = f21Var.S1;
                m41 m41Var = f21Var.Y1;
                if (m41Var == null) {
                    return jyVar2.J;
                }
                x31 G2 = m41Var.G(i7 - 1);
                return (G2 == null || (i12 = G2.u) == -1) ? jyVar2.J : i12;
            case 15:
                int size = (r0.s0.size() - 1) - i7;
                dj djVar = ((e5) this.d).t0;
                if (djVar == null || size < 0 || size >= djVar.d.size() || (d = djVar.d((ij) djVar.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
            case 16:
                zh.g1 g1Var = (zh.g1) this.d;
                jy jyVar3 = g1Var.d2;
                m41 m41Var2 = g1Var.T1;
                if (m41Var2 == null || i7 == 0) {
                    return jyVar3.J;
                }
                x31 G3 = m41Var2.G(i7 - 1);
                return (G3 == null || (i13 = G3.u) == -1) ? jyVar3.J : i13;
            case 17:
                x31 G4 = ((l3) this.d).d2.G(i7 - 1);
                if (G4 == null || (i14 = G4.u) == -1) {
                    return 3;
                }
                return i14;
            default:
                o3 o3Var = (o3) this.d;
                jy jyVar4 = o3Var.V1;
                m41 m41Var3 = o3Var.b2;
                if (m41Var3 == null) {
                    return jyVar4.J;
                }
                x31 G5 = m41Var3.G(i7 - 1);
                return (G5 == null || (i15 = G5.u) == -1) ? jyVar4.J : i15;
        }
    }
}
