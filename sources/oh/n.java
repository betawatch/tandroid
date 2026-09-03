package oh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import kf.k0;
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
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.voip.g1;
import org.telegram.ui.Components.voip.u0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.dy0;
import org.telegram.ui.gu0;
import org.telegram.ui.nf;
import org.telegram.ui.ui0;
import ph.e5;
import ph.f5;
import ph.n0;
import ph.q7;
import ph.t9;
import rh.l0;
import sh.c0;
import sh.d0;
import sh.i0;
import tf.h0;
import tf.m1;
import vh.a3;
import vh.d2;
import vh.h4;
import vh.j4;
import vh.o3;
import vh.r0;
import vh.s3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        h4 h4Var;
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
                bi1 bi1Var = (bi1) this.b;
                if (!bi1Var.a) {
                    if (bi1Var.w != 0) {
                        bi1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) bi1Var.getContext()).startActivityForResult(((MediaProjectionManager) bi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
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
                k0.u(R.string.Cancel, alertDialog$Builder, null);
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
                ((gu0) this.b).run();
                break;
            case 10:
                f5 f5Var = ((e5) this.b).x;
                if (f5Var.r && (callback = f5Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 11:
                q7 q7Var = (q7) ((sd0) this.b).h;
                if (q7Var != null) {
                    q7Var.run();
                    break;
                }
                break;
            case 12:
                ((nf) this.b).run();
                break;
            case 13:
                ((nf) this.b).run();
                break;
            case 14:
                ChatActivityEnterView.h(((qd) ((l0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 15:
                ((dy0) this.b).run();
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
                q3 q3Var = (q3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
                if (stickerSet != null && m1Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!q3Var.r) {
                        m1Var.F(stickerSet, q3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        m1Var.e.a.h(q3Var.getStickerSet());
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
                vh.q qVar = (vh.q) this.b;
                qVar.H(0, true, 0, false, 0L);
                ui0 ui0Var = qVar.L;
                if (ui0Var != null) {
                    ui0Var.h(true);
                    qVar.L = null;
                    break;
                }
                break;
            case 27:
                r0 r0Var = (r0) this.b;
                a3 a3Var = r0Var.h;
                if (a3Var != null && (aVar = r0Var.f) != null) {
                    s3 s3Var = a3Var.a;
                    s3Var.getClass();
                    if (s3.w3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        d2 d2Var = s3Var.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        s3Var.V2.N(true);
                        d2 d2Var2 = s3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                            break;
                        }
                    }
                }
                break;
            default:
                j4 j4Var = (j4) this.b;
                vh.a aVar2 = j4Var.a;
                if (aVar2 != null && (h4Var = j4Var.D) != null) {
                    ((o3) h4Var).a.e3.z(aVar2);
                    break;
                }
                break;
        }
    }
}
