package mg;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn;
import org.telegram.ui.ne0;
import org.telegram.ui.ok0;
import org.telegram.ui.pk0;
import org.telegram.ui.qd0;
import org.telegram.ui.se0;
import org.telegram.ui.v8;
import org.telegram.ui.w50;
import org.telegram.ui.zk0;
import org.telegram.ui.zy;
import rh.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
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
                org.telegram.messenger.i0.g3(new c0(tL_error, (o0) obj5, tLObject, (vp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (k2) obj2, (o0) obj, 0));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new c0(tL_error, (q20) obj5, tLObject, (vp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (k2) obj2, (q20) obj, 1));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new v8(tLObject, (String[]) obj5, (FrameLayout) obj4, (p80) obj3, (z2) obj2, (p6) obj, 0));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new v8((k2) obj5, obj4, obj3, obj2, tLObject, obj, 2));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new c0((us) obj5, tL_error, (TLObject) obj4, (Object) tLObject, obj3, obj2, obj, 3));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new c0((fn) obj5, (org.telegram.ui.ActionBar.x1) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (jj) obj, tL_error));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new v8((TLObject) tL_error, (Context) obj5, (p6) obj4, obj3, obj2, (Runnable) obj, 3));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new v8(obj5, tLObject, obj4, obj3, obj2, obj, 4));
                break;
            case 8:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new c0((LaunchActivity) obj5, (org.telegram.ui.ActionBar.x1) obj4, tL_error, (String) obj3, (Bundle) obj2, tLObject, (TL_account.sendConfirmPhoneCode) obj));
                break;
            case 9:
                se0 se0Var = (se0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                w50 w50Var = (w50) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        org.telegram.messenger.i0.g3(new zy(w50Var, 28));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = vp.z0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = z02.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = z02.get(i11);
                        i11++;
                        org.telegram.messenger.i0.g3(new qd0(se0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 6));
                    }
                    se0Var.w.getMessagesController().L3(updates, false);
                    org.telegram.messenger.u1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.i0.g3(new ne0(se0Var, 4));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.i0.g3(new c0((us) obj5, tL_error, tLObject, obj4, obj3, obj2, obj, 7));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new c0((ok0) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (pk0) obj2, tL_error, (zk0) obj));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new v8(obj5, (Object) tL_error, obj4, obj3, obj2, obj, 8));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new c0((e6) obj5, tLObject, (jj) obj4, (TLRPC.InputInvoice) obj3, (q20) obj2, (cc) obj, tL_error));
                break;
            default:
                org.telegram.messenger.i0.g3(new v8(obj5, tLObject, obj4, obj3, obj2, obj, 26));
                break;
        }
    }
}
