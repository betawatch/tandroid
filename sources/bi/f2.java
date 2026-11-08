package bi;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.wz;
import org.telegram.ui.c01;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f2(fi.n8 n8Var, org.telegram.ui.ActionBar.u1 u1Var, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.a = 6;
        this.b = n8Var;
        this.d = u1Var;
        this.c = getgroupcallstreamrtmpurl;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0390  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ij ijVar;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    qp.s1(k7Var.a).Y3(messages_messages.users, false);
                    qp.s1(k7Var.a).S3(messages_messages.chats, false);
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                            ijVar = new ij(k7Var.a, message, false, false);
                            ijVar.M5();
                            if (ijVar == null) {
                                org.telegram.messenger.g0.h3(new aa.s(k7Var, u1Var, ijVar, 14));
                                break;
                            } else {
                                org.telegram.messenger.g0.h3(new r4(u1Var, 0));
                                break;
                            }
                        }
                    }
                }
                ijVar = null;
                if (ijVar == null) {
                }
                break;
            case 1:
                k7 k7Var2 = (k7) this.b;
                vf.b bVar = (vf.b) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    qp.s1(k7Var2.a).O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new aa.s(k7Var2, bVar, tL_starGiftUnique, 9));
                    break;
                } else if (tL_error == null || !tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new aa.s(k7Var2, bVar, tL_error, 10));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new d3(k7Var2, bVar, Long.parseLong(tL_error.text.substring(26)), 0));
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.g0.h3(new u0(this.b, tL_error, this.c, (Object) tLObject, (TLObject) this.d, 4));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new u0(this.b, tL_error, this.c, (Object) tLObject, (TLObject) this.d, 7));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new u0(this.b, tL_error, this.c, (Object) tLObject, (TLObject) this.d, 1));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new ai.d0((di.z3) this.b, tLObject, (TL_stories.StoryItem) this.c, (c20) this.d, 11));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new u0(this.b, (org.telegram.ui.ActionBar.u1) this.d, tLObject, (TLObject) this.c, (Object) tL_error, 12));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new ai.d0((fi.d) this.b, tLObject, (org.telegram.ui.ActionBar.v2) this.c, (hi.o1) this.d, 17));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new ai.d0(tLObject, (boolean[]) this.b, (org.telegram.ui.web.n) this.c, (TLRPC.UserFull) this.d, 20));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new ai.d0((kg.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 21));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new fi.x1((kg.i0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 26));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new u0((kg.t1) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 16));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new ai.d0(tLObject, (org.telegram.ui.ActionBar.h6) this.b, (org.telegram.ui.ActionBar.j6) this.c, (TLRPC.TL_theme) this.d, 28));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6((dx) this.b, (org.telegram.ui.ActionBar.u1[]) this.c, tLObject, (h9.f1) this.d, 19));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6((ay) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d, 20));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new ng((wz) this.b, (org.telegram.ui.ActionBar.f2) this.c, (ArrayList) this.d, 6));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6(tL_error, (fi.d) this.b, (org.telegram.ui.p6) this.c, (Runnable) this.d, 27));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new jv0(this.b, this.c, (Object) tL_error, (Object) tLObject, this.d, 0));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new jv0(this.b, this.c, tL_error, tLObject, this.d, 1));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.x((org.telegram.ui.web.x0) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.x((org.telegram.ui.web.x0) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.u1) this.d));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new c01(tL_error, (c20) this.b, tLObject, (qp) this.c, (c20) this.d, 10));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new c01(tLObject, (qp) this.b, (di.s2) this.c, (wg.e) this.d, tL_error, 11));
                break;
            case 23:
                wg.v vVar = (wg.v) this.b;
                qp qpVar = (qp) this.c;
                wg.y yVar = (wg.y) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new u9.f(16, vVar, tL_error));
                    break;
                } else if (tLObject != null) {
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new sg.t0(yVar, 29));
                    break;
                }
                break;
            case 24:
                org.telegram.messenger.g0.h3(new c01(tL_error, (org.telegram.messenger.g1) this.b, tLObject, (qp) this.c, (org.telegram.messenger.d3) this.d, 9));
                break;
            case 25:
                org.telegram.messenger.g0.h3(new c01((wg.f1) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 12));
                break;
            default:
                org.telegram.messenger.g0.h3(new c01((zh.a4) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 13));
                break;
        }
    }

    public /* synthetic */ f2(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
