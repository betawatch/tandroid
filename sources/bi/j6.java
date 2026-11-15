package bi;

import android.widget.TextView;
import di.v8;
import hi.l8;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.ou;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.yf;
import org.telegram.ui.Components.zz;
import org.telegram.ui.cu0;
import org.telegram.ui.hp;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j6(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x036e  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gj gjVar;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.b((u6) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 1));
                break;
            case 1:
                di.c6 c6Var = (di.c6) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    np.s1(c6Var.a).Y3(messages_messages.users, false);
                    np.s1(c6Var.a).S3(messages_messages.chats, false);
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                            gjVar = new gj(c6Var.a, message, false, false);
                            gjVar.L5();
                            if (gjVar == null) {
                                org.telegram.messenger.g0.h3(new aa.r(c6Var, t1Var, gjVar, 20));
                                break;
                            } else {
                                org.telegram.messenger.g0.h3(new di.s3(t1Var, 0));
                                break;
                            }
                        }
                    }
                }
                gjVar = null;
                if (gjVar == null) {
                }
                break;
            case 2:
                di.c6 c6Var2 = (di.c6) this.b;
                vf.b bVar = (vf.b) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    np.s1(c6Var2.a).O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new aa.r(c6Var2, bVar, tL_starGiftUnique, 15));
                    break;
                } else if (tL_error == null || !tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new aa.r(c6Var2, bVar, tL_error, 16));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new m1(c6Var2, bVar, Long.parseLong(tL_error.text.substring(26)), 2));
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ai.b((v8) this.b, tL_error, (s10) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new ai.b((v8) this.b, tL_error, (org.telegram.ui.Wallet.t1) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 9));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new ai.b((v8) this.b, tL_error, (v5) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 3));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new androidx.car.app.utils.a((fi.t3) this.b, tLObject, (TL_stories.StoryItem) this.c, (z10) this.d, 12));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new ai.b((l8) this.b, (org.telegram.ui.ActionBar.t1) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 14));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new androidx.car.app.utils.a((kg.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 18));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new fi.s5(this.b, this.c, this.d, 26));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new ai.b((kg.v1) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 18));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new androidx.car.app.utils.a((hi.d) this.b, tLObject, (org.telegram.ui.ActionBar.u2) this.c, (ki.p1) this.d, 21));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new androidx.car.app.utils.a(tLObject, (boolean[]) this.b, (org.telegram.ui.web.o) this.c, (TLRPC.UserFull) this.d, 24));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new androidx.car.app.utils.a(tLObject, (org.telegram.ui.ActionBar.g6) this.b, (org.telegram.ui.ActionBar.i6) this.c, (TLRPC.TL_theme) this.d, 29));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((ix) this.b, (org.telegram.ui.ActionBar.t1[]) this.c, tLObject, (ou) this.d, 22));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((fy) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d, 23));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new yf((zz) this.b, (org.telegram.ui.ActionBar.e2) this.c, (ArrayList) this.d, 8));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new ma0(tL_error, (hi.d) this.b, (org.telegram.ui.p6) this.c, (Runnable) this.d, 0));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new hp((bw0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new hp(this.b, (Object) tLObject, this.c, this.d, tL_error, 5));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.t1) this.d));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new cu0(tL_error, (z10) this.b, tLObject, (np) this.c, (z10) this.d, 14));
                break;
            case 23:
                org.telegram.messenger.g0.h3(new cu0(tLObject, (np) this.b, (o1) this.c, (wg.e) this.d, tL_error));
                break;
            case 24:
                wg.t tVar = (wg.t) this.b;
                np npVar = (np) this.c;
                wg.w wVar = (wg.w) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new ug.t1(6, tVar, tL_error));
                    break;
                } else if (tLObject != null) {
                    npVar.O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new vg.o(wVar, 3));
                    break;
                }
                break;
            case 25:
                org.telegram.messenger.g0.h3(new cu0(tL_error, (z10) this.b, tLObject, (np) this.c, (z10) this.d, 13));
                break;
            default:
                org.telegram.messenger.g0.h3(new cu0((wg.c1) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 16));
                break;
        }
    }
}
