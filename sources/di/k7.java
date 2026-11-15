package di;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.fd0;
import org.telegram.ui.ij0;
import org.telegram.ui.iz;
import org.telegram.ui.jj0;
import org.telegram.ui.kd0;
import org.telegram.ui.lc0;
import org.telegram.ui.lm;
import org.telegram.ui.tj0;
import org.telegram.ui.x11;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        Object obj = this.f;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new j6((v8) obj4, tLObject, (gj) obj3, (TLRPC.InputInvoice) obj2, (z10) obj5, (org.telegram.ui.Components.cc) obj, tL_error));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new bi.p1((int[]) obj4, tLObject, (np) obj3, (TLRPC.User[]) obj2, (hi.mb) obj5, (hi.kb) obj, 9, false));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new bi.p1(tLObject, obj4, obj3, obj2, obj5, obj, 11));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new bi.p1((an) obj4, (vf.b) obj3, (org.telegram.ui.Cells.q1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new j6((an) obj4, tL_error, (TLObject) obj3, tLObject, (z2) obj2, (String) obj5, (vf.b) obj));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new j6((lm) obj4, (org.telegram.ui.ActionBar.t1) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (gj) obj3, tL_error, 6));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new bi.p1(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.e6) obj3, (hi.d) obj2, (org.telegram.ui.p6) obj5, (Runnable) obj));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new bi.p1((bw0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 16, false));
                break;
            case 8:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new j6((LaunchActivity) obj4, (org.telegram.ui.ActionBar.t1) obj3, tL_error, (String) obj2, (Bundle) obj5, tLObject, (TL_account.sendConfirmPhoneCode) obj, 7));
                break;
            case 9:
                kd0 kd0Var = (kd0) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                Purchase purchase = (Purchase) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj5;
                ma0 ma0Var = (ma0) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new iz(ma0Var, 28));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = np.z0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = z02.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = z02.get(i10);
                        i10++;
                        org.telegram.messenger.g0.h3(new lc0(kd0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 5));
                    }
                    kd0Var.w.getMessagesController().O3(updates, false);
                    org.telegram.messenger.r1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.g0.h3(new fd0(kd0Var, 4));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.h3(new j6((is) obj4, (Object) tL_error, (Object) tLObject, obj3, (String) obj2, obj5, obj, 9));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new j6((ij0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (jj0) obj5, tL_error, (tj0) obj));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new bi.p1((x11) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new j6(tL_error, (wg.t) obj4, tLObject, (np) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.e2) obj5, (wg.t) obj, 16));
                break;
            default:
                org.telegram.messenger.g0.h3(new j6(tL_error, (z10) obj5, tLObject, (np) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.e2) obj2, (z10) obj));
                break;
        }
    }

    public /* synthetic */ k7(z10 z10Var, np npVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.e2 e2Var, z10 z10Var2) {
        this.a = 14;
        this.e = z10Var;
        this.b = npVar;
        this.c = tL_inputInvoicePremiumGiftCode;
        this.d = e2Var;
        this.f = z10Var2;
    }

    public /* synthetic */ k7(lm lmVar, org.telegram.ui.ActionBar.t1 t1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, gj gjVar) {
        this.a = 5;
        this.b = lmVar;
        this.d = t1Var;
        this.e = hashSet;
        this.f = tL_inputGroupCallInviteMessage;
        this.c = gjVar;
    }
}
