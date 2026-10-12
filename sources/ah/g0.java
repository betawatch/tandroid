package ah;

import android.util.LongSparseArray;
import android.view.View;
import bi.bb;
import bi.h3;
import bi.j7;
import bi.la;
import bi.lb;
import bi.sb;
import bi.wa;
import di.ac;
import di.i9;
import di.l9;
import di.r6;
import di.s6;
import hg.e2;
import ji.e3;
import ji.h2;
import ji.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hj0;
import org.telegram.ui.wf;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        ji.a aVar;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b;
                if (t0Var.k) {
                    t0Var.d();
                    break;
                }
                break;
            case 1:
                ((androidx.mediarouter.app.g) this.b).dismiss();
                break;
            case 2:
                ((h3) this.b).q(!r8.f0, true);
                break;
            case 3:
                ((sb) this.b).N();
                break;
            case 4:
                ((j7) this.b).dismiss();
                m2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new sg.y0(R, 14, false));
                    break;
                }
                break;
            case 5:
                wa waVar = (wa) this.b;
                waVar.onClick(waVar.b);
                break;
            case 6:
                bb bbVar = (bb) this.b;
                bbVar.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new lb(bbVar, 0)).start();
                break;
            case 7:
                ((la) this.b).run();
                break;
            case 8:
                di.m mVar = (di.m) this.b;
                di.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                di.e eVar = mVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 9:
                ((ac) this.b).B();
                break;
            case 10:
                di.t0.a((di.t0) this.b);
                break;
            case 11:
                ((o) this.b).run();
                break;
            case 12:
                s6 s6Var = ((r6) this.b).x;
                if (s6Var.r && (callback = s6Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 13:
                l9 l9Var = (l9) ((i9) this.b).h;
                if (l9Var != null) {
                    l9Var.run();
                    break;
                }
                break;
            case 14:
                ((wf) this.b).run();
                break;
            case 15:
                ((wf) this.b).run();
                break;
            case 16:
                ChatActivityEnterView.g(((be) ((fi.o0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 17:
                ((androidx.car.app.utils.b) this.b).run();
                break;
            case 18:
                gi.p pVar = (gi.p) this.b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((gi.o) pVar.n.b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.id, ((gi.o) pVar.n.b).getText().toString(), new gi.h(pVar, 1));
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
            case 19:
                ((gi.e0) this.b).h.d.D(0);
                break;
            case 20:
                gi.k0.z(((gi.f0) this.b).r);
                break;
            case 21:
                hg.m mVar2 = (hg.m) this.b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                break;
            case 22:
                ((hg.v) this.b).run();
                break;
            case 23:
                ((hg.s0) this.b).K();
                break;
            case 24:
                e2 e2Var = (e2) this.b;
                LongSparseArray longSparseArray = e2Var.n;
                s3 s3Var = (s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                if (stickerSet != null && e2Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!s3Var.r) {
                        e2Var.F(stickerSet, s3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        e2Var.e.a.h(s3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 25:
                ig.e eVar2 = (ig.e) this.b;
                org.telegram.ui.Components.s6 s6Var2 = eVar2.f;
                int i10 = eVar2.a;
                boolean z10 = eVar2.r;
                eVar2.r = !z10;
                eVar2.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                s6Var2.a();
                s6Var2.c(LocaleController.getString(eVar2.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
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
            case 26:
                TL_account.TL_businessChatLink tL_businessChatLink = ((ig.t) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    zc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 27:
                ((ii.c) this.b).dismiss();
                break;
            case 28:
                ji.r rVar = (ji.r) this.b;
                rVar.K(0, true, 0, false, 0L);
                hj0 hj0Var = rVar.O;
                if (hj0Var != null) {
                    hj0Var.h(true);
                    rVar.O = null;
                    break;
                }
                break;
            default:
                ji.t0 t0Var2 = (ji.t0) this.b;
                e3 e3Var = t0Var2.h;
                if (e3Var != null && (aVar = t0Var2.f) != null) {
                    x3 x3Var = e3Var.a;
                    x3Var.getClass();
                    if (x3.y3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        h2 h2Var = x3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        x3Var.W2.N(true);
                        h2 h2Var2 = x3Var.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
