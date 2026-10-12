package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ff(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
        this.h = obj6;
        this.n = obj7;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        di.k8 m10;
        char c10;
        cp0 cp0Var;
        cp0 cp0Var2;
        int i14 = this.a;
        int i15 = 7;
        int i16 = 2;
        boolean z10 = false;
        int i17 = 1;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.c;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.b;
        switch (i14) {
            case 0:
                fo foVar = (fo) obj7;
                MessageObject messageObject = (MessageObject) obj5;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                org.telegram.ui.Components.cn0 cn0Var = (org.telegram.ui.Components.cn0) obj;
                foVar.getClass();
                ((org.telegram.ui.Components.m80) obj6).n0 = true;
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    str = u1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject.messageText)) {
                    str = u1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(foVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                cn0Var.dismiss();
                break;
            case 1:
                fo foVar2 = (fo) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                TLObject tLObject = (TLObject) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                kf kfVar = (kf) obj2;
                String str2 = (String) obj3;
                pf.c cVar = (pf.c) obj;
                if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                    z10 = true;
                }
                if (tLObject != null || (tL_error == null && (tLObject2 instanceof TLRPC.TL_boolTrue))) {
                    kfVar.run(tLObject, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    cVar.b = new of(foVar2, foVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new di.s1(foVar2, cVar, kfVar, z10, 2)), i15);
                    cVar.d();
                    break;
                }
            case 2:
                TLObject tLObject3 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject2 = (MessageObject) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                fo foVar3 = ((qn) obj7).a;
                ((org.telegram.ui.ActionBar.a2) obj6).dismiss();
                if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    foVar3.getMessagesController().putUsers(groupcall.users, false);
                    foVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        foVar3.showDialog(new hu(foVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = foVar3.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) foVar3).currentAccount;
                        org.telegram.ui.Components.voip.d2.g(parentActivity, i10, tL_inputGroupCallInviteMessage, messageObject2.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error2 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.zc.a0(foVar3).f0(tL_error2, false);
                        break;
                    }
                } else {
                    foVar3.showDialog(new hu(foVar3.getParentActivity(), hashSet));
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj5;
                String str3 = (String) obj3;
                Bundle bundle = (Bundle) obj4;
                TLObject tLObject4 = (TLObject) obj2;
                TL_account.sendConfirmPhoneCode sendconfirmphonecode = (TL_account.sendConfirmPhoneCode) obj;
                Pattern pattern = LaunchActivity.B1;
                ((org.telegram.ui.ActionBar.a2) obj6).dismiss();
                if (tL_error3 == null) {
                    bh0 bh0Var = new bh0();
                    bh0Var.G = str3;
                    bh0Var.H = bundle;
                    bh0Var.I = (TLRPC.TL_auth_sentCode) tLObject4;
                    bh0Var.F = 1;
                    launchActivity.p0(bh0Var);
                    break;
                } else {
                    org.telegram.ui.Components.g5.e0(launchActivity.O, tL_error3, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 4:
                kg0 kg0Var = (kg0) obj7;
                List<Purchase> list = (List) obj5;
                String str4 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj2;
                org.telegram.ui.Components.gq0 gq0Var = (org.telegram.ui.Components.gq0) obj;
                if (((c5.i) obj6).a == 0 && list != null && !list.isEmpty()) {
                    for (Purchase purchase : list) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            kg0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new di.fd(kg0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore, gq0Var, 8), 74);
                            break;
                        }
                    }
                }
                gq0Var.run();
                break;
            case 5:
                ah0 ah0Var = (ah0) obj7;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj6;
                TLObject tLObject5 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str5 = (String) obj3;
                li.k kVar = (li.k) obj2;
                TLObject tLObject6 = (TLObject) obj;
                bh0 bh0Var2 = ah0Var.V;
                ah0Var.K = false;
                int i18 = 5;
                if (tL_error4 != null) {
                    String str6 = tL_error4.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((org.telegram.ui.ActionBar.m2) bh0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new fc0(i18, ah0Var, str5), 10);
                        } else if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                            bh0.m1(bh0Var2, str5, kVar, false);
                        } else if (tL_error4.text.contains("PHONE_PASSWORD_FLOOD")) {
                            bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.text.contains("PHONE_NUMBER_FLOOD")) {
                            bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error4.text.contains("PHONE_NUMBER_BANNED")) {
                            bh0.m1(bh0Var2, str5, kVar, true);
                        } else if (tL_error4.text.contains("PHONE_CODE_EMPTY") || tL_error4.text.contains("PHONE_CODE_INVALID")) {
                            bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            bh0Var2.u1(0, true, null, true);
                            bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                            bh0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.m2) bh0Var2).currentAccount;
                            org.telegram.ui.Components.g5.e0(i11, tL_error4, bh0Var2, tLObject6, (String) kVar.d);
                        }
                    }
                } else if (tLObject5 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject5).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            bh0Var2.p0 = tL_help_termsOfService;
                        }
                        bh0Var2.u1(5, true, bundle2, false);
                    } else {
                        bh0Var2.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    bh0Var2.g1(bundle2, (TLRPC.auth_SentCode) tLObject5, true);
                }
                if (!bh0Var2.o0) {
                    bh0Var2.k1(false, true);
                    break;
                }
                break;
            case 6:
                TLObject tLObject7 = (TLObject) obj6;
                String str7 = (String) obj3;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj5;
                wm0 wm0Var = (wm0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                hn0 hn0Var = (hn0) obj;
                un0 un0Var = ((vm0) obj7).p.d;
                if (tLObject7 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject7;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    un0 un0Var2 = new un0(6, un0Var.y, un0Var.J, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.m2) un0Var2).currentAccount = i13;
                    un0Var2.T0 = sentemailcode.length;
                    un0Var2.e1 = un0Var.e1;
                    un0Var2.c1 = un0Var.c1;
                    un0Var2.B1 = wm0Var;
                    un0Var.presentFragment(un0Var2, true);
                    break;
                } else {
                    un0Var.L1(LocaleController.getString(R.string.PassportEmail), tL_error5.text);
                    if (hn0Var != null) {
                        hn0Var.o(tL_error5.text, str7);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj7;
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) obj6;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                String str8 = (String) obj3;
                byte[] bArr = (byte[]) obj4;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj2;
                mt mtVar = (mt) obj;
                d2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new bi.k8(d2Var, str8, bArr, mtVar, tonconnectsession, org.telegram.ui.Wallet.d2.r(g0Var, tonconnectsession, str8, bArr, tonconnectnexteventid.event_id), 14));
                    break;
                } catch (Exception e) {
                    mtVar.run(org.telegram.ui.Wallet.d2.h("prepare disconnect", e));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) obj7;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj6;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj2;
                byte[] bArr2 = a2Var.b;
                mt mtVar2 = (mt) obj;
                if (d2Var2.c(y1Var, tonconnectsession2, (String) obj3, (byte[]) obj4)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession2.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr2;
                    tonconnectsubmitconnectresult.body = a2Var.c;
                    tonconnectsubmitconnectresult.trace_id = y1Var.c;
                    d2Var2.f.sendRequestTyped(tonconnectsubmitconnectresult, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.i(d2Var2, a2Var, mtVar2, 8));
                    break;
                } else {
                    Arrays.fill(bArr2, (byte) 0);
                    mtVar2.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 9:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) obj7;
                org.telegram.ui.Wallet.g0 g0Var2 = (org.telegram.ui.Wallet.g0) obj6;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj5;
                String str9 = (String) obj3;
                byte[] bArr3 = (byte[]) obj4;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) obj2;
                mt mtVar3 = (mt) obj;
                d2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ji.k(d2Var3, y1Var2, tonconnectsession3, str9, bArr3, org.telegram.ui.Wallet.d2.p(g0Var2, tonconnectsession3, str9, bArr3, y1Var2.a, y1Var2.b, y1Var2.d, null, d2Var3.f.getCurrentTime()), mtVar3, g0Var2, 6));
                    break;
                } catch (Exception e7) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.b1(mtVar3, org.telegram.ui.Wallet.d2.h("prepare connect", e7), i17));
                    return;
                }
            case 10:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj7;
                int[] iArr = (int[]) obj6;
                File file = (File) obj5;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj4;
                String str10 = (String) obj3;
                String str11 = (String) obj2;
                String str12 = (String) obj;
                if (iArr[4] > 0) {
                    int i19 = iArr[1];
                    int i20 = iArr[2];
                    int photoSize = i19 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i19;
                    int photoSize2 = i20 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i20;
                    File w9 = di.k8.w(UserConfig.selectedAccount, "jpg");
                    org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p5 = f6Var.p();
                    f6Var.u();
                    if (p5 != null) {
                        try {
                            c10 = 4;
                        } catch (Exception e10) {
                            e = e10;
                            c10 = 4;
                        }
                        try {
                            p5.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w9));
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                            w9 = null;
                            m10 = di.k8.o(file, w9 != null ? null : w9.getAbsolutePath(), iArr[c10]);
                            m10.k0 = i19;
                            m10.l0 = i20;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            a2Var2.c(500L);
                            return;
                        }
                    } else {
                        c10 = 4;
                    }
                    m10 = di.k8.o(file, w9 != null ? null : w9.getAbsolutePath(), iArr[c10]);
                    m10.k0 = i19;
                    m10.l0 = i20;
                    m10.A();
                } else {
                    m10 = di.k8.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str10 != null) {
                        m10.C0 = str10;
                    }
                    if (!TextUtils.isEmpty(str11) && UserConfig.getInstance(b1Var.M).isPremium()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        rg.p0 p0Var = new rg.p0();
                        mediaEntity.linkSettings = p0Var;
                        p0Var.c = str11;
                        if (str12 != null) {
                            p0Var.a |= 2;
                            p0Var.b = str12;
                        }
                        m10.T0.add(mediaEntity);
                    }
                    di.kc.D(b1Var.W, UserConfig.selectedAccount).T(null, m10);
                    a2Var2.c(500L);
                    break;
                } else {
                    a2Var2.c(500L);
                }
                break;
            case 11:
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj7;
                ug.v vVar = (ug.v) obj6;
                TLObject tLObject8 = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                ug.v vVar2 = (ug.v) obj;
                if (tL_error6 != null) {
                    vVar.run(tL_error6);
                    break;
                } else {
                    if (tLObject8 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject8;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        cp0Var = new cp0(paymentForm, tL_inputInvoicePremiumGiftCode, m2Var);
                    } else {
                        cp0Var = tLObject8 instanceof TLRPC.PaymentReceipt ? new cp0((TLRPC.PaymentReceipt) tLObject8) : null;
                    }
                    if (cp0Var != null) {
                        cp0Var.Z0 = new org.telegram.ui.web.c0(13, vVar2, vVar);
                        LaunchActivity.R().showAsSheet(cp0Var, new org.telegram.ui.ActionBar.k2());
                        break;
                    } else {
                        vVar.run(null);
                        break;
                    }
                }
            case 12:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                Utilities.Callback callback = (Utilities.Callback) obj6;
                TLObject tLObject9 = (TLObject) obj5;
                MessagesController messagesController2 = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error7 != null) {
                    callback.run(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject9;
                        paymentForm2.invoice.recurring = true;
                        messagesController2.putUsers(paymentForm2.users, false);
                        cp0Var2 = new cp0(paymentForm2, tL_inputInvoicePremiumGiftCode2, m2Var2);
                    } else {
                        cp0Var2 = tLObject9 instanceof TLRPC.PaymentReceipt ? new cp0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (cp0Var2 != null) {
                        cp0Var2.Z0 = new org.telegram.ui.web.c0(14, callback2, callback);
                        LaunchActivity.R().showAsSheet(cp0Var2, new org.telegram.ui.ActionBar.k2());
                        break;
                    } else {
                        callback.run(null);
                        break;
                    }
                }
            case 13:
                ((boolean[]) obj6)[0] = true;
                ((zh.n5) obj7).Z((String) obj3, (TLRPC.ChatInvite) obj5, new zh.z3((boolean[]) obj4, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 14:
                zh.n5 n5Var = (zh.n5) obj7;
                TLObject tLObject10 = (TLObject) obj6;
                MessageObject messageObject3 = (MessageObject) obj5;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj4;
                Utilities.Callback callback3 = (Utilities.Callback) obj3;
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                if (tLObject10 instanceof TLRPC.TL_payments_paymentFormStars) {
                    n5Var.a0(messageObject3, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject10, callback3);
                    break;
                } else {
                    callback3.run(Boolean.FALSE);
                    i2.d.q(R.string.UnknownErrorCode, new Object[]{tL_error8 != null ? tL_error8.text : "FAILED_GETTING_FORM"}, zcVar, R.raw.error, 36);
                    break;
                }
            case 15:
                zh.n5 n5Var2 = (zh.n5) obj7;
                List list2 = (List) obj6;
                org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                c5.i iVar = (c5.i) obj2;
                Activity activity = (Activity) obj;
                if (list2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new zh.g4(d90Var, i17));
                    break;
                } else {
                    c5.p pVar = (c5.p) list2.get(0);
                    c5.l a2 = pVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new zh.g4(d90Var, i16));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(n5Var2.a).sendRequest(tL_payments_canPurchaseStore2, new sh1(pVar, iVar, d90Var, activity, tL_inputStorePaymentStarsGift, list2, 4));
                        break;
                    }
                }
            default:
                zh.h8 h8Var = (zh.h8) obj7;
                bi.z0[] z0VarArr = (bi.z0[]) obj6;
                int[] iArr2 = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                ah.j1 j1Var = (ah.j1) obj2;
                ah.g1 g1Var = (ah.g1) obj;
                if (h8Var.d) {
                    bi.z0 z0Var = z0VarArr[0];
                    if (z0Var == null) {
                        z0Var = h8Var.O.d(h8Var.P);
                        z0VarArr[0] = z0Var;
                    }
                    if (z0Var != null) {
                        z0Var.setDrawStar(false);
                        z0Var.getLocationInWindow(iArr2);
                        TextView textView = z0Var.E;
                        org.telegram.ui.Components.br[] brVarArr = z0Var.G;
                        if (brVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + brVarArr[0].translateX;
                            float y3 = textView.getY() + textView.getPaddingTop() + brVarArr[0].translateY;
                            rectF.set(x10, y3, r2.drawable.getBounds().width() + x10, brVarArr[0].drawable.getBounds().height() + y3);
                        }
                        rectF.offset(iArr2[0], iArr2[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr2);
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr2[0] + j1Var.c + g1Var.x, ((g1Var.B - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr2[1] + j1Var.d + g1Var.y, AndroidUtilities.dp(26.0f) + iArr2[0] + j1Var.c + g1Var.x, ((AndroidUtilities.dp(22.0f) + g1Var.B) / 2.0f) + iArr2[1] + j1Var.d + g1Var.y);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ff(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = str;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ ff(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
        this.e = tLObject;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
    }

    public /* synthetic */ ff(qn qnVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = qnVar;
        this.d = a2Var;
        this.f = tLObject;
        this.c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.n = tL_error;
    }

    public /* synthetic */ ff(fo foVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, kf kfVar, String str, pf.c cVar) {
        this.a = 1;
        this.b = foVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f = tLObject2;
        this.h = kfVar;
        this.c = str;
        this.n = cVar;
    }
}
