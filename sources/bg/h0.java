package bg;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import gh.v7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import kh.qc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.am0;
import org.telegram.ui.cn;
import org.telegram.ui.l61;
import org.telegram.ui.lf0;
import org.telegram.ui.lm0;
import org.telegram.ui.o00;
import org.telegram.ui.of0;
import org.telegram.ui.qn;
import org.telegram.ui.ye0;
import org.telegram.ui.zl0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        Object obj = this.f;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (z0) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.o2) obj2, (z0) obj, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new k0(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.o2) obj2, (Utilities.Callback) obj, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new k0((v7) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (oc) obj, tL_error));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new fh.k1((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (qc) obj2, (kh.oc) obj, 9, false));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new fh.k1(tLObject, obj5, obj4, obj3, obj2, obj, 12));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new fh.k1((qn) obj5, (ve.d) obj4, (org.telegram.ui.Cells.t1) obj3, (String) obj2, tLObject, (CharacterStyle) obj));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new k0((NotificationCenter.NotificationCenterDelegate) obj5, tL_error, (TLObject) obj4, (Object) tLObject, obj3, obj2, obj, 7));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new k0((cn) obj5, (org.telegram.ui.ActionBar.c2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new fh.k1(tL_error, (Context) obj5, (b6) obj4, (kh.d) obj3, (org.telegram.ui.ActionBar.f3) obj2, (Runnable) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new fh.k1((cx0) obj5, tLObject, (EditTextBoldCursor) obj4, (TextView) obj3, (TextView) obj2, (int[]) obj, 16, false));
                break;
            case 10:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new k0((LaunchActivity) obj5, (org.telegram.ui.ActionBar.c2) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                break;
            case 11:
                of0 of0Var = (of0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                no0 no0Var = (no0) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new o00(no0Var, 25));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i10 = 0;
                    while (true) {
                        int i11 = 3;
                        if (i10 >= size) {
                            of0Var.v.getMessagesController().processUpdates(updates, false);
                            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                            AndroidUtilities.runOnUIThread(new lf0(of0Var, i11));
                            break;
                        } else {
                            Object obj6 = findUpdatesAndRemove.get(i10);
                            i10++;
                            AndroidUtilities.runOnUIThread(new ye0((Object) of0Var, (Object) tL_inputStorePaymentAuthCode, obj6, i11));
                        }
                    }
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new k0((NotificationCenter.NotificationCenterDelegate) obj5, tL_error, tLObject, obj4, obj3, obj2, obj, 11));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new k0((zl0) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (am0) obj2, tL_error, (lm0) obj));
                break;
            default:
                AndroidUtilities.runOnUIThread(new fh.k1((l61) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj));
                break;
        }
    }
}
