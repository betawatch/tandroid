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
import org.telegram.ui.fn0;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ a6(int i10, File file, String str, org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.c = i10;
        this.f = file;
        this.d = str;
        this.b = d2Var;
        this.h = zArr;
        this.e = str2;
        this.r = callback;
        this.n = zArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.d2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.x;
                try {
                    d2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    fn0 fn0Var = new fn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    fn0Var.z1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, fn0Var);
                    } else {
                        externalActionActivity.c.c(-1, fn0Var);
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
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                xw0 xw0Var = (xw0) obj4;
                p2.e eVar = (p2.e) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (!(((TLObject) obj7) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Components.z4.f0(i11, tL_error, p2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = p2Var != null ? p2Var.getParentActivity() : AndroidUtilities.getActivity();
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = p2Var.getAccountInstance();
                n7.qa qaVar = new n7.qa(24);
                qaVar.L0(BillingController.PREMIUM_PRODUCT_DETAILS);
                xw0Var.a();
                String str3 = xw0Var.g.a;
                if (TextUtils.isEmpty(str3)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                qaVar.c = str3;
                billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(qaVar.X()), eVar, false);
                return;
        }
    }

    public /* synthetic */ a6(TLObject tLObject, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, xw0 xw0Var, p2.e eVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f = tLObject;
        this.d = p2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.b = xw0Var;
        this.h = eVar;
        this.c = i10;
        this.n = tL_error;
        this.r = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ a6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f = externalActionActivity;
        this.b = d2Var;
        this.h = tLObject;
        this.c = i10;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }
}
