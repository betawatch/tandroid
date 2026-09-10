package ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import bi.g3;
import bi.oa;
import bi.qd;
import bi.sa;
import bi.u7;
import bi.v7;
import bi.y0;
import di.s0;
import ei.k0;
import fg.h2;
import fg.t0;
import hi.k2;
import hi.p4;
import hi.r4;
import hi.v3;
import hi.w0;
import hi.z3;
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
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cj0;
import org.telegram.ui.sf;
import org.telegram.ui.si1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        hi.a aVar;
        p4 p4Var;
        switch (this.a) {
            case 0:
                ((a3.d) this.b).run();
                break;
            case 1:
                ((androidx.mediarouter.app.h) this.b).dismiss();
                break;
            case 2:
                bi.o oVar = (bi.o) this.b;
                bi.i iVar = oVar.f;
                iVar.d();
                iVar.k(true);
                bi.e eVar = oVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 3:
                ((qd) this.b).B();
                break;
            case 4:
                y0.a((y0) this.b);
                break;
            case 5:
                ((g3) this.b).run();
                break;
            case 6:
                v7 v7Var = ((u7) this.b).x;
                if (v7Var.r && (callback = v7Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 7:
                sa saVar = (sa) ((oa) this.b).h;
                if (saVar != null) {
                    saVar.run();
                    break;
                }
                break;
            case 8:
                ((sf) this.b).run();
                break;
            case 9:
                ((sf) this.b).run();
                break;
            case 10:
                ChatActivityEnterView.h(((yd) ((s0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 11:
                ((androidx.car.app.utils.b) this.b).run();
                break;
            case 12:
                ei.p pVar = (ei.p) this.b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((ei.o) pVar.n.b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.id, ((ei.o) pVar.n.b).getText().toString(), new ei.h(pVar, 1));
                }
                TLRPC.Chat chat2 = pVar.H;
                if (chat2 != null && pVar.h != pVar.f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    pVar.H.default_banned_rights.manage_linked_peers = !pVar.h;
                    pVar.getMessagesController().setDefaultBannedRole(pVar.b, pVar.H.default_banned_rights, false, pVar);
                }
                pVar.finishFragment();
                break;
            case 13:
                ((ei.e0) this.b).h.d.D(0);
                break;
            case 14:
                k0.x(((ei.f0) this.b).r);
                break;
            case 15:
                fg.m mVar = (fg.m) this.b;
                MessagesController.getInstance(mVar.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar.l();
                break;
            case 16:
                ((fg.v) this.b).run();
                break;
            case 17:
                ((t0) this.b).K();
                break;
            case 18:
                h2 h2Var = (h2) this.b;
                LongSparseArray longSparseArray = h2Var.n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && h2Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!r3Var.r) {
                        h2Var.F(stickerSet, r3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        h2Var.e.a.h(r3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 19:
                gg.e eVar2 = (gg.e) this.b;
                o6 o6Var = eVar2.f;
                int i10 = eVar2.a;
                boolean z10 = eVar2.r;
                eVar2.r = !z10;
                eVar2.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                o6Var.a();
                o6Var.c(LocaleController.getString(eVar2.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
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
            case 20:
                TL_account.TL_businessChatLink tL_businessChatLink = ((gg.v) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    wc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 21:
                ((gi.c) this.b).dismiss();
                break;
            case 22:
                hi.s sVar = (hi.s) this.b;
                sVar.I(0, true, 0, false, 0L);
                cj0 cj0Var = sVar.O;
                if (cj0Var != null) {
                    cj0Var.h(true);
                    sVar.O = null;
                    break;
                }
                break;
            case 23:
                w0 w0Var = (w0) this.b;
                hi.g3 g3Var = w0Var.h;
                if (g3Var != null && (aVar = w0Var.f) != null) {
                    z3 z3Var = g3Var.a;
                    z3Var.getClass();
                    if (z3.w3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        k2 k2Var = z3Var.J3;
                        if (k2Var != null) {
                            k2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        z3Var.Y2.N(true);
                        k2 k2Var2 = z3Var.J3;
                        if (k2Var2 != null) {
                            k2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 24:
                r4 r4Var = (r4) this.b;
                hi.a aVar2 = r4Var.a;
                if (aVar2 != null && (p4Var = r4Var.G) != null) {
                    ((v3) p4Var).a.h3.k(aVar2);
                    break;
                }
                break;
            case 25:
                ((og.a0) this.b).dismiss();
                break;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 27:
                org.telegram.ui.Components.voip.w0 w0Var2 = (org.telegram.ui.Components.voip.w0) this.b;
                if (!w0Var2.a) {
                    if (w0Var2.x != 0 || !w0Var2.y) {
                        w0Var2.b(false, true);
                        break;
                    } else {
                        ((Activity) w0Var2.getContext()).startActivityForResult(((MediaProjectionManager) w0Var2.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 28:
                si1 si1Var = (si1) this.b;
                if (!si1Var.a) {
                    if (si1Var.w != 0) {
                        si1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) si1Var.getContext()).startActivityForResult(((MediaProjectionManager) si1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            default:
                Context context = (Context) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(TLObject.FLAG_28);
                    }
                    context.startActivity(action);
                    i1.j();
                    break;
                }
                break;
        }
    }
}
