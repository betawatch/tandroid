package hg;

import ai.md;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import ki.d3;
import ki.h2;
import ki.m4;
import ki.o4;
import ki.s3;
import ki.w3;
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
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ah1;
import org.telegram.ui.kg;
import org.telegram.ui.mi0;
import rg.t2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ki.a aVar;
        m4 m4Var;
        n2 R;
        switch (this.a) {
            case 0:
                ((s0) this.b).K();
                break;
            case 1:
                e2 e2Var = (e2) this.b;
                LongSparseArray longSparseArray = e2Var.n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && e2Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!r3Var.r) {
                        e2Var.F(stickerSet, r3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        e2Var.e.a.h(r3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 2:
                hi.o oVar = (hi.o) this.b;
                TLRPC.Chat chat = oVar.H;
                if (chat != null && !chat.title.equals(((ai.t) oVar.n.b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.H.id, ((ai.t) oVar.n.b).getText().toString(), new hi.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.H;
                if (chat2 != null && oVar.h != oVar.f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.H.default_banned_rights.manage_linked_peers = !oVar.h;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.b, oVar.H.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                break;
            case 3:
                ((hi.e0) this.b).h.d.D(0);
                break;
            case 4:
                hi.k0.z(((hi.f0) this.b).r);
                break;
            case 5:
                ig.e eVar = (ig.e) this.b;
                q6 q6Var = eVar.f;
                int i10 = eVar.a;
                boolean z10 = eVar.r;
                eVar.r = !z10;
                eVar.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                q6Var.a();
                q6Var.c(LocaleController.getString(eVar.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
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
            case 6:
                TL_account.TL_businessChatLink tL_businessChatLink = ((ig.t) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    xc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 7:
                ((ji.b) this.b).dismiss();
                break;
            case 8:
                ki.q qVar = (ki.q) this.b;
                qVar.K(0, true, 0, false, 0L);
                mi0 mi0Var = qVar.O;
                if (mi0Var != null) {
                    mi0Var.g(true);
                    qVar.O = null;
                    break;
                }
                break;
            case 9:
                ki.t0 t0Var = (ki.t0) this.b;
                d3 d3Var = t0Var.h;
                if (d3Var != null && (aVar = t0Var.f) != null) {
                    w3 w3Var = d3Var.a;
                    w3Var.getClass();
                    if (w3.y3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        h2 h2Var = w3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        w3Var.W2.N(true);
                        h2 h2Var2 = w3Var.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 10:
                o4 o4Var = (o4) this.b;
                ki.a aVar2 = o4Var.a;
                if (aVar2 != null && (m4Var = o4Var.G) != null) {
                    ((s3) m4Var).a.f3.i(aVar2);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 12:
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
            case 13:
                ah1 ah1Var = (ah1) this.b;
                if (!ah1Var.a) {
                    if (ah1Var.w != 0) {
                        ah1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) ah1Var.getContext()).startActivityForResult(((MediaProjectionManager) ah1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 14:
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
            case 15:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 16:
                ((qg.y) this.b).dismiss();
                break;
            case 17:
                ((y31) this.b).run();
                break;
            case 18:
                ((t2) this.b).onBackPressed();
                break;
            case 19:
                ((kg) this.b).run();
                break;
            case 20:
                ((x90) this.b).performClick();
                break;
            case 21:
                sg.m1 m1Var = (sg.m1) this.b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(m1Var.t0, null, "profile", null);
                break;
            case 22:
                final ug.f0 f0Var = (ug.f0) this.b;
                wg.a aVar3 = f0Var.Q0;
                if (!aVar3.a.N) {
                    aVar3.b(true);
                    String str = f0Var.R0;
                    final int i11 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: ug.e0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i11) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    f0Var2.Q0.b(false);
                                    f0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new d0(f0Var2, 1), 200L);
                                    break;
                                default:
                                    f0.d0(f0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i12 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: ug.e0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i12) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    f0Var2.Q0.b(false);
                                    f0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new d0(f0Var2, 1), 200L);
                                    break;
                                default:
                                    f0.d0(f0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.o(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 23:
                ((ug.i0) this.b).dismiss();
                break;
            case 24:
                ((ug.a0) ((vg.e) this.b)).r.dismiss();
                break;
            case 25:
                Runnable runnable = ((yg.c) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 26:
                ((yh.c) this.b).dismiss();
                break;
            case 27:
                ((yh.c0) this.b).dismiss();
                break;
            case 28:
                if (((yh.o1) this.b).f0.f > 0 && (R = LaunchActivity.R()) != null) {
                    l2 l2Var = new l2();
                    l2Var.a = true;
                    R.showAsSheet(new md(), l2Var);
                    break;
                }
                break;
            default:
                ((zh.n) this.b).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                break;
        }
    }
}
