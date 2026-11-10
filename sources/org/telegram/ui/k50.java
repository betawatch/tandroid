package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k50(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 27;
        int i11 = 11;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                l50 l50Var = (l50) obj2;
                if (Objects.equals(l50Var.a.e, (String) obj)) {
                    org.telegram.messenger.g0.h3(new f10(5, l50Var, tLObject));
                    break;
                }
                break;
            case 1:
                x50 x50Var = (x50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.h3(new tp(x50Var, (TLRPC.TL_langPackString) langPackString, str, i11));
                            break;
                        }
                    }
                }
                break;
            case 2:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new tp((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.l6) obj, 18));
                break;
            case 3:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((org.telegram.ui.ActionBar.u1) obj2, tLObject, (g) obj, tL_error, 13));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new tp((s90) obj2, tLObject, (String) obj, 21));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new tp((p90) obj2, tLObject, (TLRPC.User) obj, 22));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((p90) obj2, tLObject, (HashSet) obj, tL_error, 15));
                break;
            case 7:
                fe0 fe0Var = (fe0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.h3(new tp(fe0Var, bundle, tLObject, i10));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ta0(fe0Var, 2));
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((kc0) obj2, tLObject, (String) obj, tL_error, 18));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new pc0((jd0) obj2, tL_error, (TL_account.confirmPhone) obj, i13));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new pc0((ee0) obj2, tLObject, (HashMap) obj, 6));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((ee0) obj2, tL_error, tLObject, (String) obj, 22));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new pc0((dh0) obj2, tLObject, (org.telegram.ui.Components.ex) obj, 9));
                break;
            case 13:
                ij0 ij0Var = (ij0) obj2;
                ij0Var.getClass();
                ij0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 14:
                org.telegram.messenger.g0.h3(new pc0((ak0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                break;
            case 15:
                kl0 kl0Var = (kl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.h3(new nk0(kl0Var, tL_error, tLObject2, i13));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new tc0(26, kl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 16:
                kl0 kl0Var2 = (kl0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    m00 m00Var = kl0Var2.e1;
                    if (m00Var == null || !((Boolean) m00Var.a(tL_error)).booleanValue()) {
                        org.telegram.messenger.g0.h3(new pc0(kl0Var2, tL_error, tL_payments_sendPaymentForm, 17));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.h3(new jk0(kl0Var2, tLObject, i13));
                        break;
                    }
                } else {
                    org.telegram.messenger.c20 c20Var = kl0Var2.c1;
                    if (c20Var == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                TLRPC.Update update = updates.updates.get(i14);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i14++;
                                }
                            }
                        }
                        kl0Var2.getMessagesController().O3(updates, false);
                        org.telegram.messenger.g0.h3(new tc0(i10, kl0Var2, messageArr));
                        break;
                    } else {
                        c20Var.a((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 17:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0((kl0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 26));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new mo0((org.telegram.ui.ActionBar.f2) obj2, (Object) tL_error, tLObject, obj, 1));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new mo0((org.telegram.ui.ActionBar.f2) obj2, (Object) tL_error, tLObject, obj, 2));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new tn0(14, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.r8) obj));
                break;
            case 21:
                RectF rectF = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new mo0((org.telegram.ui.ActionBar.f2) obj2, (Object) tL_error, tLObject, obj, 6));
                break;
            case 22:
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new mo0(obj2, (Object) tLObject, (Object) tL_error, obj, 5));
                break;
            case 23:
                RectF rectF3 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new mo0(obj2, (Object) tLObject, obj, (Object) tL_error, 8));
                break;
            case 24:
                org.telegram.messenger.g0.h3(new mo0((fw0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 10));
                break;
            case 25:
                org.telegram.messenger.g0.h3(new w21((x21) obj2, tL_error, (TLRPC.TL_authorization) obj, i12));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new w21((y21) obj2, tL_error, (TLRPC.TL_authorization) obj, i13));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new mo0((a31) obj2, tLObject, tL_error, (j9) obj, 13));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new rw0(i11, (o31) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            default:
                org.telegram.messenger.g0.h3(new mo0((org.telegram.ui.ActionBar.f2) obj2, (Object) tL_error, tLObject, obj, 14));
                break;
        }
    }
}
