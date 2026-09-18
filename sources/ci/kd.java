package ci;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.widget.FrameLayout;
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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.af;
import org.telegram.ui.bo;
import org.telegram.ui.dg0;
import org.telegram.ui.hg0;
import org.telegram.ui.i10;
import org.telegram.ui.nn;
import org.telegram.ui.og;
import org.telegram.ui.rf0;
import org.telegram.ui.s71;
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class kd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
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
                AndroidUtilities.runOnUIThread(new ai.z8((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (jd) obj2, (hd) obj, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ai.z8(tLObject, (String[]) obj5, (FrameLayout) obj4, (c90) obj3, (org.telegram.ui.ActionBar.g3) obj2, (org.telegram.ui.ActionBar.f6) obj, 4));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.z8((bo) obj5, (nf.e) obj4, (org.telegram.ui.Cells.t1) obj3, (String) obj2, tLObject, (CharacterStyle) obj, 6));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new af((bo) obj5, tL_error, (TLObject) obj4, tLObject, (og) obj3, (String) obj2, (nf.e) obj));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new af((nn) obj5, (org.telegram.ui.ActionBar.c2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.z8(tL_error, (Context) obj5, (org.telegram.ui.ActionBar.f6) obj4, (d) obj3, (org.telegram.ui.ActionBar.g3) obj2, (Runnable) obj, 7));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.z8((wx0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj, (int[]) obj5, 8));
                break;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new af((KeyEvent.Callback) obj5, obj4, (Object) tL_error, (String) obj3, obj2, tLObject, obj, 3));
                break;
            case 8:
                hg0 hg0Var = (hg0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                kn0 kn0Var = (kn0) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new i10(kn0Var, 25));
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
                            hg0Var.v.getMessagesController().processUpdates(updates, false);
                            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                            AndroidUtilities.runOnUIThread(new dg0(hg0Var, i12));
                            break;
                        } else {
                            Object obj6 = findUpdatesAndRemove.get(i11);
                            i11++;
                            AndroidUtilities.runOnUIThread(new rf0((Object) hg0Var, (Object) tL_inputStorePaymentAuthCode, obj6, i12));
                        }
                    }
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new af((xg0) obj5, tL_error, tLObject, (Bundle) obj4, (String) obj3, (lf.i) obj2, (TLObject) obj, 5));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new af(obj5, (Object) tLObject, (String) obj4, (TLObject) obj3, obj2, (Object) tL_error, obj, 6));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ai.z8((s71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 12));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new af(tL_error, (tg.w) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.o2) obj2, (tg.w) obj, 8));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new af(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.o2) obj2, (Utilities.Callback) obj, 9));
                break;
            default:
                AndroidUtilities.runOnUIThread(new af((yh.v5) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (org.telegram.ui.Components.vc) obj, tL_error, 11));
                break;
        }
    }

    public /* synthetic */ kd(wx0 wx0Var, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.a = 6;
        this.c = wx0Var;
        this.d = editTextBoldCursor;
        this.e = textView;
        this.f = textView2;
        this.b = iArr;
    }
}
