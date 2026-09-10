package bi;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.q01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.eo;
import org.telegram.ui.fg0;
import org.telegram.ui.i10;
import org.telegram.ui.ng;
import org.telegram.ui.pf0;
import org.telegram.ui.pn;
import org.telegram.ui.v71;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class ze implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
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
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (ye) obj2, (we) obj, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new te(tLObject, obj5, obj4, obj3, obj2, obj, 3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new te((org.telegram.ui.ActionBar.p2) obj5, obj4, obj3, obj2, tLObject, obj, 5));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((eo) obj5, tL_error, (TLObject) obj4, tLObject, (ng) obj3, (String) obj2, (nf.e) obj));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((pn) obj5, (org.telegram.ui.ActionBar.d2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new te((Object) tL_error, obj5, obj4, obj3, obj2, obj, 6));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new te((hy0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj, (int[]) obj5));
                break;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((KeyEvent.Callback) obj5, obj4, (Object) tL_error, (String) obj3, obj2, tLObject, obj, 3));
                break;
            case 8:
                fg0 fg0Var = (fg0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                q01 q01Var = (q01) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new i10(q01Var, 25));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = findUpdatesAndRemove.size();
                    int i11 = 0;
                    while (true) {
                        int i12 = 3;
                        if (i11 >= size) {
                            fg0Var.v.getMessagesController().processUpdates(updates, false);
                            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                            AndroidUtilities.runOnUIThread(new bg0(fg0Var, i12));
                            break;
                        } else {
                            Object obj6 = findUpdatesAndRemove.get(i11);
                            i11++;
                            AndroidUtilities.runOnUIThread(new pf0((Object) fg0Var, (Object) tL_inputStorePaymentAuthCode, obj6, i12));
                        }
                    }
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((wg0) obj5, tL_error, tLObject, (Bundle) obj4, (String) obj3, (m.e3) obj2, (TLObject) obj, 5));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf(obj5, (Object) tLObject, (String) obj4, (TLObject) obj3, obj2, (Object) tL_error, obj, 6));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new te((v71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 11));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf(tL_error, (sg.v) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.p2) obj2, (sg.v) obj, 8));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.p2) obj2, (Utilities.Callback) obj, 9));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.bf((xh.v5) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (org.telegram.ui.Components.wc) obj, tL_error, 11));
                break;
        }
    }

    public /* synthetic */ ze(hy0 hy0Var, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.a = 6;
        this.c = hy0Var;
        this.d = editTextBoldCursor;
        this.e = textView;
        this.f = textView2;
        this.b = iArr;
    }
}
