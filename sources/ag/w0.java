package ag;

import android.view.View;
import hh.da;
import hh.fa;
import hh.g5;
import hh.m4;
import hh.oa;
import hh.y7;
import jh.b9;
import jh.i9;
import jh.m8;
import jh.o5;
import jh.r8;
import lh.ib;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.a) {
            case 0:
                ((p80) this.b).performClick();
                break;
            case 1:
                y2 y2Var = (y2) this.b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(y2Var.p0, null, "profile", null);
                break;
            case 2:
                ((androidx.mediarouter.app.g) this.b).dismiss();
                break;
            case 3:
                final cg.k1 k1Var = (cg.k1) this.b;
                eg.a aVar = k1Var.M0;
                if (!aVar.a.J) {
                    aVar.b(true);
                    String str = k1Var.N0;
                    final int i10 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: cg.j1
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i10) {
                                case 0:
                                    k1 k1Var2 = k1Var;
                                    k1Var2.M0.b(false);
                                    k1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new i1(k1Var2, 1), 200L);
                                    break;
                                default:
                                    k1.c0(k1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i11 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: cg.j1
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i11) {
                                case 0:
                                    k1 k1Var2 = k1Var;
                                    k1Var2.M0.b(false);
                                    k1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new i1(k1Var2, 1), 200L);
                                    break;
                                default:
                                    k1.c0(k1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new cg.f0(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 4:
                ((cg.o1) this.b).dismiss();
                break;
            case 5:
                ((cg.f1) ((dg.e) this.b)).r.dismiss();
                break;
            case 6:
                Runnable runnable = ((gg.d) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ((gh.d) this.b).dismiss();
                break;
            case 8:
                ((gh.p0) this.b).dismiss();
                break;
            case 9:
                if (((gh.k2) this.b).b0.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    R.showAsSheet(new oa(), l2Var);
                    break;
                }
                break;
            case 10:
                ((hh.g0) this.b).dismiss();
                break;
            case 11:
                ((hh.t0) this.b).dismiss();
                break;
            case 12:
                hh.x0 x0Var = (hh.x0) this.b;
                hf.b bVar = x0Var.A.a;
                hf.b bVar2 = hf.b.b;
                if (bVar == bVar2) {
                    bVar2 = hf.b.a;
                }
                x0Var.n(hf.a.i(0L, bVar2), true, false, true);
                x0Var.c.setText("");
                break;
            case 13:
                ((hh.l1) this.b).dismiss();
                break;
            case 14:
                ((hh.r2) this.b).run();
                break;
            case 15:
                ((hh.r2) this.b).run();
                break;
            case 16:
                m4 m4Var = (m4) this.b;
                m4Var.getClass();
                new fa(m4Var.b, m4Var.g).show();
                break;
            case 17:
                ((g5) this.b).dismiss();
                break;
            case 18:
                ((y7) this.b).run();
                break;
            case 19:
                if (((da) ((gg.a) this.b).c).f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.a = true;
                    R2.showAsSheet(new oa(), l2Var2);
                    break;
                }
                break;
            case 20:
                ig.d0 d0Var = (ig.d0) this.b;
                if (d0Var.k) {
                    d0Var.d();
                    break;
                }
                break;
            case 21:
                ((jh.g2) this.b).q(!r6.b0, true);
                break;
            case 22:
                ((i9) this.b).N();
                break;
            case 23:
                ((o5) this.b).dismiss();
                org.telegram.ui.ActionBar.n2 R3 = LaunchActivity.R();
                if (R3 != null) {
                    R3.showDialog(new g2(R3, 14, false));
                    break;
                }
                break;
            case 24:
                m8 m8Var = (m8) this.b;
                m8Var.onClick(m8Var.b);
                break;
            case 25:
                r8 r8Var = (r8) this.b;
                r8Var.b.q1.animate().alpha(0.0f).setDuration(150L).setListener(new b9(r8Var, 0)).start();
                break;
            case 26:
                ((kh.c) this.b).run();
                break;
            case 27:
                lh.m mVar = (lh.m) this.b;
                lh.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                lh.e eVar = mVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 28:
                ((ib) this.b).B();
                break;
            default:
                lh.u0.a((lh.u0) this.b);
                break;
        }
    }
}
