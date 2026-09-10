package bi;

import android.view.KeyEvent;
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
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ny;
import org.telegram.ui.ac0;
import org.telegram.ui.fy0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class wa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wa(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ya((kb) this.b, (org.telegram.ui.ActionBar.d2) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((d) this.b, tLObject, (org.telegram.ui.ActionBar.h3) this.c, (di.y1) this.d, 3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (boolean[]) this.b, (org.telegram.ui.web.r) this.c, (TLRPC.UserFull) this.d, 6));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((gg.b0) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (Runnable) this.d, 11));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new gg.a0((gg.p0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d, 1));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ya(this.b, tLObject, this.c, this.d, tL_error, 5));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (org.telegram.ui.ActionBar.h6) this.b, (org.telegram.ui.ActionBar.i6) this.c, (TLRPC.TL_theme) this.d, 26));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((ny) this.b, (org.telegram.ui.ActionBar.d2[]) this.c, tLObject, (org.telegram.ui.ActionBar.c3) this.d, 16));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((kz) this.b, (TLRPC.TL_messages_getStickers) this.c, tLObject, (Runnable) this.d, 17));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new gf((k10) this.b, (org.telegram.ui.ActionBar.p2) this.c, (ArrayList) this.d, 8));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da(tL_error, (d) this.b, (org.telegram.ui.ActionBar.h3) this.c, (Runnable) this.d));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ya(this.b, (String) this.c, tL_error, tLObject, this.d, 19));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ya(this.b, tLObject, this.c, this.d, tL_error, 20));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) this.b, tL_error, (String) this.c, (TLRPC.TL_inputInvoiceSlug) this.d, tLObject));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b0((org.telegram.ui.web.c1) this.b, tLObject, (String[]) this.d, tL_error, (org.telegram.ui.ActionBar.d2) this.c));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ac0(tL_error, (Utilities.Callback) this.b, tLObject, (MessagesController) this.c, (Utilities.Callback) this.d, 21));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ac0(tL_error, (Utilities.Callback) this.b, tLObject, (MessagesController) this.c, (Utilities.Callback) this.d, 22));
                break;
            case 17:
                sg.v vVar = (sg.v) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                sg.y yVar = (sg.y) this.d;
                if (tL_error == null) {
                    if (tLObject != null) {
                        messagesController.processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new qg.q0(yVar, 11));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(19, vVar, tL_error));
                    break;
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ac0(tLObject, (MessagesController) this.b, (gg.u1) this.c, (sg.f) this.d, tL_error));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ac0(this.b, (Object) tLObject, this.c, this.d, tL_error, 24));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ac0((KeyEvent.Callback) this.b, tLObject, this.c, tL_error, (TLObject) this.d, 25));
                break;
            case 21:
                xh.x3.r0((xh.x3) this.b, (nf.e) this.c, (TL_stars.TL_starGiftUnique) this.d, tLObject, tL_error);
                break;
            case 22:
                xh.x3.e1((xh.x3) this.b, (TLRPC.TL_messageActionStarGift) this.d, (org.telegram.ui.ActionBar.d2) this.c, tLObject);
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new ac0(this.b, tL_error, this.c, tLObject, (TLObject) this.d, 28));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new xh.x4((xh.v5) this.b, tL_error, (Utilities.Callback2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, 2));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new ac0(this.b, tL_error, this.c, tLObject, (TLObject) this.d, 27));
                break;
            default:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, this.c, this.d, 29));
                break;
        }
    }

    public /* synthetic */ wa(Object obj, Object obj2, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = d2Var;
    }
}
