package org.telegram.ui;

import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l10 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l10(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 11;
        int i12 = 6;
        int i13 = 7;
        int i14 = 2;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new kz(i12, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((e50) obj2, tL_error, tLObject, (String) obj, 17));
                break;
            case 2:
                d70 d70Var = (d70) obj2;
                if (Objects.equals(d70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new kz(14, d70Var, tLObject));
                    break;
                }
                break;
            case 3:
                r70 r70Var = (r70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new pq(r70Var, (TLRPC.TL_langPackString) langPackString, str, i11));
                            break;
                        }
                    }
                }
                break;
            case 4:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new pq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.x6) obj, 18));
                break;
            case 5:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((org.telegram.ui.ActionBar.e2) obj2, tLObject, (g) obj, tL_error, 21));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new pq((ob0) obj2, tLObject, (String) obj, 21));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new pq((lb0) obj2, tLObject, (TLRPC.User) obj, 22));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((lb0) obj2, tLObject, (HashSet) obj, tL_error, 23));
                break;
            case 9:
                ig0 ig0Var = (ig0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new pq(ig0Var, bundle, tLObject, 27));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new sc0(ig0Var, i14));
                    break;
                }
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10((le0) obj2, tLObject, (String) obj, tL_error, 26));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ne0((lf0) obj2, tL_error, (TL_account.confirmPhone) obj, false, 2));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ne0((hg0) obj2, tLObject, (HashMap) obj, i13));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new cg0(obj2, (Object) tL_error, (Object) tLObject, obj, 0));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ne0((qj0) obj2, tLObject, (org.telegram.ui.Components.oy) obj, 10));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ne0((zj0) obj2, tLObject, (TL_feed.TL_feed_setInterestCategories) obj, i11));
                break;
            case 16:
                mm0 mm0Var = (mm0) obj2;
                mm0Var.getClass();
                mm0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new ne0((gn0) obj2, tL_error, (TL_account.verifyPhone) obj, false, 17));
                break;
            case 18:
                ro0 ro0Var = (ro0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new rn0(ro0Var, tL_error, tLObject2, i15));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new am0(i12, ro0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 19:
                ro0 ro0Var2 = (ro0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    z10 z10Var = ro0Var2.e1;
                    if (z10Var == null || !((Boolean) z10Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new ne0(ro0Var2, tL_error, tL_payments_sendPaymentForm, false, 19));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new ln0(ro0Var2, tLObject, i15));
                        break;
                    }
                } else {
                    Utilities.Callback callback = ro0Var2.c1;
                    if (callback == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.Update update = updates.updates.get(i16);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i16++;
                                }
                            }
                        }
                        ro0Var2.getMessagesController().lambda$processUpdates$379(updates, false);
                        AndroidUtilities.runOnUIThread(new am0(i13, ro0Var2, messageArr));
                        break;
                    } else {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new cg0((ro0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, false, 4));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new cg0(obj2, (Object) tL_error, (Object) tLObject, obj, 9));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new cg0(obj2, (Object) tL_error, (Object) tLObject, obj, 10));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new am0(25, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.a9) obj));
                break;
            case 24:
                int i17 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new cg0(obj2, (Object) tL_error, (Object) tLObject, obj, 15));
                break;
            case 25:
                int i18 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new cg0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, false, 13));
                break;
            case 26:
                int i19 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new cg0(obj2, tLObject, obj, (Object) tL_error, 14));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new cg0(obj2, tLObject, obj, (Object) tL_error, 18));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new t31((k71) obj2, tL_error, (TLRPC.TL_authorization) obj, i15));
                break;
            default:
                AndroidUtilities.runOnUIThread(new t31((l71) obj2, tL_error, (TLRPC.TL_authorization) obj, i14));
                break;
        }
    }
}
