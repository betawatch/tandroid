package mh;

import ag.v0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import j7.l1;
import lh.m5;
import nh.l8;
import nh.o8;
import nh.u0;
import nh.v5;
import nh.w5;
import nh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.p3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.df;
import org.telegram.ui.hh1;
import org.telegram.ui.ki0;
import org.telegram.ui.lx0;
import ph.l0;
import qh.c0;
import qh.d0;
import qh.i0;
import rf.m1;
import th.b2;
import th.e4;
import th.g4;
import th.l3;
import th.q0;
import th.x2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        th.a aVar;
        e4 e4Var;
        switch (this.a) {
            case 0:
                ((m5) this.b).run();
                break;
            case 1:
                nh.m mVar = (nh.m) this.b;
                nh.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                nh.e eVar = mVar.V;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 2:
                ((wa) this.b).B();
                break;
            case 3:
                u0.a((u0) this.b);
                break;
            case 4:
                ((v0) this.b).run();
                break;
            case 5:
                w5 w5Var = ((v5) this.b).x;
                if (w5Var.r && (callback = w5Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 6:
                o8 o8Var = (o8) ((l8) this.b).h;
                if (o8Var != null) {
                    o8Var.run();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.J.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 8:
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
            case 9:
                hh1 hh1Var = (hh1) this.b;
                if (!hh1Var.a) {
                    if (hh1Var.w != 0) {
                        hh1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) hh1Var.getContext()).startActivityForResult(((MediaProjectionManager) hh1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 10:
                Context context = (Context) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(TLObject.FLAG_28);
                    }
                    context.startActivity(action);
                    h1.j();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(lVar));
                l1.u(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 12:
                ((df) this.b).run();
                break;
            case 13:
                ((df) this.b).run();
                break;
            case 14:
                ChatActivityEnterView.h(((td) ((l0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 15:
                ((lx0) this.b).run();
                break;
            case 16:
                qh.n nVar = (qh.n) this.b;
                TLRPC.Chat chat = nVar.D;
                if (chat != null && !chat.title.equals(((jh.m) nVar.n.b).getText().toString())) {
                    nVar.getMessagesController().changeChatTitle(nVar.D.id, ((jh.m) nVar.n.b).getText().toString(), new qh.i(nVar, 1));
                }
                TLRPC.Chat chat2 = nVar.D;
                if (chat2 != null && nVar.h != nVar.f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.D.default_banned_rights.manage_linked_peers = !nVar.h;
                    nVar.getMessagesController().setDefaultBannedRole(nVar.b, nVar.D.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                break;
            case 17:
                ((c0) this.b).h.d.D(0);
                break;
            case 18:
                i0.x(((d0) this.b).r);
                break;
            case 19:
                rf.l lVar2 = (rf.l) this.b;
                MessagesController.getInstance(lVar2.B).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                lVar2.l();
                break;
            case 20:
                ((rf.q) this.b).run();
                break;
            case 21:
                ((rf.i0) this.b).K();
                break;
            case 22:
                m1 m1Var = (m1) this.b;
                LongSparseArray longSparseArray = m1Var.n;
                p3 p3Var = (p3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = p3Var.getStickerSet();
                if (stickerSet != null && m1Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!p3Var.r) {
                        m1Var.F(stickerSet, p3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        m1Var.e.a.h(p3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 23:
                sf.f fVar = (sf.f) this.b;
                o6 o6Var = fVar.f;
                int i10 = fVar.a;
                boolean z10 = fVar.r;
                fVar.r = !z10;
                fVar.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                o6Var.a();
                o6Var.c(LocaleController.getString(fVar.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
                if (fVar.r) {
                    fVar.w |= 1;
                } else {
                    fVar.w &= -2;
                }
                MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_botflags" + fVar.s, fVar.w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i10).getInputPeer(fVar.s);
                toggleconnectedbotpaused.paused = fVar.r;
                ConnectionsManager.getInstance(i10).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 24:
                TL_account.TL_businessChatLink tL_businessChatLink = ((sf.p) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    tc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 25:
                ((sh.b) this.b).dismiss();
                break;
            case 26:
                th.p pVar = (th.p) this.b;
                pVar.H(0, true, 0, false, 0L);
                ki0 ki0Var = pVar.K;
                if (ki0Var != null) {
                    ki0Var.h(true);
                    pVar.K = null;
                    break;
                }
                break;
            case 27:
                q0 q0Var = (q0) this.b;
                x2 x2Var = q0Var.h;
                if (x2Var != null && (aVar = q0Var.f) != null) {
                    th.p3 p3Var2 = x2Var.a;
                    p3Var2.getClass();
                    if (th.p3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        b2 b2Var = p3Var2.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        p3Var2.U2.N(true);
                        b2 b2Var2 = p3Var2.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                            break;
                        }
                    }
                }
                break;
            default:
                g4 g4Var = (g4) this.b;
                th.a aVar2 = g4Var.a;
                if (aVar2 != null && (e4Var = g4Var.C) != null) {
                    ((l3) e4Var).a.d3.J(aVar2);
                    break;
                }
                break;
        }
    }
}
