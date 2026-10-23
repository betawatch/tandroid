package ai;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cm0;
import org.telegram.ui.dm0;
import org.telegram.ui.dn;
import org.telegram.ui.fz;
import org.telegram.ui.l61;
import org.telegram.ui.of0;
import org.telegram.ui.om0;
import org.telegram.ui.re0;
import org.telegram.ui.rf0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.f;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new v7((ha) obj4, tLObject, (MessageObject) obj3, (TLRPC.InputInvoice) obj2, (Utilities.Callback) obj5, (org.telegram.ui.Components.xc) obj, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new g3((int[]) obj4, tLObject, (MessagesController) obj3, (TLRPC.User[]) obj2, (ei.qc) obj5, (ei.oc) obj, 8));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new g3(tLObject, obj4, obj3, obj2, obj5, obj, 11));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new g3((sn) obj4, (pf.c) obj3, (org.telegram.ui.Cells.t1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new v7((sn) obj4, tL_error, (TLObject) obj3, tLObject, (x3) obj2, (String) obj5, (pf.c) obj));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new v7((dn) obj4, (org.telegram.ui.ActionBar.c2) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (MessageObject) obj3, tL_error, 6));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new g3(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.g6) obj3, (ei.d) obj2, (org.telegram.ui.r6) obj5, (Runnable) obj));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new g3((ty0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 15));
                break;
            case 8:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new v7((LaunchActivity) obj4, (org.telegram.ui.ActionBar.c2) obj3, tL_error, (String) obj2, (Bundle) obj5, tLObject, (TL_account.sendConfirmPhoneCode) obj, 7));
                break;
            case 9:
                rf0 rf0Var = (rf0) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                Purchase purchase = (Purchase) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj5;
                j90 j90Var = (j90) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new fz(j90Var, 27));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = findUpdatesAndRemove.get(i11);
                        i11++;
                        AndroidUtilities.runOnUIThread(new re0(rf0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 5));
                    }
                    rf0Var.v.getMessagesController().lambda$processUpdates$377(updates, false);
                    BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                    AndroidUtilities.runOnUIThread(new of0(rf0Var, 3));
                    break;
                }
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new v7((NotificationCenter.NotificationCenterDelegate) obj4, (Object) tL_error, (Object) tLObject, obj3, (String) obj2, obj5, obj, 9));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new v7((cm0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (dm0) obj5, tL_error, (om0) obj));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new g3((l61) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new v7(tL_error, (ug.t) obj4, tLObject, (MessagesController) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.o2) obj5, (ug.t) obj, 15));
                break;
            default:
                AndroidUtilities.runOnUIThread(new v7(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.o2) obj2, (Utilities.Callback) obj));
                break;
        }
    }

    public /* synthetic */ s9(Utilities.Callback callback, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.o2 o2Var, Utilities.Callback callback2) {
        this.a = 14;
        this.e = callback;
        this.b = messagesController;
        this.c = tL_inputInvoicePremiumGiftCode;
        this.d = o2Var;
        this.f = callback2;
    }

    public /* synthetic */ s9(dn dnVar, org.telegram.ui.ActionBar.c2 c2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject) {
        this.a = 5;
        this.b = dnVar;
        this.d = c2Var;
        this.e = hashSet;
        this.f = tL_inputGroupCallInviteMessage;
        this.c = messageObject;
    }
}
