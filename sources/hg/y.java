package hg;

import java.util.ArrayList;
import lh.e6;
import mh.g5;
import oh.y3;
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
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.dy0;
import org.telegram.ui.ih;
import org.telegram.ui.y61;
import qh.w7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(tL_error, (Utilities.Callback) this.c, tLObject, (MessagesController) this.b, (Utilities.Callback) this.d, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new j0(tL_error, (Utilities.Callback) this.c, tLObject, (MessagesController) this.b, (Utilities.Callback) this.d, 1));
                break;
            case 2:
                t0 t0Var = (t0) this.c;
                MessagesController messagesController = (MessagesController) this.b;
                x0 x0Var = (x0) this.d;
                if (tL_error == null) {
                    if (tLObject != null) {
                        messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new eh.m(x0Var, 12));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new gf.c(6, t0Var, tL_error));
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new j0(tLObject, (MessagesController) this.b, (c1) this.c, (m) this.d, tL_error));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new j0((v2) this.c, tLObject, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.b, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new j0((e6) this.c, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.d, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.b));
                break;
            case 6:
                g5.q0((g5) this.c, (af.f) this.d, (TL_stars.TL_starGiftUnique) this.b, tLObject, tL_error);
                break;
            case 7:
                g5.e1((g5) this.c, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.d2) this.b, tLObject);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new j0(this.c, tL_error, this.d, (Object) tLObject, (TLObject) this.b, 7));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new j0(this.c, tL_error, this.d, (Object) tLObject, (TLObject) this.b, 11));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new j0(this.c, tL_error, this.d, (Object) tLObject, (TLObject) this.b, 6));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((y3) this.d, tLObject, (TL_stories.StoryItem) this.b, (Utilities.Callback) this.c, 13));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(tLObject, (i6) this.c, (j6) this.d, (TLRPC.TL_theme) this.b, 21));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ih(this.c, this.d, tLObject, this.b, 11));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ih(this.c, this.d, tLObject, this.b, 12));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new jp((d10) this.c, (org.telegram.ui.ActionBar.p2) this.d, (ArrayList) this.b, 3));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ih(tL_error, (qh.d) this.c, (h3) this.d, (Runnable) this.b));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new j0(this.c, this.d, tL_error, tLObject, this.b, 29));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new jy0(this.c, (Object) tLObject, this.d, this.b, (Object) tL_error, 0));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new dy0(this.c, tLObject, this.d, this.b, 12));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z((org.telegram.ui.web.a1) this.c, tL_error, (String) this.d, (TLRPC.TL_inputInvoiceSlug) this.b, tLObject));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z((org.telegram.ui.web.a1) this.c, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.d2) this.b));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new y61((w7) this.c, (org.telegram.ui.ActionBar.d2) this.d, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.b, tL_error));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new dy0((qh.d) this.c, tLObject, (h3) this.d, (sh.j1) this.b, false, 16));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new dy0(tLObject, (boolean[]) this.c, (org.telegram.ui.web.s) this.d, (TLRPC.UserFull) this.b));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new dy0((vf.t) this.c, tLObject, (TL_account.TL_businessChatLink) this.d, (Runnable) this.b, false, 24));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new uf.h1((vf.e0) this.c, (TL_account.TL_connectedBot) this.d, (TL_account.TL_businessBotRecipients) this.b, 6));
                break;
            default:
                AndroidUtilities.runOnUIThread(new y61((vf.p1) this.c, tLObject, (ArrayList) this.d, (TLRPC.TL_messages_sendQuickReplyMessages) this.b, tL_error));
                break;
        }
    }

    public /* synthetic */ y(y3 y3Var, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
        this.a = 11;
        this.d = y3Var;
        this.b = storyItem;
        this.c = callback;
    }

    public /* synthetic */ y(MessagesController messagesController, c1 c1Var, m mVar) {
        this.a = 3;
        this.b = messagesController;
        this.c = c1Var;
        this.d = mVar;
    }

    public /* synthetic */ y(Utilities.Callback callback, MessagesController messagesController, Utilities.Callback callback2, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = messagesController;
        this.d = callback2;
    }
}
