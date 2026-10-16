package ji;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.da0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.c90;
import org.telegram.ui.s20;
import org.telegram.ui.vi1;
import org.telegram.ui.xg;
import zh.d7;
import zh.f7;
import zh.p7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p4 p4Var;
        org.telegram.ui.ActionBar.m2 R;
        org.telegram.ui.ActionBar.m2 R2;
        switch (this.a) {
            case 0:
                r4 r4Var = (r4) this.b;
                a aVar = r4Var.a;
                if (aVar != null && (p4Var = r4Var.G) != null) {
                    ((t3) p4Var).a.f3.L(aVar);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 2:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                if (!v0Var.a) {
                    if (v0Var.x != 0 || !v0Var.y) {
                        v0Var.b(false, true);
                        break;
                    } else {
                        ((Activity) v0Var.getContext()).startActivityForResult(((MediaProjectionManager) v0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 3:
                vi1 vi1Var = (vi1) this.b;
                if (!vi1Var.a) {
                    if (vi1Var.w != 0) {
                        vi1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) vi1Var.getContext()).startActivityForResult(((MediaProjectionManager) vi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 4:
                Context context = (Context) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(TLObject.FLAG_28);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.h1.j();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                i2.d.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 6:
                ((qg.x) this.b).dismiss();
                break;
            case 7:
                ((c90) this.b).run();
                break;
            case 8:
                ((rg.v2) this.b).onBackPressed();
                break;
            case 9:
                ((xg) this.b).run();
                break;
            case 10:
                ((da0) this.b).performClick();
                break;
            case 11:
                sg.m1 m1Var = (sg.m1) this.b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(m1Var.t0, null, "profile", null);
                break;
            case 12:
                final ug.g0 g0Var = (ug.g0) this.b;
                wg.a aVar2 = g0Var.Q0;
                if (!aVar2.a.N) {
                    aVar2.b(true);
                    String str = g0Var.R0;
                    final int i10 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: ug.f0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i10) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    g0Var2.Q0.b(false);
                                    g0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(g0Var2, 1), 200L);
                                    break;
                                default:
                                    g0.d0(g0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i11 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: ug.f0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i11) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    g0Var2.Q0.b(false);
                                    g0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(g0Var2, 1), 200L);
                                    break;
                                default:
                                    g0.d0(g0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.p(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 13:
                ((ug.j0) this.b).dismiss();
                break;
            case 14:
                ((ug.b0) ((vg.e) this.b)).r.dismiss();
                break;
            case 15:
                Runnable runnable = ((yg.c) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 16:
                ((yh.d) this.b).dismiss();
                break;
            case 17:
                ((yh.d0) this.b).dismiss();
                break;
            case 18:
                if (((yh.p1) this.b).f0.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                    k2Var.a = true;
                    R.showAsSheet(new p7(), k2Var);
                    break;
                }
                break;
            case 19:
                ((zh.t) this.b).dismiss();
                break;
            case 20:
                ((zh.d0) this.b).dismiss();
                break;
            case 21:
                zh.h0 h0Var = (zh.h0) this.b;
                ag.b bVar = h0Var.E.a;
                ag.b bVar2 = ag.b.b;
                if (bVar == bVar2) {
                    bVar2 = ag.b.a;
                }
                h0Var.o(ag.a.i(0L, bVar2), true, false, true);
                h0Var.c.setText("");
                break;
            case 22:
                ((zh.r0) this.b).dismiss();
                break;
            case 23:
                ((zh.o1) this.b).run();
                break;
            case 24:
                ((zh.o1) this.b).run();
                break;
            case 25:
                zh.x2 x2Var = (zh.x2) this.b;
                x2Var.getClass();
                new f7(x2Var.b, x2Var.g).show();
                break;
            case 26:
                ((zh.q3) this.b).dismiss();
                break;
            case 27:
                ((zh.q5) this.b).run();
                break;
            default:
                if (((d7) ((s20) this.b).d).f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.k2 k2Var2 = new org.telegram.ui.ActionBar.k2();
                    k2Var2.a = true;
                    R2.showAsSheet(new p7(), k2Var2);
                    break;
                }
                break;
        }
    }
}
