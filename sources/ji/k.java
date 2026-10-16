package ji;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import di.wa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.m51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.ac0;
import org.telegram.ui.ff;
import org.telegram.ui.ic0;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
        this.r = obj8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) this.b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.c;
                di.d dVar = (di.d) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ii.a aVar = (ii.a) this.f;
                ImageView imageView = (ImageView) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.n;
                int[] iArr = (int[]) this.r;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z10 = zArr[0];
                    String str2 = strArr[0];
                    aVar.run(str2, new c(str2, strArr, imageView, c6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    break;
                }
            case 1:
                ((MessagesStorage) this.b).lambda$loadUnreadMessages$76((a0.h) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (ArrayList) this.n, (HashMap) this.r);
                break;
            case 2:
                ic0 ic0Var = (ic0) this.b;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                String str6 = (String) this.h;
                String str7 = (String) this.n;
                String str8 = (String) this.r;
                org.telegram.ui.Wallet.e2 e2Var = k0Var.g;
                ac0 ac0Var = new ac0(ic0Var, str8, 1);
                e2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = str3;
                tonconnectcreatesession.manifest_url = str4;
                e2Var.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.h1(e2Var, ac0Var, str5, str4, str6, str7));
                break;
            case 3:
                UserInfoActivity.Y((UserInfoActivity) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (TL_account.TL_birthday) this.e, (TLRPC.UserFull) this.f, (TLObject) this.h, (int[]) this.r, (ArrayList) this.n);
                break;
            case 4:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.n;
                mt mtVar = (mt) this.r;
                e2Var2.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ff((Object) e2Var2, (Object) z1Var, (Object) tonconnectsession, str9, (Object) bArr, (Object) org.telegram.ui.Wallet.e2.p(h0Var, tonconnectsession, str9, bArr, z1Var.a, z1Var.b, z1Var.d, tonconnectchallenge, e2Var2.f.getCurrentTime()), (Object) mtVar, 8));
                    break;
                } catch (Exception e) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.c1(mtVar, org.telegram.ui.Wallet.e2.h("prepare connect challenge", e), 0));
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.e;
                byte[] bArr2 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.h;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.n;
                bi.f0 f0Var = (bi.f0) this.r;
                e2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new m51(e2Var3, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.e2.q(h0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, e2Var3.f.getCurrentTime()), f0Var, h0Var2, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e7) {
                    f0Var.run(null, org.telegram.ui.Wallet.e2.h("prepare OAuth identity", e7));
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.e2 e2Var4 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.e;
                byte[] bArr3 = (byte[]) this.f;
                String str12 = ((org.telegram.ui.Wallet.b2) this.h).a;
                mt mtVar2 = (mt) this.n;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) this.r;
                if (!e2Var4.c(z1Var2, tonconnectsession3, str11, bArr3) || ((str = z1Var2.e.client_id) != null && !str12.equalsIgnoreCase(str))) {
                    mtVar2.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.id;
                    tonconnectregisterkey.client_id = str12;
                    e2Var4.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.b1(e2Var4, mtVar2, h0Var3, tonconnectsession3, str11, bArr3, z1Var2));
                    break;
                }
            case 7:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                ug.v vVar = (ug.v) this.c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.e;
                c5.i iVar = (c5.i) this.f;
                ug.v vVar2 = (ug.v) this.h;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error == null) {
                    if (tLObject != null) {
                        BillingController.getInstance().addResultListener(((c5.p) list.get(0)).c, new di.j5(3, iVar, vVar2));
                        BillingController.getInstance().setOnCanceled(new ug.r(vVar, 0));
                        BillingController billingController = BillingController.getInstance();
                        Activity parentActivity = m2Var.getParentActivity();
                        AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                        qf.b bVar = new qf.b(9);
                        bVar.e0((c5.p) list.get(0));
                        billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.v()));
                        break;
                    }
                } else {
                    vVar.run(tL_error);
                    break;
                }
                break;
            case 8:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.e;
                c5.i iVar2 = (c5.i) this.f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error2 == null) {
                    if (tLObject2 != null) {
                        BillingController.getInstance().addResultListener(((c5.p) list2.get(0)).c, new di.j5(2, iVar2, callback2));
                        BillingController.getInstance().setOnCanceled(new wa(1, callback));
                        BillingController billingController2 = BillingController.getInstance();
                        Activity parentActivity2 = m2Var2.getParentActivity();
                        AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                        qf.b bVar2 = new qf.b(9);
                        bVar2.e0((c5.p) list2.get(0));
                        billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.v()));
                        break;
                    }
                } else {
                    callback.run(tL_error2);
                    break;
                }
                break;
            case 9:
                TLObject tLObject3 = (TLObject) this.b;
                c5.p pVar = (c5.p) this.c;
                c5.i iVar3 = (c5.i) this.d;
                rh.r rVar = (rh.r) this.e;
                Activity activity = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.r;
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        rVar.run(Boolean.FALSE, tL_error3 != null ? tL_error3.text : "SERVER_ERROR");
                        break;
                    } else {
                        rVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(pVar.c, new di.j5(5, iVar3, rVar));
                    BillingController.getInstance().setOnCanceled(new zh.e4(rVar, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qf.b bVar3 = new qf.b(9);
                    bVar3.e0((c5.p) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.v()));
                    break;
                }
            default:
                TLObject tLObject4 = (TLObject) this.b;
                c5.p pVar2 = (c5.p) this.c;
                c5.i iVar4 = (c5.i) this.d;
                c90 c90Var = (c90) this.e;
                Activity activity2 = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.r;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                        c90Var.run(Boolean.FALSE, tL_error4 != null ? tL_error4.text : "SERVER_ERROR");
                        break;
                    } else {
                        c90Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(pVar2.c, new di.j5(4, iVar4, c90Var));
                    BillingController.getInstance().setOnCanceled(new zh.g4(c90Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qf.b bVar4 = new qf.b(9);
                    bVar4.e0((c5.p) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.v()));
                    break;
                }
        }
    }

    public /* synthetic */ k(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.a = 3;
        this.b = userInfoActivity;
        this.c = tL_error;
        this.d = tLObject;
        this.e = tL_birthday;
        this.f = userFull;
        this.h = tLObject2;
        this.r = iArr;
        this.n = arrayList;
    }
}
