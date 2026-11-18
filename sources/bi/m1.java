package bi;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.nx;
import org.telegram.ui.wn;
import org.telegram.ui.wt0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m1(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035d  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        fj fjVar;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.b((a2) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 1));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new ai.b((a9) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 2));
                break;
            case 2:
                di.f6 f6Var = (di.f6) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    mp.u1(f6Var.a).f4(messages_messages.users, false);
                    mp.u1(f6Var.a).Z3(messages_messages.chats, false);
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                            fjVar = new fj(f6Var.a, message, false, false);
                            fjVar.L5();
                            if (fjVar == null) {
                                org.telegram.messenger.g0.g3(new aa.r(f6Var, u1Var, fjVar, 24));
                                break;
                            } else {
                                org.telegram.messenger.g0.g3(new di.u3(u1Var, 0));
                                break;
                            }
                        }
                    }
                }
                fjVar = null;
                if (fjVar == null) {
                }
                break;
            case 3:
                di.f6 f6Var2 = (di.f6) this.b;
                vf.b bVar = (vf.b) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    mp.u1(f6Var2.a).V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(new aa.r(f6Var2, bVar, tL_starGiftUnique, 20));
                    break;
                } else if (tL_error == null || !tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.g3(new aa.r(f6Var2, bVar, tL_error, 21));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.g3(new m2(f6Var2, bVar, Long.parseLong(tL_error.text.substring(26)), 3));
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.g3(new ai.s((di.f6) this.b, tLObject, (TL_wallet.nftItem) this.c, (String) this.d));
                break;
            case 5:
                org.telegram.messenger.g0.g3(new ai.b((di.x8) this.b, tL_error, (q10) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 7));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new ai.b((di.x8) this.b, tL_error, (org.telegram.ui.Wallet.e0) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 10));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new ai.b((di.x8) this.b, tL_error, (c8) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 4));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new ai.s((fi.r3) this.b, tLObject, (TL_stories.StoryItem) this.c, (x10) this.d, 15));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new ai.b((hi.l8) this.b, (org.telegram.ui.ActionBar.u1) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 15));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new ai.s((kg.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 21));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new kg.i0((kg.l0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 0));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new ai.b((kg.w1) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 19));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new ai.s((hi.d) this.b, tLObject, (org.telegram.ui.ActionBar.x2) this.c, (r3) this.d, 25));
                break;
            case 14:
                org.telegram.messenger.g0.g3(new ai.s(tLObject, (boolean[]) this.b, (org.telegram.ui.web.o) this.d, (TLRPC.UserFull) this.c, 28));
                break;
            case 15:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i(tLObject, (org.telegram.ui.ActionBar.k6) this.b, (org.telegram.ui.ActionBar.m6) this.c, (TLRPC.TL_theme) this.d, 3));
                break;
            case 16:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((nx) this.b, (org.telegram.ui.ActionBar.u1[]) this.c, tLObject, (hi.w4) this.d, 26));
                break;
            case 17:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((ly) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d));
                break;
            case 18:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.k7((g00) this.b, (org.telegram.ui.ActionBar.h2) this.c, (ArrayList) this.d, 11));
                break;
            case 19:
                org.telegram.messenger.g0.g3(new n20(tL_error, (hi.d) this.b, (org.telegram.ui.o6) this.c, (Runnable) this.d));
                break;
            case 20:
                org.telegram.messenger.g0.g3(new wn((iw0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, 5));
                break;
            case 21:
                org.telegram.messenger.g0.g3(new wn(this.b, tLObject, this.c, this.d, tL_error, 6));
                break;
            case 22:
                org.telegram.messenger.g0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 23:
                org.telegram.messenger.g0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.u1) this.d));
                break;
            case 24:
                org.telegram.messenger.g0.g3(new wt0(tL_error, (x10) this.b, tLObject, (mp) this.c, (x10) this.d, 15));
                break;
            case 25:
                org.telegram.messenger.g0.g3(new wt0(tLObject, (mp) this.b, (i2) this.c, (wg.e) this.d, tL_error, 16));
                break;
            case 26:
                wg.v vVar = (wg.v) this.b;
                mp mpVar = (mp) this.c;
                wg.y yVar = (wg.y) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new p4.o0(28, vVar, tL_error));
                    break;
                } else if (tLObject != null) {
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(new v4.p(yVar, 5));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new wt0(tL_error, (org.telegram.messenger.g1) this.b, tLObject, (mp) this.c, (org.telegram.messenger.e3) this.d, 14));
                break;
        }
    }

    public /* synthetic */ m1(boolean[] zArr, org.telegram.ui.web.o oVar, TLRPC.UserFull userFull) {
        this.a = 14;
        this.b = zArr;
        this.d = oVar;
        this.c = userFull;
    }
}
