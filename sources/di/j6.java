package di;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.b00;
import org.telegram.ui.be0;
import org.telegram.ui.ce0;
import org.telegram.ui.ek0;
import org.telegram.ui.ij0;
import org.telegram.ui.jj0;
import org.telegram.ui.kd0;
import org.telegram.ui.kl0;
import org.telegram.ui.ld0;
import org.telegram.ui.lm;
import org.telegram.ui.oe;
import org.telegram.ui.tj0;
import org.telegram.ui.vs;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ j6(u8 u8Var, TLObject tLObject, gj gjVar, TLRPC.InputInvoice inputInvoice, z10 z10Var, org.telegram.ui.Components.cc ccVar, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = u8Var;
        this.c = tLObject;
        this.d = gjVar;
        this.e = inputInvoice;
        this.n = z10Var;
        this.f = ccVar;
        this.h = tL_error;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long millis;
        int i7;
        int i10;
        int i11;
        int i12;
        hi.d7 m10;
        kl0 kl0Var;
        kl0 kl0Var2;
        int i13 = this.a;
        int i14 = 13;
        int i15 = 8;
        int i16 = 1;
        int i17 = 0;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.n;
        Object obj7 = this.b;
        switch (i13) {
            case 0:
                ((boolean[]) obj5)[0] = true;
                ((u8) obj7).Y((String) obj3, (TLRPC.ChatInvite) obj2, new l6((boolean[]) obj4, (s10) obj, (z10) obj6));
                break;
            case 1:
                u8 u8Var = (u8) obj7;
                List list = (List) obj5;
                bi.v5 v5Var = (bi.v5) obj4;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj3;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                f5.f fVar = (f5.f) obj;
                Activity activity = (Activity) obj6;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.h3(new b7(v5Var, i17));
                    break;
                } else {
                    f5.m mVar = (f5.m) list.get(0);
                    f5.i a10 = mVar.a();
                    if (a10 == null) {
                        org.telegram.messenger.g0.h3(new b7(v5Var, i16));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a10.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(u8Var.a).sendRequest(tL_payments_canPurchaseStore, new u6(mVar, fVar, v5Var, activity, tL_inputStorePaymentStarsGift, list, 1));
                        break;
                    }
                }
            case 2:
                u8 u8Var2 = (u8) obj7;
                TLObject tLObject = (TLObject) obj5;
                gj gjVar = (gj) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                z10 z10Var = (z10) obj6;
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    u8Var2.Z(gjVar, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, z10Var);
                    break;
                } else {
                    z10Var.a(Boolean.FALSE);
                    ccVar.Q(R.raw.error, 36, hd.a0(null, null, 2131743878, tL_error != null ? tL_error.text : "FAILED_GETTING_FORM")).j();
                    break;
                }
            case 3:
                ic icVar = (ic) obj7;
                fi.n0[] n0VarArr = (fi.n0[]) obj5;
                int[] iArr = (int[]) obj4;
                RectF rectF = (RectF) obj3;
                View view = (View) obj2;
                ch.q0 q0Var = (ch.q0) obj;
                ch.n0 n0Var = (ch.n0) obj6;
                if (icVar.o1) {
                    fi.n0 n0Var2 = n0VarArr[0];
                    if (n0Var2 == null) {
                        n0Var2 = icVar.K1.d(icVar.L1);
                        n0VarArr[0] = n0Var2;
                    }
                    if (n0Var2 != null) {
                        n0Var2.setDrawStar(false);
                        n0Var2.getLocationInWindow(iArr);
                        TextView textView = n0Var2.F;
                        eq[] eqVarArr = n0Var2.H;
                        if (eqVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + eqVarArr[0].r;
                            float y10 = textView.getY() + textView.getPaddingTop() + eqVarArr[0].s;
                            rectF.set(x10, y10, r2.c.getBounds().width() + x10, eqVarArr[0].c.getBounds().height() + y10);
                        }
                        rectF.offset(iArr[0], iArr[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr);
                    rectF.set(org.telegram.messenger.g0.L(4.0f) + iArr[0] + q0Var.b + n0Var.w, ((n0Var.A - org.telegram.messenger.g0.L(22.0f)) / 2.0f) + iArr[1] + q0Var.c + n0Var.x, org.telegram.messenger.g0.L(26.0f) + iArr[0] + q0Var.b + n0Var.w, ((org.telegram.messenger.g0.L(22.0f) + n0Var.A) / 2.0f) + iArr[1] + q0Var.c + n0Var.x);
                    break;
                }
                break;
            case 4:
                an anVar = (an) obj7;
                gj gjVar2 = (gj) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj2;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj;
                ok0 ok0Var = (ok0) obj6;
                ((m60) obj5).n0 = true;
                if (!TextUtils.isEmpty(gjVar2.z)) {
                    str = q1Var.getMessageObject().z.toString();
                } else if (!TextUtils.isEmpty(gjVar2.v)) {
                    str = q1Var.getMessageObject().v.toString();
                }
                String str2 = str.length() > 21 ? str.substring(0, 21) + "..." : str;
                Activity parentActivity = anVar.getParentActivity();
                long j3 = tL_messageEntityFormattedDate.date * 1000;
                boolean z10 = (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true;
                Typeface typeface = org.telegram.messenger.g0.a;
                if (z10) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j3);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    j3 = calendar.getTimeInMillis();
                    millis = TimeUnit.DAYS.toMillis(1L);
                } else {
                    millis = TimeUnit.MINUTES.toMillis(10L);
                }
                Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j3).putExtra("endTime", millis + j3).putExtra("allDay", z10);
                if (!TextUtils.isEmpty(str2)) {
                    putExtra.putExtra("title", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    putExtra.putExtra("description", str);
                }
                try {
                    parentActivity.startActivity(putExtra);
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                ok0Var.dismiss();
                break;
            case 5:
                an anVar2 = (an) obj7;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                z2 z2Var = (z2) obj;
                String str3 = (String) obj3;
                vf.b bVar = (vf.b) obj6;
                boolean z11 = tL_error2 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error2.text);
                if (tLObject2 != null || (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_boolTrue))) {
                    z2Var.a(tLObject2, Boolean.valueOf(z11));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str3;
                    bVar.b = new oe(anVar2, anVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new f3(anVar2, bVar, z2Var, z11, 4)), i15);
                    bVar.d();
                    break;
                }
            case 6:
                TLObject tLObject4 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                gj gjVar3 = (gj) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj6;
                an anVar3 = ((lm) obj7).a;
                ((org.telegram.ui.ActionBar.t1) obj5).dismiss();
                if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    anVar3.getMessagesController().Y3(groupcall.users, false);
                    anVar3.getMessagesController().S3(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        anVar3.showDialog(new vs(anVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity2 = anVar3.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.e2) anVar3).currentAccount;
                        org.telegram.ui.Components.voip.c2.g(parentActivity2, i7, tL_inputGroupCallInviteMessage, gjVar3.k.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error3 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.cc.a0(anVar3).f0(tL_error3, false);
                        break;
                    }
                } else {
                    anVar3.showDialog(new vs(anVar3.getParentActivity(), hashSet));
                    break;
                }
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                String str4 = (String) obj3;
                Bundle bundle = (Bundle) obj2;
                TLObject tLObject5 = (TLObject) obj;
                TL_account.sendConfirmPhoneCode sendconfirmphonecode = (TL_account.sendConfirmPhoneCode) obj6;
                String str5 = LaunchActivity.C1;
                ((org.telegram.ui.ActionBar.t1) obj5).dismiss();
                if (tL_error4 == null) {
                    ce0 ce0Var = new ce0();
                    ce0Var.H = str4;
                    ce0Var.I = bundle;
                    ce0Var.J = (TLRPC.TL_auth_sentCode) tLObject5;
                    ce0Var.G = 1;
                    launchActivity.t0(ce0Var);
                    break;
                } else {
                    org.telegram.ui.Components.t4.c0(launchActivity.P, tL_error4, launchActivity.M().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 8:
                kd0 kd0Var = (kd0) obj7;
                List<Purchase> list2 = (List) obj4;
                String str6 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj;
                u80 u80Var = (u80) obj6;
                if (((f5.f) obj5).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str6)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            kd0Var.w.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new k7(kd0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, u80Var, 9), 74);
                            break;
                        }
                    }
                }
                u80Var.run();
                break;
            case 9:
                be0 be0Var = (be0) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj2;
                String str7 = (String) obj3;
                ld0 ld0Var = (ld0) obj;
                TLObject tLObject7 = (TLObject) obj6;
                ce0 ce0Var2 = be0Var.h0;
                be0Var.N = false;
                if (tL_error5 != null) {
                    String str8 = tL_error5.text;
                    if (str8 != null) {
                        if (str8.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i11 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                            ConnectionsManager.getInstance(i11).sendRequest(getpassword, new b00(i14, be0Var, str7), 10);
                        } else if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                            ce0.E1(ce0Var2, str7, ld0Var, false);
                        } else if (tL_error5.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ce0Var2.D1(hd.M0(2131746071, null), hd.M0(2131750687, "FloodWait"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_FLOOD")) {
                            ce0Var2.D1(hd.M0(2131746071, null), hd.M0(2131747286, "PhoneNumberFlood"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_BANNED")) {
                            ce0.E1(ce0Var2, str7, ld0Var, true);
                        } else if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                            ce0Var2.D1(hd.M0(2131746071, null), hd.M0(2131749183, null));
                        } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            ce0Var2.M1(0, true, null, true);
                            ce0Var2.D1(hd.M0(2131746071, null), hd.M0(2131752021, "CodeExpired"));
                        } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                            ce0Var2.D1(hd.M0(2131746071, null), hd.M0(2131750687, "FloodWait"));
                        } else if (tL_error5.code != -1000) {
                            i10 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                            org.telegram.ui.Components.t4.c0(i10, tL_error5, ce0Var2, tLObject7, (String) ld0Var.d);
                        }
                    }
                } else if (tLObject6 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject6).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ce0Var2.s0 = tL_help_termsOfService;
                        }
                        ce0Var2.M1(5, true, bundle2, false);
                    } else {
                        ce0Var2.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    ce0Var2.y1(bundle2, (TLRPC.auth_SentCode) tLObject6, true);
                }
                if (!ce0Var2.r0) {
                    ce0Var2.C1(false, true);
                    break;
                }
                break;
            case 10:
                TLObject tLObject8 = (TLObject) obj5;
                String str9 = (String) obj3;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj4;
                jj0 jj0Var = (jj0) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                tj0 tj0Var = (tj0) obj6;
                ek0 ek0Var = ((ij0) obj7).p.d;
                if (tLObject8 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str9);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    ek0 ek0Var2 = new ek0(6, ek0Var.E, ek0Var.K, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i12 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.e2) ek0Var2).currentAccount = i12;
                    ek0Var2.U0 = sentemailcode.length;
                    ek0Var2.f1 = ek0Var.f1;
                    ek0Var2.d1 = ek0Var.d1;
                    ek0Var2.C1 = jj0Var;
                    ek0Var.presentFragment(ek0Var2, true);
                    break;
                } else {
                    ek0Var.Q1(hd.M0(2131747575, null), tL_error6.text);
                    if (tj0Var != null) {
                        tj0Var.d(tL_error6.text, str9);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj7;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj5;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj4;
                String str10 = (String) obj3;
                byte[] bArr = (byte[]) obj2;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                x21 x21Var = (x21) obj6;
                d2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new g7(d2Var, y1Var, tonconnectsession, str10, bArr, org.telegram.ui.Wallet.d2.r(i0Var, tonconnectsession, str10, bArr, y1Var.a, y1Var.b, y1Var.d, null, d2Var.f.getCurrentTime()), x21Var, i0Var, 6));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.b1(x21Var, org.telegram.ui.Wallet.d2.i("prepare connect", e10), i17));
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) obj7;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) obj5;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj4;
                String str11 = (String) obj3;
                byte[] bArr2 = (byte[]) obj2;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                x21 x21Var2 = (x21) obj6;
                d2Var2.getClass();
                try {
                    org.telegram.messenger.g0.h3(new bi.p1(d2Var2, str11, bArr2, x21Var2, tonconnectsession2, org.telegram.ui.Wallet.d2.t(i0Var2, tonconnectsession2, str11, bArr2, tonconnectnexteventid.event_id), 22));
                    break;
                } catch (Exception e11) {
                    x21Var2.a(org.telegram.ui.Wallet.d2.i("prepare disconnect", e11));
                    return;
                }
            case 13:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) obj7;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) obj5;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj4;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                byte[] bArr3 = a2Var.b;
                x21 x21Var3 = (x21) obj6;
                if (d2Var3.d(y1Var2, tonconnectsession3, (String) obj3, (byte[]) obj2)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession3.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr3;
                    tonconnectsubmitconnectresult.body = a2Var.c;
                    tonconnectsubmitconnectresult.trace_id = y1Var2.c;
                    d2Var3.f.sendRequestTyped(tonconnectsubmitconnectresult, new d3.b(i16), new org.telegram.ui.Wallet.j(d2Var3, a2Var, x21Var3, i15));
                    break;
                } else {
                    Arrays.fill(bArr3, (byte) 0);
                    x21Var3.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 14:
                JSONObject jSONObject = (JSONObject) obj7;
                String str12 = (String) obj3;
                org.telegram.ui.Wallet.r2 r2Var = (org.telegram.ui.Wallet.r2) obj5;
                org.telegram.ui.Wallet.w2 w2Var = r2Var.a;
                org.telegram.ui.Wallet.p2 p2Var = r2Var.b;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj4;
                String str13 = (String) obj2;
                byte[] bArr4 = (byte[]) obj;
                byte[] bArr5 = (byte[]) obj6;
                if (jSONObject == null) {
                    org.telegram.ui.Components.cc.b0(str12);
                    r2Var.d = false;
                    if (!r2Var.f) {
                        r2Var.f = true;
                        p2Var.a();
                    }
                    if (!r2Var.e) {
                        w2Var.dismiss();
                        break;
                    }
                } else {
                    TLRPC.TL_widgetQueryTypeSignData tL_widgetQueryTypeSignData = new TLRPC.TL_widgetQueryTypeSignData();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str13;
                    tL_userWallet.balance = l0Var.v();
                    if (bArr5 != null) {
                        tL_userWallet.public_key = bArr4;
                        tL_userWallet.state_init = bArr5;
                    }
                    tL_widgetQueryTypeSignData.wallet = tL_userWallet;
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_widgetQueryTypeSignData.sign_data = tL_dataJSON2;
                    tL_dataJSON2.data = jSONObject.toString();
                    r2Var.d = false;
                    if (!r2Var.f) {
                        r2Var.f = true;
                        p2Var.d(tL_widgetQueryTypeSignData);
                    }
                    if (!r2Var.e) {
                        w2Var.dismiss();
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj7;
                int[] iArr2 = (int[]) obj5;
                File file = (File) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                String str14 = (String) obj3;
                String str15 = (String) obj;
                String str16 = (String) obj6;
                if (iArr2[4] > 0) {
                    int i18 = iArr2[1];
                    int i19 = iArr2[2];
                    int Z0 = i18 > org.telegram.messenger.g0.Z0(false) ? org.telegram.messenger.g0.Z0(false) : i18;
                    int Z02 = i19 > org.telegram.messenger.g0.Z0(false) ? org.telegram.messenger.g0.Z0(false) : i19;
                    File w10 = hi.d7.w(m10.t0, "jpg");
                    org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(file, true, 0L, 0, null, null, null, 0L, m10.t0, true, Z0, Z02, null, 0, true);
                    Bitmap p10 = t5Var.p();
                    t5Var.u();
                    if (p10 != null) {
                        try {
                        } catch (Exception e12) {
                            e = e12;
                        }
                        try {
                            p10.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w10));
                        } catch (Exception e13) {
                            e = e13;
                            org.telegram.messenger.a8.g(e, true);
                            w10 = null;
                            m10 = hi.d7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                            m10.k0 = i18;
                            m10.l0 = i19;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            t1Var.c(500L);
                            return;
                        }
                    }
                    m10 = hi.d7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                    m10.k0 = i18;
                    m10.l0 = i19;
                    m10.A();
                } else {
                    m10 = hi.d7.m(file, ((Integer) org.telegram.messenger.g0.L0(file).first).intValue());
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str14 != null) {
                        m10.C0 = str14;
                    }
                    if (!TextUtils.isEmpty(str15) && m10.i(v0Var.N).q()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        e20 e20Var = new e20();
                        e20Var.a = (byte) 7;
                        e20Var.b = (byte) -1;
                        e20Var.l = -1;
                        tg.h0 h0Var = new tg.h0();
                        e20Var.W = h0Var;
                        h0Var.c = str15;
                        if (str16 != null) {
                            h0Var.a |= 2;
                            h0Var.b = str16;
                        }
                        m10.T0.add(e20Var);
                    }
                    hi.sa.D(v0Var.a0, m10.t0).T(null, m10);
                    t1Var.c(500L);
                    break;
                } else {
                    t1Var.c(500L);
                }
                break;
            case 16:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                wg.t tVar = (wg.t) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                np npVar = (np) obj3;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                wg.t tVar2 = (wg.t) obj6;
                if (tL_error7 != null) {
                    tVar.a(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        npVar.Y3(paymentForm.users, false);
                        kl0Var = new kl0(paymentForm, tL_inputInvoicePremiumGiftCode, e2Var);
                    } else {
                        kl0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new kl0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (kl0Var != null) {
                        kl0Var.a1 = new org.telegram.ui.Wallet.k8(25, tVar2, tVar);
                        LaunchActivity.Q().showAsSheet(kl0Var, new org.telegram.ui.ActionBar.c2());
                        break;
                    } else {
                        tVar.a(null);
                        break;
                    }
                }
            default:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                z10 z10Var2 = (z10) obj6;
                TLObject tLObject10 = (TLObject) obj5;
                np npVar2 = (np) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                z10 z10Var3 = (z10) obj;
                if (tL_error8 != null) {
                    z10Var2.a(tL_error8);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        npVar2.Y3(paymentForm2.users, false);
                        kl0Var2 = new kl0(paymentForm2, tL_inputInvoicePremiumGiftCode2, e2Var2);
                    } else {
                        kl0Var2 = tLObject10 instanceof TLRPC.PaymentReceipt ? new kl0((TLRPC.PaymentReceipt) tLObject10) : null;
                    }
                    if (kl0Var2 != null) {
                        kl0Var2.a1 = new org.telegram.ui.Wallet.k8(26, z10Var3, z10Var2);
                        LaunchActivity.Q().showAsSheet(kl0Var2, new org.telegram.ui.ActionBar.c2());
                        break;
                    } else {
                        z10Var2.a(null);
                        break;
                    }
                }
        }
    }

    public /* synthetic */ j6(u8 u8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, s10 s10Var, z10 z10Var) {
        this.a = 0;
        this.b = u8Var;
        this.c = zArr;
        this.e = str;
        this.f = chatInvite;
        this.d = zArr2;
        this.h = s10Var;
        this.n = z10Var;
    }

    public /* synthetic */ j6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
    }

    public /* synthetic */ j6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.r2 r2Var, org.telegram.ui.Wallet.l0 l0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.a = 14;
        this.b = jSONObject;
        this.e = str;
        this.c = r2Var;
        this.d = l0Var;
        this.f = str2;
        this.h = bArr;
        this.n = bArr2;
    }

    public /* synthetic */ j6(is isVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = isVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.e = str;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ j6(TLRPC.TL_error tL_error, z10 z10Var, TLObject tLObject, np npVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.e2 e2Var, z10 z10Var2) {
        this.a = 17;
        this.b = tL_error;
        this.n = z10Var;
        this.c = tLObject;
        this.d = npVar;
        this.e = tL_inputInvoicePremiumGiftCode;
        this.f = e2Var;
        this.h = z10Var2;
    }

    public /* synthetic */ j6(an anVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, z2 z2Var, String str, vf.b bVar) {
        this.a = 5;
        this.b = anVar;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tLObject2;
        this.h = z2Var;
        this.e = str;
        this.n = bVar;
    }

    public /* synthetic */ j6(ij0 ij0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, jj0 jj0Var, TLRPC.TL_error tL_error, tj0 tj0Var) {
        this.a = 10;
        this.b = ij0Var;
        this.c = tLObject;
        this.e = str;
        this.d = tL_secureRequiredType;
        this.f = jj0Var;
        this.h = tL_error;
        this.n = tj0Var;
    }
}
