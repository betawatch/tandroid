package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.hw0;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ x5(int i9, File file, String str, org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.c = i9;
        this.f = file;
        this.d = str;
        this.b = c2Var;
        this.h = zArr;
        this.e = str2;
        this.r = callback;
        this.n = zArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        int i10 = this.c;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f;
        switch (i9) {
            case 0:
                MediaController.lambda$saveFile$50(this.c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.c2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.x;
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i10).putUsers(authorizationform.users, false);
                    wm0 wm0Var = new wm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    wm0Var.y1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, wm0Var);
                    } else {
                        externalActionActivity.c.c(-1, wm0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                hw0 hw0Var = (hw0) obj4;
                n2.e eVar = (n2.e) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (!(((TLObject) obj7) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Components.y4.f0(i10, tL_error, o2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = o2Var != null ? o2Var.getParentActivity() : AndroidUtilities.getActivity();
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = o2Var.getAccountInstance();
                g5.b bVar = new g5.b(23);
                bVar.t(BillingController.PREMIUM_PRODUCT_DETAILS);
                hw0Var.a();
                String str3 = hw0Var.g.a;
                if (TextUtils.isEmpty(str3)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                bVar.c = str3;
                billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.h()), eVar, false);
                return;
        }
    }

    public /* synthetic */ x5(TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, hw0 hw0Var, n2.e eVar, int i9, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f = tLObject;
        this.d = o2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.b = hw0Var;
        this.h = eVar;
        this.c = i9;
        this.n = tL_error;
        this.r = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ x5(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i9, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f = externalActionActivity;
        this.b = c2Var;
        this.h = tLObject;
        this.c = i9;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }
}
