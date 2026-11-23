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
import org.telegram.messenger.b20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a31;
import org.telegram.ui.bn;
import org.telegram.ui.ce0;
import org.telegram.ui.d00;
import org.telegram.ui.de0;
import org.telegram.ui.fk0;
import org.telegram.ui.jj0;
import org.telegram.ui.kj0;
import org.telegram.ui.kl0;
import org.telegram.ui.ld0;
import org.telegram.ui.mm;
import org.telegram.ui.ne;
import org.telegram.ui.re;
import org.telegram.ui.uc1;
import org.telegram.ui.uj0;
import org.telegram.ui.vs;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    public /* synthetic */ m6(y8 y8Var, TLObject tLObject, fj fjVar, TLRPC.InputInvoice inputInvoice, w10 w10Var, org.telegram.ui.Components.kc kcVar, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = y8Var;
        this.c = tLObject;
        this.d = fjVar;
        this.e = inputInvoice;
        this.n = w10Var;
        this.f = kcVar;
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
        hi.x7 m10;
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
                ((y8) obj7).X((String) obj3, (TLRPC.ChatInvite) obj2, new o6((boolean[]) obj4, (p10) obj, (w10) obj6));
                break;
            case 1:
                y8 y8Var = (y8) obj7;
                List list = (List) obj5;
                bi.h8 h8Var = (bi.h8) obj4;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj3;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                f5.f fVar = (f5.f) obj;
                Activity activity = (Activity) obj6;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.g3(new e7(h8Var, i17));
                    break;
                } else {
                    f5.m mVar = (f5.m) list.get(0);
                    f5.i a10 = mVar.a();
                    if (a10 == null) {
                        org.telegram.messenger.g0.g3(new e7(h8Var, i16));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a10.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(y8Var.a).sendRequest(tL_payments_canPurchaseStore, new y6(mVar, fVar, h8Var, activity, tL_inputStorePaymentStarsGift, list, 1));
                        break;
                    }
                }
            case 2:
                y8 y8Var2 = (y8) obj7;
                TLObject tLObject = (TLObject) obj5;
                fj fjVar = (fj) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                w10 w10Var = (w10) obj6;
                org.telegram.ui.Components.kc kcVar = (org.telegram.ui.Components.kc) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    y8Var2.Y(fjVar, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, w10Var);
                    break;
                } else {
                    w10Var.a(Boolean.FALSE);
                    kcVar.Q(R.raw.error, 36, gd.a0(null, null, 2131743631, tL_error != null ? tL_error.text : "FAILED_GETTING_FORM")).j();
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
                        kq[] kqVarArr = m0Var.H;
                        if (kqVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + kqVarArr[0].r;
                            float y10 = textView.getY() + textView.getPaddingTop() + kqVarArr[0].s;
                            rectF.set(x10, y10, r2.c.getBounds().width() + x10, kqVarArr[0].c.getBounds().height() + y10);
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
                fj fjVar2 = (fj) obj4;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj2;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj;
                yk0 yk0Var = (yk0) obj6;
                ((x60) obj5).q0 = true;
                if (!TextUtils.isEmpty(fjVar2.z)) {
                    str = r1Var.getMessageObject().z.toString();
                } else if (!TextUtils.isEmpty(fjVar2.v)) {
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
                fj fjVar3 = (fj) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj6;
                bn bnVar3 = ((mm) obj7).a;
                ((org.telegram.ui.ActionBar.t1) obj5).dismiss();
                if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    bnVar3.getMessagesController().f4(groupcall.users, false);
                    bnVar3.getMessagesController().Z3(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        bnVar3.showDialog(new vs(bnVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity2 = bnVar3.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.g2) bnVar3).currentAccount;
                        org.telegram.ui.Components.voip.c2.g(parentActivity2, i7, tL_inputGroupCallInviteMessage, fjVar3.k.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error3 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.kc.b0(bnVar3).g0(tL_error3, false);
                        break;
                    }
                } else {
                    bnVar3.showDialog(new vs(bnVar3.getParentActivity(), hashSet));
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
                    org.telegram.ui.Components.b5.c0(launchActivity.P, tL_error4, launchActivity.M().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 8:
                ld0 ld0Var = (ld0) obj7;
                List<Purchase> list2 = (List) obj4;
                String str6 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj;
                xz xzVar = (xz) obj6;
                if (((f5.f) obj5).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str6)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            ld0Var.w.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new m7(ld0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, xzVar, 9), 74);
                            break;
                        }
                    }
                }
                xzVar.run();
                break;
            case 9:
                ce0 ce0Var = (ce0) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj2;
                String str7 = (String) obj3;
                i61 i61Var = (i61) obj;
                TLObject tLObject7 = (TLObject) obj6;
                de0 de0Var2 = ce0Var.h0;
                ce0Var.N = false;
                if (tL_error5 != null) {
                    String str8 = tL_error5.text;
                    if (str8 != null) {
                        if (str8.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i11 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                            ConnectionsManager.getInstance(i11).sendRequest(getpassword, new d00(i14, ce0Var, str7), 10);
                        } else if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                            de0.E1(de0Var2, str7, i61Var, false);
                        } else if (tL_error5.text.contains("PHONE_PASSWORD_FLOOD")) {
                            de0Var2.D1(gd.N0(2131745875, null), gd.N0(2131750670, "FloodWait"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_FLOOD")) {
                            de0Var2.D1(gd.N0(2131745875, null), gd.N0(2131747092, "PhoneNumberFlood"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_BANNED")) {
                            de0.E1(de0Var2, str7, i61Var, true);
                        } else if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                            de0Var2.D1(gd.N0(2131745875, null), gd.N0(2131748990, null));
                        } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            de0Var2.M1(0, true, null, true);
                            de0Var2.D1(gd.N0(2131745875, null), gd.N0(2131752009, "CodeExpired"));
                        } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                            de0Var2.D1(gd.N0(2131745875, null), gd.N0(2131750670, "FloodWait"));
                        } else if (tL_error5.code != -1000) {
                            i10 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                            org.telegram.ui.Components.b5.c0(i10, tL_error5, de0Var2, tLObject7, (String) i61Var.d);
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
                kj0 kj0Var = (kj0) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                uj0 uj0Var = (uj0) obj6;
                fk0 fk0Var = ((jj0) obj7).p.d;
                if (tLObject8 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str9);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    fk0 fk0Var2 = new fk0(6, fk0Var.E, fk0Var.K, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i12 = ((org.telegram.ui.ActionBar.g2) fk0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.g2) fk0Var2).currentAccount = i12;
                    fk0Var2.U0 = sentemailcode.length;
                    fk0Var2.f1 = fk0Var.f1;
                    fk0Var2.d1 = fk0Var.d1;
                    fk0Var2.C1 = kj0Var;
                    fk0Var.presentFragment(fk0Var2, true);
                    break;
                } else {
                    fk0Var.Q1(gd.N0(2131747381, null), tL_error6.text);
                    if (uj0Var != null) {
                        uj0Var.f(tL_error6.text, str9);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) obj7;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) obj5;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj4;
                String str10 = (String) obj3;
                byte[] bArr = (byte[]) obj2;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj;
                a31 a31Var = (a31) obj6;
                m2Var.getClass();
                try {
                    org.telegram.messenger.g0.g3(new j7(m2Var, h2Var, tonconnectsession, str10, bArr, org.telegram.ui.Wallet.m2.r(s0Var, tonconnectsession, str10, bArr, h2Var.a, h2Var.b, h2Var.d, null, m2Var.f.getCurrentTime()), a31Var, s0Var, 6));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.l1(a31Var, org.telegram.ui.Wallet.m2.i("prepare connect", e10), i17));
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.m2 m2Var2 = (org.telegram.ui.Wallet.m2) obj7;
                org.telegram.ui.Wallet.h2 h2Var2 = (org.telegram.ui.Wallet.h2) obj5;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj4;
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) obj;
                byte[] bArr2 = j2Var.b;
                a31 a31Var2 = (a31) obj6;
                if (m2Var2.d(h2Var2, tonconnectsession2, (String) obj3, (byte[]) obj2)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession2.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr2;
                    tonconnectsubmitconnectresult.body = j2Var.c;
                    tonconnectsubmitconnectresult.trace_id = h2Var2.c;
                    m2Var2.f.sendRequestTyped(tonconnectsubmitconnectresult, new d3.b(i16), new org.telegram.ui.Wallet.j(m2Var2, j2Var, a31Var2, i15));
                    break;
                } else {
                    Arrays.fill(bArr2, (byte) 0);
                    a31Var2.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 13:
                org.telegram.ui.Wallet.m2 m2Var3 = (org.telegram.ui.Wallet.m2) obj7;
                org.telegram.ui.Wallet.s0 s0Var2 = (org.telegram.ui.Wallet.s0) obj5;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj4;
                String str11 = (String) obj3;
                byte[] bArr3 = (byte[]) obj2;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                a31 a31Var3 = (a31) obj6;
                m2Var3.getClass();
                try {
                    org.telegram.messenger.g0.g3(new bi.n2(m2Var3, str11, bArr3, a31Var3, tonconnectsession3, org.telegram.ui.Wallet.m2.t(s0Var2, tonconnectsession3, str11, bArr3, tonconnectnexteventid.event_id), 21));
                    break;
                } catch (Exception e11) {
                    a31Var3.a(org.telegram.ui.Wallet.m2.i("prepare disconnect", e11));
                    return;
                }
            case 14:
                JSONObject jSONObject = (JSONObject) obj7;
                String str12 = (String) obj3;
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) obj5;
                org.telegram.ui.Wallet.e3 e3Var = z2Var.a;
                org.telegram.ui.Wallet.x2 x2Var = z2Var.b;
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj4;
                String str13 = (String) obj2;
                byte[] bArr4 = (byte[]) obj;
                byte[] bArr5 = (byte[]) obj6;
                if (jSONObject == null) {
                    org.telegram.ui.Components.kc.c0(str12);
                    z2Var.d = false;
                    if (!z2Var.f) {
                        z2Var.f = true;
                        x2Var.a();
                    }
                    if (!z2Var.e) {
                        e3Var.dismiss();
                        break;
                    }
                } else {
                    TLRPC.TL_widgetQueryTypeSignData tL_widgetQueryTypeSignData = new TLRPC.TL_widgetQueryTypeSignData();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str13;
                    tL_userWallet.balance = v0Var.A();
                    if (bArr5 != null) {
                        tL_userWallet.public_key = bArr4;
                        tL_userWallet.state_init = bArr5;
                    }
                    tL_widgetQueryTypeSignData.wallet = tL_userWallet;
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_widgetQueryTypeSignData.sign_data = tL_dataJSON2;
                    tL_dataJSON2.data = jSONObject.toString();
                    z2Var.d = false;
                    if (!z2Var.f) {
                        z2Var.f = true;
                        x2Var.d(tL_widgetQueryTypeSignData);
                    }
                    if (!z2Var.e) {
                        e3Var.dismiss();
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) obj7;
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
                    File w10 = hi.x7.w(i10.t0, "jpg");
                    org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(file, true, 0L, 0, null, null, null, 0L, i10.t0, true, Z0, Z02, null, 0, true);
                    Bitmap p10 = b6Var.p();
                    b6Var.u();
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
                            m10 = hi.x7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                            m10.k0 = i18;
                            m10.l0 = i19;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            t1Var.c(500L);
                            return;
                        }
                    }
                    m10 = hi.x7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                    m10.k0 = i18;
                    m10.l0 = i19;
                    m10.A();
                } else {
                    m10 = hi.x7.m(file, ((Integer) org.telegram.messenger.g0.L0(file).first).intValue());
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str14 != null) {
                        m10.C0 = str14;
                    }
                    if (!TextUtils.isEmpty(str15) && i10.i(v0Var2.N).q()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        b20 b20Var = new b20();
                        b20Var.a = (byte) 7;
                        b20Var.b = (byte) -1;
                        b20Var.l = -1;
                        tg.m0 m0Var2 = new tg.m0();
                        b20Var.a0 = m0Var2;
                        m0Var2.c = str15;
                        if (str16 != null) {
                            m0Var2.a |= 2;
                            m0Var2.b = str16;
                        }
                        m10.T0.add(b20Var);
                    }
                    hi.nb.D(v0Var2.a0, i10.t0).T(null, m10);
                    t1Var.c(500L);
                    break;
                } else {
                    t1Var.c(500L);
                }
                break;
            case 16:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                wg.u uVar = (wg.u) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                mp mpVar = (mp) obj3;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                wg.u uVar2 = (wg.u) obj6;
                if (tL_error7 != null) {
                    uVar.a(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        mpVar.f4(paymentForm.users, false);
                        kl0Var = new kl0(paymentForm, tL_inputInvoicePremiumGiftCode, g2Var);
                    } else {
                        kl0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new kl0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (kl0Var != null) {
                        kl0Var.a1 = new uc1(23, uVar2, uVar);
                        LaunchActivity.Q().showAsSheet(kl0Var, new org.telegram.ui.ActionBar.e2());
                        break;
                    } else {
                        uVar.a(null);
                        break;
                    }
                }
            default:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                w10 w10Var2 = (w10) obj6;
                TLObject tLObject10 = (TLObject) obj5;
                mp mpVar2 = (mp) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj2;
                w10 w10Var3 = (w10) obj;
                if (tL_error8 != null) {
                    w10Var2.a(tL_error8);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        mpVar2.f4(paymentForm2.users, false);
                        kl0Var2 = new kl0(paymentForm2, tL_inputInvoicePremiumGiftCode2, g2Var2);
                    } else {
                        kl0Var2 = tLObject10 instanceof TLRPC.PaymentReceipt ? new kl0((TLRPC.PaymentReceipt) tLObject10) : null;
                    }
                    if (kl0Var2 != null) {
                        kl0Var2.a1 = new uc1(24, w10Var3, w10Var2);
                        LaunchActivity.Q().showAsSheet(kl0Var2, new org.telegram.ui.ActionBar.e2());
                        break;
                    } else {
                        w10Var2.a(null);
                        break;
                    }
                }
        }
    }

    public /* synthetic */ m6(y8 y8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, p10 p10Var, w10 w10Var) {
        this.a = 0;
        this.b = y8Var;
        this.c = zArr;
        this.e = str;
        this.f = chatInvite;
        this.d = zArr2;
        this.h = p10Var;
        this.n = w10Var;
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

    public /* synthetic */ m6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.z2 z2Var, org.telegram.ui.Wallet.v0 v0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.a = 14;
        this.b = jSONObject;
        this.e = str;
        this.c = z2Var;
        this.d = v0Var;
        this.f = str2;
        this.h = bArr;
        this.n = bArr2;
    }

    public /* synthetic */ m6(fs fsVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = fsVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.e = str;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ m6(TLRPC.TL_error tL_error, w10 w10Var, TLObject tLObject, mp mpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.g2 g2Var, w10 w10Var2) {
        this.a = 17;
        this.b = tL_error;
        this.n = w10Var;
        this.c = tLObject;
        this.d = mpVar;
        this.e = tL_inputInvoicePremiumGiftCode;
        this.f = g2Var;
        this.h = w10Var2;
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

    public /* synthetic */ m6(jj0 jj0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, kj0 kj0Var, TLRPC.TL_error tL_error, uj0 uj0Var) {
        this.a = 10;
        this.b = jj0Var;
        this.c = tLObject;
        this.e = str;
        this.d = tL_secureRequiredType;
        this.f = kj0Var;
        this.h = tL_error;
        this.n = uj0Var;
    }
}
