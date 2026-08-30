package oh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import kh.a2;
import nh.n5;
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
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.voip.g1;
import org.telegram.ui.Components.voip.u0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lf;
import org.telegram.ui.si0;
import org.telegram.ui.th1;
import org.telegram.ui.wx0;
import org.telegram.ui.zt0;
import ph.e5;
import ph.f5;
import ph.n0;
import ph.r7;
import ph.t9;
import rh.m0;
import sh.c0;
import sh.d0;
import sh.i0;
import tf.h0;
import tf.m1;
import vh.c2;
import vh.g4;
import vh.i4;
import vh.n3;
import vh.q0;
import vh.z2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        vh.a aVar;
        g4 g4Var;
        switch (this.a) {
            case 0:
                ((n5) this.b).run();
                break;
            case 1:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                tVar.K.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 2:
                u0 u0Var = (u0) this.b;
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
            case 3:
                th1 th1Var = (th1) this.b;
                if (!th1Var.a) {
                    if (th1Var.w != 0) {
                        th1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) th1Var.getContext()).startActivityForResult(((MediaProjectionManager) th1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
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
                    g1.j();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                a2.u(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 6:
                ph.k kVar2 = (ph.k) this.b;
                ph.f fVar = kVar2.f;
                fVar.d();
                fVar.k(true);
                ph.e eVar = kVar2.W;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 7:
                ((t9) this.b).B();
                break;
            case 8:
                n0.a((n0) this.b);
                break;
            case 9:
                ((zt0) this.b).run();
                break;
            case 10:
                f5 f5Var = ((e5) this.b).x;
                if (f5Var.r && (callback = f5Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 11:
                r7 r7Var = (r7) ((rd0) this.b).h;
                if (r7Var != null) {
                    r7Var.run();
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
                ChatActivityEnterView.h(((qd) ((m0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 15:
                ((wx0) this.b).run();
                break;
            case 16:
                sh.n nVar = (sh.n) this.b;
                TLRPC.Chat chat = nVar.E;
                if (chat != null && !chat.title.equals(((lh.n) nVar.n.b).getText().toString())) {
                    nVar.getMessagesController().changeChatTitle(nVar.E.id, ((lh.n) nVar.n.b).getText().toString(), new sh.i(nVar, 1));
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
                ((c0) this.b).h.d.D(0);
                break;
            case 18:
                i0.x(((d0) this.b).r);
                break;
            case 19:
                tf.k kVar3 = (tf.k) this.b;
                MessagesController.getInstance(kVar3.C).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                kVar3.l();
                break;
            case 20:
                ((tf.p) this.b).run();
                break;
            case 21:
                ((h0) this.b).K();
                break;
            case 22:
                m1 m1Var = (m1) this.b;
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
                uf.e eVar2 = (uf.e) this.b;
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
                TL_account.TL_businessChatLink tL_businessChatLink = ((uf.o) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    qc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 25:
                ((uh.b) this.b).dismiss();
                break;
            case 26:
                vh.p pVar = (vh.p) this.b;
                pVar.H(0, true, 0, false, 0L);
                si0 si0Var = pVar.L;
                if (si0Var != null) {
                    si0Var.h(true);
                    pVar.L = null;
                    break;
                }
                break;
            case 27:
                q0 q0Var = (q0) this.b;
                z2 z2Var = q0Var.h;
                if (z2Var != null && (aVar = q0Var.f) != null) {
                    vh.r3 r3Var2 = z2Var.a;
                    r3Var2.getClass();
                    if (vh.r3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        c2 c2Var = r3Var2.G3;
                        if (c2Var != null) {
                            c2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        r3Var2.V2.N(true);
                        c2 c2Var2 = r3Var2.G3;
                        if (c2Var2 != null) {
                            c2Var2.h();
                            break;
                        }
                    }
                }
                break;
            default:
                i4 i4Var = (i4) this.b;
                vh.a aVar2 = i4Var.a;
                if (aVar2 != null && (g4Var = i4Var.D) != null) {
                    ((n3) g4Var).a.e3.A(aVar2);
                    break;
                }
                break;
        }
    }
}
