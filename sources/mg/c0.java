package mg;

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
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.s6;
import org.telegram.messenger.vs;
import org.telegram.messenger.w20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.s2;
import org.telegram.ui.Wallet.u2;
import org.telegram.ui.Wallet.z2;
import org.telegram.ui.af;
import org.telegram.ui.cf;
import org.telegram.ui.d01;
import org.telegram.ui.ff0;
import org.telegram.ui.fn;
import org.telegram.ui.gf0;
import org.telegram.ui.jl0;
import org.telegram.ui.mk0;
import org.telegram.ui.nk0;
import org.telegram.ui.qm0;
import org.telegram.ui.re0;
import org.telegram.ui.tt;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.v8;
import org.telegram.ui.xk0;
import rh.e6;
import rh.j4;
import rh.v4;
import rh.y8;
import vh.n5;
import vh.o8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.b = obj;
        this.h = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.n = obj7;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0251  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        qm0 qm0Var;
        qm0 qm0Var2;
        long millis;
        int i10;
        int i11;
        int i12;
        int i13;
        n5 m10;
        int i14 = this.a;
        int i15 = 8;
        char c10 = 1;
        char c11 = 1;
        int i16 = 0;
        Object obj = this.n;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.h;
        Object obj7 = this.b;
        switch (i14) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj7;
                o0 o0Var = (o0) obj6;
                TLObject tLObject = (TLObject) obj5;
                wp wpVar = (wp) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                k2 k2Var = (k2) obj2;
                o0 o0Var2 = (o0) obj;
                if (tL_error != null) {
                    o0Var.a(tL_error);
                    break;
                } else {
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        wpVar.V3(paymentForm.users, false);
                        qm0Var = new qm0(paymentForm, tL_inputInvoicePremiumGiftCode, k2Var);
                    } else {
                        qm0Var = tLObject instanceof TLRPC.PaymentReceipt ? new qm0((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (qm0Var != null) {
                        qm0Var.Z0 = new ag.m(27, o0Var2, o0Var);
                        LaunchActivity.Q().showAsSheet(qm0Var, new org.telegram.ui.ActionBar.i2());
                        break;
                    } else {
                        o0Var.a(null);
                        break;
                    }
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj7;
                r20 r20Var = (r20) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                wp wpVar2 = (wp) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                k2 k2Var2 = (k2) obj2;
                r20 r20Var2 = (r20) obj;
                if (tL_error2 != null) {
                    r20Var.a(tL_error2);
                    break;
                } else {
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                        paymentForm2.invoice.recurring = true;
                        wpVar2.V3(paymentForm2.users, false);
                        qm0Var2 = new qm0(paymentForm2, tL_inputInvoicePremiumGiftCode2, k2Var2);
                    } else {
                        qm0Var2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new qm0((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (qm0Var2 != null) {
                        qm0Var2.Z0 = new ag.m(28, r20Var2, r20Var);
                        LaunchActivity.Q().showAsSheet(qm0Var2, new org.telegram.ui.ActionBar.i2());
                        break;
                    } else {
                        r20Var.a(null);
                        break;
                    }
                }
            case 2:
                un unVar = (un) obj7;
                kj kjVar = (kj) obj5;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                ol0 ol0Var = (ol0) obj;
                ((z60) obj6).n0 = true;
                if (!TextUtils.isEmpty(kjVar.z)) {
                    str = q1Var.getMessageObject().z.toString();
                } else if (!TextUtils.isEmpty(kjVar.v)) {
                    str = q1Var.getMessageObject().v.toString();
                }
                String str2 = str.length() > 21 ? str.substring(0, 21) + "..." : str;
                Activity parentActivity = unVar.getParentActivity();
                long j10 = tL_messageEntityFormattedDate.date * 1000;
                boolean z10 = (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true;
                Typeface typeface = org.telegram.messenger.i0.a;
                if (z10) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j10);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    j10 = calendar.getTimeInMillis();
                    millis = TimeUnit.DAYS.toMillis(1L);
                } else {
                    millis = TimeUnit.MINUTES.toMillis(10L);
                }
                Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j10).putExtra("endTime", millis + j10).putExtra("allDay", z10);
                if (!TextUtils.isEmpty(str2)) {
                    putExtra.putExtra("title", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    putExtra.putExtra("description", str);
                }
                try {
                    parentActivity.startActivity(putExtra);
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
                ol0Var.dismiss();
                break;
            case 3:
                un unVar2 = (un) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                TLObject tLObject3 = (TLObject) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                af afVar = (af) obj3;
                String str3 = (String) obj2;
                gf.e eVar = (gf.e) obj;
                boolean z11 = tL_error3 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error3.text);
                if (tLObject3 != null || (tL_error3 == null && (tLObject4 instanceof TLRPC.TL_boolTrue))) {
                    afVar.a(tLObject3, Boolean.valueOf(z11));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str3;
                    eVar.b = new cf(unVar2, unVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new s6(unVar2, eVar, afVar, z11, 2)), i15);
                    eVar.d();
                    break;
                }
                break;
            case 4:
                TLObject tLObject5 = (TLObject) obj5;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                kj kjVar2 = (kj) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                un unVar3 = ((fn) obj6).a;
                ((org.telegram.ui.ActionBar.x1) obj4).dismiss();
                if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    unVar3.getMessagesController().V3(groupcall.users, false);
                    unVar3.getMessagesController().P3(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        unVar3.showDialog(new tt(unVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity2 = unVar3.getParentActivity();
                        i10 = ((k2) unVar3).currentAccount;
                        org.telegram.ui.Components.voip.n1.g(parentActivity2, i10, tL_inputGroupCallInviteMessage, kjVar2.k.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error4 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error4.text)) {
                    if (tL_error4 != null) {
                        cc.a0(unVar3).f0(tL_error4, false);
                        break;
                    }
                } else {
                    unVar3.showDialog(new tt(unVar3.getParentActivity(), hashSet));
                    break;
                }
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj7;
                String str4 = (String) obj3;
                Bundle bundle = (Bundle) obj2;
                TLObject tLObject6 = (TLObject) obj5;
                TL_account.sendConfirmPhoneCode sendconfirmphonecode = (TL_account.sendConfirmPhoneCode) obj;
                Pattern pattern = LaunchActivity.D1;
                ((org.telegram.ui.ActionBar.x1) obj4).dismiss();
                if (tL_error5 == null) {
                    gf0 gf0Var = new gf0();
                    gf0Var.G = str4;
                    gf0Var.H = bundle;
                    gf0Var.I = (TLRPC.TL_auth_sentCode) tLObject6;
                    gf0Var.F = 1;
                    launchActivity.t0(gf0Var);
                    break;
                } else {
                    s4.e0(launchActivity.O, tL_error5, launchActivity.M().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 6:
                re0 re0Var = (re0) obj7;
                List<Purchase> list = (List) obj5;
                String str5 = (String) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                v50 v50Var = (v50) obj;
                if (((c5.g) obj6).a == 0 && list != null && !list.isEmpty()) {
                    for (Purchase purchase : list) {
                        if (purchase.b().contains(str5)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            re0Var.w.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new z(re0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore, v50Var, 9), 74);
                            break;
                        }
                    }
                }
                v50Var.run();
                break;
            case 7:
                ff0 ff0Var = (ff0) obj6;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj7;
                TLObject tLObject7 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str6 = (String) obj3;
                li.k kVar = (li.k) obj2;
                TLObject tLObject8 = (TLObject) obj;
                gf0 gf0Var2 = ff0Var.a0;
                ff0Var.M = false;
                if (tL_error6 != null) {
                    String str7 = tL_error6.text;
                    if (str7 != null) {
                        if (str7.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((k2) gf0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new t20(25, ff0Var, str6), 10);
                        } else if (tL_error6.text.contains("PHONE_NUMBER_INVALID")) {
                            gf0.v1(gf0Var2, str6, kVar, false);
                        } else if (tL_error6.text.contains("PHONE_PASSWORD_FLOOD")) {
                            gf0Var2.u1(dd.L0(2131746088, null), dd.L0(2131750688, "FloodWait"));
                        } else if (tL_error6.text.contains("PHONE_NUMBER_FLOOD")) {
                            gf0Var2.u1(dd.L0(2131746088, null), dd.L0(2131747302, "PhoneNumberFlood"));
                        } else if (tL_error6.text.contains("PHONE_NUMBER_BANNED")) {
                            gf0.v1(gf0Var2, str6, kVar, true);
                        } else if (tL_error6.text.contains("PHONE_CODE_EMPTY") || tL_error6.text.contains("PHONE_CODE_INVALID")) {
                            gf0Var2.u1(dd.L0(2131746088, null), dd.L0(2131749193, null));
                        } else if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                            gf0Var2.D1(0, true, null, true);
                            gf0Var2.u1(dd.L0(2131746088, null), dd.L0(2131752021, "CodeExpired"));
                        } else if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                            gf0Var2.u1(dd.L0(2131746088, null), dd.L0(2131750688, "FloodWait"));
                        } else if (tL_error6.code != -1000) {
                            i11 = ((k2) gf0Var2).currentAccount;
                            s4.e0(i11, tL_error6, gf0Var2, tLObject8, (String) kVar.d);
                        }
                    }
                } else if (tLObject7 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject7).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            gf0Var2.q0 = tL_help_termsOfService;
                        }
                        gf0Var2.D1(5, true, bundle2, false);
                    } else {
                        gf0Var2.x1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    gf0Var2.p1(bundle2, (TLRPC.auth_SentCode) tLObject7, true);
                }
                if (!gf0Var2.p0) {
                    gf0Var2.t1(false, true);
                    break;
                }
                break;
            case 8:
                TLObject tLObject9 = (TLObject) obj5;
                String str8 = (String) obj4;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj3;
                nk0 nk0Var = (nk0) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                xk0 xk0Var = (xk0) obj;
                jl0 jl0Var = ((mk0) obj6).p.d;
                if (tLObject9 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject9;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str8);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    jl0 jl0Var2 = new jl0(6, jl0Var.D, jl0Var.J, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((k2) jl0Var).currentAccount;
                    ((k2) jl0Var2).currentAccount = i13;
                    jl0Var2.T0 = sentemailcode.length;
                    jl0Var2.e1 = jl0Var.e1;
                    jl0Var2.c1 = jl0Var.c1;
                    jl0Var2.B1 = nk0Var;
                    jl0Var.presentFragment(jl0Var2, true);
                    break;
                } else {
                    jl0Var.Q1(dd.L0(2131747591, null), tL_error7.text);
                    if (xk0Var != null) {
                        xk0Var.d(tL_error7.text, str8);
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj7;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj6;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                String str9 = (String) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj2;
                d01 d01Var = (d01) obj;
                e2Var.getClass();
                try {
                    org.telegram.messenger.i0.g3(new bi.n(e2Var, z1Var, tonconnectsession, str9, bArr, org.telegram.ui.Wallet.e2.r(h0Var, tonconnectsession, str9, bArr, z1Var.a, z1Var.b, z1Var.d, null, e2Var.f.getCurrentTime()), d01Var, h0Var, 6));
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.c1(d01Var, org.telegram.ui.Wallet.e2.i("prepare connect", e), i16));
                    return;
                }
            case 10:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) obj7;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj6;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj5;
                String str10 = (String) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj2;
                d01 d01Var2 = (d01) obj;
                e2Var2.getClass();
                try {
                    org.telegram.messenger.i0.g3(new v8(e2Var2, str10, bArr2, d01Var2, tonconnectsession2, org.telegram.ui.Wallet.e2.t(h0Var2, tonconnectsession2, str10, bArr2, tonconnectnexteventid.event_id), 10));
                    break;
                } catch (Exception e7) {
                    d01Var2.a(org.telegram.ui.Wallet.e2.i("prepare disconnect", e7));
                    return;
                }
            case 11:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) obj7;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj6;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) obj2;
                byte[] bArr3 = b2Var.b;
                d01 d01Var3 = (d01) obj;
                if (e2Var3.d(z1Var2, tonconnectsession3, (String) obj4, (byte[]) obj3)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession3.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr3;
                    tonconnectsubmitconnectresult.body = b2Var.c;
                    tonconnectsubmitconnectresult.trace_id = z1Var2.c;
                    e2Var3.f.sendRequestTyped(tonconnectsubmitconnectresult, new a3.b(c10 == true ? 1 : 0), new org.telegram.ui.Wallet.j(e2Var3, b2Var, d01Var3, i15));
                    break;
                } else {
                    Arrays.fill(bArr3, (byte) 0);
                    d01Var3.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 12:
                JSONObject jSONObject = (JSONObject) obj7;
                String str11 = (String) obj6;
                u2 u2Var = (u2) obj5;
                z2 z2Var = u2Var.a;
                s2 s2Var = u2Var.b;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj4;
                String str12 = (String) obj3;
                byte[] bArr4 = (byte[]) obj2;
                byte[] bArr5 = (byte[]) obj;
                if (jSONObject == null) {
                    cc.b0(str11);
                    u2Var.d = false;
                    if (!u2Var.f) {
                        u2Var.f = true;
                        s2Var.a();
                    }
                    if (!u2Var.e) {
                        z2Var.dismiss();
                        break;
                    }
                } else {
                    TLRPC.TL_widgetQueryTypeSignData tL_widgetQueryTypeSignData = new TLRPC.TL_widgetQueryTypeSignData();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str12;
                    tL_userWallet.balance = k0Var.v();
                    if (bArr5 != null) {
                        tL_userWallet.public_key = bArr4;
                        tL_userWallet.state_init = bArr5;
                    }
                    tL_widgetQueryTypeSignData.wallet = tL_userWallet;
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_widgetQueryTypeSignData.sign_data = tL_dataJSON2;
                    tL_dataJSON2.data = jSONObject.toString();
                    u2Var.d = false;
                    if (!u2Var.f) {
                        u2Var.f = true;
                        s2Var.d(tL_widgetQueryTypeSignData);
                    }
                    if (!u2Var.e) {
                        z2Var.dismiss();
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj7;
                int[] iArr = (int[]) obj6;
                File file = (File) obj5;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj4;
                String str13 = (String) obj3;
                String str14 = (String) obj2;
                String str15 = (String) obj;
                if (iArr[4] > 0) {
                    int i17 = iArr[1];
                    int i18 = iArr[2];
                    int Z0 = i17 > org.telegram.messenger.i0.Z0(false) ? org.telegram.messenger.i0.Z0(false) : i17;
                    int Z02 = i18 > org.telegram.messenger.i0.Z0(false) ? org.telegram.messenger.i0.Z0(false) : i18;
                    File w9 = n5.w(e20.s0, "jpg");
                    s5 s5Var = new s5(file, true, 0L, 0, null, null, null, 0L, e20.s0, true, Z0, Z02, null, 0, true);
                    Bitmap p5 = s5Var.p();
                    s5Var.u();
                    if (p5 != null) {
                        try {
                        } catch (Exception e10) {
                            e = e10;
                        }
                        try {
                            p5.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w9));
                        } catch (Exception e11) {
                            e = e11;
                            f8.g(e, true);
                            w9 = null;
                            m10 = n5.o(file, w9 != null ? null : w9.getAbsolutePath(), iArr[4]);
                            m10.k0 = i17;
                            m10.l0 = i18;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            x1Var.c(500L);
                            return;
                        }
                    }
                    m10 = n5.o(file, w9 != null ? null : w9.getAbsolutePath(), iArr[4]);
                    m10.k0 = i17;
                    m10.l0 = i18;
                    m10.A();
                } else {
                    m10 = n5.m(file, ((Integer) org.telegram.messenger.i0.L0(file).first).intValue());
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str13 != null) {
                        m10.C0 = str13;
                    }
                    if (!TextUtils.isEmpty(str14) && e20.i(z0Var.M).q()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        w20 w20Var = new w20();
                        w20Var.a = (byte) 7;
                        w20Var.b = (byte) -1;
                        w20Var.l = -1;
                        jg.s0 s0Var = new jg.s0();
                        w20Var.W = s0Var;
                        s0Var.c = str14;
                        if (str15 != null) {
                            s0Var.a |= 2;
                            s0Var.b = str15;
                        }
                        m10.T0.add(w20Var);
                    }
                    o8.D(z0Var.W, e20.s0).T(null, m10);
                    x1Var.c(500L);
                    break;
                } else {
                    x1Var.c(500L);
                }
                break;
            case 14:
                ((boolean[]) obj6)[0] = true;
                ((e6) obj7).Y((String) obj5, (TLRPC.ChatInvite) obj4, new j4((boolean[]) obj3, (k20) obj2, (r20) obj));
                break;
            case 15:
                e6 e6Var = (e6) obj7;
                List list2 = (List) obj6;
                q70 q70Var = (q70) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                c5.g gVar = (c5.g) obj2;
                Activity activity = (Activity) obj;
                if (list2.isEmpty()) {
                    org.telegram.messenger.i0.g3(new v4(q70Var, i16));
                    break;
                } else {
                    c5.m mVar = (c5.m) list2.get(0);
                    c5.i a2 = mVar.a();
                    if (a2 == null) {
                        org.telegram.messenger.i0.g3(new v4(q70Var, c11 == true ? 1 : 0));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(e6Var.a).sendRequest(tL_payments_canPurchaseStore2, new e0(mVar, gVar, (k20) q70Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGift, list2, 4));
                        break;
                    }
                }
            case 16:
                e6 e6Var2 = (e6) obj6;
                TLObject tLObject10 = (TLObject) obj5;
                kj kjVar3 = (kj) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                r20 r20Var3 = (r20) obj2;
                cc ccVar = (cc) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                if (tLObject10 instanceof TLRPC.TL_payments_paymentFormStars) {
                    e6Var2.Z(kjVar3, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject10, r20Var3);
                    break;
                } else {
                    r20Var3.a(Boolean.FALSE);
                    ccVar.Q(R.raw.error, 36, dd.a0(null, null, 2131743903, tL_error8 != null ? tL_error8.text : "FAILED_GETTING_FORM")).j();
                    break;
                }
            default:
                y8 y8Var = (y8) obj7;
                th.c0[] c0VarArr = (th.c0[]) obj6;
                int[] iArr2 = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                sg.p0 p0Var = (sg.p0) obj2;
                sg.m0 m0Var = (sg.m0) obj;
                if (y8Var.k1) {
                    th.c0 c0Var = c0VarArr[0];
                    if (c0Var == null) {
                        c0Var = y8Var.G1.d(y8Var.H1);
                        c0VarArr[0] = c0Var;
                    }
                    if (c0Var != null) {
                        c0Var.setDrawStar(false);
                        c0Var.getLocationInWindow(iArr2);
                        TextView textView = c0Var.E;
                        dq[] dqVarArr = c0Var.G;
                        if (dqVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + dqVarArr[0].r;
                            float y3 = textView.getY() + textView.getPaddingTop() + dqVarArr[0].s;
                            rectF.set(x10, y3, r2.c.getBounds().width() + x10, dqVarArr[0].c.getBounds().height() + y3);
                        }
                        rectF.offset(iArr2[0], iArr2[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr2);
                    rectF.set(org.telegram.messenger.i0.L(4.0f) + iArr2[0] + p0Var.b + m0Var.w, ((m0Var.A - org.telegram.messenger.i0.L(22.0f)) / 2.0f) + iArr2[1] + p0Var.c + m0Var.x, org.telegram.messenger.i0.L(26.0f) + iArr2[0] + p0Var.b + m0Var.w, ((org.telegram.messenger.i0.L(22.0f) + m0Var.A) / 2.0f) + iArr2[1] + p0Var.c + m0Var.x);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c0(vs vsVar, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.h = vsVar;
        this.b = tL_error;
        this.c = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.n = obj4;
    }

    public /* synthetic */ c0(fn fnVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, kj kjVar, TLRPC.TL_error tL_error) {
        this.a = 4;
        this.h = fnVar;
        this.d = x1Var;
        this.c = tLObject;
        this.e = hashSet;
        this.f = tL_inputGroupCallInviteMessage;
        this.n = kjVar;
        this.b = tL_error;
    }

    public /* synthetic */ c0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.x1 x1Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = 5;
        this.h = launchActivity;
        this.d = x1Var;
        this.b = tL_error;
        this.e = str;
        this.f = bundle;
        this.c = tLObject;
        this.n = sendconfirmphonecode;
    }

    public /* synthetic */ c0(mk0 mk0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, nk0 nk0Var, TLRPC.TL_error tL_error, xk0 xk0Var) {
        this.a = 8;
        this.h = mk0Var;
        this.c = tLObject;
        this.d = str;
        this.e = tL_secureRequiredType;
        this.f = nk0Var;
        this.b = tL_error;
        this.n = xk0Var;
    }

    public /* synthetic */ c0(e6 e6Var, TLObject tLObject, kj kjVar, TLRPC.InputInvoice inputInvoice, r20 r20Var, cc ccVar, TLRPC.TL_error tL_error) {
        this.a = 16;
        this.h = e6Var;
        this.c = tLObject;
        this.d = kjVar;
        this.e = inputInvoice;
        this.f = r20Var;
        this.n = ccVar;
        this.b = tL_error;
    }
}
