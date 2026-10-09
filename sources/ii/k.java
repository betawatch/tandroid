package ii;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import ci.xa;
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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.ec0;
import org.telegram.ui.ft;
import org.telegram.ui.wb0;
import org.telegram.ui.ze;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ci.d dVar = (ci.d) this.d;
                boolean[] zArr = (boolean[]) this.e;
                hi.a aVar = (hi.a) this.f;
                ImageView imageView = (ImageView) this.h;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.n;
                int[] iArr = (int[]) this.r;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z10 = zArr[0];
                    String str2 = strArr[0];
                    aVar.run(str2, new c(str2, strArr, imageView, e6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    break;
                }
            case 1:
                ((MessagesStorage) this.b).lambda$loadUnreadMessages$76((a0.i) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (ArrayList) this.h, (ArrayList) this.n, (HashMap) this.r);
                break;
            case 2:
                ec0 ec0Var = (ec0) this.b;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                String str6 = (String) this.h;
                String str7 = (String) this.n;
                String str8 = (String) this.r;
                org.telegram.ui.Wallet.d2 d2Var = k0Var.g;
                wb0 wb0Var = new wb0(ec0Var, str8, 1);
                d2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = str3;
                tonconnectcreatesession.manifest_url = str4;
                d2Var.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.g1(d2Var, wb0Var, str5, str4, str6, str7));
                break;
            case 3:
                UserInfoActivity.Y((UserInfoActivity) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (TL_account.TL_birthday) this.e, (TLRPC.UserFull) this.f, (TLObject) this.h, (int[]) this.r, (ArrayList) this.n);
                break;
            case 4:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.b;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.n;
                ft ftVar = (ft) this.r;
                d2Var2.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ze((Object) d2Var2, (Object) y1Var, (Object) tonconnectsession, str9, (Object) bArr, (Object) org.telegram.ui.Wallet.d2.p(h0Var, tonconnectsession, str9, bArr, y1Var.a, y1Var.b, y1Var.d, tonconnectchallenge, d2Var2.f.getCurrentTime()), (Object) ftVar, 8));
                    break;
                } catch (Exception e7) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.b1(ftVar, org.telegram.ui.Wallet.d2.h("prepare connect challenge", e7), 0));
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) this.b;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.e;
                byte[] bArr2 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.h;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.n;
                ai.m0 m0Var = (ai.m0) this.r;
                d2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new q51(d2Var3, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.d2.q(h0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, d2Var3.f.getCurrentTime()), m0Var, h0Var2, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e10) {
                    m0Var.run(null, org.telegram.ui.Wallet.d2.h("prepare OAuth identity", e10));
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.d2 d2Var4 = (org.telegram.ui.Wallet.d2) this.b;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.e;
                byte[] bArr3 = (byte[]) this.f;
                String str12 = ((org.telegram.ui.Wallet.a2) this.h).a;
                ft ftVar2 = (ft) this.n;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) this.r;
                if (!d2Var4.c(y1Var2, tonconnectsession3, str11, bArr3) || ((str = y1Var2.e.client_id) != null && !str12.equalsIgnoreCase(str))) {
                    ftVar2.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.id;
                    tonconnectregisterkey.client_id = str12;
                    d2Var4.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new pr(d2Var4, ftVar2, h0Var3, tonconnectsession3, str11, bArr3, y1Var2));
                    break;
                }
            case 7:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                tg.v vVar = (tg.v) this.c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.e;
                c5.h hVar = (c5.h) this.f;
                tg.v vVar2 = (tg.v) this.h;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error == null) {
                    if (tLObject != null) {
                        BillingController.getInstance().addResultListener(((c5.o) list.get(0)).c, new ci.j5(3, hVar, vVar2));
                        BillingController.getInstance().setOnCanceled(new tg.r(vVar, 0));
                        BillingController billingController = BillingController.getInstance();
                        Activity parentActivity = n2Var.getParentActivity();
                        AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                        pf.b bVar = new pf.b(7, false);
                        bVar.T((c5.o) list.get(0));
                        billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.A()));
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
                c5.h hVar2 = (c5.h) this.f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error2 == null) {
                    if (tLObject2 != null) {
                        BillingController.getInstance().addResultListener(((c5.o) list2.get(0)).c, new ci.j5(2, hVar2, callback2));
                        BillingController.getInstance().setOnCanceled(new xa(1, callback));
                        BillingController billingController2 = BillingController.getInstance();
                        Activity parentActivity2 = n2Var2.getParentActivity();
                        AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                        pf.b bVar2 = new pf.b(7, false);
                        bVar2.T((c5.o) list2.get(0));
                        billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.A()));
                        break;
                    }
                } else {
                    callback.run(tL_error2);
                    break;
                }
                break;
            case 9:
                TLObject tLObject3 = (TLObject) this.b;
                c5.o oVar = (c5.o) this.c;
                c5.h hVar3 = (c5.h) this.d;
                qh.r rVar = (qh.r) this.e;
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
                    BillingController.getInstance().addResultListener(oVar.c, new ci.j5(5, hVar3, rVar));
                    BillingController.getInstance().setOnCanceled(new yh.e4(rVar, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar3 = new pf.b(7, false);
                    bVar3.T((c5.o) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.A()));
                    break;
                }
            default:
                TLObject tLObject4 = (TLObject) this.b;
                c5.o oVar2 = (c5.o) this.c;
                c5.h hVar4 = (c5.h) this.d;
                f90 f90Var = (f90) this.e;
                Activity activity2 = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.r;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                        f90Var.run(Boolean.FALSE, tL_error4 != null ? tL_error4.text : "SERVER_ERROR");
                        break;
                    } else {
                        f90Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(oVar2.c, new ci.j5(4, hVar4, f90Var));
                    BillingController.getInstance().setOnCanceled(new yh.g4(f90Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar4 = new pf.b(7, false);
                    bVar4.T((c5.o) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.A()));
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
