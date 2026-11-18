package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e00(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 17;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new vs(i10, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((o30) obj2, tL_error, tLObject, (String) obj, 16));
                break;
            case 2:
                j50 j50Var = (j50) obj2;
                if (Objects.equals(j50Var.a.e, (String) obj)) {
                    org.telegram.messenger.g0.g3(new vs(25, j50Var, tLObject));
                    break;
                }
                break;
            case 3:
                v50 v50Var = (v50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.g3(new up(v50Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 4:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new up((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.m6) obj, 18));
                break;
            case 5:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20(obj2, tLObject, obj, tL_error, 20));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new up((r90) obj2, tLObject, (String) obj, 21));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new up((o90) obj2, tLObject, (TLRPC.User) obj, 22));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20(obj2, tLObject, obj, tL_error, 22));
                break;
            case 9:
                de0 de0Var = (de0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.g3(new up(de0Var, bundle, tLObject, 27));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new qa0(de0Var, 2));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20(obj2, tLObject, obj, tL_error, 25));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new lc0((gd0) obj2, tL_error, (TL_account.confirmPhone) obj, i12));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new lc0((ce0) obj2, tLObject, (HashMap) obj, 6));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20((ce0) obj2, tL_error, tLObject, (String) obj, 29));
                break;
            case 14:
                org.telegram.messenger.g0.g3(new lc0((eh0) obj2, tLObject, (org.telegram.ui.Components.ph) obj, 9));
                break;
            case 15:
                lj0 lj0Var = (lj0) obj2;
                lj0Var.getClass();
                lj0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 16:
                org.telegram.messenger.g0.g3(new lc0((dk0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                break;
            case 17:
                ml0 ml0Var = (ml0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.g3(new qk0(ml0Var, tL_error, tLObject2, i12));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new ve0(16, ml0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 18:
                ml0 ml0Var2 = (ml0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    o00 o00Var = ml0Var2.f1;
                    if (o00Var == null || !((Boolean) o00Var.a(tL_error)).booleanValue()) {
                        org.telegram.messenger.g0.g3(new lc0(ml0Var2, tL_error, tL_payments_sendPaymentForm, i10));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.g3(new lk0(ml0Var2, tLObject, i12));
                        break;
                    }
                } else {
                    org.telegram.messenger.x10 x10Var = ml0Var2.d1;
                    if (x10Var == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size) {
                                TLRPC.Update update = updates.updates.get(i13);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        ml0Var2.getMessagesController().V3(updates, false);
                        org.telegram.messenger.g0.g3(new ve0(i10, ml0Var2, messageArr));
                        break;
                    } else {
                        x10Var.a((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 19:
                org.telegram.messenger.g0.g3(new jg0((ml0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 3));
                break;
            case 20:
                org.telegram.messenger.g0.g3(new jg0((is0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 8));
                break;
            case 21:
                org.telegram.messenger.g0.g3(new jg0((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 9));
                break;
            case 22:
                org.telegram.messenger.g0.g3(new tr0(4, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.r8) obj));
                break;
            case 23:
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new jg0((org.telegram.messenger.fs) obj2, (Object) tL_error, (Object) tLObject, (String) obj, 13));
                break;
            case 24:
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new jg0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 12));
                break;
            case 25:
                RectF rectF3 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new jg0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 15));
                break;
            case 26:
                org.telegram.messenger.g0.g3(new jg0((dw0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 17));
                break;
            case 27:
                org.telegram.messenger.g0.g3(new u21((v21) obj2, tL_error, (TLRPC.TL_authorization) obj, i11));
                break;
            case 28:
                org.telegram.messenger.g0.g3(new u21((w21) obj2, tL_error, (TLRPC.TL_authorization) obj, i12));
                break;
            default:
                org.telegram.messenger.g0.g3(new jg0((y21) obj2, tLObject, tL_error, (j9) obj, 20));
                break;
        }
    }
}
