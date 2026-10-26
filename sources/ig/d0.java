package ig;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import bi.dd;
import li.c3;
import li.f2;
import li.m4;
import li.o4;
import li.r3;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ih1;
import org.telegram.ui.jg;
import org.telegram.ui.ni0;
import org.telegram.ui.yx;
import sg.v2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        li.a aVar;
        m4 m4Var;
        r2 R;
        switch (this.a) {
            case 0:
                ((v) this.b).run();
                break;
            case 1:
                ((s0) this.b).K();
                break;
            case 2:
                d2 d2Var = (d2) this.b;
                LongSparseArray longSparseArray = d2Var.n;
                q3 q3Var = (q3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
                if (stickerSet != null && d2Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!q3Var.r) {
                        d2Var.F(stickerSet, q3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        d2Var.e.a.h(q3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 3:
                ii.o oVar = (ii.o) this.b;
                TLRPC.Chat chat = oVar.I;
                if (chat != null && !chat.title.equals(((bi.t) oVar.r.b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.I.id, ((bi.t) oVar.r.b).getText().toString(), new ii.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.I;
                if (chat2 != null && oVar.n != oVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.I.default_banned_rights.manage_linked_peers = !oVar.n;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.c, oVar.I.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                break;
            case 4:
                ((ii.d0) this.b).h.d.E(0);
                break;
            case 5:
                ii.j0.B(((ii.e0) this.b).r);
                break;
            case 6:
                jg.e eVar = (jg.e) this.b;
                s6 s6Var = eVar.f;
                int i10 = eVar.a;
                boolean z10 = eVar.r;
                eVar.r = !z10;
                eVar.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                s6Var.a();
                s6Var.c(LocaleController.getString(eVar.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
                if (eVar.r) {
                    eVar.w |= 1;
                } else {
                    eVar.w &= -2;
                }
                MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_botflags" + eVar.s, eVar.w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i10).getInputPeer(eVar.s);
                toggleconnectedbotpaused.paused = eVar.r;
                ConnectionsManager.getInstance(i10).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 7:
                TL_account.TL_businessChatLink tL_businessChatLink = ((jg.u) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    wc.b0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 8:
                ((ki.b) this.b).dismiss();
                break;
            case 9:
                li.q qVar = (li.q) this.b;
                qVar.K(0, true, 0, false, 0L);
                ni0 ni0Var = qVar.O;
                if (ni0Var != null) {
                    ni0Var.g(true);
                    qVar.O = null;
                    break;
                }
                break;
            case 10:
                li.s0 s0Var = (li.s0) this.b;
                c3 c3Var = s0Var.h;
                if (c3Var != null && (aVar = s0Var.f) != null) {
                    v3 v3Var = c3Var.a;
                    v3Var.getClass();
                    if (v3.D3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        f2 f2Var = v3Var.R3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        v3Var.g3.O(true);
                        f2 f2Var2 = v3Var.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 11:
                o4 o4Var = (o4) this.b;
                li.a aVar2 = o4Var.a;
                if (aVar2 != null && (m4Var = o4Var.G) != null) {
                    ((r3) m4Var).a.p3.o(aVar2);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 13:
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
            case 14:
                ih1 ih1Var = (ih1) this.b;
                if (!ih1Var.a) {
                    if (ih1Var.w != 0) {
                        ih1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) ih1Var.getContext()).startActivityForResult(((MediaProjectionManager) ih1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 15:
                Context context = (Context) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(TLObject.FLAG_28);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.i1.j();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(lVar));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 17:
                ((rg.y) this.b).dismiss();
                break;
            case 18:
                ((yx) this.b).run();
                break;
            case 19:
                ((v2) this.b).onBackPressed();
                break;
            case 20:
                ((jg) this.b).run();
                break;
            case 21:
                ((z90) this.b).performClick();
                break;
            case 22:
                tg.m1 m1Var = (tg.m1) this.b;
                PremiumPreviewFragment.q0();
                PremiumPreviewFragment.l0(m1Var.t0, null, "profile", null);
                break;
            case 23:
                final vg.g0 g0Var = (vg.g0) this.b;
                xg.a aVar3 = g0Var.Q0;
                if (!aVar3.a.Q) {
                    aVar3.b(true);
                    String str = g0Var.R0;
                    final int i11 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: vg.f0
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
                                    g0.i0(g0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i12 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: vg.f0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i12) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    g0Var2.Q0.b(false);
                                    g0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(g0Var2, 1), 200L);
                                    break;
                                default:
                                    g0.i0(g0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new vg.p(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 24:
                ((vg.j0) this.b).dismiss();
                break;
            case 25:
                ((vg.b0) ((wg.e) this.b)).r.dismiss();
                break;
            case 26:
                Runnable runnable = ((zg.c) this.b).e;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 27:
                ((zh.c) this.b).dismiss();
                break;
            case 28:
                ((zh.c0) this.b).dismiss();
                break;
            default:
                if (((zh.p1) this.b).f0.f > 0 && (R = LaunchActivity.R()) != null) {
                    p2 p2Var = new p2();
                    p2Var.a = true;
                    R.showAsSheet(new dd(), p2Var);
                    break;
                }
                break;
        }
    }
}
