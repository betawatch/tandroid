package ai;

import android.util.LongSparseArray;
import android.view.View;
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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.yd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj0;
import org.telegram.ui.qf;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        ii.a aVar;
        ii.m4 m4Var;
        switch (this.a) {
            case 0:
                ((r3) this.b).q(!r8.f0, true);
                break;
            case 1:
                ((jc) this.b).N();
                break;
            case 2:
                ((w7) this.b).dismiss();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.x0(R, 14, false));
                    break;
                }
                break;
            case 3:
                mb mbVar = (mb) this.b;
                mbVar.onClick(mbVar.b);
                break;
            case 4:
                sb sbVar = (sb) this.b;
                sbVar.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new cc(sbVar, 0)).start();
                break;
            case 5:
                ((androidx.mediarouter.app.h) this.b).dismiss();
                break;
            case 6:
                ((androidx.fragment.app.a0) this.b).run();
                break;
            case 7:
                ci.m mVar = (ci.m) this.b;
                ci.g gVar = mVar.f;
                gVar.d();
                gVar.k(true);
                ci.e eVar = mVar.c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                break;
            case 8:
                ((ci.ec) this.b).B();
                break;
            case 9:
                ci.u0.a((ci.u0) this.b);
                break;
            case 10:
                ((s1) this.b).run();
                break;
            case 11:
                ci.v6 v6Var = ((ci.u6) this.b).x;
                if (v6Var.r && (callback = v6Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 12:
                ci.p9 p9Var = (ci.p9) ((ci.m9) this.b).h;
                if (p9Var != null) {
                    p9Var.run();
                    break;
                }
                break;
            case 13:
                ((qf) this.b).run();
                break;
            case 14:
                ((qf) this.b).run();
                break;
            case 15:
                ChatActivityEnterView.h(((yd) ((ei.p0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 16:
                ((i5) this.b).run();
                break;
            case 17:
                fi.p pVar = (fi.p) this.b;
                TLRPC.Chat chat = pVar.H;
                if (chat != null && !chat.title.equals(((fi.o) pVar.n.b).getText().toString())) {
                    pVar.getMessagesController().changeChatTitle(pVar.H.id, ((fi.o) pVar.n.b).getText().toString(), new fi.h(pVar, 1));
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
            case 18:
                ((fi.e0) this.b).h.d.D(0);
                break;
            case 19:
                fi.k0.x(((fi.f0) this.b).r);
                break;
            case 20:
                gg.m mVar2 = (gg.m) this.b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                break;
            case 21:
                ((gg.w) this.b).run();
                break;
            case 22:
                ((gg.t0) this.b).K();
                break;
            case 23:
                gg.g2 g2Var = (gg.g2) this.b;
                LongSparseArray longSparseArray = g2Var.n;
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                if (stickerSet != null && g2Var.h.indexOfKey(stickerSet.set.id) < 0 && longSparseArray.indexOfKey(stickerSet.set.id) < 0) {
                    if (!s3Var.r) {
                        g2Var.F(stickerSet, s3Var);
                        break;
                    } else {
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        g2Var.e.a.h(s3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 24:
                hg.f fVar = (hg.f) this.b;
                org.telegram.ui.Components.n6 n6Var = fVar.f;
                int i10 = fVar.a;
                boolean z10 = fVar.r;
                fVar.r = !z10;
                fVar.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                n6Var.a();
                n6Var.c(LocaleController.getString(fVar.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
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
            case 25:
                TL_account.TL_businessChatLink tL_businessChatLink = ((hg.v) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    vc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 26:
                ((hi.c) this.b).dismiss();
                break;
            case 27:
                ii.r rVar = (ii.r) this.b;
                rVar.I(0, true, 0, false, 0L);
                bj0 bj0Var = rVar.O;
                if (bj0Var != null) {
                    bj0Var.h(true);
                    rVar.O = null;
                    break;
                }
                break;
            case 28:
                ii.u0 u0Var = (ii.u0) this.b;
                ii.d3 d3Var = u0Var.h;
                if (d3Var != null && (aVar = u0Var.f) != null) {
                    ii.w3 w3Var = d3Var.a;
                    w3Var.getClass();
                    if (ii.w3.x3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        ii.h2 h2Var = w3Var.J3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        w3Var.Y2.N(true);
                        ii.h2 h2Var2 = w3Var.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                            break;
                        }
                    }
                }
                break;
            default:
                ii.o4 o4Var = (ii.o4) this.b;
                ii.a aVar2 = o4Var.a;
                if (aVar2 != null && (m4Var = o4Var.G) != null) {
                    ((ii.s3) m4Var).a.h3.q(aVar2);
                    break;
                }
                break;
        }
    }
}
