package bi;

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
import org.telegram.ui.Components.w51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.gb0;
import org.telegram.ui.ob0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ i8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
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
                d5.o oVar = (d5.o) this.c;
                d5.i iVar = (d5.i) this.d;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.n;
                Activity activity = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.r;
                List list = (List) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                        r1Var.run(Boolean.FALSE, tL_error != null ? tL_error.text : "SERVER_ERROR");
                        break;
                    } else {
                        r1Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(oVar.c, new y7(1, iVar, r1Var));
                    BillingController.getInstance().setOnCanceled(new a8(r1Var, 2));
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    rf.b bVar = new rf.b(13, false);
                    bVar.R((d5.o) list.get(0));
                    billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar.E()));
                    break;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.b;
                d5.o oVar2 = (d5.o) this.c;
                d5.i iVar2 = (d5.i) this.d;
                lc lcVar = (lc) this.n;
                Activity activity2 = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.r;
                List list2 = (List) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                        lcVar.run(Boolean.FALSE, tL_error2 != null ? tL_error2.text : "SERVER_ERROR");
                        break;
                    } else {
                        lcVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    BillingController.getInstance().addResultListener(oVar2.c, new y7(0, iVar2, lcVar));
                    BillingController.getInstance().setOnCanceled(new d8(lcVar, 0));
                    BillingController billingController2 = BillingController.getInstance();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    rf.b bVar2 = new rf.b(13, false);
                    bVar2.R((d5.o) list2.get(0));
                    billingController2.launchBillingFlow(activity2, accountInstance2, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar2.E()));
                    break;
                }
            case 2:
                String[] strArr = (String[]) this.b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.c;
                fi.d dVar = (fi.d) this.d;
                boolean[] zArr = (boolean[]) this.n;
                hi.e2 e2Var = (hi.e2) this.e;
                ImageView imageView = (ImageView) this.r;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f;
                int[] iArr = (int[]) this.h;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z10 = zArr[0];
                    String str2 = strArr[0];
                    e2Var.run(str2, new li.c(str2, strArr, imageView, u6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    break;
                }
            case 3:
                ((MessagesStorage) this.b).lambda$loadUnreadMessages$79((a0.h) this.c, (ArrayList) this.d, (ArrayList) this.n, (ArrayList) this.e, (ArrayList) this.r, (ArrayList) this.f, (HashMap) this.h);
                break;
            case 4:
                ob0 ob0Var = (ob0) this.b;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.n;
                String str5 = (String) this.e;
                String str6 = (String) this.r;
                String str7 = (String) this.f;
                String str8 = (String) this.h;
                org.telegram.ui.Wallet.e2 e2Var2 = l0Var.g;
                gb0 gb0Var = new gb0(ob0Var, str8, 1);
                e2Var2.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = str3;
                tonconnectcreatesession.manifest_url = str4;
                e2Var2.f.sendRequestTyped(tonconnectcreatesession, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.h1(e2Var2, gb0Var, str5, str4, str6, str7));
                break;
            case 5:
                UserInfoActivity.Z((UserInfoActivity) this.c, (TLRPC.TL_error) this.h, (TLObject) this.b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.n, (TLObject) this.e, (int[]) this.r, (ArrayList) this.f);
                break;
            case 6:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.n;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f;
                org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) this.h;
                e2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new r7(e2Var3, z1Var, tonconnectsession, str9, bArr, org.telegram.ui.Wallet.e2.p(i0Var, tonconnectsession, str9, bArr, z1Var.a, z1Var.b, z1Var.d, tonconnectchallenge, e2Var3.f.getCurrentTime()), sVar, 12));
                    break;
                } catch (Exception e) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.c1(sVar, org.telegram.ui.Wallet.e2.h("prepare connect challenge", e), 0));
                    return;
                }
            case 7:
                org.telegram.ui.Wallet.e2 e2Var4 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.n;
                byte[] bArr2 = (byte[]) this.e;
                JSONArray jSONArray = (JSONArray) this.r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f;
                org.telegram.ui.Wallet.r1 r1Var2 = (org.telegram.ui.Wallet.r1) this.h;
                e2Var4.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new w51(e2Var4, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.e2.q(i0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, e2Var4.f.getCurrentTime()), r1Var2, i0Var2, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e10) {
                    r1Var2.run(null, org.telegram.ui.Wallet.e2.h("prepare OAuth identity", e10));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.e2 e2Var5 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.n;
                byte[] bArr3 = (byte[]) this.e;
                String str12 = ((org.telegram.ui.Wallet.b2) this.r).a;
                org.telegram.ui.Wallet.s sVar2 = (org.telegram.ui.Wallet.s) this.f;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) this.h;
                if (!e2Var5.c(z1Var2, tonconnectsession3, str11, bArr3) || ((str = z1Var2.e.client_id) != null && !str12.equalsIgnoreCase(str))) {
                    sVar2.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.id;
                    tonconnectregisterkey.client_id = str12;
                    e2Var5.f.sendRequestTyped(tonconnectregisterkey, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.b1(e2Var5, sVar2, i0Var3, tonconnectsession3, str11, bArr3, z1Var2));
                    break;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                vg.v vVar = (vg.v) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                List list3 = (List) this.f;
                d5.i iVar3 = (d5.i) this.d;
                vg.v vVar2 = (vg.v) this.n;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error3 == null) {
                    if (tLObject3 != null) {
                        BillingController.getInstance().addResultListener(((d5.o) list3.get(0)).c, new y7(5, iVar3, vVar2));
                        BillingController.getInstance().setOnCanceled(new vg.r(vVar, 0));
                        BillingController billingController3 = BillingController.getInstance();
                        Activity parentActivity = r2Var.getParentActivity();
                        AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                        rf.b bVar3 = new rf.b(13, false);
                        bVar3.R((d5.o) list3.get(0));
                        billingController3.launchBillingFlow(parentActivity, accountInstance3, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar3.E()));
                        break;
                    }
                } else {
                    vVar.run(tL_error3);
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                List list4 = (List) this.f;
                d5.i iVar4 = (d5.i) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.n;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error4 == null) {
                    if (tLObject4 != null) {
                        BillingController.getInstance().addResultListener(((d5.o) list4.get(0)).c, new y7(4, iVar4, callback2));
                        BillingController.getInstance().setOnCanceled(new fi.ea(1, callback));
                        BillingController billingController4 = BillingController.getInstance();
                        Activity parentActivity2 = r2Var2.getParentActivity();
                        AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                        rf.b bVar4 = new rf.b(13, false);
                        bVar4.R((d5.o) list4.get(0));
                        billingController4.launchBillingFlow(parentActivity2, accountInstance4, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar4.E()));
                        break;
                    }
                } else {
                    callback.run(tL_error4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i8(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, List list, d5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.a = i10;
        this.h = tL_error;
        this.c = callback;
        this.b = tLObject;
        this.f = list;
        this.d = iVar;
        this.n = callback2;
        this.e = r2Var;
        this.r = inputStorePaymentPurpose;
    }

    public /* synthetic */ i8(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
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
