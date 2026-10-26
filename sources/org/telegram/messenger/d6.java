package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.in0;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ d6(int i10, File file, String str, org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.c = i10;
        this.f = file;
        this.d = str;
        this.b = e2Var;
        this.h = zArr;
        this.e = str2;
        this.r = callback;
        this.n = zArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.m h;
        int i10 = this.a;
        int i11 = this.c;
        int i12 = 1;
        boolean z10 = false;
        Object obj = this.r;
        Object obj2 = this.h;
        Object obj3 = this.n;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$53(this.c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.e2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.x;
                try {
                    e2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    in0 in0Var = new in0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    in0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, in0Var);
                    } else {
                        externalActionActivity.c.c(-1, in0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.c.e0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.e0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                xw0 xw0Var = (xw0) obj4;
                d5.g gVar = (d5.g) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (!(((TLObject) obj7) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Components.g5.e0(i11, tL_error, r2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = r2Var != null ? r2Var.getParentActivity() : AndroidUtilities.getActivity();
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = r2Var.getAccountInstance();
                rf.b bVar = new rf.b(13, z10);
                bVar.R(BillingController.PREMIUM_PRODUCT_DETAILS);
                xw0Var.a();
                String str3 = xw0Var.g.a;
                if (TextUtils.isEmpty(str3)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                bVar.c = str3;
                billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.E()), gVar, false);
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) obj7;
                TextView[] textViewArr = (TextView[]) obj6;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj5;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                String[] strArr = (String[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                byte[] bArr = (byte[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                int i13 = this.c;
                bi.v0 v0Var = new bi.v0(runnableArr, textViewArr, i13, u6Var, 10);
                org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(i13);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.b0 b0Var = new org.telegram.ui.Wallet.b0(w10, wallettransaction.peer.address, nftitem, strArr[0], v0Var);
                    w10.j0(b0Var);
                    h = new org.telegram.ui.Wallet.m(b0Var, i12);
                } else {
                    String str4 = wallettransaction.peer.address;
                    long j10 = wallettransaction.amount;
                    String str5 = strArr[0];
                    if (!zArr[0]) {
                        bArr = null;
                    }
                    h = w10.h(str4, j10, str5, bArr, v0Var);
                }
                runnableArr[0] = h;
                return;
        }
    }

    public /* synthetic */ d6(TLObject tLObject, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, xw0 xw0Var, d5.g gVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f = tLObject;
        this.d = r2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.b = xw0Var;
        this.h = gVar;
        this.c = i10;
        this.n = tL_error;
        this.r = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ d6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f = externalActionActivity;
        this.b = e2Var;
        this.h = tLObject;
        this.c = i10;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ d6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.u6 u6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f = runnableArr;
        this.d = textViewArr;
        this.c = i10;
        this.e = u6Var;
        this.b = wallettransaction;
        this.n = strArr;
        this.h = zArr;
        this.r = bArr;
    }
}
