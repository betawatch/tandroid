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
import org.telegram.ui.Components.d90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ai0;
import org.telegram.ui.ni1;
import org.telegram.ui.o20;
import org.telegram.ui.ug;
import zh.j7;
import zh.l7;
import zh.v7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n4 n4Var;
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.b;
                a aVar = p4Var.a;
                if (aVar != null && (n4Var = p4Var.G) != null) {
                    ((r3) n4Var).a.h3.p(aVar);
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
                ni1 ni1Var = (ni1) this.b;
                if (!ni1Var.a) {
                    if (ni1Var.w != 0) {
                        ni1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) ni1Var.getContext()).startActivityForResult(((MediaProjectionManager) ni1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
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
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(lVar));
                i2.g.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 6:
                ((qg.x) this.b).dismiss();
                break;
            case 7:
                ((ai0) this.b).run();
                break;
            case 8:
                ((rg.v2) this.b).onBackPressed();
                break;
            case 9:
                ((ug) this.b).run();
                break;
            case 10:
                ((d90) this.b).performClick();
                break;
            case 11:
                sg.o1 o1Var = (sg.o1) this.b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(o1Var.t0, null, "profile", null);
                break;
            case 12:
                final ug.h0 h0Var = (ug.h0) this.b;
                wg.a aVar2 = h0Var.Q0;
                if (!aVar2.a.N) {
                    aVar2.b(true);
                    String str = h0Var.R0;
                    final int i10 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: ug.g0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i10) {
                                case 0:
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new f0(h0Var2, 1), 200L);
                                    break;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i11 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: ug.g0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i11) {
                                case 0:
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new f0(h0Var2, 1), 200L);
                                    break;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
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
                ((ug.k0) this.b).dismiss();
                break;
            case 14:
                ((ug.c0) ((vg.e) this.b)).r.dismiss();
                break;
            case 15:
                Runnable runnable = ((yg.c) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 16:
                ((yh.c) this.b).dismiss();
                break;
            case 17:
                ((yh.c0) this.b).dismiss();
                break;
            case 18:
                if (((yh.p1) this.b).f0.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    R.showAsSheet(new v7(), l2Var);
                    break;
                }
                break;
            case 19:
                ((zh.s) this.b).dismiss();
                break;
            case 20:
                ((zh.e0) this.b).dismiss();
                break;
            case 21:
                zh.i0 i0Var = (zh.i0) this.b;
                zf.b bVar = i0Var.E.a;
                zf.b bVar2 = zf.b.b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.a;
                }
                i0Var.n(zf.a.i(0L, bVar2), true, false, true);
                i0Var.c.setText("");
                break;
            case 22:
                ((zh.s0) this.b).dismiss();
                break;
            case 23:
                ((zh.q1) this.b).run();
                break;
            case 24:
                ((zh.q1) this.b).run();
                break;
            case 25:
                zh.c3 c3Var = (zh.c3) this.b;
                c3Var.getClass();
                new l7(c3Var.b, c3Var.g).show();
                break;
            case 26:
                ((zh.v3) this.b).dismiss();
                break;
            case 27:
                ((zh.v5) this.b).run();
                break;
            default:
                if (((j7) ((o20) this.b).d).f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.a = true;
                    R2.showAsSheet(new v7(), l2Var2);
                    break;
                }
                break;
        }
    }
}
