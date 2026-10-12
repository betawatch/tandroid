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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.ty0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class e5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e5(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((h5) this.b, tLObject, (TL_stories.StoryItem) this.c, (Utilities.Callback) this.d, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new c3((di.x9) this.b, (org.telegram.ui.ActionBar.a2) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((di.d) this.b, tLObject, (org.telegram.ui.ActionBar.e3) this.c, (fi.u1) this.d, 7));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (boolean[]) this.b, (org.telegram.ui.web.q) this.c, (TLRPC.UserFull) this.d, 10));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((ig.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 15));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new hg.t((ig.k0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 12));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new c3((ig.b2) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (org.telegram.ui.ActionBar.e6) this.b, (org.telegram.ui.ActionBar.f6) this.c, (TLRPC.TL_theme) this.d, 29));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6((ry) this.b, (org.telegram.ui.ActionBar.a2[]) this.c, tLObject, (org.telegram.ui.ActionBar.z2) this.d, 19));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6((pz) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d, 20));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new n2.h((o10) this.b, (org.telegram.ui.ActionBar.m2) this.c, (ArrayList) this.d, 25));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6(tL_error, (di.d) this.b, (org.telegram.ui.ActionBar.e3) this.c, (Runnable) this.d, 27));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new c3((ty0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, 23));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new c3((ez0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 24));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.b1) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.a2) this.d));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p6(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.b, (Utilities.Callback) this.c, 1));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p6(tL_error, (org.telegram.messenger.x) this.b, tLObject, (MessagesController) this.c, (org.telegram.messenger.j2) this.d, 2));
                break;
            case 18:
                ug.v vVar = (ug.v) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                ug.y yVar = (ug.y) this.d;
                if (tL_error == null) {
                    if (tLObject != null) {
                        messagesController.lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new rh.j(yVar, 14));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new s9.b(11, vVar, tL_error));
                    break;
                }
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p6(tLObject, (MessagesController) this.b, (u3) this.c, (ug.g) this.d, tL_error, 3));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p6((ug.m1) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 4));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p6((yh.x4) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 5));
                break;
            case 22:
                zh.r3.r0((zh.r3) this.b, (pf.c) this.c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                break;
            case 23:
                zh.r3.f1((zh.r3) this.b, (TLRPC.TL_messageActionStarGift) this.c, (org.telegram.ui.ActionBar.a2) this.d, tLObject);
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p6((zh.n5) this.b, tL_error, (d90) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 8));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p6((zh.n5) this.b, tL_error, (Utilities.Callback2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.p6((zh.n5) this.b, tL_error, (rh.s) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 7));
                break;
        }
    }

    public /* synthetic */ e5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.a = 16;
        this.d = callback;
        this.b = messagesController;
        this.c = callback2;
    }
}
