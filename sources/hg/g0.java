package hg;

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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import lh.i5;
import mh.eb;
import mh.q5;
import mh.t7;
import mh.y5;
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
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af;
import org.telegram.ui.b30;
import org.telegram.ui.bu;
import org.telegram.ui.fg;
import org.telegram.ui.fn0;
import org.telegram.ui.hm0;
import org.telegram.ui.im0;
import org.telegram.ui.jn;
import org.telegram.ui.lo0;
import org.telegram.ui.ng0;
import org.telegram.ui.og0;
import org.telegram.ui.tb0;
import org.telegram.ui.tm0;
import org.telegram.ui.wd;
import org.telegram.ui.xf0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.ca;
import qh.s6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.b = obj;
        this.h = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.n = obj7;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        lo0 lo0Var;
        lo0 lo0Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        s6 m9;
        int i14 = this.a;
        int i15 = 7;
        boolean z4 = false;
        int i16 = 1;
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
                t0 t0Var = (t0) obj6;
                TLObject tLObject = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                t0 t0Var2 = (t0) obj;
                if (tL_error != null) {
                    t0Var.run(tL_error);
                    break;
                } else {
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        lo0Var = new lo0(paymentForm, tL_inputInvoicePremiumGiftCode, p2Var);
                    } else {
                        lo0Var = tLObject instanceof TLRPC.PaymentReceipt ? new lo0((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (lo0Var != null) {
                        lo0Var.W0 = new c1.b(14, t0Var2, t0Var);
                        LaunchActivity.R().showAsSheet(lo0Var, new org.telegram.ui.ActionBar.n2());
                        break;
                    } else {
                        t0Var.run(null);
                        break;
                    }
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj7;
                Utilities.Callback callback = (Utilities.Callback) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                MessagesController messagesController2 = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    break;
                } else {
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                        paymentForm2.invoice.recurring = true;
                        messagesController2.putUsers(paymentForm2.users, false);
                        lo0Var2 = new lo0(paymentForm2, tL_inputInvoicePremiumGiftCode2, p2Var2);
                    } else {
                        lo0Var2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new lo0((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (lo0Var2 != null) {
                        lo0Var2.W0 = new c1.b(15, callback2, callback);
                        LaunchActivity.R().showAsSheet(lo0Var2, new org.telegram.ui.ActionBar.n2());
                        break;
                    } else {
                        callback.run(null);
                        break;
                    }
                }
            case 2:
                ((boolean[]) obj6)[0] = true;
                ((t7) obj7).Z((String) obj5, (TLRPC.ChatInvite) obj4, new q5((boolean[]) obj3, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 3:
                t7 t7Var = (t7) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                qc qcVar = (qc) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    t7Var.a0(messageObject, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, callback3);
                    break;
                } else {
                    callback3.run(Boolean.FALSE);
                    yh.s(R.string.UnknownErrorCode, new Object[]{tL_error3 != null ? tL_error3.text : "FAILED_GETTING_FORM"}, qcVar, R.raw.error, 36);
                    break;
                }
            case 4:
                t7 t7Var2 = (t7) obj7;
                List list = (List) obj6;
                i5 i5Var = (i5) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                p2.h hVar = (p2.h) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new y5(i5Var, i16));
                    break;
                } else {
                    p2.m mVar = (p2.m) list.get(0);
                    p2.j a2 = mVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new y5(i5Var, 2));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(t7Var2.a).sendRequest(tL_payments_canPurchaseStore, new i0(mVar, hVar, (Utilities.Callback2) i5Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGift, list, 3));
                        break;
                    }
                }
            case 5:
                eb ebVar = (eb) obj7;
                oh.o0[] o0VarArr = (oh.o0[]) obj6;
                int[] iArr = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                ng.r0 r0Var = (ng.r0) obj2;
                ng.o0 o0Var = (ng.o0) obj;
                if (ebVar.d) {
                    oh.o0 o0Var2 = o0VarArr[0];
                    if (o0Var2 == null) {
                        o0Var2 = ebVar.K.d(ebVar.L);
                        o0VarArr[0] = o0Var2;
                    }
                    if (o0Var2 != null) {
                        o0Var2.setDrawStar(false);
                        o0Var2.getLocationInWindow(iArr);
                        TextView textView = o0Var2.B;
                        oq[] oqVarArr = o0Var2.D;
                        if (oqVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + oqVarArr[0].translateX;
                            float y10 = textView.getY() + textView.getPaddingTop() + oqVarArr[0].translateY;
                            rectF.set(x10, y10, r2.drawable.getBounds().width() + x10, oqVarArr[0].drawable.getBounds().height() + y10);
                        }
                        rectF.offset(iArr[0], iArr[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr);
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr[0] + r0Var.c + o0Var.x, ((o0Var.B - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr[1] + r0Var.d + o0Var.y, AndroidUtilities.dp(26.0f) + iArr[0] + r0Var.c + o0Var.x, ((AndroidUtilities.dp(22.0f) + o0Var.B) / 2.0f) + iArr[1] + r0Var.d + o0Var.y);
                    break;
                }
                break;
            case 6:
                xn xnVar = (xn) obj7;
                MessageObject messageObject2 = (MessageObject) obj5;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                jm0 jm0Var = (jm0) obj;
                xnVar.getClass();
                ((q70) obj6).n0 = true;
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    str = t1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject2.messageText)) {
                    str = t1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(xnVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                jm0Var.dismiss();
                break;
            case 7:
                xn xnVar2 = (xn) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                TLObject tLObject4 = (TLObject) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                fg fgVar = (fg) obj3;
                String str2 = (String) obj2;
                af.f fVar = (af.f) obj;
                if (tL_error4 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error4.text)) {
                    z4 = true;
                }
                if (tLObject4 != null || (tL_error4 == null && (tLObject5 instanceof TLRPC.TL_boolTrue))) {
                    fgVar.run(tLObject4, Boolean.valueOf(z4));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    fVar.b = new af(xnVar2, xnVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new wd(xnVar2, fVar, fgVar, z4, 1)), i15);
                    fVar.d();
                    break;
                }
                break;
            case 8:
                TLObject tLObject6 = (TLObject) obj5;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject3 = (MessageObject) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj7;
                xn xnVar3 = ((jn) obj6).a;
                ((org.telegram.ui.ActionBar.d2) obj4).dismiss();
                if (tLObject6 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject6;
                    xnVar3.getMessagesController().putUsers(groupcall.users, false);
                    xnVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        xnVar3.showDialog(new bu(xnVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = xnVar3.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.p2) xnVar3).currentAccount;
                        org.telegram.ui.Components.voip.g2.h(parentActivity, i10, tL_inputGroupCallInviteMessage, messageObject3.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error5 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error5.text)) {
                    if (tL_error5 != null) {
                        qc.a0(xnVar3).d0(tL_error5, false);
                        break;
                    }
                } else {
                    xnVar3.showDialog(new bu(xnVar3.getParentActivity(), hashSet));
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
                Pattern pattern = LaunchActivity.y1;
                ((org.telegram.ui.ActionBar.d2) obj4).dismiss();
                if (tL_error6 == null) {
                    og0 og0Var = new og0();
                    og0Var.D = str3;
                    og0Var.E = bundle;
                    og0Var.F = (TLRPC.TL_auth_sentCode) tLObject7;
                    og0Var.C = 1;
                    launchActivity.p0(og0Var);
                    break;
                } else {
                    z4.f0(launchActivity.L, tL_error6, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 10:
                xf0 xf0Var = (xf0) obj7;
                List<Purchase> list2 = (List) obj5;
                String str4 = (String) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj2;
                b30 b30Var = (b30) obj;
                if (((p2.h) obj6).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            xf0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new e0(xf0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, b30Var, 10), 74);
                            break;
                        }
                    }
                }
                b30Var.run();
                break;
            case 11:
                ng0 ng0Var = (ng0) obj6;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                TLObject tLObject8 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str5 = (String) obj3;
                l7.w0 w0Var = (l7.w0) obj2;
                TLObject tLObject9 = (TLObject) obj;
                og0 og0Var2 = ng0Var.S;
                ng0Var.H = false;
                int i17 = 5;
                if (tL_error7 != null) {
                    String str6 = tL_error7.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new tb0(i17, ng0Var, str5), 10);
                        } else if (tL_error7.text.contains("PHONE_NUMBER_INVALID")) {
                            og0.m1(og0Var2, str5, w0Var, false);
                        } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_BANNED")) {
                            og0.m1(og0Var2, str5, w0Var, true);
                        } else if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            og0Var2.u1(0, true, null, true);
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.p2) og0Var2).currentAccount;
                            z4.f0(i11, tL_error7, og0Var2, tLObject9, (String) w0Var.d);
                        }
                    }
                } else if (tLObject8 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject8).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            og0Var2.m0 = tL_help_termsOfService;
                        }
                        og0Var2.u1(5, true, bundle2, false);
                    } else {
                        og0Var2.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    og0Var2.g1(bundle2, (TLRPC.auth_SentCode) tLObject8, true);
                }
                if (!og0Var2.l0) {
                    og0Var2.k1(false, true);
                    break;
                }
                break;
            case 12:
                TLObject tLObject10 = (TLObject) obj5;
                String str7 = (String) obj4;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj3;
                im0 im0Var = (im0) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                tm0 tm0Var = (tm0) obj;
                fn0 fn0Var = ((hm0) obj6).p.d;
                if (tLObject10 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    fn0 fn0Var2 = new fn0(6, fn0Var.y, fn0Var.G, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.p2) fn0Var2).currentAccount = i13;
                    fn0Var2.Q0 = sentemailcode.length;
                    fn0Var2.b1 = fn0Var.b1;
                    fn0Var2.Z0 = fn0Var.Z0;
                    fn0Var2.y1 = im0Var;
                    fn0Var.presentFragment(fn0Var2, true);
                    break;
                } else {
                    fn0Var.M1(LocaleController.getString(R.string.PassportEmail), tL_error8.text);
                    if (tm0Var != null) {
                        tm0Var.C(tL_error8.text, str7);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj7;
                int[] iArr2 = (int[]) obj6;
                File file = (File) obj5;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                String str10 = (String) obj;
                if (iArr2[4] > 0) {
                    int i18 = iArr2[1];
                    int i19 = iArr2[2];
                    int photoSize = i18 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i18;
                    int photoSize2 = i19 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i19;
                    File w10 = s6.w(UserConfig.selectedAccount, "jpg");
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p10 = y5Var.p();
                    y5Var.u();
                    if (p10 != null) {
                        try {
                        } catch (Exception e6) {
                            e = e6;
                        }
                        try {
                            p10.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w10));
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            w10 = null;
                            m9 = s6.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                            m9.k0 = i18;
                            m9.l0 = i19;
                            m9.A();
                            if (m9.k0 <= 0) {
                            }
                            d2Var.c(500L);
                        }
                    }
                    m9 = s6.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                    m9.k0 = i18;
                    m9.l0 = i19;
                    m9.A();
                } else {
                    m9 = s6.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
                }
                if (m9.k0 <= 0 && m9.l0 > 0) {
                    if (str8 != null) {
                        m9.C0 = str8;
                    }
                    if (!TextUtils.isEmpty(str9) && UserConfig.getInstance(a1Var.J).isPremium()) {
                        if (m9.T0 == null) {
                            m9.T0 = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        eg.d1 d1Var = new eg.d1();
                        mediaEntity.linkSettings = d1Var;
                        d1Var.c = str9;
                        if (str10 != null) {
                            d1Var.a |= 2;
                            d1Var.b = str10;
                        }
                        m9.T0.add(mediaEntity);
                    }
                    ca.E(a1Var.T, UserConfig.selectedAccount).U(null, m9);
                    d2Var.c(500L);
                    break;
                } else {
                    d2Var.c(500L);
                }
                break;
        }
    }

    public /* synthetic */ g0(t7 t7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, qc qcVar, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.h = t7Var;
        this.c = tLObject;
        this.d = messageObject;
        this.e = inputInvoice;
        this.f = callback;
        this.n = qcVar;
        this.b = tL_error;
    }

    public /* synthetic */ g0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.h = notificationCenterDelegate;
        this.b = tL_error;
        this.c = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.n = obj4;
    }

    public /* synthetic */ g0(jn jnVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.h = jnVar;
        this.d = d2Var;
        this.c = tLObject;
        this.e = hashSet;
        this.f = tL_inputGroupCallInviteMessage;
        this.n = messageObject;
        this.b = tL_error;
    }

    public /* synthetic */ g0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = 9;
        this.h = launchActivity;
        this.d = d2Var;
        this.b = tL_error;
        this.e = str;
        this.f = bundle;
        this.c = tLObject;
        this.n = sendconfirmphonecode;
    }

    public /* synthetic */ g0(hm0 hm0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, im0 im0Var, TLRPC.TL_error tL_error, tm0 tm0Var) {
        this.a = 12;
        this.h = hm0Var;
        this.c = tLObject;
        this.d = str;
        this.e = tL_secureRequiredType;
        this.f = im0Var;
        this.b = tL_error;
        this.n = tm0Var;
    }
}
