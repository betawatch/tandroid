package ai;

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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t5(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5((w5) this.b, tLObject, (TL_stories.StoryItem) this.c, (Utilities.Callback) this.d, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new n3((ci.y9) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new i5((ci.d) this.b, tLObject, (org.telegram.ui.ActionBar.f3) this.c, (ei.v1) this.d, 7));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new i5(tLObject, (boolean[]) this.b, (org.telegram.ui.web.q) this.c, (TLRPC.UserFull) this.d));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new i5((hg.z) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 15));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new gg.t((hg.l0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 9));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new n3((hg.c2) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tLObject, (org.telegram.ui.ActionBar.g6) this.b, (org.telegram.ui.ActionBar.h6) this.c, (TLRPC.TL_theme) this.d, 1));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((vy) this.b, (org.telegram.ui.ActionBar.b2[]) this.c, tLObject, (org.telegram.ui.ActionBar.a3) this.d, 21));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((tz) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d, 22));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((s10) this.b, (org.telegram.ui.ActionBar.n2) this.c, (ArrayList) this.d, 21));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tL_error, (ci.d) this.b, (org.telegram.ui.ActionBar.f3) this.c, (Runnable) this.d, 29));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new n3((xy0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, 23));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new n3((iz0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 24));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.b, (Utilities.Callback) this.c, 1));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(tL_error, (org.telegram.messenger.w) this.b, tLObject, (MessagesController) this.c, (org.telegram.messenger.g2) this.d, 2));
                break;
            case 18:
                tg.v vVar = (tg.v) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                tg.y yVar = (tg.y) this.d;
                if (tL_error == null) {
                    if (tLObject != null) {
                        messagesController.lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new rg.x1(yVar, 8));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.w1(23, vVar, tL_error));
                    break;
                }
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(tLObject, (MessagesController) this.b, (f4) this.c, (tg.f) this.d, tL_error, 3));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((tg.m1) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 4));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((xh.z4) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 5));
                break;
            case 22:
                yh.s3.r0((yh.s3) this.b, (of.e) this.c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                break;
            case 23:
                yh.s3.f1((yh.s3) this.b, (TLRPC.TL_messageActionStarGift) this.c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((yh.m5) this.b, tL_error, (f90) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 8));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((yh.m5) this.b, tL_error, (Utilities.Callback2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6((yh.m5) this.b, tL_error, (qh.r) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 7));
                break;
        }
    }

    public /* synthetic */ t5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.a = 16;
        this.d = callback;
        this.b = messagesController;
        this.c = callback2;
    }
}
