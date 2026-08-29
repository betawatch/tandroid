package eg;

import android.widget.TextView;
import ih.e6;
import java.util.ArrayList;
import jh.h5;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zx;
import org.telegram.ui.Components.zx0;
import org.telegram.ui.a01;
import org.telegram.ui.gg;
import org.telegram.ui.lx0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) this.c, tLObject, (MessagesController) this.b, (Utilities.Callback) this.d, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) this.c, tLObject, (MessagesController) this.b, (Utilities.Callback) this.d, 1));
                break;
            case 2:
                u0 u0Var = (u0) this.c;
                MessagesController messagesController = (MessagesController) this.b;
                y0 y0Var = (y0) this.d;
                if (tL_error == null) {
                    if (tLObject != null) {
                        messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new cg.m2(y0Var, 8));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new ef.c(4, u0Var, tL_error));
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new k0(tLObject, (MessagesController) this.b, (d1) this.c, (m) this.d, tL_error));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new k0((w2) this.c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.b, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new k0((e6) this.c, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.d, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.b));
                break;
            case 6:
                h5.q0((h5) this.c, (ye.c) this.d, (TL_stars.TL_starGiftUnique) this.b, tLObject, tL_error);
                break;
            case 7:
                h5.e1((h5) this.c, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.c2) this.b, tLObject);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new k0(this.c, tL_error, this.d, (Object) tLObject, (TLObject) this.b, 7));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new k0(this.c, tL_error, this.d, (Object) tLObject, (TLObject) this.b, 11));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new k0(this.c, tL_error, this.d, (Object) tLObject, (TLObject) this.b, 6));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((w3) this.d, tLObject, (TL_stories.StoryItem) this.b, (Utilities.Callback) this.c, 13));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new k0(this.c, this.d, (Object) tLObject, this.b, tL_error, 17));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tLObject, (org.telegram.ui.ActionBar.e6) this.c, (f6) this.d, (TLRPC.TL_theme) this.b, 23));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new gg((zx) this.c, (org.telegram.ui.ActionBar.c2[]) this.d, tLObject, (a3) this.b, 13));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new gg((yy) this.c, (TLRPC.TL_messages_getStickers) this.d, tLObject, (Runnable) this.b, 14));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g((y00) this.c, (org.telegram.ui.ActionBar.o2) this.d, (ArrayList) this.b, 10));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new gg(tL_error, (nh.d) this.c, (f3) this.d, (Runnable) this.b, 21));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new u20((nx0) this.c, (String) this.d, tL_error, tLObject, (TextView) this.b, 1));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new u20((zx0) this.c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.b, tL_error, 2));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new lx0((org.telegram.ui.web.z0) this.c, tLObject, (String) this.d, (String) this.b, 14));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.z0) this.c, tL_error, (String) this.d, (TLRPC.TL_inputInvoiceSlug) this.b, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.z0) this.c, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.c2) this.b));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new lx0((nh.d) this.c, tLObject, (f3) this.d, (ph.j1) this.b, 15));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new lx0(tLObject, (boolean[]) this.c, (org.telegram.ui.web.s) this.d, (TLRPC.UserFull) this.b));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new lx0((sf.u) this.c, tLObject, (TL_account.TL_businessChatLink) this.d, (Runnable) this.b, 23));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new sf.a(this.c, this.d, this.b, 4));
                break;
            default:
                AndroidUtilities.runOnUIThread(new a01((sf.s1) this.c, tLObject, (ArrayList) this.d, (TLRPC.TL_messages_sendQuickReplyMessages) this.b, tL_error, 6));
                break;
        }
    }

    public /* synthetic */ z(w3 w3Var, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
        this.a = 11;
        this.d = w3Var;
        this.b = storyItem;
        this.c = callback;
    }

    public /* synthetic */ z(MessagesController messagesController, d1 d1Var, m mVar) {
        this.a = 3;
        this.b = messagesController;
        this.c = d1Var;
        this.d = mVar;
    }

    public /* synthetic */ z(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = messagesController;
        this.d = callback2;
    }
}
