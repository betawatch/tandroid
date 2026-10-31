package jg;

import android.text.TextUtils;
import org.telegram.messenger.bj;
import org.telegram.messenger.ej;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zx;
import org.telegram.ui.fm;
import org.telegram.ui.kh0;
import org.telegram.ui.lo0;
import org.telegram.ui.nn0;
import org.telegram.ui.t31;
import org.telegram.ui.un;
import ph.q3;
import ph.t3;
import vh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        bj d;
        int i11;
        jj jjVar;
        ej k92;
        jj jjVar2;
        ej a2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.c) {
            case 0:
                int size = (r0.s0.size() - 1) - i10;
                ej ejVar = ((s3) this.d).t0;
                if (ejVar == null || size < 0 || size >= ejVar.d.size() || (d = ejVar.d((jj) ejVar.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
            case 1:
                un unVar = (un) this.d;
                fm fmVar = unVar.C0;
                int i17 = fmVar.J;
                if (i10 < i17 || i10 >= fmVar.K || (i11 = i10 - i17) < 0 || i11 >= fmVar.L().size() || (k92 = unVar.k9((jjVar = (jj) unVar.C0.L().get(i11)))) == null) {
                    return 1000;
                }
                return k92.d(jjVar).i;
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
                if (i10 < 0 || i10 >= ua0Var.r.f.size() || (a2 = ua0.a(ua0Var, (jjVar2 = (jj) ua0Var.r.f.get(i10)))) == null) {
                    return 1000;
                }
                return a2.d(jjVar2).i;
            case 6:
                cx0 cx0Var = (cx0) this.d;
                if ((cx0Var.N1 == null || !(cx0Var.k1.e.get(i10) instanceof Integer)) && i10 != cx0Var.k1.h) {
                    return 1;
                }
                return cx0Var.k1.d;
            case 7:
                kh0 kh0Var = (kh0) this.d;
                jj jjVar3 = (jj) kh0Var.M.get((r1.size() - 1) - i10);
                ej k10 = kh0Var.k(jjVar3);
                if (k10 != null) {
                    return k10.d(jjVar3).i;
                }
                return 1000;
            case 8:
                nn0 nn0Var = (nn0) this.d;
                if (i10 < nn0Var.b0 || i10 >= nn0Var.c0) {
                    return (i10 < nn0Var.d0 || i10 >= nn0Var.e0) ? 3 : 1;
                }
                return 1;
            case 9:
                lo0 lo0Var = (lo0) this.d;
                if (lo0Var.L.d(i10) == 1 || lo0Var.Y || (lo0Var.J == null && TextUtils.isEmpty(lo0Var.w))) {
                    return lo0Var.M.J;
                }
                int i22 = lo0Var.R;
                int i23 = lo0Var.g0;
                return i22 + (i10 % i23 != i23 - 1 ? org.telegram.messenger.i0.L(2.0f) : 0);
            case 10:
                t31 t31Var = (t31) this.d;
                yy yyVar = t31Var.P1;
                p51 p51Var = t31Var.V1;
                if (p51Var == null) {
                    return yyVar.J;
                }
                a51 G = p51Var.G(i10 - 1);
                return (G == null || (i12 = G.u) == -1) ? yyVar.J : i12;
            case 11:
                ph.l1 l1Var = (ph.l1) this.d;
                yy yyVar2 = l1Var.a2;
                p51 p51Var2 = l1Var.Q1;
                if (p51Var2 == null || i10 == 0) {
                    return yyVar2.J;
                }
                a51 G2 = p51Var2.G(i10 - 1);
                return (G2 == null || (i13 = G2.u) == -1) ? yyVar2.J : i13;
            case 12:
                a51 G3 = ((q3) this.d).a2.G(i10 - 1);
                if (G3 == null || (i14 = G3.u) == -1) {
                    return 3;
                }
                return i14;
            case 13:
                t3 t3Var = (t3) this.d;
                yy yyVar3 = t3Var.S1;
                p51 p51Var3 = t3Var.Y1;
                if (p51Var3 == null) {
                    return yyVar3.J;
                }
                a51 G4 = p51Var3.G(i10 - 1);
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
                a51 G5 = n0Var.G(i10 - 1);
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
