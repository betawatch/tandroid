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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b00(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 21;
        int i11 = 9;
        int i12 = 22;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(i12, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((l30) obj2, tL_error, tLObject, (String) obj, 13));
                break;
            case 2:
                h50 h50Var = (h50) obj2;
                if (Objects.equals(h50Var.a.e, (String) obj)) {
                    org.telegram.messenger.g0.h3(new g50(i13, h50Var, tLObject));
                    break;
                }
                break;
            case 3:
                t50 t50Var = (t50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.h3(new tp(t50Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 4:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new tp((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 18));
                break;
            case 5:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((org.telegram.ui.ActionBar.t1) obj2, tLObject, (g) obj, tL_error, 17));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new tp((q90) obj2, tLObject, (String) obj, i10));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new tp((n90) obj2, tLObject, (TLRPC.User) obj, i12));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((n90) obj2, tLObject, (HashSet) obj, tL_error, 19));
                break;
            case 9:
                ce0 ce0Var = (ce0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.h3(new tp(ce0Var, bundle, tLObject, 27));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new qa0(ce0Var, 2));
                    break;
                }
            case 10:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((gc0) obj2, tLObject, (String) obj, tL_error, 22));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new lc0((ed0) obj2, tL_error, (TL_account.confirmPhone) obj, i14));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new lc0((be0) obj2, tLObject, (HashMap) obj, 6));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80((be0) obj2, tL_error, tLObject, (String) obj, 26));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new lc0((bh0) obj2, tLObject, (org.telegram.ui.Components.gh) obj, i11));
                break;
            case 15:
                ij0 ij0Var = (ij0) obj2;
                ij0Var.getClass();
                ij0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 16:
                org.telegram.messenger.g0.h3(new lc0((ak0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                break;
            case 17:
                kl0 kl0Var = (kl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.h3(new nk0(kl0Var, tL_error, tLObject2, i14));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new jd0(i10, kl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 18:
                kl0 kl0Var2 = (kl0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    l00 l00Var = kl0Var2.f1;
                    if (l00Var == null || !((Boolean) l00Var.a(tL_error)).booleanValue()) {
                        org.telegram.messenger.g0.h3(new lc0(kl0Var2, tL_error, tL_payments_sendPaymentForm, 17));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.h3(new ik0(kl0Var2, tLObject, i14));
                        break;
                    }
                } else {
                    org.telegram.messenger.z10 z10Var = kl0Var2.d1;
                    if (z10Var == null) {
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
                        kl0Var2.getMessagesController().O3(updates, false);
                        org.telegram.messenger.g0.h3(new jd0(i12, kl0Var2, messageArr));
                        break;
                    } else {
                        z10Var.a((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 19:
                org.telegram.messenger.g0.h3(new ok0(obj2, (Object) tLObject, (Object) tL_error, obj, 0));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new ok0((org.telegram.ui.ActionBar.e2) obj2, (Object) tL_error, tLObject, obj, 5));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new ok0((org.telegram.ui.ActionBar.e2) obj2, (Object) tL_error, tLObject, obj, 6));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new mp0(i11, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.q8) obj));
                break;
            case 23:
                RectF rectF = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new ok0((org.telegram.ui.ActionBar.e2) obj2, (Object) tL_error, tLObject, obj, 10));
                break;
            case 24:
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new ok0(obj2, (Object) tLObject, (Object) tL_error, obj, 9));
                break;
            case 25:
                RectF rectF3 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new ok0(obj2, tLObject, obj, tL_error, 12));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new ok0(obj2, tLObject, obj, tL_error, 14));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new q21((r21) obj2, tL_error, (TLRPC.TL_authorization) obj, i13));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new q21((s21) obj2, tL_error, (TLRPC.TL_authorization) obj, i14));
                break;
            default:
                org.telegram.messenger.g0.h3(new ok0((u21) obj2, tLObject, tL_error, (j9) obj, 17));
                break;
        }
    }
}
