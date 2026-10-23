package org.telegram.ui;

import android.app.Activity;
import android.util.Base64;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Wallet.p0 p0Var;
        String h;
        byte[] bArr;
        String h10;
        String jSONObject;
        switch (this.a) {
            case 0:
                q01 q01Var = (q01) this.b;
                String str = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                org.telegram.ui.ActionBar.o2 o2Var = q01Var.e;
                if (str.equals(q01Var.y)) {
                    if (!q01Var.w && (o2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) o2Var).P.b.getImageReceiver().startAnimation();
                            ((ProfileActivity) o2Var).P.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    q01Var.w = true;
                    q01Var.r = arrayList;
                    q01Var.s = arrayList2;
                    q01Var.n = arrayList3;
                    q01Var.l();
                    if (o2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) o2Var).P.b.getImageReceiver().startAnimation();
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                b61 b61Var = (b61) this.b;
                View view = (View) this.c;
                org.telegram.ui.Components.a6 a6Var = (org.telegram.ui.Components.a6) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                k51 k51Var = (k51) this.f;
                b61Var.getClass();
                b61Var.p(view, Long.valueOf(a6Var.documentId), document, k51Var.v, null);
                return;
            case 2:
                l61 l61Var = (l61) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                l61Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    l61Var.T(user, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                org.telegram.ui.Wallet.d dVar = (org.telegram.ui.Wallet.d) this.f;
                String str2 = (String) this.c;
                try {
                    c2Var.dismiss();
                    if (i0Var != null && !i0Var.e()) {
                        TL_wallet.WalletState walletState = l0Var.e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (p0Var = l0Var.c) != null && !p0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            l0Var.c.p(UserConfig.getInstance(l0Var.a).getClientUserId(), ((TL_wallet.TL_walletState) l0Var.e).public_key, i0Var, null);
                        }
                    }
                    dVar.run(i0Var, str2);
                    if (i0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
            case 4:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.b;
                JSONObject jSONObject2 = (JSONObject) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                String str3 = (String) this.c;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f;
                e2Var.getClass();
                if (jSONObject2 == null) {
                    callback.run(str3);
                    return;
                } else {
                    e2Var.C(a2Var.a.id, a2Var.b, jSONObject2, callback);
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.b;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) this.c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.d;
                org.telegram.ui.Wallet.w wVar = (org.telegram.ui.Wallet.w) this.e;
                ai.r3 r3Var = (ai.r3) this.f;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto(i0Var2, a2Var2.a, a2Var2.h, a2Var2.g, new JSONObject().put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2))).getString("challengeAnswer"), 2);
                    h = null;
                } catch (Exception e10) {
                    h = org.telegram.ui.Wallet.e2.h("decrypt challenge", e10);
                    bArr = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.w6((Object) bArr, (Object) wVar, h, (Object) r3Var, 8));
                return;
            case 6:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.b;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.c;
                org.telegram.ui.Wallet.a2 a2Var3 = (org.telegram.ui.Wallet.a2) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) this.f;
                try {
                    jSONObject = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
                } catch (Exception e11) {
                    h10 = org.telegram.ui.Wallet.e2.h("save transfer", e11);
                }
                if (!MessagesController.getMainSettings(e2Var2.a).edit().putString(org.telegram.ui.Wallet.e2.j(a2Var3.a.id, a2Var3.b) + ".transfer", jSONObject).commit()) {
                    throw new IllegalStateException("Could not save signed transfer");
                }
                h10 = null;
                AndroidUtilities.runOnUIThread(new ai.g3(e2Var2, h10, callback2, a2Var3, i0Var3, sendtransfer, 22));
                return;
            case 7:
                ((WalletEngine2) this.b).lambda$emulateSendNFT$19((AtomicBoolean) this.d, (Utilities.Callback2) this.e, (TL_wallet.walletTransaction) this.f, (String) this.c);
                return;
            case 8:
                ((WalletEngine2) this.b).lambda$prepareSend$49((Utilities.Callback3) this.d, (TL_wallet.sendTransfer) this.e, (String) this.c, (String) this.f);
                return;
            case 9:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Utilities.Callback callback3 = (Utilities.Callback) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                MessagesController messagesController = (MessagesController) this.e;
                Utilities.Callback callback4 = (Utilities.Callback) this.f;
                if (tL_error2 != null) {
                    callback3.run(tL_error2);
                    return;
                } else {
                    if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                        TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject2;
                        messagesController.putUsers(tL_premium_myBoosts.users, false);
                        messagesController.putChats(tL_premium_myBoosts.chats, false);
                        callback4.run(tL_premium_myBoosts);
                        return;
                    }
                    return;
                }
            case 10:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                org.telegram.messenger.w wVar2 = (org.telegram.messenger.w) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                MessagesController messagesController2 = (MessagesController) this.e;
                org.telegram.messenger.k2 k2Var = (org.telegram.messenger.k2) this.f;
                if (tL_error3 != null) {
                    wVar2.run(tL_error3);
                    return;
                } else {
                    if (tLObject3 instanceof TL_stories.TL_premium_myBoosts) {
                        TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject3;
                        messagesController2.putUsers(tL_premium_myBoosts2.users, false);
                        messagesController2.putChats(tL_premium_myBoosts2.chats, false);
                        k2Var.run(tL_premium_myBoosts2);
                        return;
                    }
                    return;
                }
            case 11:
                TLObject tLObject4 = (TLObject) this.b;
                MessagesController messagesController3 = (MessagesController) this.c;
                ci.y2 y2Var = (ci.y2) this.d;
                ug.e eVar = (ug.e) this.e;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f;
                if (tLObject4 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject4;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    y2Var.run(tL_payments_checkedGiftCode);
                }
                eVar.run(tL_error4);
                return;
            case 12:
                ug.l1.R((ug.l1) this.b, (TLObject) this.c, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.e, (TLRPC.TL_error) this.f);
                return;
            default:
                yh.x4 x4Var = (yh.x4) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                int i10 = x4Var.Y;
                org.telegram.ui.ActionBar.o2 o2Var2 = x4Var.n;
                if (!(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error5 != null) {
                        org.telegram.ui.Components.f5.f0(i10, tL_error5, o2Var2, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = o2Var2.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i10);
                    n4.s sVar = new n4.s(9, false);
                    sVar.G(x4Var.e0.h);
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(sVar.k()));
                    return;
                }
        }
    }

    public /* synthetic */ k01(Object obj, Object obj2, Object obj3, Object obj4, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = str;
    }

    public /* synthetic */ k01(Object obj, Object obj2, Object obj3, String str, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = str;
        this.f = obj4;
    }
}
