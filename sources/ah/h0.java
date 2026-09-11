package ah;

import android.util.LongSparseArray;
import android.view.View;
import bi.e3;
import bi.f7;
import bi.ib;
import bi.oa;
import bi.pb;
import bi.ta;
import bi.ya;
import di.fc;
import di.l9;
import di.o9;
import di.t6;
import di.u6;
import hg.f2;
import ji.c3;
import ji.g2;
import ji.v3;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cj0;
import org.telegram.ui.qf;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        ji.a aVar;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                if (u0Var.k) {
                    u0Var.d();
                    break;
                }
                break;
            case 1:
                ((androidx.mediarouter.app.h) this.b).dismiss();
                break;
            case 2:
                ((e3) this.b).q(!r8.f0, true);
                break;
            case 3:
                ((pb) this.b).N();
                break;
            case 4:
                ((f7) this.b).dismiss();
                n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new sg.a1(R, 14, false));
                    break;
                }
                break;
            case 5:
                ta taVar = (ta) this.b;
                taVar.onClick(taVar.b);
                break;
            case 6:
                ya yaVar = (ya) this.b;
                yaVar.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new ib(yaVar, 0)).start();
                break;
            case 7:
                ((oa) this.b).run();
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
                ((fc) this.b).B();
                break;
            case 10:
                di.u0.a((di.u0) this.b);
                break;
            case 11:
                ((p) this.b).run();
                break;
            case 12:
                u6 u6Var = ((t6) this.b).x;
                if (u6Var.r && (callback = u6Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 13:
                o9 o9Var = (o9) ((l9) this.b).h;
                if (o9Var != null) {
                    o9Var.run();
                    break;
                }
                break;
            case 14:
                ((qf) this.b).run();
                break;
            case 15:
                ((qf) this.b).run();
                break;
            case 16:
                ChatActivityEnterView.h(((ae) ((fi.p0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
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
                gi.k0.x(((gi.f0) this.b).r);
                break;
            case 21:
                hg.m mVar2 = (hg.m) this.b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                break;
            case 22:
                ((hg.w) this.b).run();
                break;
            case 23:
                ((hg.t0) this.b).K();
                break;
            case 24:
                f2 f2Var = (f2) this.b;
                LongSparseArray longSparseArray = f2Var.n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && f2Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!r3Var.r) {
                        f2Var.F(stickerSet, r3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        f2Var.e.a.h(r3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 25:
                ig.e eVar2 = (ig.e) this.b;
                q6 q6Var = eVar2.f;
                int i10 = eVar2.a;
                boolean z10 = eVar2.r;
                eVar2.r = !z10;
                eVar2.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                q6Var.a();
                q6Var.c(LocaleController.getString(eVar2.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
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
                    yc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 27:
                ((ii.c) this.b).dismiss();
                break;
            case 28:
                ji.r rVar = (ji.r) this.b;
                rVar.I(0, true, 0, false, 0L);
                cj0 cj0Var = rVar.O;
                if (cj0Var != null) {
                    cj0Var.h(true);
                    rVar.O = null;
                    break;
                }
                break;
            default:
                ji.t0 t0Var = (ji.t0) this.b;
                c3 c3Var = t0Var.h;
                if (c3Var != null && (aVar = t0Var.f) != null) {
                    v3 v3Var = c3Var.a;
                    v3Var.getClass();
                    if (v3.w3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        g2 g2Var = v3Var.J3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        v3Var.Y2.N(true);
                        g2 g2Var2 = v3Var.J3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
