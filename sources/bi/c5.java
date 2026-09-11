package bi;

import android.view.KeyEvent;
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
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.h90;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c5(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f5) this.b, tLObject, (TL_stories.StoryItem) this.c, (Utilities.Callback) this.d, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new z2((di.ba) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 4));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((di.d) this.b, tLObject, (org.telegram.ui.ActionBar.f3) this.c, (fi.v1) this.d, 8));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (boolean[]) this.b, (org.telegram.ui.web.s) this.c, (TLRPC.UserFull) this.d, 11));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((ig.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 16));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new hg.t((ig.k0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 11));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new z2((ig.b2) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 9));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tLObject, (org.telegram.ui.ActionBar.h6) this.b, (org.telegram.ui.ActionBar.i6) this.c, (TLRPC.TL_theme) this.d, 0));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(this.b, this.c, tLObject, this.d, 20));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(this.b, this.c, tLObject, this.d, 21));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((c10) this.b, (org.telegram.ui.ActionBar.n2) this.c, (ArrayList) this.d, 16));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(tL_error, (di.d) this.b, (org.telegram.ui.ActionBar.f3) this.c, (Runnable) this.d, 28));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new z2((ux0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, 23));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new z2((gy0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 24));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.c0((org.telegram.ui.web.d1) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.c0((org.telegram.ui.web.d1) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new h90(tL_error, (Utilities.Callback) this.d, tLObject, (MessagesController) this.b, (Utilities.Callback) this.c, 25));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new h90(tL_error, (Utilities.Callback) this.b, tLObject, (MessagesController) this.c, (Utilities.Callback) this.d, 26));
                break;
            case 18:
                ug.w wVar = (ug.w) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                ug.z zVar = (ug.z) this.d;
                if (tL_error == null) {
                    if (tLObject != null) {
                        messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new sg.p0(zVar, 7));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new ug.r(0, wVar, tL_error));
                    break;
                }
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new h90(tLObject, (MessagesController) this.b, (r3) this.c, (ug.g) this.d, tL_error));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new h90(this.b, tLObject, this.c, this.d, tL_error, 28));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new h90((KeyEvent.Callback) this.b, tLObject, this.c, tL_error, (TLObject) this.d, 29));
                break;
            case 22:
                zh.w3.r0((zh.w3) this.b, (of.e) this.c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                break;
            case 23:
                zh.w3.e1((zh.w3) this.b, (TLRPC.TL_messageActionStarGift) this.c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new zh.u((zh.s5) this.b, tL_error, (Utilities.Callback2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new zh.u((zh.s5) this.b, tL_error, (Utilities.Callback2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 6));
                break;
            default:
                AndroidUtilities.runOnUIThread(new zh.u((zh.s5) this.b, tL_error, (Utilities.Callback2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 1));
                break;
        }
    }

    public /* synthetic */ c5(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2) {
        this.a = 16;
        this.d = callback;
        this.b = messagesController;
        this.c = callback2;
    }
}
