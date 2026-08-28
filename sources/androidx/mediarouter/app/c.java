package androidx.mediarouter.app;

import android.view.View;
import bg.k1;
import bg.p1;
import bg.t1;
import fh.p2;
import gh.da;
import gh.fa;
import gh.i5;
import gh.l1;
import gh.o4;
import gh.oa;
import gh.r2;
import gh.t0;
import gh.x0;
import gh.z7;
import ih.f9;
import ih.h2;
import ih.m9;
import ih.q8;
import ih.s5;
import ih.v8;
import kh.j6;
import kh.k6;
import kh.mb;
import kh.v0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o2 R;
        o2 R2;
        Utilities.Callback callback;
        switch (this.a) {
            case 0:
                ((i) this.b).dismiss();
                break;
            case 1:
                final p1 p1Var = (p1) this.b;
                dg.a aVar = p1Var.M0;
                if (!aVar.a.J) {
                    aVar.b(true);
                    String str = p1Var.N0;
                    final int i9 = 0;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: bg.o1
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i9) {
                                case 0:
                                    p1 p1Var2 = p1Var;
                                    p1Var2.M0.b(false);
                                    p1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new n1(p1Var2, 1), 200L);
                                    break;
                                default:
                                    p1.b0(p1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i10 = 1;
                    Utilities.Callback callback3 = new Utilities.Callback() { // from class: bg.o1
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i10) {
                                case 0:
                                    p1 p1Var2 = p1Var;
                                    p1Var2.M0.b(false);
                                    p1Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new n1(p1Var2, 1), 200L);
                                    break;
                                default:
                                    p1.b0(p1Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new bg.i0(callback3, callback2, 0), 2);
                    break;
                }
                break;
            case 2:
                ((t1) this.b).dismiss();
                break;
            case 3:
                ((k1) ((cg.e) this.b)).r.dismiss();
                break;
            case 4:
                Runnable runnable = ((fg.d) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                ((fh.d) this.b).dismiss();
                break;
            case 6:
                ((fh.r0) this.b).dismiss();
                break;
            case 7:
                if (((p2) this.b).b0.f > 0 && (R = LaunchActivity.R()) != null) {
                    m2 m2Var = new m2();
                    m2Var.a = true;
                    R.showAsSheet(new oa(), m2Var);
                    break;
                }
                break;
            case 8:
                ((gh.g0) this.b).dismiss();
                break;
            case 9:
                ((t0) this.b).dismiss();
                break;
            case 10:
                x0 x0Var = (x0) this.b;
                gf.b bVar = x0Var.A.a;
                gf.b bVar2 = gf.b.b;
                if (bVar == bVar2) {
                    bVar2 = gf.b.a;
                }
                x0Var.n(gf.a.i(0L, bVar2), true, false, true);
                x0Var.c.setText("");
                break;
            case 11:
                ((l1) this.b).dismiss();
                break;
            case 12:
                ((r2) this.b).run();
                break;
            case 13:
                ((r2) this.b).run();
                break;
            case 14:
                o4 o4Var = (o4) this.b;
                o4Var.getClass();
                new fa(o4Var.b, o4Var.g).show();
                break;
            case 15:
                ((i5) this.b).dismiss();
                break;
            case 16:
                ((z7) this.b).run();
                break;
            case 17:
                if (((da) ((fg.a) this.b).c).f > 0 && (R2 = LaunchActivity.R()) != null) {
                    m2 m2Var2 = new m2();
                    m2Var2.a = true;
                    R2.showAsSheet(new oa(), m2Var2);
                    break;
                }
                break;
            case 18:
                hg.e0 e0Var = (hg.e0) this.b;
                if (e0Var.k) {
                    e0Var.d();
                    break;
                }
                break;
            case 19:
                ((h2) this.b).q(!r6.b0, true);
                break;
            case 20:
                ((m9) this.b).N();
                break;
            case 21:
                ((s5) this.b).dismiss();
                o2 R3 = LaunchActivity.R();
                if (R3 != null) {
                    R3.showDialog(new zf.x0(R3, 14, false));
                    break;
                }
                break;
            case 22:
                q8 q8Var = (q8) this.b;
                q8Var.onClick(q8Var.b);
                break;
            case 23:
                v8 v8Var = (v8) this.b;
                v8Var.b.q1.animate().alpha(0.0f).setDuration(150L).setListener(new f9(v8Var, 0)).start();
                break;
            case 24:
                ((ih.g) this.b).run();
                break;
            case 25:
                kh.m mVar = (kh.m) this.b;
                kh.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                kh.e eVar = mVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 26:
                ((mb) this.b).B();
                break;
            case 27:
                v0.a((v0) this.b);
                break;
            case 28:
                ((d5.i) this.b).run();
                break;
            default:
                k6 k6Var = ((j6) this.b).x;
                if (k6Var.r && (callback = k6Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
        }
    }
}
