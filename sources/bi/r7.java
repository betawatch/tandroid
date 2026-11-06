package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.h20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.be0;
import org.telegram.ui.bk0;
import org.telegram.ui.ce0;
import org.telegram.ui.fj0;
import org.telegram.ui.gj0;
import org.telegram.ui.h50;
import org.telegram.ui.hl0;
import org.telegram.ui.ld0;
import org.telegram.ui.lm;
import org.telegram.ui.qe;
import org.telegram.ui.qj0;
import org.telegram.ui.ss;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ r7(ea eaVar, TLObject tLObject, ij ijVar, TLRPC.InputInvoice inputInvoice, c20 c20Var, org.telegram.ui.Components.hc hcVar, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = eaVar;
        this.c = tLObject;
        this.d = ijVar;
        this.e = inputInvoice;
        this.n = c20Var;
        this.f = hcVar;
        this.h = tL_error;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
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
        fi.e7 m10;
        hl0 hl0Var;
        hl0 hl0Var2;
        int i13 = this.a;
        int i14 = 11;
        int i15 = 8;
        int i16 = 21;
        int i17 = 1;
        int i18 = 0;
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
                ((ea) obj7).Y((String) obj3, (TLRPC.ChatInvite) obj2, new t7((boolean[]) obj4, (v10) obj, (c20) obj6));
                break;
            case 1:
                ea eaVar = (ea) obj7;
                List list = (List) obj5;
                mc mcVar = (mc) obj4;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj3;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                f5.f fVar = (f5.f) obj;
                Activity activity = (Activity) obj6;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.h3(new i8(mcVar, i18));
                    break;
                } else {
                    f5.l lVar = (f5.l) list.get(0);
                    f5.h a10 = lVar.a();
                    if (a10 == null) {
                        org.telegram.messenger.g0.h3(new i8(mcVar, i17));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a10.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(eaVar.a).sendRequest(tL_payments_canPurchaseStore, new c8(lVar, fVar, mcVar, activity, tL_inputStorePaymentStarsGift, list, 1));
                        break;
                    }
                }
            case 2:
                ea eaVar2 = (ea) obj7;
                TLObject tLObject = (TLObject) obj5;
                ij ijVar = (ij) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                c20 c20Var = (c20) obj6;
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    eaVar2.Z(ijVar, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, c20Var);
                    break;
                } else {
                    c20Var.a(Boolean.FALSE);
                    hcVar.Q(R.raw.error, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, tL_error != null ? tL_error.text : "FAILED_GETTING_FORM")).j();
                    break;
                }
            case 3:
                ce ceVar = (ce) obj7;
                di.n0[] n0VarArr = (di.n0[]) obj5;
                int[] iArr = (int[]) obj4;
                RectF rectF = (RectF) obj3;
                View view = (View) obj2;
                ch.p0 p0Var = (ch.p0) obj;
                ch.m0 m0Var = (ch.m0) obj6;
                if (ceVar.k1) {
                    di.n0 n0Var = n0VarArr[0];
                    if (n0Var == null) {
                        n0Var = ceVar.G1.d(ceVar.H1);
                        n0VarArr[0] = n0Var;
                    }
                    if (n0Var != null) {
                        n0Var.setDrawStar(false);
                        n0Var.getLocationInWindow(iArr);
                        TextView textView = n0Var.E;
                        wp[] wpVarArr = n0Var.G;
                        if (wpVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + wpVarArr[0].r;
                            float y10 = textView.getY() + textView.getPaddingTop() + wpVarArr[0].s;
                            rectF.set(x10, y10, r2.c.getBounds().width() + x10, wpVarArr[0].c.getBounds().height() + y10);
                        }
                        rectF.offset(iArr[0], iArr[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr);
                    rectF.set(org.telegram.messenger.g0.L(4.0f) + iArr[0] + p0Var.b + m0Var.w, ((m0Var.A - org.telegram.messenger.g0.L(22.0f)) / 2.0f) + iArr[1] + p0Var.c + m0Var.x, org.telegram.messenger.g0.L(26.0f) + iArr[0] + p0Var.b + m0Var.w, ((org.telegram.messenger.g0.L(22.0f) + m0Var.A) / 2.0f) + iArr[1] + p0Var.c + m0Var.x);
                    break;
                }
                break;
            case 4:
                an anVar = (an) obj7;
                ij ijVar2 = (ij) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj2;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj;
                jk0 jk0Var = (jk0) obj6;
                ((k60) obj5).n0 = true;
                if (!TextUtils.isEmpty(ijVar2.z)) {
                    str = q1Var.getMessageObject().z.toString();
                } else if (!TextUtils.isEmpty(ijVar2.v)) {
                    str = q1Var.getMessageObject().v.toString();
                }
                String str2 = str.length() > 21 ? str.substring(0, 21) + "..." : str;
                Activity parentActivity = anVar.getParentActivity();
                long j3 = tL_messageEntityFormattedDate.date * 1000;
                boolean z9 = (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true;
                Typeface typeface = org.telegram.messenger.g0.a;
                if (z9) {
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
                Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j3).putExtra("endTime", millis + j3).putExtra("allDay", z9);
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
                jk0Var.dismiss();
                break;
            case 5:
                an anVar2 = (an) obj7;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                t3 t3Var = (t3) obj;
                String str3 = (String) obj3;
                vf.b bVar = (vf.b) obj6;
                boolean z10 = tL_error2 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error2.text);
                if (tLObject2 != null || (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_boolTrue))) {
                    t3Var.a(tLObject2, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str3;
                    bVar.b = new qe(anVar2, anVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new d4(anVar2, bVar, t3Var, z10, 4)), i15);
                    bVar.d();
                    break;
                }
                break;
            case 6:
                TLObject tLObject4 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                ij ijVar3 = (ij) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj6;
                an anVar3 = ((lm) obj7).a;
                ((org.telegram.ui.ActionBar.u1) obj5).dismiss();
                if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    anVar3.getMessagesController().Y3(groupcall.users, false);
                    anVar3.getMessagesController().S3(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        anVar3.showDialog(new ss(anVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity2 = anVar3.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.f2) anVar3).currentAccount;
                        org.telegram.ui.Components.voip.y1.g(parentActivity2, i7, tL_inputGroupCallInviteMessage, ijVar3.k.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error3 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.hc.a0(anVar3).f0(tL_error3, false);
                        break;
                    }
                } else {
                    anVar3.showDialog(new ss(anVar3.getParentActivity(), hashSet));
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
                String str5 = LaunchActivity.B1;
                ((org.telegram.ui.ActionBar.u1) obj5).dismiss();
                if (tL_error4 == null) {
                    ce0 ce0Var = new ce0();
                    ce0Var.G = str4;
                    ce0Var.H = bundle;
                    ce0Var.I = (TLRPC.TL_auth_sentCode) tLObject5;
                    ce0Var.F = 1;
                    launchActivity.t0(ce0Var);
                    break;
                } else {
                    org.telegram.ui.Components.v4.c0(launchActivity.O, tL_error4, launchActivity.M().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 8:
                ld0 ld0Var = (ld0) obj7;
                List<Purchase> list2 = (List) obj4;
                String str6 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj;
                kn0 kn0Var = (kn0) obj6;
                if (((f5.f) obj5).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str6)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            ld0Var.w.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new r8(ld0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, kn0Var, 9), 74);
                            break;
                        }
                    }
                }
                kn0Var.run();
                break;
            case 9:
                be0 be0Var = (be0) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj2;
                String str7 = (String) obj3;
                h6.m mVar = (h6.m) obj;
                TLObject tLObject7 = (TLObject) obj6;
                ce0 ce0Var2 = be0Var.g0;
                be0Var.M = false;
                if (tL_error5 != null) {
                    String str8 = tL_error5.text;
                    if (str8 != null) {
                        if (str8.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i11 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                            ConnectionsManager.getInstance(i11).sendRequest(getpassword, new h50(i14, be0Var, str7), 10);
                        } else if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                            ce0.E1(ce0Var2, str7, mVar, false);
                        } else if (tL_error5.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131750688, "FloodWait"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_FLOOD")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131747285, "PhoneNumberFlood"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_BANNED")) {
                            ce0.E1(ce0Var2, str7, mVar, true);
                        } else if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749182, null));
                        } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            ce0Var2.M1(0, true, null, true);
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                        } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131750688, "FloodWait"));
                        } else if (tL_error5.code != -1000) {
                            i10 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                            org.telegram.ui.Components.v4.c0(i10, tL_error5, ce0Var2, tLObject7, (String) mVar.d);
                        }
                    }
                } else if (tLObject6 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject6).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ce0Var2.q0 = tL_help_termsOfService;
                        }
                        ce0Var2.M1(5, true, bundle2, false);
                    } else {
                        ce0Var2.G1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    ce0Var2.y1(bundle2, (TLRPC.auth_SentCode) tLObject6, true);
                }
                if (!ce0Var2.p0) {
                    ce0Var2.C1(false, true);
                    break;
                }
                break;
            case 10:
                TLObject tLObject8 = (TLObject) obj5;
                String str9 = (String) obj3;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj4;
                gj0 gj0Var = (gj0) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                qj0 qj0Var = (qj0) obj6;
                bk0 bk0Var = ((fj0) obj7).p.d;
                if (tLObject8 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str9);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    bk0 bk0Var2 = new bk0(6, bk0Var.D, bk0Var.J, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i12 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.f2) bk0Var2).currentAccount = i12;
                    bk0Var2.T0 = sentemailcode.length;
                    bk0Var2.e1 = bk0Var.e1;
                    bk0Var2.c1 = bk0Var.c1;
                    bk0Var2.B1 = gj0Var;
                    bk0Var.presentFragment(bk0Var2, true);
                    break;
                } else {
                    bk0Var.Q1(org.telegram.messenger.hd.M0(2131747574, null), tL_error6.text);
                    if (qj0Var != null) {
                        qj0Var.a(tL_error6.text, str9);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) obj7;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj5;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj4;
                String str10 = (String) obj3;
                byte[] bArr = (byte[]) obj2;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj;
                org.telegram.ui.Wallet.t tVar = (org.telegram.ui.Wallet.t) obj6;
                f2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new n8(f2Var, a2Var, tonconnectsession, str10, bArr, org.telegram.ui.Wallet.f2.r(k0Var, tonconnectsession, str10, bArr, a2Var.a, a2Var.b, a2Var.d, null, f2Var.f.getCurrentTime()), tVar, k0Var, 6));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.d1(tVar, org.telegram.ui.Wallet.f2.i("prepare connect", e10), i18));
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) obj7;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj5;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj4;
                String str11 = (String) obj3;
                byte[] bArr2 = (byte[]) obj2;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                org.telegram.ui.Wallet.t tVar2 = (org.telegram.ui.Wallet.t) obj6;
                f2Var2.getClass();
                try {
                    org.telegram.messenger.g0.h3(new a3(f2Var2, str11, bArr2, tVar2, tonconnectsession2, org.telegram.ui.Wallet.f2.t(k0Var2, tonconnectsession2, str11, bArr2, tonconnectnexteventid.event_id), 20));
                    break;
                } catch (Exception e11) {
                    tVar2.a(org.telegram.ui.Wallet.f2.i("prepare disconnect", e11));
                    return;
                }
            case 13:
                org.telegram.ui.Wallet.f2 f2Var3 = (org.telegram.ui.Wallet.f2) obj7;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj5;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj4;
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) obj;
                byte[] bArr3 = c2Var.b;
                org.telegram.ui.Wallet.t tVar3 = (org.telegram.ui.Wallet.t) obj6;
                if (f2Var3.d(a2Var2, tonconnectsession3, (String) obj3, (byte[]) obj2)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession3.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr3;
                    tonconnectsubmitconnectresult.body = c2Var.c;
                    tonconnectsubmitconnectresult.trace_id = a2Var2.c;
                    f2Var3.f.sendRequestTyped(tonconnectsubmitconnectresult, new d3.b(i17), new org.telegram.ui.Wallet.j(f2Var3, c2Var, tVar3, i15));
                    break;
                } else {
                    Arrays.fill(bArr3, (byte) 0);
                    tVar3.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 14:
                JSONObject jSONObject = (JSONObject) obj7;
                String str12 = (String) obj3;
                org.telegram.ui.Wallet.u2 u2Var = (org.telegram.ui.Wallet.u2) obj5;
                org.telegram.ui.Wallet.z2 z2Var = u2Var.a;
                org.telegram.ui.Wallet.s2 s2Var = u2Var.b;
                org.telegram.ui.Wallet.n0 n0Var2 = (org.telegram.ui.Wallet.n0) obj4;
                String str13 = (String) obj2;
                byte[] bArr4 = (byte[]) obj;
                byte[] bArr5 = (byte[]) obj6;
                if (jSONObject == null) {
                    org.telegram.ui.Components.hc.b0(str12);
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
                    tL_userWallet.address = str13;
                    tL_userWallet.balance = n0Var2.v();
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
            case 15:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj7;
                int[] iArr2 = (int[]) obj5;
                File file = (File) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                String str14 = (String) obj3;
                String str15 = (String) obj;
                String str16 = (String) obj6;
                if (iArr2[4] > 0) {
                    int i19 = iArr2[1];
                    int i20 = iArr2[2];
                    int Z0 = i19 > org.telegram.messenger.g0.Z0(false) ? org.telegram.messenger.g0.Z0(false) : i19;
                    int Z02 = i20 > org.telegram.messenger.g0.Z0(false) ? org.telegram.messenger.g0.Z0(false) : i20;
                    File w10 = fi.e7.w(p10.s0, "jpg");
                    org.telegram.ui.Components.v5 v5Var = new org.telegram.ui.Components.v5(file, true, 0L, 0, null, null, null, 0L, p10.s0, true, Z0, Z02, null, 0, true);
                    Bitmap p10 = v5Var.p();
                    v5Var.u();
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
                            m10 = fi.e7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                            m10.k0 = i19;
                            m10.l0 = i20;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            u1Var.c(500L);
                            return;
                        }
                    }
                    m10 = fi.e7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                    m10.k0 = i19;
                    m10.l0 = i20;
                    m10.A();
                } else {
                    m10 = fi.e7.m(file, ((Integer) org.telegram.messenger.g0.L0(file).first).intValue());
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str14 != null) {
                        m10.C0 = str14;
                    }
                    if (!TextUtils.isEmpty(str15) && p10.i(x0Var.M).q()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        h20 h20Var = new h20();
                        h20Var.a = (byte) 7;
                        h20Var.b = (byte) -1;
                        h20Var.l = -1;
                        tg.h0 h0Var = new tg.h0();
                        h20Var.W = h0Var;
                        h0Var.c = str15;
                        if (str16 != null) {
                            h0Var.a |= 2;
                            h0Var.b = str16;
                        }
                        m10.T0.add(h20Var);
                    }
                    fi.va.D(x0Var.W, p10.s0).T(null, m10);
                    u1Var.c(500L);
                    break;
                } else {
                    u1Var.c(500L);
                }
                break;
            case 16:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                wg.v vVar = (wg.v) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                qp qpVar = (qp) obj3;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj2;
                org.telegram.ui.ActionBar.f2 f2Var4 = (org.telegram.ui.ActionBar.f2) obj;
                wg.v vVar2 = (wg.v) obj6;
                if (tL_error7 != null) {
                    vVar.a(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        qpVar.Y3(paymentForm.users, false);
                        hl0Var = new hl0(paymentForm, tL_inputInvoicePremiumGiftCode, f2Var4);
                    } else {
                        hl0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new hl0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (hl0Var != null) {
                        hl0Var.Z0 = new org.telegram.ui.web.a0(20, vVar2, vVar);
                        LaunchActivity.Q().showAsSheet(hl0Var, new org.telegram.ui.ActionBar.d2());
                        break;
                    } else {
                        vVar.a(null);
                        break;
                    }
                }
            default:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                c20 c20Var2 = (c20) obj6;
                TLObject tLObject10 = (TLObject) obj5;
                qp qpVar2 = (qp) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.f2 f2Var5 = (org.telegram.ui.ActionBar.f2) obj2;
                c20 c20Var3 = (c20) obj;
                if (tL_error8 != null) {
                    c20Var2.a(tL_error8);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        qpVar2.Y3(paymentForm2.users, false);
                        hl0Var2 = new hl0(paymentForm2, tL_inputInvoicePremiumGiftCode2, f2Var5);
                    } else {
                        hl0Var2 = tLObject10 instanceof TLRPC.PaymentReceipt ? new hl0((TLRPC.PaymentReceipt) tLObject10) : null;
                    }
                    if (hl0Var2 != null) {
                        hl0Var2.Z0 = new org.telegram.ui.web.a0(i16, c20Var3, c20Var2);
                        LaunchActivity.Q().showAsSheet(hl0Var2, new org.telegram.ui.ActionBar.d2());
                        break;
                    } else {
                        c20Var2.a(null);
                        break;
                    }
                }
        }
    }

    public /* synthetic */ r7(ea eaVar, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, v10 v10Var, c20 c20Var) {
        this.a = 0;
        this.b = eaVar;
        this.c = zArr;
        this.e = str;
        this.f = chatInvite;
        this.d = zArr2;
        this.h = v10Var;
        this.n = c20Var;
    }

    public /* synthetic */ r7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
    }

    public /* synthetic */ r7(JSONObject jSONObject, String str, org.telegram.ui.Wallet.u2 u2Var, org.telegram.ui.Wallet.n0 n0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.a = 14;
        this.b = jSONObject;
        this.e = str;
        this.c = u2Var;
        this.d = n0Var;
        this.f = str2;
        this.h = bArr;
        this.n = bArr2;
    }

    public /* synthetic */ r7(ls lsVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = lsVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.e = str;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ r7(TLRPC.TL_error tL_error, c20 c20Var, TLObject tLObject, qp qpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.f2 f2Var, c20 c20Var2) {
        this.a = 17;
        this.b = tL_error;
        this.n = c20Var;
        this.c = tLObject;
        this.d = qpVar;
        this.e = tL_inputInvoicePremiumGiftCode;
        this.f = f2Var;
        this.h = c20Var2;
    }

    public /* synthetic */ r7(an anVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, t3 t3Var, String str, vf.b bVar) {
        this.a = 5;
        this.b = anVar;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tLObject2;
        this.h = t3Var;
        this.e = str;
        this.n = bVar;
    }

    public /* synthetic */ r7(fj0 fj0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, gj0 gj0Var, TLRPC.TL_error tL_error, qj0 qj0Var) {
        this.a = 10;
        this.b = fj0Var;
        this.c = tLObject;
        this.e = str;
        this.d = tL_secureRequiredType;
        this.f = gj0Var;
        this.h = tL_error;
        this.n = qj0Var;
    }
}
