package org.telegram.ui.Components.voip;

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
import org.telegram.ui.Components.c90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.em0;
import org.telegram.ui.ni1;
import org.telegram.ui.o20;
import org.telegram.ui.ug;
import yh.l7;
import yh.n7;
import yh.x5;
import yh.x7;
import yh.y3;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 1:
                x0 x0Var = (x0) this.b;
                if (!x0Var.a) {
                    if (x0Var.x != 0 || !x0Var.y) {
                        x0Var.b(false, true);
                        break;
                    } else {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 2:
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
            case 3:
                Context context = (Context) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(TLObject.FLAG_28);
                    }
                    context.startActivity(action);
                    j1.j();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 5:
                ((pg.x) this.b).dismiss();
                break;
            case 6:
                ((em0) this.b).run();
                break;
            case 7:
                ((qg.v2) this.b).onBackPressed();
                break;
            case 8:
                ((ug) this.b).run();
                break;
            case 9:
                ((c90) this.b).performClick();
                break;
            case 10:
                rg.k1 k1Var = (rg.k1) this.b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(k1Var.t0, null, "profile", null);
                break;
            case 11:
                final tg.h0 h0Var = (tg.h0) this.b;
                vg.a aVar = h0Var.Q0;
                if (!aVar.a.N) {
                    aVar.b(true);
                    String str = h0Var.R0;
                    final int i10 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: tg.g0
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
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: tg.g0
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
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.q(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 12:
                ((tg.k0) this.b).dismiss();
                break;
            case 13:
                ((tg.c0) ((ug.e) this.b)).r.dismiss();
                break;
            case 14:
                Runnable runnable = ((xg.c) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 15:
                ((xh.c) this.b).dismiss();
                break;
            case 16:
                ((xh.c0) this.b).dismiss();
                break;
            case 17:
                if (((xh.q1) this.b).f0.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    R.showAsSheet(new x7(), l2Var);
                    break;
                }
                break;
            case 18:
                ((yh.s) this.b).dismiss();
                break;
            case 19:
                ((yh.e0) this.b).dismiss();
                break;
            case 20:
                yh.i0 i0Var = (yh.i0) this.b;
                zf.b bVar = i0Var.E.a;
                zf.b bVar2 = zf.b.b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.a;
                }
                i0Var.n(zf.a.i(0L, bVar2), true, false, true);
                i0Var.c.setText("");
                break;
            case 21:
                ((yh.s0) this.b).dismiss();
                break;
            case 22:
                ((yh.r1) this.b).run();
                break;
            case 23:
                ((yh.r1) this.b).run();
                break;
            case 24:
                yh.e3 e3Var = (yh.e3) this.b;
                e3Var.getClass();
                new n7(e3Var.b, e3Var.g).show();
                break;
            case 25:
                ((y3) this.b).dismiss();
                break;
            case 26:
                ((x5) this.b).run();
                break;
            case 27:
                if (((l7) ((o20) this.b).d).f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.a = true;
                    R2.showAsSheet(new x7(), l2Var2);
                    break;
                }
                break;
            default:
                zg.c0 c0Var = (zg.c0) this.b;
                if (c0Var.k) {
                    c0Var.d();
                    break;
                }
                break;
        }
    }
}
