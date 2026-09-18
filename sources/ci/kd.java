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
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cg0;
import org.telegram.ui.g10;
import org.telegram.ui.gg0;
import org.telegram.ui.kg;
import org.telegram.ui.ln;
import org.telegram.ui.q71;
import org.telegram.ui.qf0;
import org.telegram.ui.wg0;
import org.telegram.ui.ze;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                AndroidUtilities.runOnUIThread(new ai.z8(tLObject, (String[]) obj5, (FrameLayout) obj4, (l90) obj3, (org.telegram.ui.ActionBar.f3) obj2, (org.telegram.ui.ActionBar.e6) obj, 4));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.z8((zn) obj5, (nf.e) obj4, (org.telegram.ui.Cells.u1) obj3, (String) obj2, tLObject, (CharacterStyle) obj, 6));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ze((zn) obj5, tL_error, (TLObject) obj4, tLObject, (kg) obj3, (String) obj2, (nf.e) obj));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ze((ln) obj5, (org.telegram.ui.ActionBar.b2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.z8(tL_error, (Context) obj5, (org.telegram.ui.ActionBar.e6) obj4, (d) obj3, (org.telegram.ui.ActionBar.f3) obj2, (Runnable) obj, 7));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.z8((hy0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj, (int[]) obj5, 8));
                break;
            case 7:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new ze((KeyEvent.Callback) obj5, obj4, (Object) tL_error, (String) obj3, obj2, tLObject, obj, 3));
                break;
            case 8:
                gg0 gg0Var = (gg0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                wn0 wn0Var = (wn0) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new g10(wn0Var, 25));
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
                            gg0Var.v.getMessagesController().processUpdates(updates, false);
                            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                            AndroidUtilities.runOnUIThread(new cg0(gg0Var, i12));
                            break;
                        } else {
                            Object obj6 = findUpdatesAndRemove.get(i11);
                            i11++;
                            AndroidUtilities.runOnUIThread(new qf0((Object) gg0Var, (Object) tL_inputStorePaymentAuthCode, obj6, i12));
                        }
                    }
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ze((wg0) obj5, tL_error, tLObject, (Bundle) obj4, (String) obj3, (lf.i) obj2, (TLObject) obj, 5));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ze(obj5, (Object) tLObject, (String) obj4, (TLObject) obj3, obj2, (Object) tL_error, obj, 6));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ai.z8((q71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 12));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ze(tL_error, (tg.v) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (tg.v) obj, 8));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ze(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.n2) obj2, (Utilities.Callback) obj, 9));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ze((yh.t5) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (org.telegram.ui.Components.xc) obj, tL_error, 11));
                break;
        }
    }

    public /* synthetic */ kd(hy0 hy0Var, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.a = 6;
        this.c = hy0Var;
        this.d = editTextBoldCursor;
        this.e = textView;
        this.f = textView2;
        this.b = iArr;
    }
}
