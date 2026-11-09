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
import org.telegram.messenger.c20;
import org.telegram.messenger.dt;
import org.telegram.messenger.mn;
import org.telegram.messenger.p10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.z21;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.k90;
import org.telegram.ui.r90;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ n8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i7) {
        this.a = i7;
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
                f5.l lVar = (f5.l) this.c;
                f5.f fVar = (f5.f) this.d;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.n;
                Activity activity = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.r;
                List list = (List) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                        t1Var.a(Boolean.FALSE, tL_error != null ? tL_error.text : "SERVER_ERROR");
                        break;
                    } else {
                        t1Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.r1.i().d(lVar.c, new h8(1, fVar, t1Var));
                    org.telegram.messenger.r1.i().h = new b8(t1Var, 2);
                    org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(p10.s0);
                    q4.q qVar = new q4.q(20, false);
                    qVar.g((f5.l) list.get(0));
                    i7.l(activity, a10, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(qVar.a()));
                    break;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.b;
                f5.l lVar2 = (f5.l) this.c;
                f5.f fVar2 = (f5.f) this.d;
                mc mcVar = (mc) this.n;
                Activity activity2 = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.r;
                List list2 = (List) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                        mcVar.a(Boolean.FALSE, tL_error2 != null ? tL_error2.text : "SERVER_ERROR");
                        break;
                    } else {
                        mcVar.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.r1.i().d(lVar2.c, new h8(0, fVar2, mcVar));
                    org.telegram.messenger.r1.i().h = new i8(mcVar, 2);
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(p10.s0);
                    q4.q qVar2 = new q4.q(20, false);
                    qVar2.g((f5.l) list2.get(0));
                    i10.l(activity2, a11, tL_inputStorePaymentStarsGift, Collections.singletonList(qVar2.a()));
                    break;
                }
            case 2:
                String[] strArr = (String[]) this.b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.c;
                fi.d dVar = (fi.d) this.d;
                boolean[] zArr = (boolean[]) this.n;
                hi.u1 u1Var = (hi.u1) this.e;
                ImageView imageView = (ImageView) this.r;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f;
                int[] iArr = (int[]) this.h;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z9 = zArr[0];
                    String str2 = strArr[0];
                    u1Var.a(str2, new li.c(str2, strArr, imageView, g6Var, z9, iArr, dVar, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    break;
                }
            case 3:
                yr yrVar = (yr) this.b;
                a0.h hVar = (a0.h) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.n;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.r;
                ArrayList arrayList5 = (ArrayList) this.f;
                HashMap hashMap = (HashMap) this.h;
                dt notificationsController = yrVar.getNotificationsController();
                Collection values = hashMap.values();
                notificationsController.getMessagesController().Y3(arrayList3, true);
                notificationsController.getMessagesController().S3(arrayList4, true);
                notificationsController.getMessagesController().V3(arrayList5);
                dt.k0.c(new mn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                break;
            case 4:
                r90 r90Var = (r90) this.b;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.n;
                String str5 = (String) this.e;
                String str6 = (String) this.r;
                String str7 = (String) this.f;
                String str8 = (String) this.h;
                org.telegram.ui.Wallet.d2 d2Var = l0Var.g;
                k90 k90Var = new k90(r90Var, str8, 1);
                d2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = str3;
                tonconnectcreatesession.manifest_url = str4;
                d2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new org.telegram.ui.Wallet.d1(d2Var, k90Var, str5, str4, str6, str7, 0));
                break;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.c, (TLRPC.TL_error) this.h, (TLObject) this.b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.n, (TLObject) this.e, (int[]) this.r, (ArrayList) this.f);
                break;
            case 6:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.b;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.n;
                byte[] bArr = (byte[]) this.e;
                String str10 = ((org.telegram.ui.Wallet.a2) this.r).a;
                org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) this.f;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.h;
                if (!d2Var2.d(y1Var, tonconnectsession, str9, bArr) || ((str = y1Var.e.client_id) != null && !str10.equalsIgnoreCase(str))) {
                    sVar.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = str10;
                    d2Var2.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.ui.Wallet.c1(d2Var2, sVar, i0Var, tonconnectsession, str9, bArr, y1Var));
                    break;
                }
            case 7:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) this.b;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.n;
                byte[] bArr2 = (byte[]) this.e;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) this.r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f;
                org.telegram.ui.Wallet.s sVar2 = (org.telegram.ui.Wallet.s) this.h;
                d2Var3.getClass();
                try {
                    org.telegram.messenger.g0.h3(new r7(d2Var3, y1Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.d2.r(i0Var2, tonconnectsession2, str11, bArr2, y1Var2.a, y1Var2.b, y1Var2.d, tonconnectchallenge, d2Var3.f.getCurrentTime()), sVar2, 13));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.b1(sVar2, org.telegram.ui.Wallet.d2.i("prepare connect challenge", e10), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.d2 d2Var4 = (org.telegram.ui.Wallet.d2) this.b;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.n;
                byte[] bArr3 = (byte[]) this.e;
                JSONArray jSONArray = (JSONArray) this.r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f;
                org.telegram.ui.Wallet.t1 t1Var2 = (org.telegram.ui.Wallet.t1) this.h;
                d2Var4.getClass();
                try {
                    org.telegram.messenger.g0.h3(new z21(d2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.d2.s(i0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, d2Var4.f.getCurrentTime()), t1Var2, i0Var3, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e11) {
                    t1Var2.a(null, org.telegram.ui.Wallet.d2.i("prepare OAuth identity", e11));
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                wg.u uVar = (wg.u) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                List list3 = (List) this.f;
                f5.f fVar3 = (f5.f) this.d;
                wg.u uVar2 = (wg.u) this.n;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error3 == null) {
                    if (tLObject3 != null) {
                        org.telegram.messenger.r1.i().d(((f5.l) list3.get(0)).c, new h8(5, fVar3, uVar2));
                        org.telegram.messenger.r1.i().h = new wg.p(uVar, 0);
                        org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
                        Activity parentActivity = f2Var.getParentActivity();
                        org.telegram.messenger.c a12 = org.telegram.messenger.c.a(p10.s0);
                        q4.q qVar3 = new q4.q(20, false);
                        qVar3.g((f5.l) list3.get(0));
                        i11.l(parentActivity, a12, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(qVar3.a()));
                        break;
                    }
                } else {
                    uVar.a(tL_error3);
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                c20 c20Var = (c20) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                List list4 = (List) this.f;
                f5.f fVar4 = (f5.f) this.d;
                c20 c20Var2 = (c20) this.n;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error4 == null) {
                    if (tLObject4 != null) {
                        org.telegram.messenger.r1.i().d(((f5.l) list4.get(0)).c, new h8(4, fVar4, c20Var2));
                        org.telegram.messenger.r1.i().h = new fi.j9(c20Var, 1);
                        org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                        Activity parentActivity2 = f2Var2.getParentActivity();
                        org.telegram.messenger.c a13 = org.telegram.messenger.c.a(p10.s0);
                        q4.q qVar4 = new q4.q(20, false);
                        qVar4.g((f5.l) list4.get(0));
                        i12.l(parentActivity2, a13, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(qVar4.a()));
                        break;
                    }
                } else {
                    c20Var.a(tL_error4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n8(TLRPC.TL_error tL_error, c20 c20Var, TLObject tLObject, List list, f5.f fVar, c20 c20Var2, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.a = i7;
        this.h = tL_error;
        this.c = c20Var;
        this.b = tLObject;
        this.f = list;
        this.d = fVar;
        this.n = c20Var2;
        this.e = f2Var;
        this.r = inputStorePaymentPurpose;
    }

    public /* synthetic */ n8(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
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
