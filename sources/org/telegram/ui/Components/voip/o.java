package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
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
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.td0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.lf;
import org.telegram.ui.ti0;
import org.telegram.ui.vh1;
import org.telegram.ui.yx0;
import qh.d5;
import qh.e5;
import qh.p7;
import qh.r9;
import wh.g4;
import wh.i4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        wh.a aVar;
        g4 g4Var;
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.K.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 1:
                v0 v0Var = (v0) this.b;
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
            case 2:
                vh1 vh1Var = (vh1) this.b;
                if (!vh1Var.a) {
                    if (vh1Var.w != 0) {
                        vh1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) vh1Var.getContext()).startActivityForResult(((MediaProjectionManager) vh1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
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
                    h1.j();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 5:
                ((org.telegram.ui.web.s0) this.b).run();
                break;
            case 6:
                qh.k kVar2 = (qh.k) this.b;
                qh.f fVar = kVar2.f;
                fVar.d();
                fVar.k(true);
                qh.e eVar = kVar2.W;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 7:
                ((r9) this.b).B();
                break;
            case 8:
                qh.n0.a((qh.n0) this.b);
                break;
            case 9:
                ((bu0) this.b).run();
                break;
            case 10:
                e5 e5Var = ((d5) this.b).x;
                if (e5Var.r && (callback = e5Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 11:
                p7 p7Var = (p7) ((td0) this.b).h;
                if (p7Var != null) {
                    p7Var.run();
                    break;
                }
                break;
            case 12:
                ((lf) this.b).run();
                break;
            case 13:
                ((lf) this.b).run();
                break;
            case 14:
                ChatActivityEnterView.h(((qd) ((sh.l0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 15:
                ((yx0) this.b).run();
                break;
            case 16:
                th.n nVar = (th.n) this.b;
                TLRPC.Chat chat = nVar.E;
                if (chat != null && !chat.title.equals(((mh.m) nVar.n.b).getText().toString())) {
                    nVar.getMessagesController().changeChatTitle(nVar.E.id, ((mh.m) nVar.n.b).getText().toString(), new th.i(nVar, 1));
                }
                TLRPC.Chat chat2 = nVar.E;
                if (chat2 != null && nVar.h != nVar.f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.E.default_banned_rights.manage_linked_peers = !nVar.h;
                    nVar.getMessagesController().setDefaultBannedRole(nVar.b, nVar.E.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                break;
            case 17:
                ((th.c0) this.b).h.d.D(0);
                break;
            case 18:
                th.i0.x(((th.d0) this.b).r);
                break;
            case 19:
                uf.k kVar3 = (uf.k) this.b;
                MessagesController.getInstance(kVar3.C).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                kVar3.l();
                break;
            case 20:
                ((uf.p) this.b).run();
                break;
            case 21:
                ((uf.h0) this.b).K();
                break;
            case 22:
                uf.m1 m1Var = (uf.m1) this.b;
                LongSparseArray longSparseArray = m1Var.n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && m1Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!r3Var.r) {
                        m1Var.F(stickerSet, r3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        m1Var.e.a.h(r3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 23:
                vf.e eVar2 = (vf.e) this.b;
                k6 k6Var = eVar2.f;
                int i10 = eVar2.a;
                boolean z4 = eVar2.r;
                eVar2.r = !z4;
                eVar2.h.c(LocaleController.getString(!z4 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                k6Var.a();
                k6Var.c(LocaleController.getString(eVar2.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
                if (eVar2.r) {
                    eVar2.w |= 1;
                } else {
                    eVar2.w &= -2;
                }
                MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_botflags" + eVar2.s, eVar2.w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i10).getInputPeer(eVar2.s);
                toggleconnectedbotpaused.paused = eVar2.r;
                ConnectionsManager.getInstance(i10).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 24:
                TL_account.TL_businessChatLink tL_businessChatLink = ((vf.o) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    qc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 25:
                ((vh.b) this.b).dismiss();
                break;
            case 26:
                wh.q qVar = (wh.q) this.b;
                qVar.H(0, true, 0, false, 0L);
                ti0 ti0Var = qVar.L;
                if (ti0Var != null) {
                    ti0Var.h(true);
                    qVar.L = null;
                    break;
                }
                break;
            case 27:
                wh.r0 r0Var = (wh.r0) this.b;
                wh.z2 z2Var = r0Var.h;
                if (z2Var != null && (aVar = r0Var.f) != null) {
                    wh.r3 r3Var2 = z2Var.a;
                    r3Var2.getClass();
                    if (wh.r3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        wh.d2 d2Var = r3Var2.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        r3Var2.V2.N(true);
                        wh.d2 d2Var2 = r3Var2.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                            break;
                        }
                    }
                }
                break;
            default:
                i4 i4Var = (i4) this.b;
                wh.a aVar2 = i4Var.a;
                if (aVar2 != null && (g4Var = i4Var.D) != null) {
                    ((wh.n3) g4Var).a.e3.n(aVar2);
                    break;
                }
                break;
        }
    }
}
