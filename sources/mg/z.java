package mg;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
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
import org.telegram.ui.me0;
import org.telegram.ui.mk0;
import org.telegram.ui.nk0;
import org.telegram.ui.pd0;
import org.telegram.ui.re0;
import org.telegram.ui.v50;
import org.telegram.ui.v8;
import org.telegram.ui.xk0;
import org.telegram.ui.yy;
import rh.e6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                org.telegram.messenger.i0.g3(new c0(tL_error, (o0) obj5, tLObject, (wp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (k2) obj2, (o0) obj, 0));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new c0(tL_error, (r20) obj5, tLObject, (wp) obj4, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (k2) obj2, (r20) obj, 1));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new v8(tLObject, (String[]) obj5, (FrameLayout) obj4, (p80) obj3, (z2) obj2, (p6) obj, 0));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new v8((k2) obj5, obj4, obj3, obj2, tLObject, obj, 2));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new c0((vs) obj5, tL_error, (TLObject) obj4, (Object) tLObject, obj3, obj2, obj, 3));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new c0((fn) obj5, (org.telegram.ui.ActionBar.x1) obj4, tLObject, (HashSet) obj3, (TLRPC.TL_inputGroupCallInviteMessage) obj2, (kj) obj, tL_error));
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
                re0 re0Var = (re0) obj5;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                Purchase purchase = (Purchase) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                v50 v50Var = (v50) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        org.telegram.messenger.i0.g3(new yy(v50Var, 28));
                        break;
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = wp.z0(updates, TL_update.TL_updateSentPhoneCode.class);
                    int size = z02.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = z02.get(i11);
                        i11++;
                        org.telegram.messenger.i0.g3(new pd0(re0Var, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj6, 6));
                    }
                    re0Var.w.getMessagesController().L3(updates, false);
                    org.telegram.messenger.u1.i().e(purchase, tL_payments_canPurchaseStore.purpose, null);
                    org.telegram.messenger.i0.g3(new me0(re0Var, 4));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.i0.g3(new c0((vs) obj5, tL_error, tLObject, obj4, obj3, obj2, obj, 7));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new c0((mk0) obj5, tLObject, (String) obj4, (TLRPC.TL_secureRequiredType) obj3, (nk0) obj2, tL_error, (xk0) obj));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new v8(obj5, (Object) tL_error, obj4, obj3, obj2, obj, 8));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new c0((e6) obj5, tLObject, (kj) obj4, (TLRPC.InputInvoice) obj3, (r20) obj2, (cc) obj, tL_error));
                break;
            default:
                org.telegram.messenger.i0.g3(new v8(obj5, tLObject, obj4, obj3, obj2, obj, 26));
                break;
        }
    }
}
