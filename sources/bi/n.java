package bi;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.telegram.messenger.cn;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ot;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.q70;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.f11;
import org.telegram.ui.na0;
import org.telegram.ui.ua0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
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
                vh.d dVar = (vh.d) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ag.a aVar = (ag.a) this.f;
                ImageView imageView = (ImageView) this.h;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.n;
                int[] iArr = (int[]) this.r;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z10 = zArr[0];
                    String str2 = strArr[0];
                    aVar.a(str2, new d(str2, strArr, imageView, p6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    break;
                }
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                mg.o0 o0Var = (mg.o0) this.c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.e;
                c5.g gVar = (c5.g) this.f;
                mg.o0 o0Var2 = (mg.o0) this.h;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error == null) {
                    if (tLObject != null) {
                        org.telegram.messenger.u1.i().d(((c5.m) list.get(0)).c, new mg.f0(1, gVar, o0Var2));
                        org.telegram.messenger.u1.i().h = new mg.h0(o0Var, 0);
                        org.telegram.messenger.u1 i10 = org.telegram.messenger.u1.i();
                        Activity parentActivity = k2Var.getParentActivity();
                        org.telegram.messenger.c a2 = org.telegram.messenger.c.a(d20.s0);
                        hf.b bVar = new hf.b(9, false);
                        bVar.m0((c5.m) list.get(0));
                        i10.l(parentActivity, a2, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.K()));
                        break;
                    }
                } else {
                    o0Var.a(tL_error);
                    break;
                }
                break;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                q20 q20Var = (q20) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.e;
                c5.g gVar2 = (c5.g) this.f;
                q20 q20Var2 = (q20) this.h;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error2 == null) {
                    if (tLObject2 != null) {
                        org.telegram.messenger.u1.i().d(((c5.m) list2.get(0)).c, new mg.f0(0, gVar2, q20Var2));
                        org.telegram.messenger.u1.i().h = new mg.g0(q20Var, 0);
                        org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
                        Activity parentActivity2 = k2Var2.getParentActivity();
                        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(d20.s0);
                        hf.b bVar2 = new hf.b(9, false);
                        bVar2.m0((c5.m) list2.get(0));
                        i11.l(parentActivity2, a10, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.K()));
                        break;
                    }
                } else {
                    q20Var.a(tL_error2);
                    break;
                }
                break;
            case 3:
                hs hsVar = (hs) this.b;
                a0.h hVar = (a0.h) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = (ArrayList) this.h;
                ArrayList arrayList5 = (ArrayList) this.n;
                HashMap hashMap = (HashMap) this.r;
                ot notificationsController = hsVar.getNotificationsController();
                Collection values = hashMap.values();
                notificationsController.getMessagesController().V3(arrayList3, true);
                notificationsController.getMessagesController().P3(arrayList4, true);
                notificationsController.getMessagesController().S3(arrayList5);
                ot.k0.c(new cn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                break;
            case 4:
                ua0 ua0Var = (ua0) this.b;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                String str6 = (String) this.h;
                String str7 = (String) this.n;
                String str8 = (String) this.r;
                org.telegram.ui.Wallet.e2 e2Var = k0Var.g;
                na0 na0Var = new na0(ua0Var, str8, 1);
                e2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = str3;
                tonconnectcreatesession.manifest_url = str4;
                e2Var.f.sendRequestTyped(tonconnectcreatesession, new a3.b(1), new org.telegram.ui.Wallet.e1(e2Var, na0Var, str5, str4, str6, str7, 0));
                break;
            case 5:
                UserInfoActivity.c0((UserInfoActivity) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (TL_account.TL_birthday) this.e, (TLRPC.UserFull) this.f, (TLObject) this.h, (int[]) this.r, (ArrayList) this.n);
                break;
            case 6:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                String str10 = ((org.telegram.ui.Wallet.b2) this.h).a;
                f11 f11Var = (f11) this.n;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.r;
                if (!e2Var2.d(z1Var, tonconnectsession, str9, bArr) || ((str = z1Var.e.client_id) != null && !str10.equalsIgnoreCase(str))) {
                    f11Var.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = str10;
                    e2Var2.f.sendRequestTyped(tonconnectregisterkey, new a3.b(1), new org.telegram.ui.Wallet.d1(e2Var2, f11Var, h0Var, tonconnectsession, str9, bArr, z1Var));
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.e;
                byte[] bArr2 = (byte[]) this.f;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.n;
                f11 f11Var2 = (f11) this.r;
                e2Var3.getClass();
                try {
                    org.telegram.messenger.i0.g3(new mg.c0(e2Var3, z1Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.e2.r(h0Var2, tonconnectsession2, str11, bArr2, z1Var2.a, z1Var2.b, z1Var2.d, tonconnectchallenge, e2Var3.f.getCurrentTime()), f11Var2, 11));
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.c1(f11Var2, org.telegram.ui.Wallet.e2.i("prepare connect challenge", e), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.e2 e2Var4 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.e;
                byte[] bArr3 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.h;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.n;
                ih.s sVar = (ih.s) this.r;
                e2Var4.getClass();
                try {
                    org.telegram.messenger.i0.g3(new b41(e2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.e2.s(h0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, e2Var4.f.getCurrentTime()), sVar, h0Var3, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e7) {
                    sVar.a(null, org.telegram.ui.Wallet.e2.i("prepare OAuth identity", e7));
                    return;
                }
            case 9:
                TLObject tLObject3 = (TLObject) this.b;
                c5.m mVar = (c5.m) this.c;
                c5.g gVar3 = (c5.g) this.d;
                ih.s sVar2 = (ih.s) this.e;
                Activity activity = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.r;
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        sVar2.a(Boolean.FALSE, tL_error3 != null ? tL_error3.text : "SERVER_ERROR");
                        break;
                    } else {
                        sVar2.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.u1.i().d(mVar.c, new mg.f0(4, gVar3, sVar2));
                    org.telegram.messenger.u1.i().h = new rh.p4(sVar2, 2);
                    org.telegram.messenger.u1 i12 = org.telegram.messenger.u1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(d20.s0);
                    hf.b bVar3 = new hf.b(9, false);
                    bVar3.m0((c5.m) list3.get(0));
                    i12.l(activity, a11, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.K()));
                    break;
                }
            default:
                TLObject tLObject4 = (TLObject) this.b;
                c5.m mVar2 = (c5.m) this.c;
                c5.g gVar4 = (c5.g) this.d;
                q70 q70Var = (q70) this.e;
                Activity activity2 = (Activity) this.f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.r;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                        q70Var.a(Boolean.FALSE, tL_error4 != null ? tL_error4.text : "SERVER_ERROR");
                        break;
                    } else {
                        q70Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.u1.i().d(mVar2.c, new mg.f0(3, gVar4, q70Var));
                    org.telegram.messenger.u1.i().h = new rh.v4(q70Var, 2);
                    org.telegram.messenger.u1 i13 = org.telegram.messenger.u1.i();
                    org.telegram.messenger.c a12 = org.telegram.messenger.c.a(d20.s0);
                    hf.b bVar4 = new hf.b(9, false);
                    bVar4.m0((c5.m) list4.get(0));
                    i13.l(activity2, a12, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.K()));
                    break;
                }
        }
    }

    public /* synthetic */ n(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.a = 5;
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
