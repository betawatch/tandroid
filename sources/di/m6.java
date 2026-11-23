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
import org.telegram.messenger.d20;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.ce0;
import org.telegram.ui.de0;
import org.telegram.ui.e00;
import org.telegram.ui.hk0;
import org.telegram.ui.ld0;
import org.telegram.ui.lj0;
import org.telegram.ui.md0;
import org.telegram.ui.mj0;
import org.telegram.ui.ml0;
import org.telegram.ui.mm;
import org.telegram.ui.ne;
import org.telegram.ui.p51;
import org.telegram.ui.re;
import org.telegram.ui.wc1;
import org.telegram.ui.wj0;
import org.telegram.ui.ws;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ m6(y8 y8Var, TLObject tLObject, gj gjVar, TLRPC.InputInvoice inputInvoice, y10 y10Var, org.telegram.ui.Components.lc lcVar, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = y8Var;
        this.c = tLObject;
        this.d = gjVar;
        this.e = inputInvoice;
        this.n = y10Var;
        this.f = lcVar;
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
        hi.c7 m10;
        ml0 ml0Var;
        ml0 ml0Var2;
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
                ((y8) obj7).X((String) obj3, (TLRPC.ChatInvite) obj2, new o6((boolean[]) obj4, (r10) obj, (y10) obj6));
                break;
            case 1:
                y8 y8Var = (y8) obj7;
                List list = (List) obj5;
                bi.e8 e8Var = (bi.e8) obj4;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj3;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                f5.f fVar = (f5.f) obj;
                Activity activity = (Activity) obj6;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.g3(new e7(e8Var, i17));
                    break;
                } else {
                    f5.m mVar = (f5.m) list.get(0);
                    f5.i a10 = mVar.a();
                    if (a10 == null) {
                        org.telegram.messenger.g0.g3(new e7(e8Var, i16));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a10.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(y8Var.a).sendRequest(tL_payments_canPurchaseStore, new y6(mVar, fVar, e8Var, activity, tL_inputStorePaymentStarsGift, list, 1));
                        break;
                    }
                }
            case 2:
                y8 y8Var2 = (y8) obj7;
                TLObject tLObject = (TLObject) obj5;
                gj gjVar = (gj) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                y10 y10Var = (y10) obj6;
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    y8Var2.Y(gjVar, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, y10Var);
                    break;
                } else {
                    y10Var.a(Boolean.FALSE);
                    lcVar.Q(R.raw.error, 36, hd.a0(null, null, 2131743633, tL_error != null ? tL_error.text : "FAILED_GETTING_FORM")).j();
                    break;
                }
            case 3:
                mc mcVar = (mc) obj7;
                fi.m0[] m0VarArr = (fi.m0[]) obj5;
                int[] iArr = (int[]) obj4;
                RectF rectF = (RectF) obj3;
                View view = (View) obj2;
                ch.q0 q0Var = (ch.q0) obj;
                ch.n0 n0Var = (ch.n0) obj6;
                if (mcVar.o1) {
                    fi.m0 m0Var = m0VarArr[0];
                    if (m0Var == null) {
                        m0Var = mcVar.K1.d(mcVar.L1);
                        m0VarArr[0] = m0Var;
                    }
                    if (m0Var != null) {
                        m0Var.setDrawStar(false);
                        m0Var.getLocationInWindow(iArr);
                        TextView textView = m0Var.F;
                        nq[] nqVarArr = m0Var.H;
                        if (nqVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + nqVarArr[0].r;
                            float y10 = textView.getY() + textView.getPaddingTop() + nqVarArr[0].s;
                            rectF.set(x10, y10, r2.c.getBounds().width() + x10, nqVarArr[0].c.getBounds().height() + y10);
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
                bn bnVar = (bn) obj7;
                gj gjVar2 = (gj) obj4;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj2;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj;
                yk0 yk0Var = (yk0) obj6;
                ((a70) obj5).q0 = true;
                if (!TextUtils.isEmpty(gjVar2.z)) {
                    str = r1Var.getMessageObject().z.toString();
                } else if (!TextUtils.isEmpty(gjVar2.v)) {
                    str = r1Var.getMessageObject().v.toString();
                }
                String str2 = str.length() > 21 ? str.substring(0, 21) + "..." : str;
                Activity parentActivity = bnVar.getParentActivity();
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
                yk0Var.dismiss();
                break;
            case 5:
                bn bnVar2 = (bn) obj7;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                ne neVar = (ne) obj;
                String str3 = (String) obj3;
                vf.b bVar = (vf.b) obj6;
                boolean z11 = tL_error2 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error2.text);
                if (tLObject2 != null || (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_boolTrue))) {
                    neVar.a(tLObject2, Boolean.valueOf(z11));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str3;
                    bVar.b = new re(bnVar2, bnVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new j3(bnVar2, bVar, neVar, z11, 4)), i15);
                    bVar.d();
                    break;
                }
            case 6:
                TLObject tLObject4 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                gj gjVar3 = (gj) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj6;
                bn bnVar3 = ((mm) obj7).a;
                ((org.telegram.ui.ActionBar.t1) obj5).dismiss();
                if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    bnVar3.getMessagesController().f4(groupcall.users, false);
                    bnVar3.getMessagesController().Z3(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        bnVar3.showDialog(new ws(bnVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity2 = bnVar3.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.g2) bnVar3).currentAccount;
                        org.telegram.ui.Components.voip.b2.g(parentActivity2, i7, tL_inputGroupCallInviteMessage, gjVar3.k.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error3 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.lc.b0(bnVar3).g0(tL_error3, false);
                        break;
                    }
                } else {
                    bnVar3.showDialog(new ws(bnVar3.getParentActivity(), hashSet));
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
                    de0 de0Var = new de0();
                    de0Var.H = str4;
                    de0Var.I = bundle;
                    de0Var.J = (TLRPC.TL_auth_sentCode) tLObject5;
                    de0Var.G = 1;
                    launchActivity.t0(de0Var);
                    break;
                } else {
                    org.telegram.ui.Components.c5.c0(launchActivity.P, tL_error4, launchActivity.M().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 8:
                ld0 ld0Var = (ld0) obj7;
                List<Purchase> list2 = (List) obj4;
                String str6 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj;
                q20 q20Var = (q20) obj6;
                if (((f5.f) obj5).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str6)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            ld0Var.w.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new m7(ld0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, q20Var, 9), 74);
                            break;
                        }
                    }
                }
                q20Var.run();
                break;
            case 9:
                ce0 ce0Var = (ce0) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj2;
                String str7 = (String) obj3;
                md0 md0Var = (md0) obj;
                TLObject tLObject7 = (TLObject) obj6;
                de0 de0Var2 = ce0Var.h0;
                ce0Var.N = false;
                if (tL_error5 != null) {
                    String str8 = tL_error5.text;
                    if (str8 != null) {
                        if (str8.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i11 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                            ConnectionsManager.getInstance(i11).sendRequest(getpassword, new e00(i14, ce0Var, str7), 10);
                        } else if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                            de0.E1(de0Var2, str7, md0Var, false);
                        } else if (tL_error5.text.contains("PHONE_PASSWORD_FLOOD")) {
                            de0Var2.D1(hd.N0(2131745875, null), hd.N0(2131750670, "FloodWait"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_FLOOD")) {
                            de0Var2.D1(hd.N0(2131745875, null), hd.N0(2131747092, "PhoneNumberFlood"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_BANNED")) {
                            de0.E1(de0Var2, str7, md0Var, true);
                        } else if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                            de0Var2.D1(hd.N0(2131745875, null), hd.N0(2131748990, null));
                        } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            de0Var2.M1(0, true, null, true);
                            de0Var2.D1(hd.N0(2131745875, null), hd.N0(2131752009, "CodeExpired"));
                        } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                            de0Var2.D1(hd.N0(2131745875, null), hd.N0(2131750670, "FloodWait"));
                        } else if (tL_error5.code != -1000) {
                            i10 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                            org.telegram.ui.Components.c5.c0(i10, tL_error5, de0Var2, tLObject7, (String) md0Var.d);
                        }
                    }
                } else if (tLObject6 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject6).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            de0Var2.s0 = tL_help_termsOfService;
                        }
                        de0Var2.M1(5, true, bundle2, false);
                    } else {
                        de0Var2.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    de0Var2.y1(bundle2, (TLRPC.auth_SentCode) tLObject6, true);
                }
                if (!de0Var2.r0) {
                    de0Var2.C1(false, true);
                    break;
                }
                break;
            case 10:
                TLObject tLObject8 = (TLObject) obj5;
                String str9 = (String) obj3;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj4;
                mj0 mj0Var = (mj0) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                wj0 wj0Var = (wj0) obj6;
                hk0 hk0Var = ((lj0) obj7).p.d;
                if (tLObject8 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str9);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    hk0 hk0Var2 = new hk0(6, hk0Var.E, hk0Var.K, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i12 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.g2) hk0Var2).currentAccount = i12;
                    hk0Var2.U0 = sentemailcode.length;
                    hk0Var2.f1 = hk0Var.f1;
                    hk0Var2.d1 = hk0Var.d1;
                    hk0Var2.C1 = mj0Var;
                    hk0Var.presentFragment(hk0Var2, true);
                    break;
                } else {
                    hk0Var.Q1(hd.N0(2131747381, null), tL_error6.text);
                    if (wj0Var != null) {
                        wj0Var.d(tL_error6.text, str9);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) obj7;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj5;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj4;
                String str10 = (String) obj3;
                byte[] bArr = (byte[]) obj2;
                org.telegram.ui.Wallet.g2 g2Var = (org.telegram.ui.Wallet.g2) obj;
                p51 p51Var = (p51) obj6;
                l2Var.getClass();
                try {
                    org.telegram.messenger.g0.g3(new j7(l2Var, g2Var, tonconnectsession, str10, bArr, org.telegram.ui.Wallet.l2.r(r0Var, tonconnectsession, str10, bArr, g2Var.a, g2Var.b, g2Var.d, null, l2Var.f.getCurrentTime()), p51Var, r0Var, 6));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.k1(p51Var, org.telegram.ui.Wallet.l2.i("prepare connect", e10), i17));
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) obj7;
                org.telegram.ui.Wallet.g2 g2Var2 = (org.telegram.ui.Wallet.g2) obj5;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj4;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) obj;
                byte[] bArr2 = i2Var.b;
                p51 p51Var2 = (p51) obj6;
                if (l2Var2.d(g2Var2, tonconnectsession2, (String) obj3, (byte[]) obj2)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession2.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr2;
                    tonconnectsubmitconnectresult.body = i2Var.c;
                    tonconnectsubmitconnectresult.trace_id = g2Var2.c;
                    l2Var2.f.sendRequestTyped(tonconnectsubmitconnectresult, new d3.b(i16), new org.telegram.ui.Wallet.j(l2Var2, i2Var, p51Var2, i15));
                    break;
                } else {
                    Arrays.fill(bArr2, (byte) 0);
                    p51Var2.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 13:
                org.telegram.ui.Wallet.l2 l2Var3 = (org.telegram.ui.Wallet.l2) obj7;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) obj5;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj4;
                String str11 = (String) obj3;
                byte[] bArr3 = (byte[]) obj2;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                p51 p51Var3 = (p51) obj6;
                l2Var3.getClass();
                try {
                    org.telegram.messenger.g0.g3(new bi.l2(l2Var3, str11, bArr3, p51Var3, tonconnectsession3, org.telegram.ui.Wallet.l2.t(r0Var2, tonconnectsession3, str11, bArr3, tonconnectnexteventid.event_id), 21));
                    break;
                } catch (Exception e11) {
                    p51Var3.a(org.telegram.ui.Wallet.l2.i("prepare disconnect", e11));
                    return;
                }
            case 14:
                JSONObject jSONObject = (JSONObject) obj7;
                String str12 = (String) obj3;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj5;
                org.telegram.ui.Wallet.d3 d3Var = y2Var.a;
                org.telegram.ui.Wallet.w2 w2Var = y2Var.b;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj4;
                String str13 = (String) obj2;
                byte[] bArr4 = (byte[]) obj;
                byte[] bArr5 = (byte[]) obj6;
                if (jSONObject == null) {
                    org.telegram.ui.Components.lc.c0(str12);
                    y2Var.d = false;
                    if (!y2Var.f) {
                        y2Var.f = true;
                        w2Var.a();
                    }
                    if (!y2Var.e) {
                        d3Var.dismiss();
                        break;
                    }
                } else {
                    TLRPC.TL_widgetQueryTypeSignData tL_widgetQueryTypeSignData = new TLRPC.TL_widgetQueryTypeSignData();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str13;
                    tL_userWallet.balance = u0Var.A();
                    if (bArr5 != null) {
                        tL_userWallet.public_key = bArr4;
                        tL_userWallet.state_init = bArr5;
                    }
                    tL_widgetQueryTypeSignData.wallet = tL_userWallet;
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_widgetQueryTypeSignData.sign_data = tL_dataJSON2;
                    tL_dataJSON2.data = jSONObject.toString();
                    y2Var.d = false;
                    if (!y2Var.f) {
                        y2Var.f = true;
                        w2Var.d(tL_widgetQueryTypeSignData);
                    }
                    if (!y2Var.e) {
                        d3Var.dismiss();
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
                    File w10 = hi.c7.w(k10.t0, "jpg");
                    org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(file, true, 0L, 0, null, null, null, 0L, k10.t0, true, Z0, Z02, null, 0, true);
                    Bitmap p10 = c6Var.p();
                    c6Var.u();
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
                            m10 = hi.c7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                            m10.k0 = i18;
                            m10.l0 = i19;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            t1Var.c(500L);
                            return;
                        }
                    }
                    m10 = hi.c7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                    m10.k0 = i18;
                    m10.l0 = i19;
                    m10.A();
                } else {
                    m10 = hi.c7.m(file, ((Integer) org.telegram.messenger.g0.L0(file).first).intValue());
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str14 != null) {
                        m10.C0 = str14;
                    }
                    if (!TextUtils.isEmpty(str15) && k10.i(v0Var.N).q()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        d20 d20Var = new d20();
                        d20Var.a = (byte) 7;
                        d20Var.b = (byte) -1;
                        d20Var.l = -1;
                        tg.i0 i0Var = new tg.i0();
                        d20Var.W = i0Var;
                        i0Var.c = str15;
                        if (str16 != null) {
                            i0Var.a |= 2;
                            i0Var.b = str16;
                        }
                        m10.T0.add(d20Var);
                    }
                    hi.sa.D(v0Var.a0, k10.t0).T(null, m10);
                    t1Var.c(500L);
                    break;
                } else {
                    t1Var.c(500L);
                }
                break;
            case 16:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                wg.v vVar = (wg.v) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                np npVar = (np) obj3;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj2;
                org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) obj;
                wg.v vVar2 = (wg.v) obj6;
                if (tL_error7 != null) {
                    vVar.a(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        npVar.f4(paymentForm.users, false);
                        ml0Var = new ml0(paymentForm, tL_inputInvoicePremiumGiftCode, g2Var3);
                    } else {
                        ml0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new ml0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (ml0Var != null) {
                        ml0Var.a1 = new wc1(23, vVar2, vVar);
                        LaunchActivity.Q().showAsSheet(ml0Var, new org.telegram.ui.ActionBar.e2());
                        break;
                    } else {
                        vVar.a(null);
                        break;
                    }
                }
            default:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                y10 y10Var2 = (y10) obj6;
                TLObject tLObject10 = (TLObject) obj5;
                np npVar2 = (np) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.g2 g2Var4 = (org.telegram.ui.ActionBar.g2) obj2;
                y10 y10Var3 = (y10) obj;
                if (tL_error8 != null) {
                    y10Var2.a(tL_error8);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        npVar2.f4(paymentForm2.users, false);
                        ml0Var2 = new ml0(paymentForm2, tL_inputInvoicePremiumGiftCode2, g2Var4);
                    } else {
                        ml0Var2 = tLObject10 instanceof TLRPC.PaymentReceipt ? new ml0((TLRPC.PaymentReceipt) tLObject10) : null;
                    }
                    if (ml0Var2 != null) {
                        ml0Var2.a1 = new wc1(24, y10Var3, y10Var2);
                        LaunchActivity.Q().showAsSheet(ml0Var2, new org.telegram.ui.ActionBar.e2());
                        break;
                    } else {
                        y10Var2.a(null);
                        break;
                    }
                }
        }
    }

    public /* synthetic */ m6(y8 y8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, r10 r10Var, y10 y10Var) {
        this.a = 0;
        this.b = y8Var;
        this.c = zArr;
        this.e = str;
        this.f = chatInvite;
        this.d = zArr2;
        this.h = r10Var;
        this.n = y10Var;
    }

    public /* synthetic */ m6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
    }

    public /* synthetic */ m6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.y2 y2Var, org.telegram.ui.Wallet.u0 u0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.a = 14;
        this.b = jSONObject;
        this.e = str;
        this.c = y2Var;
        this.d = u0Var;
        this.f = str2;
        this.h = bArr;
        this.n = bArr2;
    }

    public /* synthetic */ m6(gs gsVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = gsVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.e = str;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ m6(TLRPC.TL_error tL_error, y10 y10Var, TLObject tLObject, np npVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.g2 g2Var, y10 y10Var2) {
        this.a = 17;
        this.b = tL_error;
        this.n = y10Var;
        this.c = tLObject;
        this.d = npVar;
        this.e = tL_inputInvoicePremiumGiftCode;
        this.f = g2Var;
        this.h = y10Var2;
    }

    public /* synthetic */ m6(bn bnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, ne neVar, String str, vf.b bVar) {
        this.a = 5;
        this.b = bnVar;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tLObject2;
        this.h = neVar;
        this.e = str;
        this.n = bVar;
    }

    public /* synthetic */ m6(lj0 lj0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, mj0 mj0Var, TLRPC.TL_error tL_error, wj0 wj0Var) {
        this.a = 10;
        this.b = lj0Var;
        this.c = tLObject;
        this.e = str;
        this.d = tL_secureRequiredType;
        this.f = mj0Var;
        this.h = tL_error;
        this.n = wj0Var;
    }
}
