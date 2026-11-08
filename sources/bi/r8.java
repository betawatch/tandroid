package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a21;
import org.telegram.ui.an;
import org.telegram.ui.fj0;
import org.telegram.ui.gj0;
import org.telegram.ui.hd0;
import org.telegram.ui.hz;
import org.telegram.ui.ld0;
import org.telegram.ui.lm;
import org.telegram.ui.mc0;
import org.telegram.ui.qj0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
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
                org.telegram.messenger.g0.h3(new r7((ea) obj4, tLObject, (ij) obj3, (TLRPC.InputInvoice) obj2, (c20) obj5, (org.telegram.ui.Components.hc) obj, tL_error));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new a3((int[]) obj4, tLObject, (qp) obj3, (TLRPC.User[]) obj2, (fi.pb) obj5, (fi.nb) obj, 8));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new a3(tLObject, obj4, obj3, obj2, obj5, obj, 10));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new a3((an) obj4, (vf.b) obj3, (org.telegram.ui.Cells.q1) obj2, (String) obj5, tLObject, (CharacterStyle) obj));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new r7((an) obj4, tL_error, (TLObject) obj3, tLObject, (t3) obj2, (String) obj5, (vf.b) obj));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new r7((lm) obj4, (org.telegram.ui.ActionBar.u1) obj2, tLObject, (HashSet) obj5, (TLRPC.TL_inputGroupCallInviteMessage) obj, (ij) obj3, tL_error, 6));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new a3(tL_error, (Context) obj4, (org.telegram.ui.ActionBar.f6) obj3, (fi.d) obj2, (org.telegram.ui.p6) obj5, (Runnable) obj));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new a3((yv0) obj4, tLObject, (EditTextBoldCursor) obj3, (TextView) obj2, (TextView) obj5, (int[]) obj, 14));
                break;
            case 8:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new r7((LaunchActivity) obj4, (org.telegram.ui.ActionBar.u1) obj3, tL_error, (String) obj2, (Bundle) obj5, tLObject, (TL_account.sendConfirmPhoneCode) obj, 7));
                break;
            case 9:
                ld0 ld0Var = (ld0) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                Purchase purchase = (Purchase) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj5;
                kn0 kn0Var = (kn0) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new hz(kn0Var, 28));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = qp.z0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = z02.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = z02.get(i10);
                        i10++;
                        org.telegram.messenger.g0.h3(new mc0(ld0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 5));
                    }
                    ld0Var.w.getMessagesController().O3(updates, false);
                    org.telegram.messenger.r1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.g0.h3(new hd0(ld0Var, 4));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.g0.h3(new r7((ls) obj4, (Object) tL_error, (Object) tLObject, obj3, (String) obj2, obj5, obj, 9));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new r7((fj0) obj4, tLObject, (String) obj3, (TLRPC.TL_secureRequiredType) obj2, (gj0) obj5, tL_error, (qj0) obj));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new a3((a21) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TLRPC.User) obj2, (TwoStepVerificationActivity) obj5, (TLRPC.TL_channels_editCreator) obj));
                break;
            case 13:
                org.telegram.messenger.g0.h3(new r7(tL_error, (wg.v) obj4, tLObject, (qp) obj3, (TLRPC.TL_inputInvoicePremiumGiftCode) obj2, (org.telegram.ui.ActionBar.f2) obj5, (wg.v) obj, 16));
                break;
            default:
                org.telegram.messenger.g0.h3(new r7(tL_error, (c20) obj5, tLObject, (qp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (org.telegram.ui.ActionBar.f2) obj2, (c20) obj));
                break;
        }
    }

    public /* synthetic */ r8(c20 c20Var, qp qpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.f2 f2Var, c20 c20Var2) {
        this.a = 14;
        this.e = c20Var;
        this.b = qpVar;
        this.c = tL_inputInvoicePremiumGiftCode;
        this.d = f2Var;
        this.f = c20Var2;
    }

    public /* synthetic */ r8(lm lmVar, org.telegram.ui.ActionBar.u1 u1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, ij ijVar) {
        this.a = 5;
        this.b = lmVar;
        this.d = u1Var;
        this.e = hashSet;
        this.f = tL_inputGroupCallInviteMessage;
        this.c = ijVar;
    }
}
