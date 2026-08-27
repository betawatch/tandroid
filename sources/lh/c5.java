package lh;

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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.md;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eh1;
import org.telegram.ui.gf;
import org.telegram.ui.lg;
import org.telegram.ui.ni0;
import org.telegram.ui.ol0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        rh.a aVar;
        rh.e4 e4Var;
        switch (this.a) {
            case 0:
                ((d5.i) this.b).run();
                break;
            case 1:
                i6 i6Var = ((h6) this.b).x;
                if (i6Var.r && (callback = i6Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 2:
                z8 z8Var = (z8) ((w8) this.b).h;
                if (z8Var != null) {
                    z8Var.run();
                    break;
                }
                break;
            case 3:
                ((gf) this.b).run();
                break;
            case 4:
                ((gf) this.b).run();
                break;
            case 5:
                ChatActivityEnterView.h(((md) ((nh.n0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 6:
                ((androidx.car.app.utils.b) this.b).run();
                break;
            case 7:
                oh.o oVar = (oh.o) this.b;
                TLRPC.Chat chat = oVar.D;
                if (chat != null && !chat.title.equals(((hh.o) oVar.n.b).getText().toString())) {
                    oVar.getMessagesController().changeChatTitle(oVar.D.id, ((hh.o) oVar.n.b).getText().toString(), new oh.h(oVar, 1));
                }
                TLRPC.Chat chat2 = oVar.D;
                if (chat2 != null && oVar.h != oVar.f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    oVar.D.default_banned_rights.manage_linked_peers = !oVar.h;
                    oVar.getMessagesController().setDefaultBannedRole(oVar.b, oVar.D.default_banned_rights, false, oVar);
                }
                oVar.finishFragment();
                break;
            case 8:
                ((oh.d0) this.b).h.d.D(0);
                break;
            case 9:
                oh.j0.y(((oh.e0) this.b).r);
                break;
            case 10:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.J.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 11:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                if (!u0Var.a) {
                    if (u0Var.x != 0 || !u0Var.y) {
                        u0Var.b(false, true);
                        break;
                    } else {
                        ((Activity) u0Var.getContext()).startActivityForResult(((MediaProjectionManager) u0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 12:
                eh1 eh1Var = (eh1) this.b;
                if (!eh1Var.a) {
                    if (eh1Var.w != 0) {
                        eh1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) eh1Var.getContext()).startActivityForResult(((MediaProjectionManager) eh1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 13:
                Context context = (Context) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(TLObject.FLAG_28);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.g1.j();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(lVar));
                i0.a.w(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 15:
                pf.k kVar = (pf.k) this.b;
                MessagesController.getInstance(kVar.B).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                kVar.l();
                break;
            case 16:
                ((pf.p) this.b).run();
                break;
            case 17:
                ((pf.h0) this.b).K();
                break;
            case 18:
                pf.l1 l1Var = (pf.l1) this.b;
                LongSparseArray longSparseArray = l1Var.n;
                org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = p3Var.getStickerSet();
                if (stickerSet != null && l1Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!p3Var.r) {
                        l1Var.F(stickerSet, p3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        l1Var.e.a.h(p3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 19:
                qf.g gVar = (qf.g) this.b;
                org.telegram.ui.Components.j6 j6Var = gVar.f;
                int i10 = gVar.a;
                boolean z10 = gVar.r;
                gVar.r = !z10;
                gVar.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                j6Var.a();
                j6Var.c(LocaleController.getString(gVar.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
                if (gVar.r) {
                    gVar.w |= 1;
                } else {
                    gVar.w &= -2;
                }
                MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_botflags" + gVar.s, gVar.w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i10).getInputPeer(gVar.s);
                toggleconnectedbotpaused.paused = gVar.r;
                ConnectionsManager.getInstance(i10).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 20:
                TL_account.TL_businessChatLink tL_businessChatLink = ((qf.q) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    org.telegram.ui.Components.mc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 21:
                ((qh.b) this.b).dismiss();
                break;
            case 22:
                rh.p pVar = (rh.p) this.b;
                pVar.I(0, true, 0, false, 0L);
                ni0 ni0Var = pVar.K;
                if (ni0Var != null) {
                    ni0Var.h(true);
                    pVar.K = null;
                    break;
                }
                break;
            case 23:
                rh.q0 q0Var = (rh.q0) this.b;
                rh.x2 x2Var = q0Var.h;
                if (x2Var != null && (aVar = q0Var.f) != null) {
                    rh.p3 p3Var2 = x2Var.a;
                    p3Var2.getClass();
                    if (rh.p3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        rh.b2 b2Var = p3Var2.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        p3Var2.U2.N(true);
                        rh.b2 b2Var2 = p3Var2.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 24:
                rh.g4 g4Var = (rh.g4) this.b;
                rh.a aVar2 = g4Var.a;
                if (aVar2 != null && (e4Var = g4Var.C) != null) {
                    ((rh.l3) e4Var).a.d3.l2(aVar2);
                    break;
                }
                break;
            case 25:
                ((yf.x) this.b).dismiss();
                break;
            case 26:
                ((ol0) this.b).run();
                break;
            case 27:
                ((zf.t2) this.b).onBackPressed();
                break;
            default:
                ((lg) this.b).run();
                break;
        }
    }
}
