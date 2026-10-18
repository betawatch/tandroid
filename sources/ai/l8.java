package ai;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
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
import org.telegram.ui.Components.f51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.db0;
import org.telegram.ui.kb0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ l8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.n = obj4;
        this.e = obj5;
        this.r = obj6;
        this.f = obj7;
        this.h = obj8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.b;
                c5.o oVar = (c5.o) this.c;
                c5.i iVar = (c5.i) this.d;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.n;
                Activity activity = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.r;
                List list = (List) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                        s1Var.run(Boolean.FALSE, tL_error != null ? tL_error.text : "SERVER_ERROR");
                        break;
                    } else {
                        s1Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(oVar.c, new b8(1, iVar, s1Var));
                    BillingController.getInstance().setOnCanceled(new d8(s1Var, 2));
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar = new n4.s(9, false);
                    sVar.K((c5.o) list.get(0));
                    billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(sVar.k()));
                    break;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.b;
                c5.o oVar2 = (c5.o) this.c;
                c5.i iVar2 = (c5.i) this.d;
                tc tcVar = (tc) this.n;
                Activity activity2 = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.r;
                List list2 = (List) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                        tcVar.run(Boolean.FALSE, tL_error2 != null ? tL_error2.text : "SERVER_ERROR");
                        break;
                    } else {
                        tcVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(oVar2.c, new b8(0, iVar2, tcVar));
                    BillingController.getInstance().setOnCanceled(new g8(tcVar, 0));
                    BillingController billingController2 = BillingController.getInstance();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar2 = new n4.s(9, false);
                    sVar2.K((c5.o) list2.get(0));
                    billingController2.launchBillingFlow(activity2, accountInstance2, tL_inputStorePaymentStarsGift, Collections.singletonList(sVar2.k()));
                    break;
                }
            case 2:
                String[] strArr = (String[]) this.b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.c;
                ei.d dVar = (ei.d) this.d;
                boolean[] zArr = (boolean[]) this.n;
                hg.o oVar3 = (hg.o) this.e;
                ImageView imageView = (ImageView) this.r;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f;
                int[] iArr = (int[]) this.h;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z10 = zArr[0];
                    String str2 = strArr[0];
                    oVar3.run(str2, new ki.c(str2, strArr, imageView, d6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    break;
                }
            case 3:
                ((MessagesStorage) this.b).lambda$loadUnreadMessages$76((a0.h) this.c, (ArrayList) this.d, (ArrayList) this.n, (ArrayList) this.e, (ArrayList) this.r, (ArrayList) this.f, (HashMap) this.h);
                break;
            case 4:
                kb0 kb0Var = (kb0) this.b;
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.n;
                String str5 = (String) this.e;
                String str6 = (String) this.r;
                String str7 = (String) this.f;
                String str8 = (String) this.h;
                org.telegram.ui.Wallet.f2 f2Var = m0Var.g;
                db0 db0Var = new db0(kb0Var, str8, 1);
                f2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = str3;
                tonconnectcreatesession.manifest_url = str4;
                f2Var.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.i1(f2Var, db0Var, str5, str4, str6, str7));
                break;
            case 5:
                UserInfoActivity.Y((UserInfoActivity) this.c, (TLRPC.TL_error) this.h, (TLObject) this.b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.n, (TLObject) this.e, (int[]) this.r, (ArrayList) this.f);
                break;
            case 6:
                org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.b;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.n;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f;
                org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.h;
                f2Var2.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new u7(f2Var2, a2Var, tonconnectsession, str9, bArr, org.telegram.ui.Wallet.f2.p(j0Var, tonconnectsession, str9, bArr, a2Var.a, a2Var.b, a2Var.d, tonconnectchallenge, f2Var2.f.getCurrentTime()), xVar, 12));
                    break;
                } catch (Exception e) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.d1(xVar, org.telegram.ui.Wallet.f2.h("prepare connect challenge", e), 0));
                    return;
                }
            case 7:
                org.telegram.ui.Wallet.f2 f2Var3 = (org.telegram.ui.Wallet.f2) this.b;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.n;
                byte[] bArr2 = (byte[]) this.e;
                JSONArray jSONArray = (JSONArray) this.r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f;
                org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.h;
                f2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new f51(f2Var3, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.f2.q(j0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, f2Var3.f.getCurrentTime()), s1Var2, j0Var2, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e7) {
                    s1Var2.run(null, org.telegram.ui.Wallet.f2.h("prepare OAuth identity", e7));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.f2 f2Var4 = (org.telegram.ui.Wallet.f2) this.b;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.n;
                byte[] bArr3 = (byte[]) this.e;
                String str12 = ((org.telegram.ui.Wallet.c2) this.r).a;
                org.telegram.ui.Wallet.x xVar2 = (org.telegram.ui.Wallet.x) this.f;
                org.telegram.ui.Wallet.j0 j0Var3 = (org.telegram.ui.Wallet.j0) this.h;
                if (!f2Var4.c(a2Var2, tonconnectsession3, str11, bArr3) || ((str = a2Var2.e.client_id) != null && !str12.equalsIgnoreCase(str))) {
                    xVar2.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.id;
                    tonconnectregisterkey.client_id = str12;
                    f2Var4.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.c1(f2Var4, xVar2, j0Var3, tonconnectsession3, str11, bArr3, a2Var2));
                    break;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                ug.u uVar = (ug.u) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                List list3 = (List) this.f;
                c5.i iVar3 = (c5.i) this.d;
                ug.u uVar2 = (ug.u) this.n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error3 == null) {
                    if (tLObject3 != null) {
                        BillingController.getInstance().addResultListener(((c5.o) list3.get(0)).c, new b8(5, iVar3, uVar2));
                        BillingController.getInstance().setOnCanceled(new ug.q(uVar, 0));
                        BillingController billingController3 = BillingController.getInstance();
                        Activity parentActivity = n2Var.getParentActivity();
                        AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                        n4.s sVar3 = new n4.s(9, false);
                        sVar3.K((c5.o) list3.get(0));
                        billingController3.launchBillingFlow(parentActivity, accountInstance3, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(sVar3.k()));
                        break;
                    }
                } else {
                    uVar.run(tL_error3);
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                List list4 = (List) this.f;
                c5.i iVar4 = (c5.i) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.n;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error4 == null) {
                    if (tLObject4 != null) {
                        BillingController.getInstance().addResultListener(((c5.o) list4.get(0)).c, new b8(4, iVar4, callback2));
                        BillingController.getInstance().setOnCanceled(new ei.ia(1, callback));
                        BillingController billingController4 = BillingController.getInstance();
                        Activity parentActivity2 = n2Var2.getParentActivity();
                        AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                        n4.s sVar4 = new n4.s(9, false);
                        sVar4.K((c5.o) list4.get(0));
                        billingController4.launchBillingFlow(parentActivity2, accountInstance4, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(sVar4.k()));
                        break;
                    }
                } else {
                    callback.run(tL_error4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l8(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, List list, c5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.a = i10;
        this.h = tL_error;
        this.c = callback;
        this.b = tLObject;
        this.f = list;
        this.d = iVar;
        this.n = callback2;
        this.e = n2Var;
        this.r = inputStorePaymentPurpose;
    }

    public /* synthetic */ l8(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.a = 5;
        this.c = userInfoActivity;
        this.h = tL_error;
        this.b = tLObject;
        this.d = tL_birthday;
        this.n = userFull;
        this.e = tLObject2;
        this.r = iArr;
        this.f = arrayList;
    }
}
