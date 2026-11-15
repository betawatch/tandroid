package ah;

import ai.a1;
import ai.x2;
import android.view.View;
import bi.f5;
import bi.s2;
import bi.t0;
import bi.x0;
import ch.b0;
import di.ab;
import di.cb;
import di.d9;
import di.e5;
import di.i1;
import di.lb;
import di.s0;
import di.u2;
import di.v0;
import di.y5;
import fi.b9;
import fi.c1;
import fi.i9;
import fi.m8;
import fi.o5;
import fi.r8;
import hi.ia;
import hi.u0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e2 Q;
        e2 Q2;
        switch (this.a) {
            case 0:
                Runnable runnable = ((e) this.b).e;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                x2 x2Var = (x2) this.b;
                x2Var.getClass();
                DictationAsr.T(!DictationAsr.v());
                x2Var.e0();
                break;
            case 2:
                ((androidx.mediarouter.app.g) this.b).dismiss();
                break;
            case 3:
                ((bi.e) this.b).dismiss();
                break;
            case 4:
                ((t0) this.b).dismiss();
                break;
            case 5:
                ((x0) this.b).c(null);
                break;
            case 6:
                if (((s2) this.b).a2.e > 0 && (Q = LaunchActivity.Q()) != null) {
                    c2 c2Var = new c2();
                    c2Var.a = true;
                    Q.showAsSheet(new lb(), c2Var);
                    break;
                }
                break;
            case 7:
                ((f5) this.b).performClick();
                break;
            case 8:
                b0 b0Var = (b0) this.b;
                if (b0Var.k) {
                    b0Var.d();
                    break;
                }
                break;
            case 9:
                ((ci.n) this.b).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                break;
            case 10:
                ((p20) this.b).dismiss();
                break;
            case 11:
                ((s0) this.b).dismiss();
                break;
            case 12:
                v0 v0Var = (v0) this.b;
                cg.b bVar = v0Var.z1.a;
                cg.b bVar2 = cg.b.b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.a;
                }
                v0Var.J0(cg.a.i(0L, bVar2), true, false, true);
                v0Var.n1.setText("");
                break;
            case 13:
                ((i1) this.b).dismiss();
                break;
            case 14:
                ((u2) this.b).run();
                break;
            case 15:
                ((u2) this.b).run();
                break;
            case 16:
                e5 e5Var = (e5) this.b;
                e5Var.getClass();
                new cb(e5Var.b, e5Var.g).show();
                break;
            case 17:
                ((y5) this.b).dismiss();
                break;
            case 18:
                ((d9) this.b).run();
                break;
            case 19:
                if (((ab) ((a) this.b).c).e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    c2 c2Var2 = new c2();
                    c2Var2.a = true;
                    Q2.showAsSheet(new lb(), c2Var2);
                    break;
                }
                break;
            case 20:
                ((fi.c2) this.b).q(!r5.g0, true);
                break;
            case 21:
                ((i9) this.b).T();
                break;
            case 22:
                ((o5) this.b).dismiss();
                e2 Q3 = LaunchActivity.Q();
                if (Q3 != null) {
                    Q3.showDialog(new ug.x0(Q3, 14, false));
                    break;
                }
                break;
            case 23:
                m8 m8Var = (m8) this.b;
                m8Var.onClick(m8Var.b);
                break;
            case 24:
                r8 r8Var = (r8) this.b;
                r8Var.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new b9(r8Var, 0)).start();
                break;
            case 25:
                ((c1) this.b).run();
                break;
            case 26:
                hi.m mVar = (hi.m) this.b;
                hi.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                hi.e eVar = mVar.d0;
                g0.r(eVar);
                eVar.run();
                break;
            case 27:
                ((ia) this.b).B();
                break;
            case 28:
                u0.a((u0) this.b);
                break;
            default:
                ((a1) this.b).run();
                break;
        }
    }
}
