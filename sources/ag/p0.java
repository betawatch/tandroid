package ag;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.v41;
import org.telegram.ui.fp;
import org.telegram.ui.l90;
import org.telegram.ui.p6;
import rh.e4;
import rh.e6;
import rh.r4;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0189  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        kj kjVar;
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new q0(this.b, (Object) tLObject, this.c, this.d, 0));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new a3.l0((j1) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 5));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new e3((i3) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new e3(tL_error, (r20) this.b, tLObject, (wp) this.c, (r20) this.d, 5));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new e3(tLObject, (wp) this.b, (m2) this.c, (mg.k) this.d, tL_error, 6));
                break;
            case 5:
                mg.o0 o0Var = (mg.o0) this.b;
                wp wpVar = (wp) this.c;
                mg.s0 s0Var = (mg.s0) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new k2.u(24, o0Var, tL_error));
                    break;
                } else if (tLObject != null) {
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.i0.g3(new lg.s(s0Var, 6));
                    break;
                }
                break;
            case 6:
                org.telegram.messenger.i0.g3(new e3(tL_error, (org.telegram.messenger.j1) this.b, tLObject, (wp) this.c, (org.telegram.messenger.g3) this.d, 4));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new e3((mg.i2) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 7));
                break;
            case 8:
                org.telegram.messenger.i0.g3(new q0(tLObject, (r6) this.b, (s6) this.c, (TLRPC.TL_theme) this.d));
                break;
            case 9:
                org.telegram.messenger.i0.g3(new fp((rx) this.b, (org.telegram.ui.ActionBar.x1[]) this.c, tLObject, (l2.f) this.d, 9));
                break;
            case 10:
                org.telegram.messenger.i0.g3(new fp((py) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d, 10));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new jg((j00) this.b, (org.telegram.ui.ActionBar.k2) this.c, (ArrayList) this.d, 6));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new fp(tL_error, (vh.d) this.b, (p6) this.c, (Runnable) this.d, 17));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new e3((dx0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, 20));
                break;
            case 14:
                org.telegram.messenger.i0.g3(new e3((ox0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 21));
                break;
            case 15:
                org.telegram.messenger.i0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.z0) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 16:
                org.telegram.messenger.i0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.z0) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.x1) this.d));
                break;
            case 17:
                org.telegram.messenger.i0.g3(new l90((KeyEvent.Callback) this.b, tLObject, this.c, tL_error, (TLObject) this.d, 28));
                break;
            case 18:
                e4 e4Var = (e4) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.c;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    wp.r1(e4Var.a).V3(messages_messages.users, false);
                    wp.r1(e4Var.a).P3(messages_messages.chats, false);
                    for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                        TLRPC.Message message = messages_messages.messages.get(i10);
                        if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                            kjVar = new kj(e4Var.a, message, false, false);
                            kjVar.K5();
                            if (kjVar == null) {
                                org.telegram.messenger.i0.g3(new v41(e4Var, x1Var, kjVar, 26));
                                break;
                            } else {
                                org.telegram.messenger.i0.g3(new org.telegram.ui.ActionBar.n1(x1Var, 2));
                                break;
                            }
                        }
                    }
                }
                kjVar = null;
                if (kjVar == null) {
                }
                break;
            case 19:
                e4 e4Var2 = (e4) this.b;
                gf.e eVar = (gf.e) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    wp.r1(e4Var2.a).L3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.i0.g3(new v41(e4Var2, eVar, tL_starGiftUnique, 21));
                    break;
                } else if (tL_error == null || !tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                    if (tL_error != null) {
                        org.telegram.messenger.i0.g3(new v41(e4Var2, eVar, tL_error, false, 22));
                        break;
                    }
                } else {
                    org.telegram.messenger.i0.g3(new a3.i0(e4Var2, eVar, Long.parseLong(tL_error.text.substring(26)), 24));
                    break;
                }
                break;
            case 20:
                org.telegram.messenger.i0.g3(new r4((e6) this.b, tL_error, (k20) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 3));
                break;
            case 21:
                org.telegram.messenger.i0.g3(new r4((e6) this.b, tL_error, (ih.s) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                break;
            case 22:
                org.telegram.messenger.i0.g3(new r4((e6) this.b, tL_error, (q70) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 0));
                break;
            case 23:
                org.telegram.messenger.i0.g3(new org.telegram.ui.ox0((th.u2) this.b, tLObject, (TL_stories.StoryItem) this.c, (r20) this.d, 22));
                break;
            case 24:
                org.telegram.messenger.i0.g3(new r4((vh.r6) this.b, (org.telegram.ui.ActionBar.x1) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error));
                break;
            case 25:
                org.telegram.messenger.i0.g3(new org.telegram.ui.ox0((vh.d) this.b, tLObject, (org.telegram.ui.ActionBar.z2) this.c, (xh.h1) this.d, 28));
                break;
            default:
                org.telegram.messenger.i0.g3(new xh.p2(tLObject, (boolean[]) this.b, (org.telegram.ui.web.o) this.c, (TLRPC.UserFull) this.d, 1));
                break;
        }
    }
}
