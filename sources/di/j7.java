package di;

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
import org.telegram.messenger.fn;
import org.telegram.messenger.j10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.n31;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.l90;
import org.telegram.ui.p51;
import org.telegram.ui.r90;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ j7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i7) {
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
                f5.m mVar = (f5.m) this.c;
                f5.f fVar = (f5.f) this.d;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.n;
                Activity activity = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.r;
                List list = (List) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                        e0Var.a(Boolean.FALSE, tL_error != null ? tL_error.text : "SERVER_ERROR");
                        break;
                    } else {
                        e0Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.r1.i().d(mVar.c, new d7(1, fVar, e0Var));
                    org.telegram.messenger.r1.i().h = new w6(e0Var, 2);
                    org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(j10.t0);
                    wf.b bVar = new wf.b(17, false);
                    bVar.R((f5.m) list.get(0));
                    i7.l(activity, a10, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar.q()));
                    break;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.b;
                f5.m mVar2 = (f5.m) this.c;
                f5.f fVar2 = (f5.f) this.d;
                bi.c8 c8Var = (bi.c8) this.n;
                Activity activity2 = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.r;
                List list2 = (List) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                        c8Var.a(Boolean.FALSE, tL_error2 != null ? tL_error2.text : "SERVER_ERROR");
                        break;
                    } else {
                        c8Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.r1.i().d(mVar2.c, new d7(0, fVar2, c8Var));
                    org.telegram.messenger.r1.i().h = new e7(c8Var, 2);
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(j10.t0);
                    wf.b bVar2 = new wf.b(17, false);
                    bVar2.R((f5.m) list2.get(0));
                    i10.l(activity2, a11, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar2.q()));
                    break;
                }
            case 2:
                String[] strArr = (String[]) this.b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.c;
                hi.d dVar = (hi.d) this.d;
                boolean[] zArr = (boolean[]) this.n;
                hi.e7 e7Var = (hi.e7) this.e;
                ImageView imageView = (ImageView) this.r;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f;
                int[] iArr = (int[]) this.h;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z10 = zArr[0];
                    String str2 = strArr[0];
                    e7Var.a(str2, new oi.c(str2, strArr, imageView, i6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    break;
                }
            case 3:
                tr trVar = (tr) this.b;
                a0.h hVar = (a0.h) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.n;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.r;
                ArrayList arrayList5 = (ArrayList) this.f;
                HashMap hashMap = (HashMap) this.h;
                xs notificationsController = trVar.getNotificationsController();
                Collection values = hashMap.values();
                notificationsController.getMessagesController().f4(arrayList3, true);
                notificationsController.getMessagesController().Z3(arrayList4, true);
                notificationsController.getMessagesController().c4(arrayList5);
                xs.l0.c(new fn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                break;
            case 4:
                r90 r90Var = (r90) this.b;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.n;
                String str5 = (String) this.e;
                String str6 = (String) this.r;
                String str7 = (String) this.f;
                String str8 = (String) this.h;
                org.telegram.ui.Wallet.l2 l2Var = u0Var.g;
                l90 l90Var = new l90(r90Var, str8, 1);
                l2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = str3;
                tonconnectcreatesession.manifest_url = str4;
                l2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new s1(l2Var, l90Var, str5, str4, str6, str7, 1));
                break;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.c, (TLRPC.TL_error) this.h, (TLObject) this.b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.n, (TLObject) this.e, (int[]) this.r, (ArrayList) this.f);
                break;
            case 6:
                org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) this.b;
                org.telegram.ui.Wallet.g2 g2Var = (org.telegram.ui.Wallet.g2) this.c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.n;
                byte[] bArr = (byte[]) this.e;
                String str10 = ((org.telegram.ui.Wallet.i2) this.r).a;
                p51 p51Var = (p51) this.f;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.h;
                if (!l2Var2.d(g2Var, tonconnectsession, str9, bArr) || ((str = g2Var.e.client_id) != null && !str10.equalsIgnoreCase(str))) {
                    p51Var.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = str10;
                    l2Var2.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.ui.Wallet.l1(l2Var2, p51Var, r0Var, tonconnectsession, str9, bArr, g2Var));
                    break;
                }
            case 7:
                org.telegram.ui.Wallet.l2 l2Var3 = (org.telegram.ui.Wallet.l2) this.b;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.n;
                byte[] bArr2 = (byte[]) this.e;
                org.telegram.ui.Wallet.g2 g2Var2 = (org.telegram.ui.Wallet.g2) this.r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f;
                p51 p51Var2 = (p51) this.h;
                l2Var3.getClass();
                try {
                    org.telegram.messenger.g0.g3(new m6(l2Var3, g2Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.l2.r(r0Var2, tonconnectsession2, str11, bArr2, g2Var2.a, g2Var2.b, g2Var2.d, tonconnectchallenge, l2Var3.f.getCurrentTime()), p51Var2, 12));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.k1(p51Var2, org.telegram.ui.Wallet.l2.i("prepare connect challenge", e10), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.l2 l2Var4 = (org.telegram.ui.Wallet.l2) this.b;
                org.telegram.ui.Wallet.r0 r0Var3 = (org.telegram.ui.Wallet.r0) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.n;
                byte[] bArr3 = (byte[]) this.e;
                JSONArray jSONArray = (JSONArray) this.r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f;
                org.telegram.ui.Wallet.e0 e0Var2 = (org.telegram.ui.Wallet.e0) this.h;
                l2Var4.getClass();
                try {
                    org.telegram.messenger.g0.g3(new n31(l2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.l2.s(r0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, l2Var4.f.getCurrentTime()), e0Var2, r0Var3, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e11) {
                    e0Var2.a(null, org.telegram.ui.Wallet.l2.i("prepare OAuth identity", e11));
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                wg.v vVar = (wg.v) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                List list3 = (List) this.f;
                f5.f fVar3 = (f5.f) this.d;
                wg.v vVar2 = (wg.v) this.n;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error3 == null) {
                    if (tLObject3 != null) {
                        org.telegram.messenger.r1.i().d(((f5.m) list3.get(0)).c, new d7(5, fVar3, vVar2));
                        org.telegram.messenger.r1.i().h = new wg.p(vVar, 0);
                        org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
                        Activity parentActivity = h2Var.getParentActivity();
                        org.telegram.messenger.c a12 = org.telegram.messenger.c.a(j10.t0);
                        wf.b bVar3 = new wf.b(17, false);
                        bVar3.R((f5.m) list3.get(0));
                        i11.l(parentActivity, a12, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar3.q()));
                        break;
                    }
                } else {
                    vVar.a(tL_error3);
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                x10 x10Var = (x10) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                List list4 = (List) this.f;
                f5.f fVar4 = (f5.f) this.d;
                x10 x10Var2 = (x10) this.n;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error4 == null) {
                    if (tLObject4 != null) {
                        org.telegram.messenger.r1.i().d(((f5.m) list4.get(0)).c, new d7(4, fVar4, x10Var2));
                        org.telegram.messenger.r1.i().h = new hi.i9(x10Var, 1);
                        org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                        Activity parentActivity2 = h2Var2.getParentActivity();
                        org.telegram.messenger.c a13 = org.telegram.messenger.c.a(j10.t0);
                        wf.b bVar4 = new wf.b(17, false);
                        bVar4.R((f5.m) list4.get(0));
                        i12.l(parentActivity2, a13, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar4.q()));
                        break;
                    }
                } else {
                    x10Var.a(tL_error4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j7(TLRPC.TL_error tL_error, x10 x10Var, TLObject tLObject, List list, f5.f fVar, x10 x10Var2, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.a = i7;
        this.h = tL_error;
        this.c = x10Var;
        this.b = tLObject;
        this.f = list;
        this.d = fVar;
        this.n = x10Var2;
        this.e = h2Var;
        this.r = inputStorePaymentPurpose;
    }

    public /* synthetic */ j7(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
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
