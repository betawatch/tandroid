package ai;

import android.text.TextUtils;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.fl;
import org.telegram.ui.s11;
import org.telegram.ui.sm0;
import org.telegram.ui.vf0;
import org.telegram.ui.wl0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g2 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g2(Object obj, int i3) {
        this.c = i3;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zi ziVar;
        ui s92;
        zi ziVar2;
        ui a10;
        int i15;
        ri d;
        switch (this.c) {
            case 0:
                b3 b3Var = (b3) this.d;
                hy hyVar = b3Var.b2;
                f41 f41Var = b3Var.R1;
                if (f41Var == null || i3 == 0) {
                    return hyVar.J;
                }
                r31 G = f41Var.G(i3 - 1);
                return (G == null || (i10 = G.u) == -1) ? hyVar.J : i10;
            case 1:
                r31 G2 = ((h6) this.d).b2.G(i3 - 1);
                if (G2 == null || (i11 = G2.u) == -1) {
                    return 3;
                }
                return i11;
            case 2:
                m6 m6Var = (m6) this.d;
                hy hyVar2 = m6Var.T1;
                f41 f41Var2 = m6Var.Z1;
                if (f41Var2 == null) {
                    return hyVar2.J;
                }
                r31 G3 = f41Var2.G(i3 - 1);
                return (G3 == null || (i12 = G3.u) == -1) ? hyVar2.J : i12;
            case 3:
                bi.h0 h0Var = (bi.h0) this.d;
                if (h0Var.e.d(i3) == 0) {
                    return h0Var.r;
                }
                return 1;
            case 4:
                ci.p1 p1Var = (ci.p1) this.d;
                hy hyVar3 = p1Var.a2;
                ci.i1 i1Var = p1Var.d2;
                if (i1Var == null || i3 == 0) {
                    return hyVar3.J;
                }
                r31 G4 = i1Var.G(i3 - 1);
                return (G4 == null || (i13 = G4.u) == -1) ? hyVar3.J : i13;
            case 5:
                gi.s1 s1Var = (gi.s1) this.d;
                if (s1Var.Y.c.F(i3) == null) {
                    return s1Var.J;
                }
                s1Var.B1();
                return s1Var.R.get(i3);
            case 6:
                gi.y1 y1Var = (gi.y1) this.d;
                if (y1Var.c.d(i3) != 2) {
                    return y1Var.h;
                }
                return 1;
            case 7:
                return (i3 == 0 || i3 == 1 || i3 == ((gi.d3) this.d).f.b() - 1) ? 3 : 1;
            case 8:
                wm wmVar = (wm) this.d;
                fl flVar = wmVar.D0;
                int i16 = flVar.K;
                if (i3 < i16 || i3 >= flVar.L || (i14 = i3 - i16) < 0 || i14 >= flVar.L().size() || (s92 = wmVar.s9((ziVar = (zi) wmVar.D0.L().get(i14)))) == null) {
                    return 1000;
                }
                return s92.d(ziVar).i;
            case 9:
                qi qiVar = (qi) this.d;
                int i17 = qiVar.r;
                int i18 = qiVar.x;
                return i17 + (i3 % i18 != i18 + (-1) ? org.telegram.messenger.g0.L(5.0f) : 0);
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i3 == chatAttachAlertPhotoLayout.H.n - 1 || ((chatAttachAlertPhotoLayout.Q0 || chatAttachAlertPhotoLayout.P0) && i3 == 0)) {
                    return chatAttachAlertPhotoLayout.G.J;
                }
                if (chatAttachAlertPhotoLayout.P0) {
                    i3--;
                }
                int i19 = chatAttachAlertPhotoLayout.L0;
                int i20 = chatAttachAlertPhotoLayout.N0;
                return i19 + (i3 % i20 != i20 + (-1) ? org.telegram.messenger.g0.L(2.0f) : 0);
            case 11:
                kx kxVar = (kx) this.d;
                ey eyVar = kxVar.Y;
                if (i3 == 0) {
                    eyVar.o0.getClass();
                }
                u4.h0 adapter = eyVar.i0.getAdapter();
                jx jxVar = eyVar.k0;
                if (adapter == jxVar && jxVar.y.isEmpty()) {
                    return kxVar.J;
                }
                eyVar.o0.getClass();
                kxVar.B1();
                return kxVar.R.get(i3);
            case 12:
                x90 x90Var = (x90) this.d;
                if (i3 < 0 || i3 >= x90Var.r.f.size() || (a10 = x90.a(x90Var, (ziVar2 = (zi) x90Var.r.f.get(i3)))) == null) {
                    return 1000;
                }
                return a10.d(ziVar2).i;
            case 13:
                xv0 xv0Var = (xv0) this.d;
                if ((xv0Var.O1 == null || !(xv0Var.l1.e.get(i3) instanceof Integer)) && i3 != xv0Var.l1.h) {
                    return 1;
                }
                return xv0Var.l1.d;
            case 14:
                vf0 vf0Var = (vf0) this.d;
                zi ziVar3 = (zi) vf0Var.N.get((r1.size() - 1) - i3);
                ui k10 = vf0Var.k(ziVar3);
                if (k10 != null) {
                    return k10.d(ziVar3).i;
                }
                return 1000;
            case 15:
                wl0 wl0Var = (wl0) this.d;
                if (i3 < wl0Var.c0 || i3 >= wl0Var.d0) {
                    return (i3 < wl0Var.e0 || i3 >= wl0Var.f0) ? 3 : 1;
                }
                return 1;
            case 16:
                sm0 sm0Var = (sm0) this.d;
                if (sm0Var.M.d(i3) == 1 || sm0Var.Z || (sm0Var.K == null && TextUtils.isEmpty(sm0Var.w))) {
                    return sm0Var.N.J;
                }
                int i21 = sm0Var.S;
                int i22 = sm0Var.h0;
                return i21 + (i3 % i22 != i22 - 1 ? org.telegram.messenger.g0.L(2.0f) : 0);
            case 17:
                s11 s11Var = (s11) this.d;
                hy hyVar4 = s11Var.Q1;
                f41 f41Var3 = s11Var.W1;
                if (f41Var3 == null) {
                    return hyVar4.J;
                }
                r31 G5 = f41Var3.G(i3 - 1);
                return (G5 == null || (i15 = G5.u) == -1) ? hyVar4.J : i15;
            default:
                int size = (r0.t0.size() - 1) - i3;
                ui uiVar = ((gi.c5) this.d).u0;
                if (uiVar == null || size < 0 || size >= uiVar.d.size() || (d = uiVar.d((zi) uiVar.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
        }
    }
}
