// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lo0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ lo0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.a = (byte) 10;
        this.h = userInfoActivity;
        this.b = tL_error;
        this.c = tLObject;
        this.d = tL_birthday;
        this.e = userFull;
        this.n = tLObject2;
        this.f = iArr;
        this.r = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = 9;
        Object obj = this.r;
        Object obj2 = this.f;
        Object obj3 = this.n;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        Object obj8 = this.h;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj7;
                to0 to0Var = (to0) obj8;
                TLObject tLObject = (TLObject) obj6;
                List list = (List) obj5;
                fj0 fj0Var = (fj0) obj4;
                to0 to0Var2 = (to0) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj;
                if (tL_error == null) {
                    if (tLObject != null) {
                        cj0.h().c(((ln8) list.get(0)).c, new ad0(fj0Var, to0Var2, b2));
                        cj0.h().h = new no0(to0Var, objArr2 == true ? 1 : 0);
                        cj0 h = cj0.h();
                        Activity parentActivity = dVar.getParentActivity();
                        j5 a = j5.a(z8c.t0);
                        hi2 hi2Var = new hi2(b4, (boolean) (objArr == true ? 1 : 0));
                        hi2Var.T((ln8) list.get(0));
                        h.k(parentActivity, a, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(hi2Var.c()));
                        break;
                    }
                } else {
                    to0Var.a(tL_error);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj7;
                qac qacVar = (qac) obj8;
                TLObject tLObject2 = (TLObject) obj6;
                List list2 = (List) obj5;
                fj0 fj0Var2 = (fj0) obj4;
                qac qacVar2 = (qac) obj3;
                d dVar2 = (d) obj2;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) obj;
                if (tL_error2 == null) {
                    if (tLObject2 != null) {
                        cj0.h().c(((ln8) list2.get(0)).c, new ad0(fj0Var2, qacVar2, b3));
                        cj0.h().h = new mo0(qacVar, objArr4 == true ? 1 : 0);
                        cj0 h2 = cj0.h();
                        Activity parentActivity2 = dVar2.getParentActivity();
                        j5 a2 = j5.a(z8c.t0);
                        hi2 hi2Var2 = new hi2(b4, (boolean) (objArr3 == true ? 1 : 0));
                        hi2Var2.T((ln8) list2.get(0));
                        h2.k(parentActivity2, a2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(hi2Var2.c()));
                        break;
                    }
                } else {
                    qacVar.a(tL_error2);
                    break;
                }
                break;
            case 2:
                String[] strArr = (String[]) obj7;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj8;
                b61 b61Var = (b61) obj6;
                boolean[] zArr = (boolean[]) obj5;
                f fVar = (f) obj4;
                ImageView imageView = (ImageView) obj3;
                ylb ylbVar = (ylb) obj2;
                int[] iArr = (int[]) obj;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    boolean z2 = zArr[0];
                    String str2 = strArr[0];
                    fVar.a(str2, new d82(str2, strArr, imageView, ylbVar, z2, iArr, b61Var, horizontalScrollView, zArr));
                    break;
                } else {
                    horizontalScrollView.setVisibility(8);
                    b61Var.setEnabled(false);
                    break;
                }
            case 3:
                w45 w45Var = (w45) obj7;
                r45 r45Var = (r45) obj8;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj6;
                String str3 = (String) obj5;
                byte[] bArr = (byte[]) obj4;
                String str4 = ((t45) obj3).a;
                u35 u35Var = (u35) obj2;
                y25 y25Var = (y25) obj;
                if (!w45Var.c(r45Var, tonconnectsession, str3, bArr) || ((str = r45Var.e.client_id) != null && !str4.equalsIgnoreCase(str))) {
                    u35Var.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = str4;
                    w45Var.f.sendRequestTyped(tonconnectregisterkey, new kc(objArr5 == true ? 1 : 0), new t35(w45Var, u35Var, y25Var, tonconnectsession, str3, bArr, r45Var));
                    break;
                }
                break;
            case 4:
                w45 w45Var2 = (w45) obj7;
                y25 y25Var2 = (y25) obj8;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj6;
                String str5 = (String) obj5;
                byte[] bArr2 = (byte[]) obj4;
                r45 r45Var2 = (r45) obj3;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj2;
                u35 u35Var2 = (u35) obj;
                w45Var2.getClass();
                try {
                    gm.c3(new ja7((Object) w45Var2, (Object) r45Var2, (Object) tonconnectsession2, (Object) str5, (Object) bArr2, (Object) w45.r(y25Var2, tonconnectsession2, str5, bArr2, r45Var2.a, r45Var2.b, r45Var2.d, tonconnectchallenge, w45Var2.f.getCurrentTime()), (Object) u35Var2, (byte) 9));
                    break;
                } catch (Exception e) {
                    gm.c3(new s35(u35Var2, w45.h("prepare connect challenge", e), (byte) 1));
                    return;
                }
            case 5:
                w45 w45Var3 = (w45) obj7;
                y25 y25Var3 = (y25) obj8;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj6;
                String str6 = (String) obj5;
                byte[] bArr3 = (byte[]) obj4;
                JSONArray jSONArray = (JSONArray) obj3;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj2;
                lf2 lf2Var = (lf2) obj;
                w45Var3.getClass();
                try {
                    gm.c3(new r35(w45Var3, str6, bArr3, tonconnectsession3, w45.s(y25Var3, tonconnectsession3, str6, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, w45Var3.f.getCurrentTime()), lf2Var, y25Var3, jSONArray, tL_urlAuthResultRequest));
                    break;
                } catch (Exception e2) {
                    lf2Var.a(null, w45.h("prepare OAuth identity", e2));
                    return;
                }
            case 6:
                String str7 = (String) obj5;
                w45 w45Var4 = ((c) obj8).g;
                u56 u56Var = new u56((a66) obj7, (String) obj, b3);
                w45Var4.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) obj6;
                tonconnectcreatesession.manifest_url = str7;
                w45Var4.f.sendRequestTyped(tonconnectcreatesession, new kc(objArr6 == true ? 1 : 0), new w35((Object) w45Var4, (Object) u56Var, obj4, (Object) str7, obj3, obj2, (byte) 0));
                break;
            case 7:
                lo7 notificationsController = ((cf7) obj7).getNotificationsController();
                Collection values = ((HashMap) obj).values();
                notificationsController.getMessagesController().d4((ArrayList) obj4, true);
                notificationsController.getMessagesController().X3((ArrayList) obj3, true);
                notificationsController.getMessagesController().a4((ArrayList) obj2);
                lo7.l0.c(new v15((Object) notificationsController, obj6, obj8, obj5, (Object) values, (byte) 29));
                break;
            case 8:
                TLObject tLObject3 = (TLObject) obj6;
                ln8 ln8Var = (ln8) obj8;
                fj0 fj0Var3 = (fj0) obj4;
                lf2 lf2Var2 = (lf2) obj3;
                Activity activity = (Activity) obj2;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) obj;
                List list3 = (List) obj5;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    boolean z3 = tLObject3 instanceof TLRPC.TL_boolFalse;
                    Boolean bool = Boolean.FALSE;
                    if (!z3) {
                        lf2Var2.a(bool, tL_error3 != null ? tL_error3.text : "SERVER_ERROR");
                        break;
                    } else {
                        lf2Var2.a(bool, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    cj0.h().c(ln8Var.c, new ad0(fj0Var3, lf2Var2, (byte) 5));
                    cj0.h().h = new rta(lf2Var2, b2);
                    cj0 h3 = cj0.h();
                    j5 a3 = j5.a(z8c.t0);
                    hi2 hi2Var3 = new hi2(b4, (boolean) (objArr7 == true ? 1 : 0));
                    hi2Var3.T((ln8) list3.get(0));
                    h3.k(activity, a3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(hi2Var3.c()));
                    break;
                }
            case 9:
                TLObject tLObject4 = (TLObject) obj6;
                ln8 ln8Var2 = (ln8) obj8;
                fj0 fj0Var4 = (fj0) obj4;
                fv4 fv4Var = (fv4) obj3;
                Activity activity2 = (Activity) obj2;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj;
                List list4 = (List) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    boolean z4 = tLObject4 instanceof TLRPC.TL_boolFalse;
                    Boolean bool2 = Boolean.FALSE;
                    if (!z4) {
                        fv4Var.a(bool2, tL_error4 != null ? tL_error4.text : "SERVER_ERROR");
                        break;
                    } else {
                        fv4Var.a(bool2, "PURCHASE_FORBIDDEN");
                        break;
                    }
                } else {
                    cj0.h().c(ln8Var2.c, new ad0(fj0Var4, fv4Var, (byte) 4));
                    cj0.h().h = new xta(fv4Var, b2);
                    cj0 h4 = cj0.h();
                    j5 a4 = j5.a(z8c.t0);
                    hi2 hi2Var4 = new hi2(b4, z);
                    hi2Var4.T((ln8) list4.get(0));
                    h4.k(activity2, a4, tL_inputStorePaymentStarsGift, Collections.singletonList(hi2Var4.c()));
                    break;
                }
            default:
                ((UserInfoActivity) obj8).g0((TLRPC.TL_error) obj7, (TLObject) obj6, (TL_account.TL_birthday) obj5, (TLRPC.UserFull) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ lo0(TLObject tLObject, ln8 ln8Var, fj0 fj0Var, jac jacVar, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.c = tLObject;
        this.h = ln8Var;
        this.e = fj0Var;
        this.n = jacVar;
        this.f = activity;
        this.r = inputStorePaymentPurpose;
        this.d = list;
        this.b = tL_error;
    }

    public /* synthetic */ lo0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.a = b;
        this.b = obj;
        this.h = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.n = obj6;
        this.f = obj7;
        this.r = obj8;
    }
}
