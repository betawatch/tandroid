package ci;

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
import org.telegram.messenger.h10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.t21;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.e51;
import org.telegram.ui.f90;
import org.telegram.ui.m90;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ o7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i3) {
        this.a = i3;
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
                e5.l lVar = (e5.l) this.c;
                e5.f fVar = (e5.f) this.d;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.n;
                Activity activity = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.r;
                List list = (List) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                        s1Var.a(Boolean.FALSE, tL_error != null ? tL_error.text : "SERVER_ERROR");
                        break;
                    } else {
                        s1Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.r1.i().d(lVar.c, new i7(1, fVar, s1Var));
                    org.telegram.messenger.r1.i().h = new c7(s1Var, 2);
                    org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(h10.t0);
                    tf.b bVar = new tf.b();
                    bVar.B((e5.l) list.get(0));
                    i3.l(activity, a10, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar.k()));
                    break;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.b;
                e5.l lVar2 = (e5.l) this.c;
                e5.f fVar2 = (e5.f) this.d;
                ai.d6 d6Var = (ai.d6) this.n;
                Activity activity2 = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.r;
                List list2 = (List) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                        d6Var.a(Boolean.FALSE, tL_error2 != null ? tL_error2.text : "SERVER_ERROR");
                        break;
                    } else {
                        d6Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.r1.i().d(lVar2.c, new i7(0, fVar2, d6Var));
                    org.telegram.messenger.r1.i().h = new j7(d6Var, 2);
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(h10.t0);
                    tf.b bVar2 = new tf.b();
                    bVar2.B((e5.l) list2.get(0));
                    i10.l(activity2, a11, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar2.k()));
                    break;
                }
            case 2:
                String[] strArr = (String[]) this.b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.c;
                gi.d dVar = (gi.d) this.d;
                boolean[] zArr = (boolean[]) this.n;
                gi.q4 q4Var = (gi.q4) this.e;
                ImageView imageView = (ImageView) this.r;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f;
                int[] iArr = (int[]) this.h;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z10 = zArr[0];
                    String str2 = strArr[0];
                    q4Var.a(str2, new mi.c(str2, strArr, imageView, e6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    break;
                }
            case 3:
                qr qrVar = (qr) this.b;
                a0.h hVar = (a0.h) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.n;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.r;
                ArrayList arrayList5 = (ArrayList) this.f;
                HashMap hashMap = (HashMap) this.h;
                us notificationsController = qrVar.getNotificationsController();
                Collection values = hashMap.values();
                notificationsController.getMessagesController().Y3(arrayList3, true);
                notificationsController.getMessagesController().S3(arrayList4, true);
                notificationsController.getMessagesController().V3(arrayList5);
                us.l0.c(new cn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                break;
            case 4:
                m90 m90Var = (m90) this.b;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.n;
                String str5 = (String) this.e;
                String str6 = (String) this.r;
                String str7 = (String) this.f;
                String str8 = (String) this.h;
                org.telegram.ui.Wallet.c2 c2Var = k0Var.g;
                f90 f90Var = new f90(m90Var, str8, 1);
                c2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = str3;
                tonconnectcreatesession.manifest_url = str4;
                c2Var.f.sendRequestTyped(tonconnectcreatesession, new c3.b(1), new org.telegram.ui.Wallet.c1(c2Var, f90Var, str5, str4, str6, str7, 0));
                break;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.c, (TLRPC.TL_error) this.h, (TLObject) this.b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.n, (TLObject) this.e, (int[]) this.r, (ArrayList) this.f);
                break;
            case 6:
                org.telegram.ui.Wallet.c2 c2Var2 = (org.telegram.ui.Wallet.c2) this.b;
                org.telegram.ui.Wallet.x1 x1Var = (org.telegram.ui.Wallet.x1) this.c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.n;
                byte[] bArr = (byte[]) this.e;
                String str10 = ((org.telegram.ui.Wallet.z1) this.r).a;
                e51 e51Var = (e51) this.f;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.h;
                if (!c2Var2.d(x1Var, tonconnectsession, str9, bArr) || ((str = x1Var.e.client_id) != null && !str10.equalsIgnoreCase(str))) {
                    e51Var.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = str10;
                    c2Var2.f.sendRequestTyped(tonconnectregisterkey, new c3.b(1), new org.telegram.ui.Wallet.b1(c2Var2, e51Var, h0Var, tonconnectsession, str9, bArr, x1Var));
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Wallet.c2 c2Var3 = (org.telegram.ui.Wallet.c2) this.b;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.n;
                byte[] bArr2 = (byte[]) this.e;
                org.telegram.ui.Wallet.x1 x1Var2 = (org.telegram.ui.Wallet.x1) this.r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f;
                e51 e51Var2 = (e51) this.h;
                c2Var3.getClass();
                try {
                    org.telegram.messenger.g0.h3(new s6(c2Var3, x1Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.c2.r(h0Var2, tonconnectsession2, str11, bArr2, x1Var2.a, x1Var2.b, x1Var2.d, tonconnectchallenge, c2Var3.f.getCurrentTime()), e51Var2, 13));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.a1(e51Var2, org.telegram.ui.Wallet.c2.i("prepare connect challenge", e10), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.c2 c2Var4 = (org.telegram.ui.Wallet.c2) this.b;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.n;
                byte[] bArr3 = (byte[]) this.e;
                JSONArray jSONArray = (JSONArray) this.r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f;
                org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.h;
                c2Var4.getClass();
                try {
                    org.telegram.messenger.g0.h3(new t21(c2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.c2.s(h0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, c2Var4.f.getCurrentTime()), s1Var2, h0Var3, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e11) {
                    s1Var2.a(null, org.telegram.ui.Wallet.c2.i("prepare OAuth identity", e11));
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                xg.v vVar = (xg.v) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                List list3 = (List) this.f;
                e5.f fVar3 = (e5.f) this.d;
                xg.v vVar2 = (xg.v) this.n;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error3 == null) {
                    if (tLObject3 != null) {
                        org.telegram.messenger.r1.i().d(((e5.l) list3.get(0)).c, new i7(5, fVar3, vVar2));
                        org.telegram.messenger.r1.i().h = new xg.r(vVar, 0);
                        org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
                        Activity parentActivity = d2Var.getParentActivity();
                        org.telegram.messenger.c a12 = org.telegram.messenger.c.a(h10.t0);
                        tf.b bVar3 = new tf.b();
                        bVar3.B((e5.l) list3.get(0));
                        i11.l(parentActivity, a12, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar3.k()));
                        break;
                    }
                } else {
                    vVar.a(tL_error3);
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                u10 u10Var = (u10) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                List list4 = (List) this.f;
                e5.f fVar4 = (e5.f) this.d;
                u10 u10Var2 = (u10) this.n;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error4 == null) {
                    if (tLObject4 != null) {
                        org.telegram.messenger.r1.i().d(((e5.l) list4.get(0)).c, new i7(4, fVar4, u10Var2));
                        org.telegram.messenger.r1.i().h = new gi.k9(u10Var, 1);
                        org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                        Activity parentActivity2 = d2Var2.getParentActivity();
                        org.telegram.messenger.c a13 = org.telegram.messenger.c.a(h10.t0);
                        tf.b bVar4 = new tf.b();
                        bVar4.B((e5.l) list4.get(0));
                        i12.l(parentActivity2, a13, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar4.k()));
                        break;
                    }
                } else {
                    u10Var.a(tL_error4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o7(TLRPC.TL_error tL_error, u10 u10Var, TLObject tLObject, List list, e5.f fVar, u10 u10Var2, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i3) {
        this.a = i3;
        this.h = tL_error;
        this.c = u10Var;
        this.b = tLObject;
        this.f = list;
        this.d = fVar;
        this.n = u10Var2;
        this.e = d2Var;
        this.r = inputStorePaymentPurpose;
    }

    public /* synthetic */ o7(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
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
