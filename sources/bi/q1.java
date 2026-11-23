package bi;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.xz;
import org.telegram.ui.eu0;
import org.telegram.ui.ip;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0369  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        fj fjVar;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new s1(this.b, (Object) tLObject, this.c, this.d, (Object) tL_error, 0));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new s1((f9) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d));
                break;
            case 2:
                di.f6 f6Var = (di.f6) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
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
                                org.telegram.messenger.g0.g3(new aa.r(f6Var, t1Var, fjVar, 25));
                                break;
                            } else {
                                org.telegram.messenger.g0.g3(new di.u3(t1Var, 0));
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
                    org.telegram.messenger.g0.g3(new aa.r(f6Var2, bVar, tL_starGiftUnique, 21));
                    break;
                } else if (tL_error == null || !tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.g3(new aa.r(f6Var2, bVar, tL_error, 22));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.g3(new s2(f6Var2, bVar, Long.parseLong(tL_error.text.substring(26)), 3));
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.g0.g3(new ai.j((di.f6) this.b, tLObject, (TL_wallet.nftItem) this.c, (String) this.d, 11));
                break;
            case 5:
                org.telegram.messenger.g0.g3(new s1((di.y8) this.b, tL_error, (p10) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new s1((di.y8) this.b, tL_error, (p10) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 9));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new s1((di.y8) this.b, tL_error, (p10) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 3));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new ai.j((fi.r3) this.b, tLObject, (TL_stories.StoryItem) this.c, (w10) this.d, 16));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new s1(this.b, this.c, tLObject, this.d, (Object) tL_error, 14));
                break;
            case 10:
                org.telegram.messenger.g0.g3(new ai.j((kg.z) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 22));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new kg.x((kg.k0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 2));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new s1((kg.w1) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 18));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new ai.j((hi.e) this.b, tLObject, (org.telegram.ui.ActionBar.w2) this.c, (x3) this.d, 26));
                break;
            case 14:
                org.telegram.messenger.g0.g3(new ai.j((Object) tLObject, (boolean[]) this.b, this.d, this.c, 29));
                break;
            case 15:
                org.telegram.messenger.g0.g3(new oi.h(tLObject, (org.telegram.ui.ActionBar.k6) this.b, (org.telegram.ui.ActionBar.m6) this.c, (TLRPC.TL_theme) this.d, 4));
                break;
            case 16:
                org.telegram.messenger.g0.g3(new oi.h((mx) this.b, (org.telegram.ui.ActionBar.t1[]) this.c, tLObject, (h6.o) this.d, 27));
                break;
            case 17:
                org.telegram.messenger.g0.g3(new oi.h((ky) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d, 28));
                break;
            case 18:
                org.telegram.messenger.g0.g3(new fa((g00) this.b, (org.telegram.ui.ActionBar.g2) this.c, (ArrayList) this.d, 13));
                break;
            case 19:
                org.telegram.messenger.g0.g3(new xz(tL_error, (hi.e) this.b, (org.telegram.ui.p6) this.c, (Runnable) this.d, 5));
                break;
            case 20:
                org.telegram.messenger.g0.g3(new ip((jw0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d));
                break;
            case 21:
                org.telegram.messenger.g0.g3(new ip(this.b, (Object) tLObject, this.c, this.d, tL_error, 5));
                break;
            case 22:
                org.telegram.messenger.g0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 23:
                org.telegram.messenger.g0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.t1) this.d));
                break;
            case 24:
                org.telegram.messenger.g0.g3(new eu0(tL_error, (w10) this.b, tLObject, (mp) this.c, (w10) this.d, 14));
                break;
            case 25:
                org.telegram.messenger.g0.g3(new eu0(tLObject, (mp) this.b, (o2) this.c, (wg.e) this.d, tL_error));
                break;
            case 26:
                wg.u uVar = (wg.u) this.b;
                mp mpVar = (mp) this.c;
                wg.x xVar = (wg.x) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new v9.b(4, uVar, tL_error));
                    break;
                } else if (tLObject != null) {
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(new ug.u1(xVar, 6));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new eu0(tL_error, (w10) this.b, tLObject, (mp) this.c, (w10) this.d, 13));
                break;
        }
    }

    public /* synthetic */ q1(boolean[] zArr, org.telegram.ui.web.o oVar, TLRPC.UserFull userFull) {
        this.a = 14;
        this.b = zArr;
        this.d = oVar;
        this.c = userFull;
    }
}
