package ai;

import android.animation.ValueAnimator;
import gi.x9;
import org.telegram.messenger.a8;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.lp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q6(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i3 = this.a;
        int i10 = 0;
        char c2 = 1;
        char c10 = 1;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                d7 d7Var = (d7) obj2;
                if (((e5.f) obj).a == 0) {
                    org.telegram.messenger.g0.h3(new p6(d7Var, c2 == true ? 1 : 0));
                    break;
                }
                break;
            case 1:
                n10 n10Var = (n10) obj2;
                int i11 = ((e5.f) obj).a;
                boolean z10 = i11 == 0;
                String j10 = z10 ? null : org.telegram.messenger.r1.j(i11);
                a8.b("StarsController.buy onResult " + z10 + " " + j10);
                org.telegram.messenger.g0.h3(new ci.v6(n10Var, z10, j10, i10));
                break;
            case 2:
                gi.m5.Y((x9) obj2, (Integer) obj);
                break;
            case 3:
                ii.a3 a3Var = (ii.a3) obj2;
                Float f10 = (Float) obj;
                a3Var.F.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(xq.f);
                    duration.addUpdateListener(new ii.w1(a3Var, 1));
                    duration.addListener(new e1(a3Var, 29));
                    duration.start();
                    break;
                }
                break;
            case 4:
                ii.d4 d4Var = (ii.d4) obj2;
                Float f11 = (Float) obj;
                d4Var.J.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(xq.f);
                    duration2.addUpdateListener(new ii.t3(d4Var, c10 == true ? 1 : 0));
                    duration2.addListener(new ii.v3(d4Var, 0));
                    duration2.start();
                    d4Var.P();
                    break;
                }
                break;
            case 5:
                ((kg.m) obj2).S.L4(((Float) obj).floatValue());
                break;
            default:
                androidx.activity.n nVar = (androidx.activity.n) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (nVar.a) {
                    case 1:
                        x9 x9Var = (x9) nVar.d;
                        x9Var.F0(false);
                        tg.k0 k0Var = (tg.k0) nVar.c;
                        k0Var.h(intValue, true);
                        k0Var.g();
                        x9Var.setNewColor(intValue);
                        gi.u4 u4Var = x9Var.g1;
                        u4Var.setSelectedColorIndex(k0Var.d());
                        u4Var.getAdapter().f();
                        break;
                    default:
                        lp0 lp0Var = (lp0) nVar.d;
                        lp0Var.w0(false);
                        tg.k0 k0Var2 = lp0Var.F1;
                        k0Var2.h(intValue, true);
                        k0Var2.g();
                        lp0Var.setNewColor(intValue);
                        ug.c0 c0Var = lp0Var.q1;
                        c0Var.setSelectedColorIndex(k0Var2.d());
                        c0Var.getAdapter().f();
                        break;
                }
        }
    }
}
