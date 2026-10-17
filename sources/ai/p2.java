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
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.i01;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p2(ei.k9 k9Var, org.telegram.ui.ActionBar.b2 b2Var, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.a = 6;
        this.b = k9Var;
        this.d = b2Var;
        this.c = getgroupcallstreamrtmpurl;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                k7.Y0((k7) this.b, (TLRPC.TL_messageActionStarGift) this.c, (org.telegram.ui.ActionBar.b2) this.d, tLObject);
                break;
            case 1:
                k7.K0((k7) this.b, (pf.c) this.c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new t0(this.b, tL_error, this.c, (Object) tLObject, (TLObject) this.d, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new t0(this.b, tL_error, this.c, (Object) tLObject, (TLObject) this.d, 6));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new t0(this.b, tL_error, this.c, (Object) tLObject, (TLObject) this.d, 1));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new y0((ci.h4) this.b, tLObject, (TL_stories.StoryItem) this.c, (Utilities.Callback) this.d, 7));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new t0(this.b, (org.telegram.ui.ActionBar.b2) this.d, tLObject, (TLObject) this.c, (Object) tL_error, 12));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new y0((ei.d) this.b, tLObject, (org.telegram.ui.ActionBar.f3) this.c, (gi.r1) this.d, 13));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new y0(tLObject, (boolean[]) this.b, (org.telegram.ui.web.q) this.c, (TLRPC.UserFull) this.d, 16));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new y0((ig.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 21));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.k0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 27));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new t0((ig.y1) this.b, tLObject, (ArrayList) this.c, (TLRPC.TL_messages_sendQuickReplyMessages) this.d, tL_error, 17));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(tLObject, (org.telegram.ui.ActionBar.f6) this.b, (org.telegram.ui.ActionBar.g6) this.c, (TLRPC.TL_theme) this.d, 4));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((ny) this.b, (org.telegram.ui.ActionBar.b2[]) this.c, tLObject, (org.telegram.ui.ActionBar.a3) this.d, 24));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((mz) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new lg(this.b, this.c, (ArrayList) this.d, 7));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new i90(tL_error, (ei.d) this.b, (org.telegram.ui.ActionBar.f3) this.c, (Runnable) this.d));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new g30((oy0) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, 1));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new g30((zy0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 2));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.a1) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0((org.telegram.ui.web.a1) this.b, tLObject, (String[]) this.c, tL_error, (org.telegram.ui.ActionBar.b2) this.d));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new i01(tL_error, (Utilities.Callback) this.b, tLObject, (MessagesController) this.c, (Utilities.Callback) this.d, 9));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new i01(tL_error, (org.telegram.messenger.x) this.b, tLObject, (MessagesController) this.c, (org.telegram.messenger.j2) this.d, 10));
                break;
            case 23:
                ug.t tVar = (ug.t) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                ug.w wVar = (ug.w) this.d;
                if (tL_error == null) {
                    if (tLObject != null) {
                        messagesController.lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new tg.p(wVar, 4));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new uf.c(2, tVar, tL_error));
                    break;
                }
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new i01(tLObject, (MessagesController) this.b, (ci.z2) this.c, (ug.e) this.d, tL_error, 11));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new i01((ug.l1) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i01((yh.y4) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d, 13));
                break;
        }
    }

    public /* synthetic */ p2(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
