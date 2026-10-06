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
import org.telegram.ui.Components.q90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.am0;
import org.telegram.ui.di1;
import org.telegram.ui.o20;
import org.telegram.ui.ug;
import yh.a6;
import yh.m7;
import yh.p7;
import yh.x3;
import yh.z7;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                di1 di1Var = (di1) this.b;
                if (!di1Var.a) {
                    if (di1Var.w != 0) {
                        di1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) di1Var.getContext()).startActivityForResult(((MediaProjectionManager) di1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
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
                    k1.j();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 5:
                ((pg.x) this.b).dismiss();
                break;
            case 6:
                ((am0) this.b).run();
                break;
            case 7:
                ((qg.t2) this.b).onBackPressed();
                break;
            case 8:
                ((ug) this.b).run();
                break;
            case 9:
                ((q90) this.b).performClick();
                break;
            case 10:
                rg.m1 m1Var = (rg.m1) this.b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(m1Var.t0, null, "profile", null);
                break;
            case 11:
                final tg.g0 g0Var = (tg.g0) this.b;
                vg.a aVar = g0Var.Q0;
                if (!aVar.a.N) {
                    aVar.b(true);
                    String str = g0Var.R0;
                    final int i10 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: tg.f0
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
                                    g0.c0(g0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i11 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: tg.f0
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
                                    g0.c0(g0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.o(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 12:
                ((tg.j0) this.b).dismiss();
                break;
            case 13:
                ((tg.b0) ((ug.e) this.b)).r.dismiss();
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
                    R.showAsSheet(new z7(), l2Var);
                    break;
                }
                break;
            case 18:
                ((yh.t) this.b).dismiss();
                break;
            case 19:
                ((yh.f0) this.b).dismiss();
                break;
            case 20:
                yh.j0 j0Var = (yh.j0) this.b;
                zf.b bVar = j0Var.E.a;
                zf.b bVar2 = zf.b.b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.a;
                }
                j0Var.n(zf.a.i(0L, bVar2), true, false, true);
                j0Var.c.setText("");
                break;
            case 21:
                ((yh.t0) this.b).dismiss();
                break;
            case 22:
                ((yh.s1) this.b).run();
                break;
            case 23:
                ((yh.s1) this.b).run();
                break;
            case 24:
                yh.d3 d3Var = (yh.d3) this.b;
                d3Var.getClass();
                new p7(d3Var.b, d3Var.g).show();
                break;
            case 25:
                ((x3) this.b).dismiss();
                break;
            case 26:
                ((a6) this.b).run();
                break;
            case 27:
                if (((m7) ((o20) this.b).d).f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.a = true;
                    R2.showAsSheet(new z7(), l2Var2);
                    break;
                }
                break;
            default:
                zg.z zVar = (zg.z) this.b;
                if (zVar.k) {
                    zVar.d();
                    break;
                }
                break;
        }
    }
}
