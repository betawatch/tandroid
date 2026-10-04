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
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yf;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        ii.o4 o4Var;
        switch (this.a) {
            case 0:
                ((r3) this.b).q(!r8.f0, true);
                break;
            case 1:
                ((jc) this.b).N();
                break;
            case 2:
                ((x7) this.b).dismiss();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.showDialog(new rg.y0(R, 14, false));
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
                ((ci.ac) this.b).B();
                break;
            case 9:
                ci.u0.a((ci.u0) this.b);
                break;
            case 10:
                ((s1) this.b).run();
                break;
            case 11:
                ci.u6 u6Var = ((ci.t6) this.b).x;
                if (u6Var.r && (callback = u6Var.f) != null) {
                    callback.run(5);
                    break;
                }
                break;
            case 12:
                ci.l9 l9Var = (ci.l9) ((ci.i9) this.b).h;
                if (l9Var != null) {
                    l9Var.run();
                    break;
                }
                break;
            case 13:
                ((yf) this.b).run();
                break;
            case 14:
                ((yf) this.b).run();
                break;
            case 15:
                ChatActivityEnterView.h(((ce) ((ei.q0) this.b).d).a, (TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 16:
                ((h5) this.b).run();
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
                ((fi.e0) this.b).h.d.E(0);
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
                hg.e eVar2 = (hg.e) this.b;
                org.telegram.ui.Components.p6 p6Var = eVar2.f;
                int i10 = eVar2.a;
                boolean z10 = eVar2.r;
                eVar2.r = !z10;
                eVar2.h.c(LocaleController.getString(!z10 ? R.string.BizBotStart : R.string.BizBotStop), true, true);
                p6Var.a();
                p6Var.c(LocaleController.getString(eVar2.r ? R.string.BizBotStatusStopped : R.string.BizBotStatusManages), true, true);
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
            case 25:
                TL_account.TL_businessChatLink tL_businessChatLink = ((hg.t) this.b).f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    yc.a0(LaunchActivity.R()).k(false).j();
                    break;
                }
                break;
            case 26:
                ((hi.c) this.b).dismiss();
                break;
            case 27:
                ii.r rVar = (ii.r) this.b;
                rVar.G(0, true, 0, false, 0L);
                zi0 zi0Var = rVar.O;
                if (zi0Var != null) {
                    zi0Var.h(true);
                    rVar.O = null;
                    break;
                }
                break;
            case 28:
                ii.u0 u0Var = (ii.u0) this.b;
                ii.e3 e3Var = u0Var.h;
                if (e3Var != null && (aVar = u0Var.f) != null) {
                    ii.x3 x3Var = e3Var.a;
                    x3Var.getClass();
                    if (ii.x3.z3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        ii.i2 i2Var = x3Var.Q3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        x3Var.f3.N(true);
                        ii.i2 i2Var2 = x3Var.Q3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                            break;
                        }
                    }
                }
                break;
            default:
                ii.q4 q4Var = (ii.q4) this.b;
                ii.a aVar2 = q4Var.a;
                if (aVar2 != null && (o4Var = q4Var.G) != null) {
                    ((ii.t3) o4Var).a.o3.D(aVar2);
                    break;
                }
                break;
        }
    }
}
