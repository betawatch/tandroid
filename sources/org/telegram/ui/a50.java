package org.telegram.ui;

import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class a50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a50(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 26;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90(obj2, tL_error, tLObject, obj, 14));
                break;
            case 1:
                a70 a70Var = (a70) obj2;
                if (Objects.equals(a70Var.a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new ot(i11, a70Var, tLObject));
                    break;
                }
                break;
            case 2:
                n70 n70Var = (n70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new lq(n70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 3:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new lq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.j6) obj, 18));
                break;
            case 4:
                Pattern pattern2 = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90(obj2, tLObject, obj, tL_error, 18));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new lq((ob0) obj2, tLObject, (String) obj, 21));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new lq((lb0) obj2, tLObject, (TLRPC.User) obj, 22));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90(obj2, tLObject, obj, tL_error, 20));
                break;
            case 8:
                ig0 ig0Var = (ig0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new lq(ig0Var, bundle, tLObject, i11));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new tc0(ig0Var, 2));
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90(obj2, tLObject, obj, tL_error, 23));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new re0((mf0) obj2, tL_error, (TL_account.confirmPhone) obj, i13));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new re0((hg0) obj2, tLObject, (HashMap) obj, 6));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j90(obj2, tL_error, tLObject, obj, 27));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new re0((rj0) obj2, tLObject, (org.telegram.ui.Components.qy) obj, 9));
                break;
            case 14:
                cm0 cm0Var = (cm0) obj2;
                cm0Var.getClass();
                cm0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new re0((wm0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                break;
            case 16:
                io0 io0Var = (io0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    AndroidUtilities.runOnUIThread(new hn0(io0Var, tL_error, tLObject2, i13));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new bh0(16, io0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 17:
                io0 io0Var2 = (io0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                int i14 = 17;
                if (tLObject == null) {
                    x10 x10Var = io0Var2.e1;
                    if (x10Var == null || !((Boolean) x10Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new re0(io0Var2, tL_error, tL_payments_sendPaymentForm, i14));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new bn0(io0Var2, tLObject, i13));
                        break;
                    }
                } else {
                    Utilities.Callback callback = io0Var2.c1;
                    if (callback == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.Update update = updates.updates.get(i15);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i15++;
                                }
                            }
                        }
                        io0Var2.getMessagesController().lambda$processUpdates$377(updates, false);
                        AndroidUtilities.runOnUIThread(new bh0(i14, io0Var2, messageArr));
                        break;
                    } else {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new jn0((io0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 1));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new jn0((bw0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 6));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new jn0((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 7));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new mv0(5, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.w8) obj));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new jn0((ProfileActivity) obj2, tL_error, tLObject, (String) obj, 13));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new jn0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 10));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new jn0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 11));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new jn0((yz0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 15));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new re0((g71) obj2, tL_error, (TLRPC.TL_authorization) obj, 29));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new h71((i71) obj2, tL_error, (TLRPC.TL_authorization) obj, i12));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new jn0((k71) obj2, tLObject, tL_error, (n9) obj, 18));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jn0((c81) obj2, tL_error, tLObject, (String) obj, 19));
                break;
        }
    }
}
