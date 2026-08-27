package cg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import gh.p5;
import hh.a6;
import hh.jb;
import hh.s5;
import hh.u7;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import lh.sb;
import lh.z7;
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
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.am0;
import org.telegram.ui.bm0;
import org.telegram.ui.cg;
import org.telegram.ui.dn;
import org.telegram.ui.do0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.mm0;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.v80;
import org.telegram.ui.ve;
import org.telegram.ui.vt;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h0(u7 u7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, mc mcVar, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.h = u7Var;
        this.c = tLObject;
        this.d = messageObject;
        this.e = inputInvoice;
        this.f = callback;
        this.n = mcVar;
        this.b = tL_error;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        do0 do0Var;
        do0 do0Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        z7 m10;
        int i14 = this.a;
        int i15 = 9;
        int i16 = 7;
        boolean z10 = false;
        int i17 = 1;
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
                v0 v0Var = (v0) obj6;
                TLObject tLObject = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                v0 v0Var2 = (v0) obj;
                if (tL_error != null) {
                    v0Var.run(tL_error);
                    break;
                } else {
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        do0Var = new do0(paymentForm, tL_inputInvoicePremiumGiftCode, n2Var);
                    } else {
                        do0Var = tLObject instanceof TLRPC.PaymentReceipt ? new do0((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (do0Var != null) {
                        do0Var.V0 = new ag.h0(8, v0Var2, v0Var);
                        LaunchActivity.R().showAsSheet(do0Var, new org.telegram.ui.ActionBar.l2());
                        break;
                    } else {
                        v0Var.run(null);
                        break;
                    }
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj7;
                Utilities.Callback callback = (Utilities.Callback) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                MessagesController messagesController2 = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    break;
                } else {
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                        paymentForm2.invoice.recurring = true;
                        messagesController2.putUsers(paymentForm2.users, false);
                        do0Var2 = new do0(paymentForm2, tL_inputInvoicePremiumGiftCode2, n2Var2);
                    } else {
                        do0Var2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new do0((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (do0Var2 != null) {
                        do0Var2.V0 = new ag.h0(i15, callback2, callback);
                        LaunchActivity.R().showAsSheet(do0Var2, new org.telegram.ui.ActionBar.l2());
                        break;
                    } else {
                        callback.run(null);
                        break;
                    }
                }
            case 2:
                ((boolean[]) obj6)[0] = true;
                ((u7) obj7).Z((String) obj5, (TLRPC.ChatInvite) obj4, new s5((boolean[]) obj3, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 3:
                u7 u7Var = (u7) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                mc mcVar = (mc) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    u7Var.a0(messageObject, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, callback3);
                    break;
                } else {
                    callback3.run(Boolean.FALSE);
                    pa.r(R.string.UnknownErrorCode, new Object[]{tL_error3 != null ? tL_error3.text : "FAILED_GETTING_FORM"}, mcVar, R.raw.error, 36);
                    break;
                }
            case 4:
                u7 u7Var2 = (u7) obj7;
                List list = (List) obj6;
                p5 p5Var = (p5) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                n2.g gVar = (n2.g) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new a6(p5Var, i17));
                    break;
                } else {
                    n2.l lVar = (n2.l) list.get(0);
                    n2.i a2 = lVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new a6(p5Var, 2));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(u7Var2.a).sendRequest(tL_payments_canPurchaseStore, new j0(lVar, gVar, (Utilities.Callback2) p5Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGift, list, 3));
                        break;
                    }
                }
            case 5:
                jb jbVar = (jb) obj7;
                jh.n0[] n0VarArr = (jh.n0[]) obj6;
                int[] iArr = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                ig.r0 r0Var = (ig.r0) obj2;
                ig.o0 o0Var = (ig.o0) obj;
                if (jbVar.d) {
                    jh.n0 n0Var = n0VarArr[0];
                    if (n0Var == null) {
                        n0Var = jbVar.J.d(jbVar.K);
                        n0VarArr[0] = n0Var;
                    }
                    if (n0Var != null) {
                        n0Var.setDrawStar(false);
                        n0Var.getLocationInWindow(iArr);
                        TextView textView = n0Var.A;
                        cq[] cqVarArr = n0Var.C;
                        if (cqVarArr[0] != null && textView.getLayout() != null) {
                            float x8 = textView.getX() + textView.getPaddingLeft() + cqVarArr[0].translateX;
                            float y10 = textView.getY() + textView.getPaddingTop() + cqVarArr[0].translateY;
                            rectF.set(x8, y10, r2.drawable.getBounds().width() + x8, cqVarArr[0].drawable.getBounds().height() + y10);
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
                rn rnVar = (rn) obj7;
                MessageObject messageObject2 = (MessageObject) obj5;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                ol0 ol0Var = (ol0) obj;
                rnVar.getClass();
                ((b70) obj6).n0 = true;
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    str = s1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject2.messageText)) {
                    str = s1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(rnVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                ol0Var.dismiss();
                break;
            case 7:
                rn rnVar2 = (rn) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                TLObject tLObject4 = (TLObject) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                cg cgVar = (cg) obj3;
                String str2 = (String) obj2;
                we.d dVar = (we.d) obj;
                if (tL_error4 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error4.text)) {
                    z10 = true;
                }
                if (tLObject4 != null || (tL_error4 == null && (tLObject5 instanceof TLRPC.TL_boolTrue))) {
                    cgVar.run(tLObject4, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    dVar.b = new ve(rnVar2, rnVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new lh.r1(rnVar2, dVar, cgVar, z10, 2)), i16);
                    dVar.d();
                    break;
                }
            case 8:
                TLObject tLObject6 = (TLObject) obj5;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject3 = (MessageObject) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj7;
                rn rnVar3 = ((dn) obj6).a;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (tLObject6 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject6;
                    rnVar3.getMessagesController().putUsers(groupcall.users, false);
                    rnVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        rnVar3.showDialog(new vt(rnVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = rnVar3.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) rnVar3).currentAccount;
                        org.telegram.ui.Components.voip.e2.h(parentActivity, i10, tL_inputGroupCallInviteMessage, messageObject3.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error5 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error5.text)) {
                    if (tL_error5 != null) {
                        mc.a0(rnVar3).d0(tL_error5, false);
                        break;
                    }
                } else {
                    rnVar3.showDialog(new vt(rnVar3.getParentActivity(), hashSet));
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
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (tL_error6 == null) {
                    ig0 ig0Var = new ig0();
                    ig0Var.C = str3;
                    ig0Var.D = bundle;
                    ig0Var.E = (TLRPC.TL_auth_sentCode) tLObject7;
                    ig0Var.B = 1;
                    launchActivity.p0(ig0Var);
                    break;
                } else {
                    y4.f0(launchActivity.K, tL_error6, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 10:
                rf0 rf0Var = (rf0) obj7;
                List<Purchase> list2 = (List) obj5;
                String str4 = (String) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj2;
                l11 l11Var = (l11) obj;
                if (((n2.g) obj6).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            rf0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new e0(rf0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, l11Var, 11), 74);
                            break;
                        }
                    }
                }
                l11Var.run();
                break;
            case 11:
                hg0 hg0Var = (hg0) obj6;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                TLObject tLObject8 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str5 = (String) obj3;
                j9.a aVar = (j9.a) obj2;
                TLObject tLObject9 = (TLObject) obj;
                ig0 ig0Var2 = hg0Var.R;
                hg0Var.G = false;
                if (tL_error7 != null) {
                    String str6 = tL_error7.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new v80(i15, hg0Var, str5), 10);
                        } else if (tL_error7.text.contains("PHONE_NUMBER_INVALID")) {
                            ig0.m1(ig0Var2, str5, aVar, false);
                        } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_BANNED")) {
                            ig0.m1(ig0Var2, str5, aVar, true);
                        } else if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            ig0Var2.u1(0, true, null, true);
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount;
                            y4.f0(i11, tL_error7, ig0Var2, tLObject9, (String) aVar.b);
                        }
                    }
                } else if (tLObject8 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject8).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ig0Var2.l0 = tL_help_termsOfService;
                        }
                        ig0Var2.u1(5, true, bundle2, false);
                    } else {
                        ig0Var2.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    ig0Var2.g1(bundle2, (TLRPC.auth_SentCode) tLObject8, true);
                }
                if (!ig0Var2.k0) {
                    ig0Var2.k1(false, true);
                    break;
                }
                break;
            case 12:
                TLObject tLObject10 = (TLObject) obj5;
                String str7 = (String) obj4;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj3;
                bm0 bm0Var = (bm0) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                mm0 mm0Var = (mm0) obj;
                xm0 xm0Var = ((am0) obj6).p.d;
                if (tLObject10 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    xm0 xm0Var2 = new xm0(6, xm0Var.y, xm0Var.F, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount = i13;
                    xm0Var2.P0 = sentemailcode.length;
                    xm0Var2.a1 = xm0Var.a1;
                    xm0Var2.Y0 = xm0Var.Y0;
                    xm0Var2.x1 = bm0Var;
                    xm0Var.presentFragment(xm0Var2, true);
                    break;
                } else {
                    xm0Var.M1(LocaleController.getString(R.string.PassportEmail), tL_error8.text);
                    if (mm0Var != null) {
                        mm0Var.S(tL_error8.text, str7);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj7;
                int[] iArr2 = (int[]) obj6;
                File file = (File) obj5;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                String str10 = (String) obj;
                if (iArr2[4] > 0) {
                    int i18 = iArr2[1];
                    int i19 = iArr2[2];
                    int photoSize = i18 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i18;
                    int photoSize2 = i19 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i19;
                    File w10 = z7.w(UserConfig.selectedAccount, "jpg");
                    x5 x5Var = new x5(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p6 = x5Var.p();
                    x5Var.u();
                    if (p6 != null) {
                        try {
                        } catch (Exception e9) {
                            e = e9;
                        }
                        try {
                            p6.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w10));
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            w10 = null;
                            m10 = z7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                            m10.k0 = i18;
                            m10.l0 = i19;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            b2Var.c(500L);
                        }
                    }
                    m10 = z7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                    m10.k0 = i18;
                    m10.l0 = i19;
                    m10.A();
                } else {
                    m10 = z7.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str8 != null) {
                        m10.C0 = str8;
                    }
                    if (!TextUtils.isEmpty(str9) && UserConfig.getInstance(z0Var.I).isPremium()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        zf.m0 m0Var = new zf.m0();
                        mediaEntity.linkSettings = m0Var;
                        m0Var.c = str9;
                        if (str10 != null) {
                            m0Var.a |= 2;
                            m0Var.b = str10;
                        }
                        m10.T0.add(mediaEntity);
                    }
                    sb.E(z0Var.S, UserConfig.selectedAccount).U(null, m10);
                    b2Var.c(500L);
                    break;
                } else {
                    b2Var.c(500L);
                }
                break;
        }
    }

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.b = obj;
        this.h = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.n = obj7;
    }

    public /* synthetic */ h0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.h = notificationCenterDelegate;
        this.b = tL_error;
        this.c = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.n = obj4;
    }

    public /* synthetic */ h0(dn dnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.h = dnVar;
        this.d = b2Var;
        this.c = tLObject;
        this.e = hashSet;
        this.f = tL_inputGroupCallInviteMessage;
        this.n = messageObject;
        this.b = tL_error;
    }

    public /* synthetic */ h0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = 9;
        this.h = launchActivity;
        this.d = b2Var;
        this.b = tL_error;
        this.e = str;
        this.f = bundle;
        this.c = tLObject;
        this.n = sendconfirmphonecode;
    }

    public /* synthetic */ h0(am0 am0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, bm0 bm0Var, TLRPC.TL_error tL_error, mm0 mm0Var) {
        this.a = 12;
        this.h = am0Var;
        this.c = tLObject;
        this.d = str;
        this.e = tL_secureRequiredType;
        this.f = bm0Var;
        this.b = tL_error;
        this.n = mm0Var;
    }
}
