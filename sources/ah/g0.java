package ah;

import ai.a2;
import ai.ad;
import ai.cd;
import ai.g7;
import ai.k6;
import ai.ka;
import ai.ld;
import ai.x3;
import ai.zc;
import android.view.View;
import ci.aa;
import ci.e9;
import ci.g6;
import ci.j9;
import ci.t9;
import ei.a9;
import ei.j6;
import ei.lb;
import ei.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.zd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mf;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n2 R;
        Utilities.Callback callback;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b;
                if (t0Var.k) {
                    t0Var.d();
                    break;
                }
                break;
            case 1:
                ((ai.o0) this.b).dismiss();
                break;
            case 2:
                ((ai.h1) this.b).dismiss();
                break;
            case 3:
                ai.l1 l1Var = (ai.l1) this.b;
                ag.c cVar = l1Var.E.a;
                ag.c cVar2 = ag.c.b;
                if (cVar == cVar2) {
                    cVar2 = ag.c.a;
                }
                l1Var.o(ag.a.i(0L, cVar2), true, false, true);
                l1Var.c.setText("");
                break;
            case 4:
                ((a2) this.b).dismiss();
                break;
            case 5:
                ((x3) this.b).run();
                break;
            case 6:
                ((x3) this.b).run();
                break;
            case 7:
                k6 k6Var = (k6) this.b;
                k6Var.getClass();
                new cd(k6Var.b, k6Var.g).show();
                break;
            case 8:
                ((g7) this.b).dismiss();
                break;
            case 9:
                ((ka) this.b).run();
                break;
            case 10:
                if (((zc) ((ad) this.b).d).f > 0 && (R = LaunchActivity.R()) != null) {
                    l2 l2Var = new l2();
                    l2Var.a = true;
                    R.showAsSheet(new ld(), l2Var);
                    break;
                }
                break;
            case 11:
                ((androidx.mediarouter.app.g) this.b).dismiss();
                break;
            case 12:
                ((ci.n2) this.b).q(!r5.f0, true);
                break;
            case 13:
                ((aa) this.b).N();
                break;
            case 14:
                ((g6) this.b).dismiss();
                n2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.showDialog(new sg.x0(R2, 14, false));
                    break;
                }
                break;
            case 15:
                e9 e9Var = (e9) this.b;
                e9Var.onClick(e9Var.b);
                break;
            case 16:
                j9 j9Var = (j9) this.b;
                j9Var.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new t9(j9Var, 0)).start();
                break;
            case 17:
                ((com.google.firebase.messaging.s) this.b).run();
                break;
            case 18:
                ei.m mVar = (ei.m) this.b;
                ei.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                ei.e eVar = mVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 19:
                ((lb) this.b).B();
                break;
            case 20:
                ei.u0.a((ei.u0) this.b);
                break;
            case 21:
                ((o) this.b).run();
                break;
            case 22:
                ei.k6 k6Var2 = ((j6) this.b).x;
                if (k6Var2.r && (callback = k6Var2.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 23:
                a9 a9Var = (a9) ((x8) this.b).h;
                if (a9Var != null) {
                    a9Var.run();
                    break;
                }
                break;
            case 24:
                ((mf) this.b).run();
                break;
            case 25:
                ((mf) this.b).run();
                break;
            case 26:
                ChatActivityEnterView.g(((zd) ((gi.n0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 27:
                ((ai.y0) this.b).run();
                break;
            case 28:
                hg.m mVar2 = (hg.m) this.b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                break;
            default:
                ((hg.v) this.b).run();
                break;
        }
    }
}
