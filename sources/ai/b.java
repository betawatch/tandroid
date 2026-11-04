package ai;

import android.view.View;
import ci.lb;
import ci.n9;
import ci.nb;
import ci.wb;
import ei.k9;
import ei.r9;
import ei.t8;
import ei.z8;
import gi.c8;
import gi.la;
import gi.z7;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.i20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.xe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.d2 Q;
        org.telegram.ui.ActionBar.d2 Q2;
        u10 u10Var;
        switch (this.a) {
            case 0:
                ((g) this.b).dismiss();
                break;
            case 1:
                ((z0) this.b).dismiss();
                break;
            case 2:
                if (((b3) this.b).X1.f > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                    b2Var.a = true;
                    Q.showAsSheet(new wb(), b2Var);
                    break;
                }
                break;
            case 3:
                ((androidx.mediarouter.app.g) this.b).dismiss();
                break;
            case 4:
                Runnable runnable = ((bh.d) this.b).e;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                ((bi.n) this.b).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                break;
            case 6:
                ((i20) this.b).dismiss();
                break;
            case 7:
                ((ci.x0) this.b).dismiss();
                break;
            case 8:
                ci.a1 a1Var = (ci.a1) this.b;
                dg.b bVar = a1Var.w1.a;
                dg.b bVar2 = dg.b.b;
                if (bVar == bVar2) {
                    bVar2 = dg.b.a;
                }
                a1Var.J0(dg.a.i(0L, bVar2), true, false, true);
                a1Var.k1.setText("");
                break;
            case 9:
                ((ci.p1) this.b).dismiss();
                break;
            case 10:
                ((ci.b3) this.b).run();
                break;
            case 11:
                ((ci.b3) this.b).run();
                break;
            case 12:
                ci.n5 n5Var = (ci.n5) this.b;
                n5Var.getClass();
                new nb(n5Var.b, n5Var.g).show();
                break;
            case 13:
                ((ci.h6) this.b).dismiss();
                break;
            case 14:
                ((n9) this.b).run();
                break;
            case 15:
                if (((lb) ((bh.a) this.b).c).f > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2();
                    b2Var2.a = true;
                    Q2.showAsSheet(new wb(), b2Var2);
                    break;
                }
                break;
            case 16:
                dh.a0 a0Var = (dh.a0) this.b;
                if (a0Var.k) {
                    a0Var.d();
                    break;
                }
                break;
            case 17:
                ((ei.k2) this.b).q(!r5.g0, true);
                break;
            case 18:
                ((r9) this.b).b0();
                break;
            case 19:
                ((ei.w5) this.b).dismiss();
                org.telegram.ui.ActionBar.d2 Q3 = LaunchActivity.Q();
                if (Q3 != null) {
                    Q3.showDialog(new vg.v0(Q3, 14, false));
                    break;
                }
                break;
            case 20:
                t8 t8Var = (t8) this.b;
                t8Var.onClick(t8Var.b);
                break;
            case 21:
                z8 z8Var = (z8) this.b;
                z8Var.b.v1.animate().alpha(0.0f).setDuration(150L).setListener(new k9(z8Var, 0)).start();
                break;
            case 22:
                ((ei.z5) this.b).run();
                break;
            case 23:
                gi.m mVar = (gi.m) this.b;
                gi.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                gi.e eVar = mVar.d0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                break;
            case 24:
                ((la) this.b).B();
                break;
            case 25:
                gi.t0.a((gi.t0) this.b);
                break;
            case 26:
                ((e3) this.b).run();
                break;
            case 27:
                gi.q5 q5Var = ((gi.p5) this.b).y;
                if (q5Var.r && (u10Var = q5Var.f) != null) {
                    u10Var.a(5);
                    break;
                }
                break;
            case 28:
                c8 c8Var = (c8) ((z7) this.b).h;
                if (c8Var != null) {
                    c8Var.run();
                    break;
                }
                break;
            default:
                ((xe) this.b).run();
                break;
        }
    }
}
