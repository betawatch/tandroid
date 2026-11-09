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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j50(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 0;
        int i11 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                k50 k50Var = (k50) obj2;
                if (Objects.equals(k50Var.a.e, (String) obj)) {
                    org.telegram.messenger.g0.h3(new s10(4, k50Var, tLObject));
                    break;
                }
                break;
            case 1:
                w50 w50Var = (w50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.h3(new tp(w50Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            break;
                        }
                    }
                }
                break;
            case 2:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new tp((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.k6) obj, 18));
                break;
            case 3:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((org.telegram.ui.ActionBar.u1) obj2, tLObject, (g) obj, tL_error, 13));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new tp((r90) obj2, tLObject, (String) obj, 21));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new tp((o90) obj2, tLObject, (TLRPC.User) obj, 22));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((o90) obj2, tLObject, (HashSet) obj, tL_error, 15));
                break;
            case 7:
                ee0 ee0Var = (ee0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.h3(new tp(ee0Var, bundle, tLObject, 27));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new sa0(ee0Var, 2));
                    break;
                }
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((jc0) obj2, tLObject, (String) obj, tL_error, 18));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new oc0((id0) obj2, tL_error, (TL_account.confirmPhone) obj, i11));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new oc0((de0) obj2, tLObject, (HashMap) obj, 6));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((de0) obj2, tL_error, tLObject, (String) obj, 22));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new oc0((ch0) obj2, tLObject, (org.telegram.ui.Components.fx) obj, 9));
                break;
            case 13:
                hj0 hj0Var = (hj0) obj2;
                hj0Var.getClass();
                hj0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 14:
                org.telegram.messenger.g0.h3(new oc0((zj0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                break;
            case 15:
                jl0 jl0Var = (jl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.h3(new mk0(jl0Var, tL_error, tLObject2, i11));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new bd0(25, jl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 16:
                jl0 jl0Var2 = (jl0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    l00 l00Var = jl0Var2.e1;
                    if (l00Var == null || !((Boolean) l00Var.a(tL_error)).booleanValue()) {
                        org.telegram.messenger.g0.h3(new oc0(jl0Var2, tL_error, tL_payments_sendPaymentForm, 17));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.h3(new ik0(jl0Var2, tLObject, i11));
                        break;
                    }
                } else {
                    org.telegram.messenger.c20 c20Var = jl0Var2.c1;
                    if (c20Var == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                TLRPC.Update update = updates.updates.get(i12);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i12++;
                                }
                            }
                        }
                        jl0Var2.getMessagesController().O3(updates, false);
                        org.telegram.messenger.g0.h3(new bd0(26, jl0Var2, messageArr));
                        break;
                    } else {
                        c20Var.a((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 17:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0((jl0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 26));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new lo0((org.telegram.ui.ActionBar.f2) obj2, (Object) tL_error, tLObject, obj, 1));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new lo0((org.telegram.ui.ActionBar.f2) obj2, (Object) tL_error, tLObject, obj, 2));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new sn0(13, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.r8) obj));
                break;
            case 21:
                RectF rectF = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new lo0((org.telegram.ui.ActionBar.f2) obj2, (Object) tL_error, tLObject, obj, 6));
                break;
            case 22:
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new lo0(obj2, (Object) tLObject, (Object) tL_error, obj, 5));
                break;
            case 23:
                RectF rectF3 = ProfileActivity.V6;
                org.telegram.messenger.g0.h3(new lo0(obj2, (Object) tLObject, obj, (Object) tL_error, 8));
                break;
            case 24:
                org.telegram.messenger.g0.h3(new lo0((ew0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 10));
                break;
            case 25:
                org.telegram.messenger.g0.h3(new v21((w21) obj2, tL_error, (TLRPC.TL_authorization) obj, i10));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new v21((x21) obj2, tL_error, (TLRPC.TL_authorization) obj, i11));
                break;
            case 27:
                org.telegram.messenger.g0.h3(new lo0((z21) obj2, tLObject, tL_error, (j9) obj, 13));
                break;
            case 28:
                org.telegram.messenger.g0.h3(new ax0(10, (n31) obj2, (TLRPC.TL_attachMenuBot) obj));
                break;
            default:
                org.telegram.messenger.g0.h3(new lo0((org.telegram.ui.ActionBar.f2) obj2, (Object) tL_error, tLObject, obj, 14));
                break;
        }
    }
}
