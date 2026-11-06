package ah;

import ai.d0;
import ai.e0;
import ai.s;
import android.view.View;
import bi.dd;
import bi.e1;
import bi.g7;
import bi.h1;
import bi.k6;
import bi.o3;
import bi.oa;
import bi.sc;
import bi.uc;
import bi.w1;
import ch.b0;
import di.g2;
import di.i9;
import di.p9;
import di.s7;
import di.t8;
import di.w5;
import di.y8;
import fi.a8;
import fi.d8;
import fi.la;
import fi.r5;
import fi.s5;
import fi.t0;
import hi.k0;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.jd;
import org.telegram.ui.Components.m20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.af;
import ug.w0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        f2 Q;
        c20 c20Var;
        switch (this.a) {
            case 0:
                Runnable runnable = ((e) this.b).e;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ((s) this.b).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                break;
            case 2:
                ((androidx.mediarouter.app.g) this.b).dismiss();
                break;
            case 3:
                ((m20) this.b).dismiss();
                break;
            case 4:
                ((e1) this.b).dismiss();
                break;
            case 5:
                h1 h1Var = (h1) this.b;
                cg.b bVar = h1Var.v1.a;
                cg.b bVar2 = cg.b.b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.a;
                }
                h1Var.J0(cg.a.i(0L, bVar2), true, false, true);
                h1Var.j1.setText("");
                break;
            case 6:
                ((w1) this.b).dismiss();
                break;
            case 7:
                ((o3) this.b).run();
                break;
            case 8:
                ((o3) this.b).run();
                break;
            case 9:
                k6 k6Var = (k6) this.b;
                k6Var.getClass();
                new uc(k6Var.b, k6Var.g).show();
                break;
            case 10:
                ((g7) this.b).dismiss();
                break;
            case 11:
                ((oa) this.b).run();
                break;
            case 12:
                if (((sc) ((a) this.b).c).f > 0 && (Q = LaunchActivity.Q()) != null) {
                    d2 d2Var = new d2();
                    d2Var.a = true;
                    Q.showAsSheet(new dd(), d2Var);
                    break;
                }
                break;
            case 13:
                b0 b0Var = (b0) this.b;
                if (b0Var.k) {
                    b0Var.d();
                    break;
                }
                break;
            case 14:
                ((g2) this.b).q(!r5.f0, true);
                break;
            case 15:
                ((p9) this.b).T();
                break;
            case 16:
                ((w5) this.b).dismiss();
                f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new w0(Q2, 14, false));
                    break;
                }
                break;
            case 17:
                t8 t8Var = (t8) this.b;
                t8Var.onClick(t8Var.b);
                break;
            case 18:
                y8 y8Var = (y8) this.b;
                y8Var.b.t1.animate().alpha(0.0f).setDuration(150L).setListener(new i9(y8Var, 0)).start();
                break;
            case 19:
                ((s7) this.b).run();
                break;
            case 20:
                fi.m mVar = (fi.m) this.b;
                fi.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                fi.e eVar = mVar.c0;
                g0.r(eVar);
                eVar.run();
                break;
            case 21:
                ((la) this.b).B();
                break;
            case 22:
                t0.a((t0) this.b);
                break;
            case 23:
                ((e0) this.b).run();
                break;
            case 24:
                s5 s5Var = ((r5) this.b).y;
                if (s5Var.r && (c20Var = s5Var.f) != null) {
                    c20Var.a(5);
                    break;
                }
                break;
            case 25:
                d8 d8Var = (d8) ((a8) this.b).h;
                if (d8Var != null) {
                    d8Var.run();
                    break;
                }
                break;
            case 26:
                ((af) this.b).run();
                break;
            case 27:
                ((af) this.b).run();
                break;
            case 28:
                ChatActivityEnterView.e(((jd) ((k0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            default:
                ((d0) this.b).run();
                break;
        }
    }
}
