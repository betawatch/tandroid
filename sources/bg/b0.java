package bg;

import android.widget.TextView;
import fh.u6;
import gh.k5;
import ih.b4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.rx;
import org.telegram.ui.hr;
import org.telegram.ui.ir0;
import org.telegram.ui.k6;
import org.telegram.ui.rx0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(b4 b4Var, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
        this.a = 11;
        this.d = b4Var;
        this.b = storyItem;
        this.c = callback;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(tL_error, (Utilities.Callback) this.c, tLObject, (MessagesController) this.b, (Utilities.Callback) this.d, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new o0(tL_error, (Utilities.Callback) this.c, tLObject, (MessagesController) this.b, (Utilities.Callback) this.d, 1));
                break;
            case 2:
                z0 z0Var = (z0) this.c;
                MessagesController messagesController = (MessagesController) this.b;
                d1 d1Var = (d1) this.d;
                if (tL_error == null) {
                    if (tLObject != null) {
                        messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new af.e(d1Var, 9));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new a1.e(11, z0Var, tL_error));
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new o0(tLObject, (MessagesController) this.b, (j1) this.c, (p) this.d, tL_error));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new o0((g3) this.c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.b, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new o0((u6) this.c, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.d, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.b));
                break;
            case 6:
                k5.p0((k5) this.c, (ve.d) this.d, (TL_stars.TL_starGiftUnique) this.b, tLObject, tL_error);
                break;
            case 7:
                k5.e1((k5) this.c, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.c2) this.b, tLObject);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new o0(this.c, tL_error, this.d, (Object) tLObject, (TLObject) this.b, 7));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new o0(this.c, tL_error, this.d, (Object) tLObject, (TLObject) this.b, 11));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new o0(this.c, tL_error, this.d, (Object) tLObject, (TLObject) this.b, 6));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((b4) this.d, tLObject, (TL_stories.StoryItem) this.b, (Utilities.Callback) this.c, 10));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new o0(this.c, this.d, (Object) tLObject, this.b, tL_error, 17));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((kh.d) this.c, tLObject, (org.telegram.ui.ActionBar.f3) this.d, (mh.r1) this.b, 17));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tLObject, (boolean[]) this.c, (org.telegram.ui.web.r) this.d, (TLRPC.UserFull) this.b, 20));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tLObject, (d6) this.c, (e6) this.d, (TLRPC.TL_theme) this.b, 29));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new k6((rx) this.c, (org.telegram.ui.ActionBar.c2[]) this.d, tLObject, (org.telegram.ui.ActionBar.a3) this.b, 19));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new k6((py) this.c, (TLRPC.TL_messages_getStickers) this.d, tLObject, (Runnable) this.b, 20));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((n00) this.c, (org.telegram.ui.ActionBar.o2) this.d, (ArrayList) this.b, 21));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new k6(tL_error, (kh.d) this.c, (org.telegram.ui.ActionBar.f3) this.d, (Runnable) this.b, 27));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new hr((cx0) this.c, (String) this.d, tL_error, tLObject, (TextView) this.b, 2));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new hr((ox0) this.c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.b, tL_error, 3));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.web.y0) this.c, tLObject, (String) this.d, (String) this.b, 20));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y((org.telegram.ui.web.y0) this.c, tL_error, (String) this.d, (TLRPC.TL_inputInvoiceSlug) this.b, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y((org.telegram.ui.web.y0) this.c, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.c2) this.b));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new ir0((pf.u) this.c, tLObject, (TL_account.TL_businessChatLink) this.d, (Runnable) this.b, 21));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new pf.a(this.c, this.d, this.b, 4));
                break;
            default:
                AndroidUtilities.runOnUIThread(new rx0((pf.r1) this.c, tLObject, (ArrayList) this.d, (TLRPC.TL_messages_sendQuickReplyMessages) this.b, tL_error, 6));
                break;
        }
    }

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ b0(MessagesController messagesController, j1 j1Var, p pVar) {
        this.a = 3;
        this.b = messagesController;
        this.c = j1Var;
        this.d = pVar;
    }

    public /* synthetic */ b0(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2, int i9) {
        this.a = i9;
        this.c = callback;
        this.b = messagesController;
        this.d = callback2;
    }
}
