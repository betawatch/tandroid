package jg;

import android.text.TextUtils;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zx;
import org.telegram.ui.fm;
import org.telegram.ui.ih0;
import org.telegram.ui.jo0;
import org.telegram.ui.ln0;
import org.telegram.ui.r31;
import org.telegram.ui.un;
import ph.q3;
import ph.t3;
import vh.s3;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h1 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h1(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        cj d;
        int i11;
        kj kjVar;
        fj p9;
        kj kjVar2;
        fj a2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.c) {
            case 0:
                int size = (r0.s0.size() - 1) - i10;
                fj fjVar = ((s3) this.d).t0;
                if (fjVar == null || size < 0 || size >= fjVar.d.size() || (d = fjVar.d((kj) fjVar.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
            case 1:
                un unVar = (un) this.d;
                fm fmVar = unVar.C0;
                int i17 = fmVar.J;
                if (i10 < i17 || i10 >= fmVar.K || (i11 = i10 - i17) < 0 || i11 >= fmVar.L().size() || (p9 = unVar.p9((kjVar = (kj) unVar.C0.L().get(i11)))) == null) {
                    return 1000;
                }
                return p9.d(kjVar).i;
            case 2:
                qi qiVar = (qi) this.d;
                int i18 = qiVar.r;
                int i19 = qiVar.x;
                return i18 + (i10 % i19 != i19 + (-1) ? org.telegram.messenger.i0.L(5.0f) : 0);
            case 3:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.d;
                if (i10 == chatAttachAlertPhotoLayout.G.n - 1 || ((chatAttachAlertPhotoLayout.P0 || chatAttachAlertPhotoLayout.O0) && i10 == 0)) {
                    return chatAttachAlertPhotoLayout.F.J;
                }
                if (chatAttachAlertPhotoLayout.O0) {
                    i10--;
                }
                int i20 = chatAttachAlertPhotoLayout.K0;
                int i21 = chatAttachAlertPhotoLayout.M0;
                return i20 + (i10 % i21 != i21 + (-1) ? org.telegram.messenger.i0.L(2.0f) : 0);
            case 4:
                ay ayVar = (ay) this.d;
                vy vyVar = ayVar.Y;
                if (i10 == 0) {
                    vyVar.n0.getClass();
                }
                s4.g0 adapter = vyVar.h0.getAdapter();
                zx zxVar = vyVar.j0;
                if (adapter == zxVar && zxVar.y.isEmpty()) {
                    return ayVar.J;
                }
                vyVar.n0.getClass();
                ayVar.B1();
                return ayVar.R.get(i10);
            case 5:
                ua0 ua0Var = (ua0) this.d;
                if (i10 < 0 || i10 >= ua0Var.r.f.size() || (a2 = ua0.a(ua0Var, (kjVar2 = (kj) ua0Var.r.f.get(i10)))) == null) {
                    return 1000;
                }
                return a2.d(kjVar2).i;
            case 6:
                dx0 dx0Var = (dx0) this.d;
                if ((dx0Var.N1 == null || !(dx0Var.k1.e.get(i10) instanceof Integer)) && i10 != dx0Var.k1.h) {
                    return 1;
                }
                return dx0Var.k1.d;
            case 7:
                ih0 ih0Var = (ih0) this.d;
                kj kjVar3 = (kj) ih0Var.M.get((r1.size() - 1) - i10);
                fj k10 = ih0Var.k(kjVar3);
                if (k10 != null) {
                    return k10.d(kjVar3).i;
                }
                return 1000;
            case 8:
                ln0 ln0Var = (ln0) this.d;
                if (i10 < ln0Var.b0 || i10 >= ln0Var.c0) {
                    return (i10 < ln0Var.d0 || i10 >= ln0Var.e0) ? 3 : 1;
                }
                return 1;
            case 9:
                jo0 jo0Var = (jo0) this.d;
                if (jo0Var.L.d(i10) == 1 || jo0Var.Y || (jo0Var.J == null && TextUtils.isEmpty(jo0Var.w))) {
                    return jo0Var.M.J;
                }
                int i22 = jo0Var.R;
                int i23 = jo0Var.g0;
                return i22 + (i10 % i23 != i23 - 1 ? org.telegram.messenger.i0.L(2.0f) : 0);
            case 10:
                r31 r31Var = (r31) this.d;
                yy yyVar = r31Var.P1;
                q51 q51Var = r31Var.V1;
                if (q51Var == null) {
                    return yyVar.J;
                }
                b51 G = q51Var.G(i10 - 1);
                return (G == null || (i12 = G.u) == -1) ? yyVar.J : i12;
            case 11:
                ph.l1 l1Var = (ph.l1) this.d;
                yy yyVar2 = l1Var.a2;
                q51 q51Var2 = l1Var.Q1;
                if (q51Var2 == null || i10 == 0) {
                    return yyVar2.J;
                }
                b51 G2 = q51Var2.G(i10 - 1);
                return (G2 == null || (i13 = G2.u) == -1) ? yyVar2.J : i13;
            case 12:
                b51 G3 = ((q3) this.d).a2.G(i10 - 1);
                if (G3 == null || (i14 = G3.u) == -1) {
                    return 3;
                }
                return i14;
            case 13:
                t3 t3Var = (t3) this.d;
                yy yyVar3 = t3Var.S1;
                q51 q51Var3 = t3Var.Y1;
                if (q51Var3 == null) {
                    return yyVar3.J;
                }
                b51 G4 = q51Var3.G(i10 - 1);
                return (G4 == null || (i15 = G4.u) == -1) ? yyVar3.J : i15;
            case 14:
                qh.g0 g0Var = (qh.g0) this.d;
                if (g0Var.e.d(i10) == 0) {
                    return g0Var.r;
                }
                return 1;
            case 15:
                rh.t0 t0Var = (rh.t0) this.d;
                yy yyVar4 = t0Var.Z1;
                rh.n0 n0Var = t0Var.c2;
                if (n0Var == null || i10 == 0) {
                    return yyVar4.J;
                }
                b51 G5 = n0Var.G(i10 - 1);
                return (G5 == null || (i16 = G5.u) == -1) ? yyVar4.J : i16;
            case 16:
                vh.f1 f1Var = (vh.f1) this.d;
                if (f1Var.Y.c.F(i10) == null) {
                    return f1Var.J;
                }
                f1Var.B1();
                return f1Var.R.get(i10);
            case 17:
                vh.l1 l1Var2 = (vh.l1) this.d;
                if (l1Var2.c.d(i10) != 2) {
                    return l1Var2.h;
                }
                return 1;
            default:
                return (i10 == 0 || i10 == 1 || i10 == ((vh.k2) this.d).f.b() - 1) ? 3 : 1;
        }
    }
}
