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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d00(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 22;
        int i11 = 23;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.voip.o(i11, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((n30) obj2, tL_error, tLObject, (String) obj, 17));
                break;
            case 2:
                j50 j50Var = (j50) obj2;
                if (Objects.equals(j50Var.a.e, (String) obj)) {
                    org.telegram.messenger.g0.g3(new i50(i13, j50Var, tLObject));
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
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((org.telegram.ui.ActionBar.t1) obj2, tLObject, (g) obj, tL_error, 21));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new up((r90) obj2, tLObject, (String) obj, 21));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new up((o90) obj2, tLObject, (TLRPC.User) obj, i10));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((o90) obj2, tLObject, (HashSet) obj, tL_error, 23));
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
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz((gc0) obj2, tLObject, (String) obj, tL_error, 26));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new lc0((gd0) obj2, tL_error, (TL_account.confirmPhone) obj, i13));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new lc0((ce0) obj2, tLObject, (HashMap) obj, 6));
                break;
            case 13:
                org.telegram.messenger.g0.g3(new yd0(obj2, (Object) tL_error, (Object) tLObject, obj, 0));
                break;
            case 14:
                org.telegram.messenger.g0.g3(new lc0((dh0) obj2, tLObject, (org.telegram.ui.Components.ph) obj, 9));
                break;
            case 15:
                jj0 jj0Var = (jj0) obj2;
                jj0Var.getClass();
                jj0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 16:
                org.telegram.messenger.g0.g3(new lc0((bk0) obj2, tL_error, (TL_account.verifyPhone) obj, 15));
                break;
            case 17:
                kl0 kl0Var = (kl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    org.telegram.messenger.g0.g3(new ok0(kl0Var, tL_error, tLObject2, i13));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new bd0(i10, kl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    break;
                }
            case 18:
                kl0 kl0Var2 = (kl0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    n00 n00Var = kl0Var2.f1;
                    if (n00Var == null || !((Boolean) n00Var.a(tL_error)).booleanValue()) {
                        org.telegram.messenger.g0.g3(new lc0(kl0Var2, tL_error, tL_payments_sendPaymentForm, 17));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.g3(new jk0(kl0Var2, tLObject, i13));
                        break;
                    }
                } else {
                    org.telegram.messenger.w10 w10Var = kl0Var2.d1;
                    if (w10Var == null) {
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
                        kl0Var2.getMessagesController().V3(updates, false);
                        org.telegram.messenger.g0.g3(new bd0(i11, kl0Var2, messageArr));
                        break;
                    } else {
                        w10Var.a((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 19:
                org.telegram.messenger.g0.g3(new yd0((kl0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, false, 4));
                break;
            case 20:
                org.telegram.messenger.g0.g3(new yd0(obj2, (Object) tL_error, (Object) tLObject, obj, 9));
                break;
            case 21:
                org.telegram.messenger.g0.g3(new yd0(obj2, (Object) tL_error, (Object) tLObject, obj, 10));
                break;
            case 22:
                org.telegram.messenger.g0.g3(new mp0(10, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.r8) obj));
                break;
            case 23:
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new yd0(obj2, (Object) tL_error, (Object) tLObject, obj, 14));
                break;
            case 24:
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new yd0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, false, 13));
                break;
            case 25:
                RectF rectF3 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new yd0(obj2, tLObject, obj, (Object) tL_error, 16));
                break;
            case 26:
                org.telegram.messenger.g0.g3(new yd0(obj2, tLObject, obj, (Object) tL_error, 18));
                break;
            case 27:
                org.telegram.messenger.g0.g3(new t21((u21) obj2, tL_error, (TLRPC.TL_authorization) obj, i12));
                break;
            case 28:
                org.telegram.messenger.g0.g3(new t21((v21) obj2, tL_error, (TLRPC.TL_authorization) obj, i13));
                break;
            default:
                org.telegram.messenger.g0.g3(new yd0((x21) obj2, tLObject, tL_error, (k9) obj, false, 21));
                break;
        }
    }
}
