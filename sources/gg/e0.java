package gg;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import lh.t7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a30;
import org.telegram.ui.b71;
import org.telegram.ui.c10;
import org.telegram.ui.fm0;
import org.telegram.ui.gm0;
import org.telegram.ui.hf0;
import org.telegram.ui.jn;
import org.telegram.ui.rm0;
import org.telegram.ui.tf0;
import org.telegram.ui.wf0;
import org.telegram.ui.xn;
import ph.xa;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
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
                AndroidUtilities.runOnUIThread(new g0(tL_error, (t0) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.p2) obj2, (t0) obj, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new g0(tL_error, (Utilities.Callback) obj5, tLObject, (MessagesController) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.p2) obj2, (Utilities.Callback) obj, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new g0((t7) obj5, tLObject, (MessageObject) obj4, (TLRPC.InputInvoice) obj3, (Utilities.Callback) obj2, (qc) obj, tL_error));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new kh.e1(tLObject, obj5, obj4, obj3, obj2, obj, 9));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new kh.e1((xn) obj5, (af.f) obj4, (org.telegram.ui.Cells.t1) obj3, (String) obj2, tLObject, (CharacterStyle) obj));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new g0((NotificationCenter.NotificationCenterDelegate) obj5, tL_error, (TLObject) obj4, (Object) tLObject, obj3, obj2, obj, 7));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new g0((jn) obj5, (org.telegram.ui.ActionBar.d2) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (MessageObject) obj, tL_error));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new kh.e1(tL_error, (Context) obj5, (f6) obj4, (ph.d) obj3, (g3) obj2, (Runnable) obj));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new kh.e1((xx0) obj5, tLObject, (EditTextBoldCursor) obj4, (TextView) obj3, (TextView) obj2, (int[]) obj, 13, false));
                break;
            case 9:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new g0((LaunchActivity) obj5, (org.telegram.ui.ActionBar.d2) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                break;
            case 10:
                wf0 wf0Var = (wf0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                a30 a30Var = (a30) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new c10(a30Var, 25));
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
                            wf0Var.v.getMessagesController().processUpdates(updates, false);
                            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
                            AndroidUtilities.runOnUIThread(new tf0(wf0Var, i12));
                            break;
                        } else {
                            Object obj6 = findUpdatesAndRemove.get(i11);
                            i11++;
                            AndroidUtilities.runOnUIThread(new hf0((Object) wf0Var, (Object) tL_inputStorePaymentAuthCode, obj6, i12));
                        }
                    }
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new g0((NotificationCenter.NotificationCenterDelegate) obj5, tL_error, tLObject, obj4, obj3, obj2, obj, 11));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new g0((fm0) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (gm0) obj2, tL_error, (rm0) obj));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new kh.e1((b71) obj5, tL_error, (TLRPC.InputCheckPasswordSRP) obj4, (TLRPC.User) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj));
                break;
            default:
                AndroidUtilities.runOnUIThread(new kh.e1((int[]) obj5, tLObject, (MessagesController) obj4, (TLRPC.User[]) obj3, (xa) obj2, (ll) obj, 20, false));
                break;
        }
    }
}
