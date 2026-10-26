package bi;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.o01;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h2(fi.g9 g9Var, org.telegram.ui.ActionBar.e2 e2Var, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.a = 6;
        this.b = g9Var;
        this.d = e2Var;
        this.c = getgroupcallstreamrtmpurl;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                h7.Q((h7) this.b, (TLRPC.TL_messageActionStarGift) this.c, (org.telegram.ui.ActionBar.e2) this.d, tLObject);
                break;
            case 1:
                h7.L0((h7) this.b, (qf.c) this.c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new u0(this.b, tL_error, this.c, (Object) tLObject, (TLObject) this.d, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new u0(this.b, tL_error, this.c, (Object) tLObject, (TLObject) this.d, 6));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new u0(this.b, tL_error, this.c, (Object) tLObject, (TLObject) this.d, 1));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.e0((di.h4) this.b, tLObject, (TL_stories.StoryItem) this.c, (Utilities.Callback) this.d, 10));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new u0(this.b, (org.telegram.ui.ActionBar.e2) this.d, tLObject, (TLObject) this.c, (Object) tL_error, 12));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.e0((fi.d) this.b, tLObject, (org.telegram.ui.ActionBar.k3) this.c, (hi.y1) this.d, 16));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.e0(tLObject, (boolean[]) this.b, (org.telegram.ui.web.r) this.c, (TLRPC.UserFull) this.d, 19));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.e0((jg.z) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 24));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.k0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 28));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new u0((jg.c2) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 17));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new m4.v0(tLObject, (org.telegram.ui.ActionBar.w6) this.b, (org.telegram.ui.ActionBar.x6) this.c, (TLRPC.TL_theme) this.d, 7));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new m4.v0((my) this.b, (org.telegram.ui.ActionBar.e2[]) this.c, tLObject, (org.telegram.ui.ActionBar.e3) this.d, 27));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new m4.v0((lz) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d, 28));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new kg((n10) this.b, (org.telegram.ui.ActionBar.r2) this.c, (ArrayList) this.d, 8));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new e10(tL_error, (fi.d) this.b, (org.telegram.ui.s6) this.c, (Runnable) this.d, 5));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new i30((cz0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, 1));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new i30((nz0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 2));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.a1) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.e2) this.d));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new o01(tL_error, (Utilities.Callback) this.b, tLObject, (MessagesController) this.c, (Utilities.Callback) this.d, 9));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new o01(tL_error, (org.telegram.messenger.z) this.b, tLObject, (MessagesController) this.c, (org.telegram.messenger.l2) this.d, 10));
                break;
            case 23:
                vg.v vVar = (vg.v) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                vg.y yVar = (vg.y) this.d;
                if (tL_error == null) {
                    if (tLObject != null) {
                        messagesController.lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new ti.g(yVar, 7));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new sg.u(20, vVar, tL_error));
                    break;
                }
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new o01(tLObject, (MessagesController) this.b, (di.y2) this.c, (vg.g) this.d, tL_error, 11));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new o01((vg.n1) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new o01((zh.y4) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 13));
                break;
        }
    }

    public /* synthetic */ h2(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
