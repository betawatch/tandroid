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
import org.telegram.messenger.i10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.o31;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.a31;
import org.telegram.ui.l90;
import org.telegram.ui.r90;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.n;
                Activity activity = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.r;
                List list = (List) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                        f0Var.a(Boolean.FALSE, tL_error != null ? tL_error.text : "SERVER_ERROR");
                        break;
                    } else {
                        f0Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.r1.i().d(mVar.c, new d7(1, fVar, f0Var));
                    org.telegram.messenger.r1.i().h = new x6(f0Var, 2);
                    org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i10.t0);
                    wf.b bVar = new wf.b(17, false);
                    bVar.R((f5.m) list.get(0));
                    i7.l(activity, a10, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar.q()));
                    break;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.b;
                f5.m mVar2 = (f5.m) this.c;
                f5.f fVar2 = (f5.f) this.d;
                bi.h8 h8Var = (bi.h8) this.n;
                Activity activity2 = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.r;
                List list2 = (List) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                        h8Var.a(Boolean.FALSE, tL_error2 != null ? tL_error2.text : "SERVER_ERROR");
                        break;
                    } else {
                        h8Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    org.telegram.messenger.r1.i().d(mVar2.c, new d7(0, fVar2, h8Var));
                    org.telegram.messenger.r1.i().h = new e7(h8Var, 2);
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(i10.t0);
                    wf.b bVar2 = new wf.b(17, false);
                    bVar2.R((f5.m) list2.get(0));
                    i10.l(activity2, a11, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar2.q()));
                    break;
                }
            case 2:
                String[] strArr = (String[]) this.b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.c;
                hi.e eVar = (hi.e) this.d;
                boolean[] zArr = (boolean[]) this.n;
                hi.y7 y7Var = (hi.y7) this.e;
                ImageView imageView = (ImageView) this.r;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f;
                int[] iArr = (int[]) this.h;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z10 = zArr[0];
                    String str2 = strArr[0];
                    y7Var.a(str2, new oi.c(str2, strArr, imageView, i6Var, z10, iArr, eVar, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    eVar.setEnabled(false);
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
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.n;
                String str5 = (String) this.e;
                String str6 = (String) this.r;
                String str7 = (String) this.f;
                String str8 = (String) this.h;
                org.telegram.ui.Wallet.m2 m2Var = v0Var.g;
                l90 l90Var = new l90(r90Var, str8, 1);
                m2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = str3;
                tonconnectcreatesession.manifest_url = str4;
                m2Var.f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new s1(m2Var, l90Var, str5, str4, str6, str7, 1));
                break;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.c, (TLRPC.TL_error) this.h, (TLObject) this.b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.n, (TLObject) this.e, (int[]) this.r, (ArrayList) this.f);
                break;
            case 6:
                org.telegram.ui.Wallet.m2 m2Var2 = (org.telegram.ui.Wallet.m2) this.b;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.n;
                byte[] bArr = (byte[]) this.e;
                String str10 = ((org.telegram.ui.Wallet.j2) this.r).a;
                a31 a31Var = (a31) this.f;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.h;
                if (!m2Var2.d(h2Var, tonconnectsession, str9, bArr) || ((str = h2Var.e.client_id) != null && !str10.equalsIgnoreCase(str))) {
                    a31Var.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = str10;
                    m2Var2.f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.ui.Wallet.m1(m2Var2, a31Var, s0Var, tonconnectsession, str9, bArr, h2Var));
                    break;
                }
            case 7:
                org.telegram.ui.Wallet.m2 m2Var3 = (org.telegram.ui.Wallet.m2) this.b;
                org.telegram.ui.Wallet.s0 s0Var2 = (org.telegram.ui.Wallet.s0) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.n;
                byte[] bArr2 = (byte[]) this.e;
                org.telegram.ui.Wallet.h2 h2Var2 = (org.telegram.ui.Wallet.h2) this.r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f;
                a31 a31Var2 = (a31) this.h;
                m2Var3.getClass();
                try {
                    org.telegram.messenger.g0.g3(new m6(m2Var3, h2Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.m2.r(s0Var2, tonconnectsession2, str11, bArr2, h2Var2.a, h2Var2.b, h2Var2.d, tonconnectchallenge, m2Var3.f.getCurrentTime()), a31Var2, 12));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.l1(a31Var2, org.telegram.ui.Wallet.m2.i("prepare connect challenge", e10), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.m2 m2Var4 = (org.telegram.ui.Wallet.m2) this.b;
                org.telegram.ui.Wallet.s0 s0Var3 = (org.telegram.ui.Wallet.s0) this.c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.n;
                byte[] bArr3 = (byte[]) this.e;
                JSONArray jSONArray = (JSONArray) this.r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f;
                org.telegram.ui.Wallet.f0 f0Var2 = (org.telegram.ui.Wallet.f0) this.h;
                m2Var4.getClass();
                try {
                    org.telegram.messenger.g0.g3(new o31(m2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.m2.s(s0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, m2Var4.f.getCurrentTime()), f0Var2, s0Var3, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e11) {
                    f0Var2.a(null, org.telegram.ui.Wallet.m2.i("prepare OAuth identity", e11));
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                wg.u uVar = (wg.u) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                List list3 = (List) this.f;
                f5.f fVar3 = (f5.f) this.d;
                wg.u uVar2 = (wg.u) this.n;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.r;
                if (tL_error3 == null) {
                    if (tLObject3 != null) {
                        org.telegram.messenger.r1.i().d(((f5.m) list3.get(0)).c, new d7(5, fVar3, uVar2));
                        org.telegram.messenger.r1.i().h = new wg.q(uVar, 0);
                        org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
                        Activity parentActivity = g2Var.getParentActivity();
                        org.telegram.messenger.c a12 = org.telegram.messenger.c.a(i10.t0);
                        wf.b bVar3 = new wf.b(17, false);
                        bVar3.R((f5.m) list3.get(0));
                        i11.l(parentActivity, a12, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar3.q()));
                        break;
                    }
                } else {
                    uVar.a(tL_error3);
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                w10 w10Var = (w10) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                List list4 = (List) this.f;
                f5.f fVar4 = (f5.f) this.d;
                w10 w10Var2 = (w10) this.n;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.r;
                if (tL_error4 == null) {
                    if (tLObject4 != null) {
                        org.telegram.messenger.r1.i().d(((f5.m) list4.get(0)).c, new d7(4, fVar4, w10Var2));
                        org.telegram.messenger.r1.i().h = new hi.ca(w10Var, 1);
                        org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                        Activity parentActivity2 = g2Var2.getParentActivity();
                        org.telegram.messenger.c a13 = org.telegram.messenger.c.a(i10.t0);
                        wf.b bVar4 = new wf.b(17, false);
                        bVar4.R((f5.m) list4.get(0));
                        i12.l(parentActivity2, a13, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar4.q()));
                        break;
                    }
                } else {
                    w10Var.a(tL_error4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j7(TLRPC.TL_error tL_error, w10 w10Var, TLObject tLObject, List list, f5.f fVar, w10 w10Var2, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.a = i7;
        this.h = tL_error;
        this.c = w10Var;
        this.b = tLObject;
        this.f = list;
        this.d = fVar;
        this.n = w10Var2;
        this.e = g2Var;
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
