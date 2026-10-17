package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rw0;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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

    public /* synthetic */ a6(int i10, File file, String str, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.c = i10;
        this.f = file;
        this.d = str;
        this.b = b2Var;
        this.h = zArr;
        this.e = str2;
        this.r = callback;
        this.n = zArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.n h;
        int i10 = this.a;
        int i11 = 1;
        int i12 = this.c;
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
                MediaController.lambda$saveFile$51(this.c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.b2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.x;
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i12).putUsers(authorizationform.users, false);
                    xm0 xm0Var = new xm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    xm0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, xm0Var);
                    } else {
                        externalActionActivity.c.c(-1, xm0Var);
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
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                TLObject tLObject2 = (TLObject) obj4;
                pf.c cVar = (pf.c) obj2;
                String str3 = (String) obj6;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                MessagesController messagesController = (MessagesController) obj;
                String str4 = (String) obj5;
                Pattern pattern = LaunchActivity.C1;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    messagesController.putUser(user, false);
                    if (!UserObject.isUserSelf(user)) {
                        launchActivity.Z(i12, user, str4, cVar);
                        return;
                    }
                    if (cVar != null) {
                        cVar.b();
                    }
                    launchActivity.m0(null, user.id);
                    return;
                }
                if (cVar != null) {
                    cVar.b();
                }
                StringBuilder v = a1.g.v("cant import contact token. token=", str3, " err=");
                v.append(tL_error == null ? null : tL_error.text);
                FileLog.e(v.toString());
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    wh.q(R.string.NoUsernameFound, org.telegram.ui.Components.xc.a0(R), null);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                rw0 rw0Var = (rw0) obj4;
                c5.g gVar = (c5.g) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (!(((TLObject) obj7) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Components.f5.e0(i12, tL_error2, n2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = n2Var != null ? n2Var.getParentActivity() : AndroidUtilities.getActivity();
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = n2Var.getAccountInstance();
                n4.s sVar = new n4.s(9, z10);
                sVar.K(BillingController.PREMIUM_PRODUCT_DETAILS);
                rw0Var.a();
                String str5 = rw0Var.g.a;
                if (TextUtils.isEmpty(str5)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                sVar.c = str5;
                billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(sVar.j()), gVar, false);
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) obj7;
                TextView[] textViewArr = (TextView[]) obj6;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj5;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                String[] strArr = (String[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                byte[] bArr = (byte[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                int i13 = this.c;
                ai.u0 u0Var = new ai.u0(runnableArr, textViewArr, i13, d6Var, 9);
                org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i13);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.c0 c0Var = new org.telegram.ui.Wallet.c0(w9, wallettransaction.peer.address, nftitem, strArr[0], u0Var);
                    w9.j0(c0Var);
                    h = new org.telegram.ui.Wallet.n(c0Var, i11);
                } else {
                    h = w9.h(wallettransaction.peer.address, wallettransaction.amount, strArr[0], zArr[0] ? bArr : null, u0Var);
                }
                runnableArr[0] = h;
                return;
        }
    }

    public /* synthetic */ a6(TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, rw0 rw0Var, c5.g gVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f = tLObject;
        this.d = n2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.b = rw0Var;
        this.h = gVar;
        this.c = i10;
        this.n = tL_error;
        this.r = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ a6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f = externalActionActivity;
        this.b = b2Var;
        this.h = tLObject;
        this.c = i10;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ a6(LaunchActivity launchActivity, TLObject tLObject, pf.c cVar, String str, TLRPC.TL_error tL_error, MessagesController messagesController, int i10, String str2) {
        this.f = launchActivity;
        this.b = tLObject;
        this.h = cVar;
        this.d = str;
        this.n = tL_error;
        this.r = messagesController;
        this.c = i10;
        this.e = str2;
    }

    public /* synthetic */ a6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.d6 d6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f = runnableArr;
        this.d = textViewArr;
        this.c = i10;
        this.e = d6Var;
        this.b = wallettransaction;
        this.n = strArr;
        this.h = zArr;
        this.r = bArr;
    }
}
