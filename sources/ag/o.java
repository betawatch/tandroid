package ag;

import android.view.View;
import bg.c4;
import jh.f5;
import jh.ia;
import jh.l4;
import jh.p2;
import jh.w7;
import jh.x9;
import jh.z9;
import lh.b9;
import lh.i9;
import lh.m8;
import lh.q5;
import lh.r8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o2 R;
        o2 R2;
        switch (this.a) {
            case 0:
                ((f0) this.b).dismiss();
                break;
            case 1:
                ((androidx.mediarouter.app.f) this.b).dismiss();
                break;
            case 2:
                ((v0) this.b).run();
                break;
            case 3:
                ((c4) this.b).onBackPressed();
                break;
            case 4:
                ((ig) this.b).run();
                break;
            case 5:
                ((y80) this.b).performClick();
                break;
            case 6:
                cg.f2 f2Var = (cg.f2) this.b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(f2Var.p0, null, "profile", null);
                break;
            case 7:
                final eg.j1 j1Var = (eg.j1) this.b;
                gg.a aVar = j1Var.M0;
                if (!aVar.a.J) {
                    aVar.b(true);
                    String str = j1Var.N0;
                    final int i10 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: eg.i1
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i10) {
                                case 0:
                                    j1 j1Var2 = j1Var;
                                    j1Var2.M0.b(false);
                                    j1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new h1(j1Var2, 1), 200L);
                                    break;
                                default:
                                    j1.c0(j1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i11 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: eg.i1
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i11) {
                                case 0:
                                    j1 j1Var2 = j1Var;
                                    j1Var2.M0.b(false);
                                    j1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new h1(j1Var2, 1), 200L);
                                    break;
                                default:
                                    j1.c0(j1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new eg.g0(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 8:
                ((eg.n1) this.b).dismiss();
                break;
            case 9:
                ((eg.e1) ((fg.e) this.b)).r.dismiss();
                break;
            case 10:
                Runnable runnable = ((ig.d) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 11:
                ((ih.d) this.b).dismiss();
                break;
            case 12:
                ((ih.n0) this.b).dismiss();
                break;
            case 13:
                if (((ih.h2) this.b).b0.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    R.showAsSheet(new ia(), m2Var);
                    break;
                }
                break;
            case 14:
                ((jh.f0) this.b).dismiss();
                break;
            case 15:
                ((jh.s0) this.b).dismiss();
                break;
            case 16:
                jh.w0 w0Var = (jh.w0) this.b;
                kf.b bVar = w0Var.A.a;
                kf.b bVar2 = kf.b.b;
                if (bVar == bVar2) {
                    bVar2 = kf.b.a;
                }
                w0Var.n(kf.a.i(0L, bVar2), true, false, true);
                w0Var.c.setText("");
                break;
            case 17:
                ((jh.j1) this.b).dismiss();
                break;
            case 18:
                ((p2) this.b).run();
                break;
            case 19:
                ((p2) this.b).run();
                break;
            case 20:
                l4 l4Var = (l4) this.b;
                l4Var.getClass();
                new z9(l4Var.b, l4Var.g).show();
                break;
            case 21:
                ((f5) this.b).dismiss();
                break;
            case 22:
                ((w7) this.b).run();
                break;
            case 23:
                if (((x9) ((ig.a) this.b).c).f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                    m2Var2.a = true;
                    R2.showAsSheet(new ia(), m2Var2);
                    break;
                }
                break;
            case 24:
                kg.d0 d0Var = (kg.d0) this.b;
                if (d0Var.k) {
                    d0Var.d();
                    break;
                }
                break;
            case 25:
                ((lh.f2) this.b).q(!r6.b0, true);
                break;
            case 26:
                ((i9) this.b).N();
                break;
            case 27:
                ((q5) this.b).dismiss();
                o2 R3 = LaunchActivity.R();
                if (R3 != null) {
                    R3.showDialog(new cg.p1(R3, 14, false));
                    break;
                }
                break;
            case 28:
                m8 m8Var = (m8) this.b;
                m8Var.onClick(m8Var.b);
                break;
            default:
                r8 r8Var = (r8) this.b;
                r8Var.b.q1.animate().alpha(0.0f).setDuration(150L).setListener(new b9(r8Var, 0)).start();
                break;
        }
    }
}
