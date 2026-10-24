package ah;

import ai.a2;
import ai.bd;
import ai.cd;
import ai.ed;
import ai.h7;
import ai.l6;
import ai.ma;
import ai.nd;
import ai.s3;
import android.view.View;
import ci.d9;
import ci.f6;
import ci.i9;
import ci.s9;
import ci.z9;
import ei.a9;
import ei.j6;
import ei.k6;
import ei.lb;
import ei.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.zd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kf;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        o2 R;
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
                ag.b bVar = l1Var.E.a;
                ag.b bVar2 = ag.b.b;
                if (bVar == bVar2) {
                    bVar2 = ag.b.a;
                }
                l1Var.n(ag.a.i(0L, bVar2), true, false, true);
                l1Var.c.setText("");
                break;
            case 4:
                ((a2) this.b).dismiss();
                break;
            case 5:
                ((s3) this.b).run();
                break;
            case 6:
                ((s3) this.b).run();
                break;
            case 7:
                l6 l6Var = (l6) this.b;
                l6Var.getClass();
                new ed(l6Var.b, l6Var.g).show();
                break;
            case 8:
                ((h7) this.b).dismiss();
                break;
            case 9:
                ((ma) this.b).run();
                break;
            case 10:
                if (((bd) ((cd) this.b).d).f > 0 && (R = LaunchActivity.R()) != null) {
                    m2 m2Var = new m2();
                    m2Var.a = true;
                    R.showAsSheet(new nd(), m2Var);
                    break;
                }
                break;
            case 11:
                ((androidx.mediarouter.app.g) this.b).dismiss();
                break;
            case 12:
                ((ci.m2) this.b).q(!r5.f0, true);
                break;
            case 13:
                ((z9) this.b).N();
                break;
            case 14:
                ((f6) this.b).dismiss();
                o2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.showDialog(new sg.y0(R2, 14, false));
                    break;
                }
                break;
            case 15:
                d9 d9Var = (d9) this.b;
                d9Var.onClick(d9Var.b);
                break;
            case 16:
                i9 i9Var = (i9) this.b;
                i9Var.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new s9(i9Var, 0)).start();
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
                k6 k6Var = ((j6) this.b).x;
                if (k6Var.r && (callback = k6Var.f) != null) {
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
                ((kf) this.b).run();
                break;
            case 25:
                ((kf) this.b).run();
                break;
            case 26:
                ChatActivityEnterView.f(((zd) ((gi.n0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
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
