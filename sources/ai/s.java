package ai;

import android.view.View;
import bi.d7;
import bi.dd;
import bi.g6;
import bi.ma;
import bi.o3;
import bi.rc;
import bi.sc;
import bi.uc;
import bi.x1;
import di.c9;
import di.f6;
import di.h9;
import di.m2;
import di.r9;
import di.s8;
import di.y9;
import fi.h6;
import fi.i6;
import fi.ib;
import fi.t8;
import fi.w8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.kf;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r2 R;
        Utilities.Callback callback;
        switch (this.a) {
            case 0:
                ((t) this.b).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                break;
            case 1:
                ((androidx.mediarouter.app.h) this.b).dismiss();
                break;
            case 2:
                bh.i0 i0Var = (bh.i0) this.b;
                if (i0Var.k) {
                    i0Var.d();
                    break;
                }
                break;
            case 3:
                ((bi.q0) this.b).dismiss();
                break;
            case 4:
                ((bi.g1) this.b).dismiss();
                break;
            case 5:
                bi.k1 k1Var = (bi.k1) this.b;
                bg.b bVar = k1Var.E.a;
                bg.b bVar2 = bg.b.b;
                if (bVar == bVar2) {
                    bVar2 = bg.b.a;
                }
                k1Var.n(bg.a.i(0L, bVar2), true, false, true);
                k1Var.c.setText("");
                break;
            case 6:
                ((x1) this.b).dismiss();
                break;
            case 7:
                ((o3) this.b).run();
                break;
            case 8:
                ((o3) this.b).run();
                break;
            case 9:
                g6 g6Var = (g6) this.b;
                g6Var.getClass();
                new uc(g6Var.b, g6Var.g).show();
                break;
            case 10:
                ((d7) this.b).dismiss();
                break;
            case 11:
                ((ma) this.b).run();
                break;
            case 12:
                if (((rc) ((sc) this.b).d).f > 0 && (R = LaunchActivity.R()) != null) {
                    p2 p2Var = new p2();
                    p2Var.a = true;
                    R.showAsSheet(new dd(), p2Var);
                    break;
                }
                break;
            case 13:
                ((m2) this.b).q(!r5.f0, true);
                break;
            case 14:
                ((y9) this.b).N();
                break;
            case 15:
                ((f6) this.b).dismiss();
                r2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.showDialog(new tg.y0(R2, 14, false));
                    break;
                }
                break;
            case 16:
                c9 c9Var = (c9) this.b;
                c9Var.onClick(c9Var.b);
                break;
            case 17:
                h9 h9Var = (h9) this.b;
                h9Var.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new r9(h9Var, 0)).start();
                break;
            case 18:
                ((s8) this.b).run();
                break;
            case 19:
                fi.m mVar = (fi.m) this.b;
                fi.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                fi.e eVar = mVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 20:
                ((ib) this.b).B();
                break;
            case 21:
                fi.u0.a((fi.u0) this.b);
                break;
            case 22:
                ((h0) this.b).run();
                break;
            case 23:
                i6 i6Var = ((h6) this.b).x;
                if (i6Var.r && (callback = i6Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 24:
                w8 w8Var = (w8) ((t8) this.b).h;
                if (w8Var != null) {
                    w8Var.run();
                    break;
                }
                break;
            case 25:
                ((kf) this.b).run();
                break;
            case 26:
                ((kf) this.b).run();
                break;
            case 27:
                ChatActivityEnterView.f(((ae) ((hi.u0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 28:
                ((e0) this.b).run();
                break;
            default:
                ig.n nVar = (ig.n) this.b;
                MessagesController.getInstance(nVar.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                nVar.l();
                break;
        }
    }
}
