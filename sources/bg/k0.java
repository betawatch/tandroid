package bg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import fh.w5;
import gh.b6;
import gh.jb;
import gh.t5;
import gh.v7;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import kh.a8;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.am0;
import org.telegram.ui.bg;
import org.telegram.ui.cn;
import org.telegram.ui.co0;
import org.telegram.ui.eg0;
import org.telegram.ui.fg0;
import org.telegram.ui.lm0;
import org.telegram.ui.of0;
import org.telegram.ui.qn;
import org.telegram.ui.st;
import org.telegram.ui.v40;
import org.telegram.ui.ve;
import org.telegram.ui.wm0;
import org.telegram.ui.zl0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ k0(v7 v7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, oc ocVar, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.h = v7Var;
        this.c = tLObject;
        this.d = messageObject;
        this.e = inputInvoice;
        this.f = callback;
        this.n = ocVar;
        this.b = tL_error;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        co0 co0Var;
        co0 co0Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        a8 m10;
        char c10;
        int i13 = this.a;
        int i14 = 5;
        int i15 = 7;
        boolean z10 = false;
        int i16 = 1;
        Object obj = this.n;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.h;
        Object obj7 = this.b;
        switch (i13) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj7;
                z0 z0Var = (z0) obj6;
                TLObject tLObject = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                z0 z0Var2 = (z0) obj;
                if (tL_error != null) {
                    z0Var.run(tL_error);
                    break;
                } else {
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        co0Var = new co0(paymentForm, tL_inputInvoicePremiumGiftCode, o2Var);
                    } else {
                        co0Var = tLObject instanceof TLRPC.PaymentReceipt ? new co0((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (co0Var != null) {
                        co0Var.V0 = new b5.d(4, z0Var2, z0Var);
                        LaunchActivity.R().showAsSheet(co0Var, new org.telegram.ui.ActionBar.m2());
                        break;
                    } else {
                        z0Var.run(null);
                        break;
                    }
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj7;
                Utilities.Callback callback = (Utilities.Callback) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                MessagesController messagesController2 = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    break;
                } else {
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                        paymentForm2.invoice.recurring = true;
                        messagesController2.putUsers(paymentForm2.users, false);
                        co0Var2 = new co0(paymentForm2, tL_inputInvoicePremiumGiftCode2, o2Var2);
                    } else {
                        co0Var2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new co0((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (co0Var2 != null) {
                        co0Var2.V0 = new b5.d(i14, callback2, callback);
                        LaunchActivity.R().showAsSheet(co0Var2, new org.telegram.ui.ActionBar.m2());
                        break;
                    } else {
                        callback.run(null);
                        break;
                    }
                }
            case 2:
                ((boolean[]) obj6)[0] = true;
                ((v7) obj7).Z((String) obj5, (TLRPC.ChatInvite) obj4, new t5((boolean[]) obj3, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 3:
                v7 v7Var = (v7) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                oc ocVar = (oc) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    v7Var.a0(messageObject, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, callback3);
                    break;
                } else {
                    callback3.run(Boolean.FALSE);
                    org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{tL_error3 != null ? tL_error3.text : "FAILED_GETTING_FORM"}, ocVar, R.raw.error, 36);
                    break;
                }
            case 4:
                v7 v7Var2 = (v7) obj7;
                List list = (List) obj6;
                w5 w5Var = (w5) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                n2.g gVar = (n2.g) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new b6(w5Var, i16));
                    break;
                } else {
                    n2.l lVar = (n2.l) list.get(0);
                    n2.i a2 = lVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new b6(w5Var, 2));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(v7Var2.a).sendRequest(tL_payments_canPurchaseStore, new n0(lVar, gVar, (Utilities.Callback2) w5Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGift, list, 3));
                        break;
                    }
                }
            case 5:
                jb jbVar = (jb) obj7;
                ih.p0[] p0VarArr = (ih.p0[]) obj6;
                int[] iArr = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                hg.s0 s0Var = (hg.s0) obj2;
                hg.p0 p0Var = (hg.p0) obj;
                if (jbVar.d) {
                    ih.p0 p0Var2 = p0VarArr[0];
                    if (p0Var2 == null) {
                        p0Var2 = jbVar.J.d(jbVar.K);
                        p0VarArr[0] = p0Var2;
                    }
                    if (p0Var2 != null) {
                        p0Var2.setDrawStar(false);
                        p0Var2.getLocationInWindow(iArr);
                        TextView textView = p0Var2.A;
                        eq[] eqVarArr = p0Var2.C;
                        if (eqVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + eqVarArr[0].translateX;
                            float y10 = textView.getY() + textView.getPaddingTop() + eqVarArr[0].translateY;
                            rectF.set(x10, y10, r2.drawable.getBounds().width() + x10, eqVarArr[0].drawable.getBounds().height() + y10);
                        }
                        rectF.offset(iArr[0], iArr[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr);
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr[0] + s0Var.c + p0Var.x, ((p0Var.B - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr[1] + s0Var.d + p0Var.y, AndroidUtilities.dp(26.0f) + iArr[0] + s0Var.c + p0Var.x, ((AndroidUtilities.dp(22.0f) + p0Var.B) / 2.0f) + iArr[1] + s0Var.d + p0Var.y);
                    break;
                }
                break;
            case 6:
                qn qnVar = (qn) obj7;
                MessageObject messageObject2 = (MessageObject) obj5;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                ll0 ll0Var = (ll0) obj;
                qnVar.getClass();
                ((x60) obj6).n0 = true;
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    str = t1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject2.messageText)) {
                    str = t1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(qnVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                ll0Var.dismiss();
                break;
            case 7:
                qn qnVar2 = (qn) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                TLObject tLObject4 = (TLObject) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                bg bgVar = (bg) obj3;
                String str2 = (String) obj2;
                ve.d dVar = (ve.d) obj;
                if (tL_error4 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error4.text)) {
                    z10 = true;
                }
                if (tLObject4 != null || (tL_error4 == null && (tLObject5 instanceof TLRPC.TL_boolTrue))) {
                    bgVar.run(tLObject4, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    dVar.b = new ve(qnVar2, qnVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new kh.t1(qnVar2, dVar, bgVar, z10, 2)), i15);
                    dVar.d();
                    break;
                }
            case 8:
                TLObject tLObject6 = (TLObject) obj5;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject3 = (MessageObject) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj7;
                qn qnVar3 = ((cn) obj6).a;
                ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                if (tLObject6 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject6;
                    qnVar3.getMessagesController().putUsers(groupcall.users, false);
                    qnVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        qnVar3.showDialog(new st(qnVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = qnVar3.getParentActivity();
                        i9 = ((org.telegram.ui.ActionBar.o2) qnVar3).currentAccount;
                        org.telegram.ui.Components.voip.e2.h(parentActivity, i9, tL_inputGroupCallInviteMessage, messageObject3.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error5 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error5.text)) {
                    if (tL_error5 != null) {
                        oc.a0(qnVar3).d0(tL_error5, false);
                        break;
                    }
                } else {
                    qnVar3.showDialog(new st(qnVar3.getParentActivity(), hashSet));
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj7;
                String str3 = (String) obj3;
                Bundle bundle = (Bundle) obj2;
                TLObject tLObject7 = (TLObject) obj5;
                TL_account.sendConfirmPhoneCode sendconfirmphonecode = (TL_account.sendConfirmPhoneCode) obj;
                Pattern pattern = LaunchActivity.x1;
                ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                if (tL_error6 == null) {
                    fg0 fg0Var = new fg0();
                    fg0Var.C = str3;
                    fg0Var.D = bundle;
                    fg0Var.E = (TLRPC.TL_auth_sentCode) tLObject7;
                    fg0Var.B = 1;
                    launchActivity.p0(fg0Var);
                    break;
                } else {
                    y4.f0(launchActivity.K, tL_error6, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 10:
                of0 of0Var = (of0) obj7;
                List<Purchase> list2 = (List) obj5;
                String str4 = (String) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj2;
                no0 no0Var = (no0) obj;
                if (((n2.g) obj6).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            of0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new h0(of0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, no0Var, 11), 74);
                            break;
                        }
                    }
                }
                no0Var.run();
                break;
            case 11:
                eg0 eg0Var = (eg0) obj6;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                TLObject tLObject8 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str5 = (String) obj3;
                j4.c cVar = (j4.c) obj2;
                TLObject tLObject9 = (TLObject) obj;
                fg0 fg0Var2 = eg0Var.R;
                eg0Var.G = false;
                if (tL_error7 != null) {
                    String str6 = tL_error7.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i11 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                            ConnectionsManager.getInstance(i11).sendRequest(getpassword, new v40(12, eg0Var, str5), 10);
                        } else if (tL_error7.text.contains("PHONE_NUMBER_INVALID")) {
                            fg0.m1(fg0Var2, str5, cVar, false);
                        } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_BANNED")) {
                            fg0.m1(fg0Var2, str5, cVar, true);
                        } else if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            fg0Var2.u1(0, true, null, true);
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.code != -1000) {
                            i10 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                            y4.f0(i10, tL_error7, fg0Var2, tLObject9, (String) cVar.d);
                        }
                    }
                } else if (tLObject8 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject8).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            fg0Var2.l0 = tL_help_termsOfService;
                        }
                        fg0Var2.u1(5, true, bundle2, false);
                    } else {
                        fg0Var2.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    fg0Var2.g1(bundle2, (TLRPC.auth_SentCode) tLObject8, true);
                }
                if (!fg0Var2.k0) {
                    fg0Var2.k1(false, true);
                    break;
                }
                break;
            case 12:
                TLObject tLObject10 = (TLObject) obj5;
                String str7 = (String) obj4;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj3;
                am0 am0Var = (am0) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                lm0 lm0Var = (lm0) obj;
                wm0 wm0Var = ((zl0) obj6).p.d;
                if (tLObject10 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    wm0 wm0Var2 = new wm0(6, wm0Var.y, wm0Var.F, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i12 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.o2) wm0Var2).currentAccount = i12;
                    wm0Var2.P0 = sentemailcode.length;
                    wm0Var2.a1 = wm0Var.a1;
                    wm0Var2.Y0 = wm0Var.Y0;
                    wm0Var2.x1 = am0Var;
                    wm0Var.presentFragment(wm0Var2, true);
                    break;
                } else {
                    wm0Var.M1(LocaleController.getString(R.string.PassportEmail), tL_error8.text);
                    if (lm0Var != null) {
                        lm0Var.T(tL_error8.text, str7);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj7;
                int[] iArr2 = (int[]) obj6;
                File file = (File) obj5;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                String str10 = (String) obj;
                if (iArr2[4] > 0) {
                    int i17 = iArr2[1];
                    int i18 = iArr2[2];
                    int photoSize = i17 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i17;
                    int photoSize2 = i18 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i18;
                    File w8 = a8.w(UserConfig.selectedAccount, "jpg");
                    x5 x5Var = new x5(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p6 = x5Var.p();
                    x5Var.u();
                    if (p6 != null) {
                        c10 = 4;
                        try {
                        } catch (Exception e10) {
                            e = e10;
                        }
                        try {
                            p6.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w8));
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                            w8 = null;
                            m10 = a8.o(file, w8 != null ? null : w8.getAbsolutePath(), iArr2[c10]);
                            m10.k0 = i17;
                            m10.l0 = i18;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            c2Var.c(500L);
                        }
                    } else {
                        c10 = 4;
                    }
                    m10 = a8.o(file, w8 != null ? null : w8.getAbsolutePath(), iArr2[c10]);
                    m10.k0 = i17;
                    m10.l0 = i18;
                    m10.A();
                } else {
                    m10 = a8.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str8 != null) {
                        m10.C0 = str8;
                    }
                    if (!TextUtils.isEmpty(str9) && UserConfig.getInstance(y0Var.I).isPremium()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        yf.m0 m0Var = new yf.m0();
                        mediaEntity.linkSettings = m0Var;
                        m0Var.c = str9;
                        if (str10 != null) {
                            m0Var.a |= 2;
                            m0Var.b = str10;
                        }
                        m10.T0.add(mediaEntity);
                    }
                    wb.E(y0Var.S, UserConfig.selectedAccount).U(null, m10);
                    c2Var.c(500L);
                    break;
                } else {
                    c2Var.c(500L);
                }
                break;
        }
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i9) {
        this.a = i9;
        this.b = obj;
        this.h = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.n = obj7;
    }

    public /* synthetic */ k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.h = notificationCenterDelegate;
        this.b = tL_error;
        this.c = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.n = obj4;
    }

    public /* synthetic */ k0(cn cnVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.h = cnVar;
        this.d = c2Var;
        this.c = tLObject;
        this.e = hashSet;
        this.f = tL_inputGroupCallInviteMessage;
        this.n = messageObject;
        this.b = tL_error;
    }

    public /* synthetic */ k0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = 9;
        this.h = launchActivity;
        this.d = c2Var;
        this.b = tL_error;
        this.e = str;
        this.f = bundle;
        this.c = tLObject;
        this.n = sendconfirmphonecode;
    }

    public /* synthetic */ k0(zl0 zl0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, am0 am0Var, TLRPC.TL_error tL_error, lm0 lm0Var) {
        this.a = 12;
        this.h = zl0Var;
        this.c = tLObject;
        this.d = str;
        this.e = tL_secureRequiredType;
        this.f = am0Var;
        this.b = tL_error;
        this.n = lm0Var;
    }
}
