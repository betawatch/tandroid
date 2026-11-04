package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.messenger.z10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cj0;
import org.telegram.ui.dj0;
import org.telegram.ui.dl0;
import org.telegram.ui.e51;
import org.telegram.ui.hm;
import org.telegram.ui.id0;
import org.telegram.ui.na1;
import org.telegram.ui.ne;
import org.telegram.ui.nj0;
import org.telegram.ui.qs;
import org.telegram.ui.wd0;
import org.telegram.ui.wm;
import org.telegram.ui.xd0;
import org.telegram.ui.xy;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ s6(e9 e9Var, TLObject tLObject, zi ziVar, TLRPC.InputInvoice inputInvoice, u10 u10Var, org.telegram.ui.Components.fc fcVar, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = e9Var;
        this.c = tLObject;
        this.d = ziVar;
        this.e = inputInvoice;
        this.n = u10Var;
        this.f = fcVar;
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
        int i3;
        int i10;
        int i11;
        int i12;
        gi.f7 m10;
        dl0 dl0Var;
        dl0 dl0Var2;
        int i13 = this.a;
        int i14 = 14;
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
                ((e9) obj7).Y((String) obj3, (TLRPC.ChatInvite) obj2, new u6((boolean[]) obj4, (n10) obj, (u10) obj6));
                break;
            case 1:
                e9 e9Var = (e9) obj7;
                List list = (List) obj5;
                ai.d6 d6Var = (ai.d6) obj4;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj3;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                e5.f fVar = (e5.f) obj;
                Activity activity = (Activity) obj6;
                if (list.isEmpty()) {
                    org.telegram.messenger.g0.h3(new j7(d6Var, i17));
                    break;
                } else {
                    e5.l lVar = (e5.l) list.get(0);
                    e5.h a10 = lVar.a();
                    if (a10 == null) {
                        org.telegram.messenger.g0.h3(new j7(d6Var, i16));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a10.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(e9Var.a).sendRequest(tL_payments_canPurchaseStore, new d7(lVar, fVar, d6Var, activity, tL_inputStorePaymentStarsGift, list, 1));
                        break;
                    }
                }
            case 2:
                e9 e9Var2 = (e9) obj7;
                TLObject tLObject = (TLObject) obj5;
                zi ziVar = (zi) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                u10 u10Var = (u10) obj6;
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    e9Var2.Z(ziVar, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, u10Var);
                    break;
                } else {
                    u10Var.a(Boolean.FALSE);
                    fcVar.Q(R.raw.error, 36, bd.a0(null, null, 2131743888, tL_error != null ? tL_error.text : "FAILED_GETTING_FORM")).j();
                    break;
                }
            case 3:
                tc tcVar = (tc) obj7;
                ei.p0[] p0VarArr = (ei.p0[]) obj5;
                int[] iArr = (int[]) obj4;
                RectF rectF = (RectF) obj3;
                View view = (View) obj2;
                dh.o0 o0Var = (dh.o0) obj;
                dh.l0 l0Var = (dh.l0) obj6;
                if (tcVar.l1) {
                    ei.p0 p0Var = p0VarArr[0];
                    if (p0Var == null) {
                        p0Var = tcVar.H1.d(tcVar.I1);
                        p0VarArr[0] = p0Var;
                    }
                    if (p0Var != null) {
                        p0Var.setDrawStar(false);
                        p0Var.getLocationInWindow(iArr);
                        TextView textView = p0Var.F;
                        wp[] wpVarArr = p0Var.H;
                        if (wpVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + wpVarArr[0].r;
                            float y9 = textView.getY() + textView.getPaddingTop() + wpVarArr[0].s;
                            rectF.set(x10, y9, r2.c.getBounds().width() + x10, wpVarArr[0].c.getBounds().height() + y9);
                        }
                        rectF.offset(iArr[0], iArr[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr);
                    rectF.set(org.telegram.messenger.g0.L(4.0f) + iArr[0] + o0Var.b + l0Var.w, ((l0Var.A - org.telegram.messenger.g0.L(22.0f)) / 2.0f) + iArr[1] + o0Var.c + l0Var.x, org.telegram.messenger.g0.L(26.0f) + iArr[0] + o0Var.b + l0Var.w, ((org.telegram.messenger.g0.L(22.0f) + l0Var.A) / 2.0f) + iArr[1] + o0Var.c + l0Var.x);
                    break;
                }
                break;
            case 4:
                wm wmVar = (wm) obj7;
                zi ziVar2 = (zi) obj4;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj2;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj;
                nk0 nk0Var = (nk0) obj6;
                ((f60) obj5).n0 = true;
                if (!TextUtils.isEmpty(ziVar2.z)) {
                    str = q1Var.getMessageObject().z.toString();
                } else if (!TextUtils.isEmpty(ziVar2.v)) {
                    str = q1Var.getMessageObject().v.toString();
                }
                String str2 = str.length() > 21 ? str.substring(0, 21) + "..." : str;
                Activity parentActivity = wmVar.getParentActivity();
                long j10 = tL_messageEntityFormattedDate.date * 1000;
                boolean z10 = (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true;
                Typeface typeface = org.telegram.messenger.g0.a;
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
                    org.telegram.messenger.a8.g(th2, true);
                }
                nk0Var.dismiss();
                break;
            case 5:
                wm wmVar2 = (wm) obj7;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                g3 g3Var = (g3) obj;
                String str3 = (String) obj3;
                sf.b bVar = (sf.b) obj6;
                boolean z11 = tL_error2 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error2.text);
                if (tLObject2 != null || (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_boolTrue))) {
                    g3Var.a(tLObject2, Boolean.valueOf(z11));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str3;
                    bVar.b = new ne(wmVar2, wmVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new o3(wmVar2, bVar, g3Var, z11, 4)), i15);
                    bVar.d();
                    break;
                }
            case 6:
                TLObject tLObject4 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                zi ziVar3 = (zi) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj6;
                wm wmVar3 = ((hm) obj7).a;
                ((org.telegram.ui.ActionBar.s1) obj5).dismiss();
                if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    wmVar3.getMessagesController().Y3(groupcall.users, false);
                    wmVar3.getMessagesController().S3(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        wmVar3.showDialog(new qs(wmVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity2 = wmVar3.getParentActivity();
                        i3 = ((org.telegram.ui.ActionBar.d2) wmVar3).currentAccount;
                        org.telegram.ui.Components.voip.n1.g(parentActivity2, i3, tL_inputGroupCallInviteMessage, ziVar3.k.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error3 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.fc.a0(wmVar3).f0(tL_error3, false);
                        break;
                    }
                } else {
                    wmVar3.showDialog(new qs(wmVar3.getParentActivity(), hashSet));
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
                String str5 = LaunchActivity.E1;
                ((org.telegram.ui.ActionBar.s1) obj5).dismiss();
                if (tL_error4 == null) {
                    xd0 xd0Var = new xd0();
                    xd0Var.H = str4;
                    xd0Var.I = bundle;
                    xd0Var.J = (TLRPC.TL_auth_sentCode) tLObject5;
                    xd0Var.G = 1;
                    launchActivity.t0(xd0Var);
                    break;
                } else {
                    org.telegram.ui.Components.t4.e0(launchActivity.P, tL_error4, launchActivity.M().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 8:
                id0 id0Var = (id0) obj7;
                List<Purchase> list2 = (List) obj4;
                String str6 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj;
                v60 v60Var = (v60) obj6;
                if (((e5.f) obj5).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str6)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            id0Var.w.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new s7(id0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, v60Var, 9), 74);
                            break;
                        }
                    }
                }
                v60Var.run();
                break;
            case 9:
                wd0 wd0Var = (wd0) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj2;
                String str7 = (String) obj3;
                k4.j jVar = (k4.j) obj;
                TLObject tLObject7 = (TLObject) obj6;
                xd0 xd0Var2 = wd0Var.b0;
                wd0Var.N = false;
                if (tL_error5 != null) {
                    String str8 = tL_error5.text;
                    if (str8 != null) {
                        if (str8.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i11 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                            ConnectionsManager.getInstance(i11).sendRequest(getpassword, new xy(i14, wd0Var, str7), 10);
                        } else if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                            xd0.v1(xd0Var2, str7, jVar, false);
                        } else if (tL_error5.text.contains("PHONE_PASSWORD_FLOOD")) {
                            xd0Var2.u1(bd.M0(2131746081, null), bd.M0(2131750688, "FloodWait"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_FLOOD")) {
                            xd0Var2.u1(bd.M0(2131746081, null), bd.M0(2131747294, "PhoneNumberFlood"));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_BANNED")) {
                            xd0.v1(xd0Var2, str7, jVar, true);
                        } else if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                            xd0Var2.u1(bd.M0(2131746081, null), bd.M0(2131749191, null));
                        } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            xd0Var2.D1(0, true, null, true);
                            xd0Var2.u1(bd.M0(2131746081, null), bd.M0(2131752021, "CodeExpired"));
                        } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                            xd0Var2.u1(bd.M0(2131746081, null), bd.M0(2131750688, "FloodWait"));
                        } else if (tL_error5.code != -1000) {
                            i10 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                            org.telegram.ui.Components.t4.e0(i10, tL_error5, xd0Var2, tLObject7, (String) jVar.c);
                        }
                    }
                } else if (tLObject6 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject6).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            xd0Var2.r0 = tL_help_termsOfService;
                        }
                        xd0Var2.D1(5, true, bundle2, false);
                    } else {
                        xd0Var2.x1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    xd0Var2.p1(bundle2, (TLRPC.auth_SentCode) tLObject6, true);
                }
                if (!xd0Var2.q0) {
                    xd0Var2.t1(false, true);
                    break;
                }
                break;
            case 10:
                TLObject tLObject8 = (TLObject) obj5;
                String str9 = (String) obj3;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj4;
                dj0 dj0Var = (dj0) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                nj0 nj0Var = (nj0) obj6;
                yj0 yj0Var = ((cj0) obj7).p.d;
                if (tLObject8 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str9);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    yj0 yj0Var2 = new yj0(6, yj0Var.E, yj0Var.K, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i12 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.d2) yj0Var2).currentAccount = i12;
                    yj0Var2.U0 = sentemailcode.length;
                    yj0Var2.f1 = yj0Var.f1;
                    yj0Var2.d1 = yj0Var.d1;
                    yj0Var2.C1 = dj0Var;
                    yj0Var.presentFragment(yj0Var2, true);
                    break;
                } else {
                    yj0Var.Q1(bd.M0(2131747583, null), tL_error6.text);
                    if (nj0Var != null) {
                        nj0Var.f(tL_error6.text, str9);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) obj7;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj5;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj4;
                String str10 = (String) obj3;
                byte[] bArr = (byte[]) obj2;
                org.telegram.ui.Wallet.x1 x1Var = (org.telegram.ui.Wallet.x1) obj;
                e51 e51Var = (e51) obj6;
                c2Var.getClass();
                try {
                    org.telegram.messenger.g0.h3(new o7(c2Var, x1Var, tonconnectsession, str10, bArr, org.telegram.ui.Wallet.c2.r(h0Var, tonconnectsession, str10, bArr, x1Var.a, x1Var.b, x1Var.d, null, c2Var.f.getCurrentTime()), e51Var, h0Var, 6));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.a1(e51Var, org.telegram.ui.Wallet.c2.i("prepare connect", e10), i17));
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.c2 c2Var2 = (org.telegram.ui.Wallet.c2) obj7;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj5;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj4;
                String str11 = (String) obj3;
                byte[] bArr2 = (byte[]) obj2;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                e51 e51Var2 = (e51) obj6;
                c2Var2.getClass();
                try {
                    org.telegram.messenger.g0.h3(new ai.w1(c2Var2, str11, bArr2, e51Var2, tonconnectsession2, org.telegram.ui.Wallet.c2.t(h0Var2, tonconnectsession2, str11, bArr2, tonconnectnexteventid.event_id), 21));
                    break;
                } catch (Exception e11) {
                    e51Var2.a(org.telegram.ui.Wallet.c2.i("prepare disconnect", e11));
                    return;
                }
            case 13:
                org.telegram.ui.Wallet.c2 c2Var3 = (org.telegram.ui.Wallet.c2) obj7;
                org.telegram.ui.Wallet.x1 x1Var2 = (org.telegram.ui.Wallet.x1) obj5;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj4;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                byte[] bArr3 = z1Var.b;
                e51 e51Var3 = (e51) obj6;
                if (c2Var3.d(x1Var2, tonconnectsession3, (String) obj3, (byte[]) obj2)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession3.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr3;
                    tonconnectsubmitconnectresult.body = z1Var.c;
                    tonconnectsubmitconnectresult.trace_id = x1Var2.c;
                    c2Var3.f.sendRequestTyped(tonconnectsubmitconnectresult, new c3.b(i16), new org.telegram.ui.Wallet.j(c2Var3, z1Var, e51Var3, i15));
                    break;
                } else {
                    Arrays.fill(bArr3, (byte) 0);
                    e51Var3.a("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 14:
                JSONObject jSONObject = (JSONObject) obj7;
                String str12 = (String) obj3;
                org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) obj5;
                org.telegram.ui.Wallet.x2 x2Var = s2Var.a;
                org.telegram.ui.Wallet.q2 q2Var = s2Var.b;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj4;
                String str13 = (String) obj2;
                byte[] bArr4 = (byte[]) obj;
                byte[] bArr5 = (byte[]) obj6;
                if (jSONObject == null) {
                    org.telegram.ui.Components.fc.b0(str12);
                    s2Var.d = false;
                    if (!s2Var.f) {
                        s2Var.f = true;
                        q2Var.a();
                    }
                    if (!s2Var.e) {
                        x2Var.dismiss();
                        break;
                    }
                } else {
                    TLRPC.TL_widgetQueryTypeSignData tL_widgetQueryTypeSignData = new TLRPC.TL_widgetQueryTypeSignData();
                    TLRPC.TL_userWallet tL_userWallet = new TLRPC.TL_userWallet();
                    tL_userWallet.address = str13;
                    tL_userWallet.balance = k0Var.v();
                    if (bArr5 != null) {
                        tL_userWallet.public_key = bArr4;
                        tL_userWallet.state_init = bArr5;
                    }
                    tL_widgetQueryTypeSignData.wallet = tL_userWallet;
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_widgetQueryTypeSignData.sign_data = tL_dataJSON2;
                    tL_dataJSON2.data = jSONObject.toString();
                    s2Var.d = false;
                    if (!s2Var.f) {
                        s2Var.f = true;
                        q2Var.d(tL_widgetQueryTypeSignData);
                    }
                    if (!s2Var.e) {
                        x2Var.dismiss();
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj7;
                int[] iArr2 = (int[]) obj5;
                File file = (File) obj4;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj2;
                String str14 = (String) obj3;
                String str15 = (String) obj;
                String str16 = (String) obj6;
                if (iArr2[4] > 0) {
                    int i18 = iArr2[1];
                    int i19 = iArr2[2];
                    int Z0 = i18 > org.telegram.messenger.g0.Z0(false) ? org.telegram.messenger.g0.Z0(false) : i18;
                    int Z02 = i19 > org.telegram.messenger.g0.Z0(false) ? org.telegram.messenger.g0.Z0(false) : i19;
                    File w10 = gi.f7.w(h10.t0, "jpg");
                    org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(file, true, 0L, 0, null, null, null, 0L, h10.t0, true, Z0, Z02, null, 0, true);
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
                            m10 = gi.f7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                            m10.k0 = i18;
                            m10.l0 = i19;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            s1Var.c(500L);
                            return;
                        }
                    }
                    m10 = gi.f7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                    m10.k0 = i18;
                    m10.l0 = i19;
                    m10.A();
                } else {
                    m10 = gi.f7.m(file, ((Integer) org.telegram.messenger.g0.L0(file).first).intValue());
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str14 != null) {
                        m10.C0 = str14;
                    }
                    if (!TextUtils.isEmpty(str15) && h10.i(w0Var.N).q()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        z10 z10Var = new z10();
                        z10Var.a = (byte) 7;
                        z10Var.b = (byte) -1;
                        z10Var.l = -1;
                        ug.g0 g0Var = new ug.g0();
                        z10Var.W = g0Var;
                        g0Var.c = str15;
                        if (str16 != null) {
                            g0Var.a |= 2;
                            g0Var.b = str16;
                        }
                        m10.T0.add(z10Var);
                    }
                    gi.va.D(w0Var.a0, h10.t0).T(null, m10);
                    s1Var.c(500L);
                    break;
                } else {
                    s1Var.c(500L);
                }
                break;
            case 16:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                xg.v vVar = (xg.v) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                hp hpVar = (hp) obj3;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                xg.v vVar2 = (xg.v) obj6;
                if (tL_error7 != null) {
                    vVar.a(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        hpVar.Y3(paymentForm.users, false);
                        dl0Var = new dl0(paymentForm, tL_inputInvoicePremiumGiftCode, d2Var);
                    } else {
                        dl0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new dl0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (dl0Var != null) {
                        dl0Var.a1 = new na1(24, vVar2, vVar);
                        LaunchActivity.Q().showAsSheet(dl0Var, new org.telegram.ui.ActionBar.b2());
                        break;
                    } else {
                        vVar.a(null);
                        break;
                    }
                }
            default:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                u10 u10Var2 = (u10) obj6;
                TLObject tLObject10 = (TLObject) obj5;
                hp hpVar2 = (hp) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                u10 u10Var3 = (u10) obj;
                if (tL_error8 != null) {
                    u10Var2.a(tL_error8);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        hpVar2.Y3(paymentForm2.users, false);
                        dl0Var2 = new dl0(paymentForm2, tL_inputInvoicePremiumGiftCode2, d2Var2);
                    } else {
                        dl0Var2 = tLObject10 instanceof TLRPC.PaymentReceipt ? new dl0((TLRPC.PaymentReceipt) tLObject10) : null;
                    }
                    if (dl0Var2 != null) {
                        dl0Var2.a1 = new na1(25, u10Var3, u10Var2);
                        LaunchActivity.Q().showAsSheet(dl0Var2, new org.telegram.ui.ActionBar.b2());
                        break;
                    } else {
                        u10Var2.a(null);
                        break;
                    }
                }
        }
    }

    public /* synthetic */ s6(e9 e9Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, n10 n10Var, u10 u10Var) {
        this.a = 0;
        this.b = e9Var;
        this.c = zArr;
        this.e = str;
        this.f = chatInvite;
        this.d = zArr2;
        this.h = n10Var;
        this.n = u10Var;
    }

    public /* synthetic */ s6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
        this.n = obj7;
    }

    public /* synthetic */ s6(JSONObject jSONObject, String str, org.telegram.ui.Wallet.s2 s2Var, org.telegram.ui.Wallet.k0 k0Var, String str2, byte[] bArr, byte[] bArr2) {
        this.a = 14;
        this.b = jSONObject;
        this.e = str;
        this.c = s2Var;
        this.d = k0Var;
        this.f = str2;
        this.h = bArr;
        this.n = bArr2;
    }

    public /* synthetic */ s6(cs csVar, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i3) {
        this.a = i3;
        this.b = csVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.e = str;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ s6(TLRPC.TL_error tL_error, u10 u10Var, TLObject tLObject, hp hpVar, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.d2 d2Var, u10 u10Var2) {
        this.a = 17;
        this.b = tL_error;
        this.n = u10Var;
        this.c = tLObject;
        this.d = hpVar;
        this.e = tL_inputInvoicePremiumGiftCode;
        this.f = d2Var;
        this.h = u10Var2;
    }

    public /* synthetic */ s6(wm wmVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, g3 g3Var, String str, sf.b bVar) {
        this.a = 5;
        this.b = wmVar;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tLObject2;
        this.h = g3Var;
        this.e = str;
        this.n = bVar;
    }

    public /* synthetic */ s6(cj0 cj0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, dj0 dj0Var, TLRPC.TL_error tL_error, nj0 nj0Var) {
        this.a = 10;
        this.b = cj0Var;
        this.c = tLObject;
        this.e = str;
        this.d = tL_secureRequiredType;
        this.f = dj0Var;
        this.h = tL_error;
        this.n = nj0Var;
    }
}
