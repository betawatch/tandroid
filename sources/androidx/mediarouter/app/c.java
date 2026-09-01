package androidx.mediarouter.app;

import android.view.View;
import eg.w3;
import fg.d2;
import fg.n1;
import hg.d1;
import hg.i1;
import hg.m1;
import lh.g2;
import mh.aa;
import mh.e5;
import mh.ja;
import mh.k4;
import mh.v0;
import mh.x7;
import mh.y9;
import oh.b9;
import oh.h2;
import oh.i9;
import oh.m8;
import oh.r5;
import oh.r8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ng;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p2 R;
        p2 R2;
        switch (this.a) {
            case 0:
                ((i) this.b).dismiss();
                break;
            case 1:
                ((dg.e0) this.b).dismiss();
                break;
            case 2:
                ((bh.a) this.b).run();
                break;
            case 3:
                ((w3) this.b).onBackPressed();
                break;
            case 4:
                ((ng) this.b).run();
                break;
            case 5:
                ((g90) this.b).performClick();
                break;
            case 6:
                d2 d2Var = (d2) this.b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(d2Var.q0, null, "profile", null);
                break;
            case 7:
                final i1 i1Var = (i1) this.b;
                jg.a aVar = i1Var.N0;
                if (!aVar.a.K) {
                    aVar.b(true);
                    String str = i1Var.O0;
                    final int i10 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: hg.h1
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i10) {
                                case 0:
                                    i1 i1Var2 = i1Var;
                                    i1Var2.N0.b(false);
                                    i1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new g1(i1Var2, 1), 200L);
                                    break;
                                default:
                                    i1.c0(i1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i11 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: hg.h1
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i11) {
                                case 0:
                                    i1 i1Var2 = i1Var;
                                    i1Var2.N0.b(false);
                                    i1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new g1(i1Var2, 1), 200L);
                                    break;
                                default:
                                    i1.c0(i1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new hg.f0(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 8:
                ((m1) this.b).dismiss();
                break;
            case 9:
                ((d1) ((ig.e) this.b)).r.dismiss();
                break;
            case 10:
                Runnable runnable = ((lg.d) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 11:
                ((lh.d) this.b).dismiss();
                break;
            case 12:
                ((lh.m0) this.b).dismiss();
                break;
            case 13:
                if (((g2) this.b).c0.f > 0 && (R = LaunchActivity.R()) != null) {
                    n2 n2Var = new n2();
                    n2Var.a = true;
                    R.showAsSheet(new ja(), n2Var);
                    break;
                }
                break;
            case 14:
                ((mh.e0) this.b).dismiss();
                break;
            case 15:
                ((mh.r0) this.b).dismiss();
                break;
            case 16:
                v0 v0Var = (v0) this.b;
                mf.b bVar = v0Var.B.a;
                mf.b bVar2 = mf.b.b;
                if (bVar == bVar2) {
                    bVar2 = mf.b.a;
                }
                v0Var.n(mf.a.i(0L, bVar2), true, false, true);
                v0Var.c.setText("");
                break;
            case 17:
                ((mh.i1) this.b).dismiss();
                break;
            case 18:
                ((mh.p2) this.b).run();
                break;
            case 19:
                ((mh.p2) this.b).run();
                break;
            case 20:
                k4 k4Var = (k4) this.b;
                k4Var.getClass();
                new aa(k4Var.b, k4Var.g).show();
                break;
            case 21:
                ((e5) this.b).dismiss();
                break;
            case 22:
                ((x7) this.b).run();
                break;
            case 23:
                if (((y9) ((lg.a) this.b).c).f > 0 && (R2 = LaunchActivity.R()) != null) {
                    n2 n2Var2 = new n2();
                    n2Var2.a = true;
                    R2.showAsSheet(new ja(), n2Var2);
                    break;
                }
                break;
            case 24:
                ng.d0 d0Var = (ng.d0) this.b;
                if (d0Var.k) {
                    d0Var.d();
                    break;
                }
                break;
            case 25:
                ((h2) this.b).q(!r6.c0, true);
                break;
            case 26:
                ((i9) this.b).N();
                break;
            case 27:
                ((r5) this.b).dismiss();
                p2 R3 = LaunchActivity.R();
                if (R3 != null) {
                    R3.showDialog(new n1(R3, 14, false));
                    break;
                }
                break;
            case 28:
                m8 m8Var = (m8) this.b;
                m8Var.onClick(m8Var.b);
                break;
            default:
                r8 r8Var = (r8) this.b;
                r8Var.b.r1.animate().alpha(0.0f).setDuration(150L).setListener(new b9(r8Var, 0)).start();
                break;
        }
    }
}
