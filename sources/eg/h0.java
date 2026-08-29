package eg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import ih.i5;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import jh.db;
import jh.q5;
import jh.s7;
import jh.y5;
import nh.gb;
import nh.o7;
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
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.eg0;
import org.telegram.ui.fg0;
import org.telegram.ui.fn;
import org.telegram.ui.jm0;
import org.telegram.ui.n20;
import org.telegram.ui.of0;
import org.telegram.ui.te;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.tt;
import org.telegram.ui.u80;
import org.telegram.ui.vm0;
import org.telegram.ui.xl0;
import org.telegram.ui.zf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        bo0 bo0Var;
        bo0 bo0Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        o7 m10;
        int i14 = this.a;
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
        switch (i14) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj7;
                u0 u0Var = (u0) obj6;
                TLObject tLObject = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                u0 u0Var2 = (u0) obj;
                if (tL_error != null) {
                    u0Var.run(tL_error);
                    break;
                } else {
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        bo0Var = new bo0(paymentForm, tL_inputInvoicePremiumGiftCode, o2Var);
                    } else {
                        bo0Var = tLObject instanceof TLRPC.PaymentReceipt ? new bo0((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (bo0Var != null) {
                        bo0Var.V0 = new a9.s(13, u0Var2, u0Var);
                        LaunchActivity.R().showAsSheet(bo0Var, new org.telegram.ui.ActionBar.m2());
                        break;
                    } else {
                        u0Var.run(null);
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
                        bo0Var2 = new bo0(paymentForm2, tL_inputInvoicePremiumGiftCode2, o2Var2);
                    } else {
                        bo0Var2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new bo0((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (bo0Var2 != null) {
                        bo0Var2.V0 = new a9.s(14, callback2, callback);
                        LaunchActivity.R().showAsSheet(bo0Var2, new org.telegram.ui.ActionBar.m2());
                        break;
                    } else {
                        callback.run(null);
                        break;
                    }
                }
            case 2:
                ((boolean[]) obj6)[0] = true;
                ((s7) obj7).Z((String) obj5, (TLRPC.ChatInvite) obj4, new q5((boolean[]) obj3, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 3:
                s7 s7Var = (s7) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                tc tcVar = (tc) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    s7Var.a0(messageObject, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, callback3);
                    break;
                } else {
                    callback3.run(Boolean.FALSE);
                    th.r(R.string.UnknownErrorCode, new Object[]{tL_error3 != null ? tL_error3.text : "FAILED_GETTING_FORM"}, tcVar, R.raw.error, 36);
                    break;
                }
            case 4:
                s7 s7Var2 = (s7) obj7;
                List list = (List) obj6;
                i5 i5Var = (i5) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                p2.g gVar = (p2.g) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new y5(i5Var, i16));
                    break;
                } else {
                    p2.l lVar = (p2.l) list.get(0);
                    p2.i a2 = lVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new y5(i5Var, 2));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(s7Var2.a).sendRequest(tL_payments_canPurchaseStore, new j0(lVar, gVar, (Utilities.Callback2) i5Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGift, list, 3));
                        break;
                    }
                }
            case 5:
                db dbVar = (db) obj7;
                lh.n0[] n0VarArr = (lh.n0[]) obj6;
                int[] iArr = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                kg.r0 r0Var = (kg.r0) obj2;
                kg.o0 o0Var = (kg.o0) obj;
                if (dbVar.d) {
                    lh.n0 n0Var = n0VarArr[0];
                    if (n0Var == null) {
                        n0Var = dbVar.J.d(dbVar.K);
                        n0VarArr[0] = n0Var;
                    }
                    if (n0Var != null) {
                        n0Var.setDrawStar(false);
                        n0Var.getLocationInWindow(iArr);
                        TextView textView = n0Var.A;
                        iq[] iqVarArr = n0Var.C;
                        if (iqVarArr[0] != null && textView.getLayout() != null) {
                            float x4 = textView.getX() + textView.getPaddingLeft() + iqVarArr[0].translateX;
                            float y8 = textView.getY() + textView.getPaddingTop() + iqVarArr[0].translateY;
                            rectF.set(x4, y8, r2.drawable.getBounds().width() + x4, iqVarArr[0].drawable.getBounds().height() + y8);
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
                tn tnVar = (tn) obj7;
                MessageObject messageObject2 = (MessageObject) obj5;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                yl0 yl0Var = (yl0) obj;
                tnVar.getClass();
                ((j70) obj6).n0 = true;
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    str = s1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject2.messageText)) {
                    str = s1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(tnVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                yl0Var.dismiss();
                break;
            case 7:
                tn tnVar2 = (tn) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                TLObject tLObject4 = (TLObject) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                zf zfVar = (zf) obj3;
                String str2 = (String) obj2;
                ye.c cVar = (ye.c) obj;
                if (tL_error4 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error4.text)) {
                    z10 = true;
                }
                if (tLObject4 != null || (tL_error4 == null && (tLObject5 instanceof TLRPC.TL_boolTrue))) {
                    zfVar.run(tLObject4, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    cVar.b = new te(tnVar2, tnVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new nh.q1(tnVar2, cVar, zfVar, z10, 2)), i15);
                    cVar.d();
                    break;
                }
                break;
            case 8:
                TLObject tLObject6 = (TLObject) obj5;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject3 = (MessageObject) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj7;
                tn tnVar3 = ((fn) obj6).a;
                ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                if (tLObject6 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject6;
                    tnVar3.getMessagesController().putUsers(groupcall.users, false);
                    tnVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        tnVar3.showDialog(new tt(tnVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = tnVar3.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.o2) tnVar3).currentAccount;
                        org.telegram.ui.Components.voip.h2.h(parentActivity, i10, tL_inputGroupCallInviteMessage, messageObject3.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error5 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error5.text)) {
                    if (tL_error5 != null) {
                        tc.a0(tnVar3).d0(tL_error5, false);
                        break;
                    }
                } else {
                    tnVar3.showDialog(new tt(tnVar3.getParentActivity(), hashSet));
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
                    c5.f0(launchActivity.K, tL_error6, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 10:
                of0 of0Var = (of0) obj7;
                List<Purchase> list2 = (List) obj5;
                String str4 = (String) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj2;
                n20 n20Var = (n20) obj;
                if (((p2.g) obj6).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            of0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new f0(of0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, n20Var, 11), 74);
                            break;
                        }
                    }
                }
                n20Var.run();
                break;
            case 11:
                eg0 eg0Var = (eg0) obj6;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                TLObject tLObject8 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str5 = (String) obj3;
                l3.g0 g0Var = (l3.g0) obj2;
                TLObject tLObject9 = (TLObject) obj;
                fg0 fg0Var2 = eg0Var.R;
                eg0Var.G = false;
                if (tL_error7 != null) {
                    String str6 = tL_error7.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new u80(8, eg0Var, str5), 10);
                        } else if (tL_error7.text.contains("PHONE_NUMBER_INVALID")) {
                            fg0.m1(fg0Var2, str5, g0Var, false);
                        } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_BANNED")) {
                            fg0.m1(fg0Var2, str5, g0Var, true);
                        } else if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            fg0Var2.u1(0, true, null, true);
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                            c5.f0(i11, tL_error7, fg0Var2, tLObject9, (String) g0Var.d);
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
                org.telegram.ui.yl0 yl0Var2 = (org.telegram.ui.yl0) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                jm0 jm0Var = (jm0) obj;
                vm0 vm0Var = ((xl0) obj6).p.d;
                if (tLObject10 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    vm0 vm0Var2 = new vm0(6, vm0Var.y, vm0Var.F, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.o2) vm0Var2).currentAccount = i13;
                    vm0Var2.P0 = sentemailcode.length;
                    vm0Var2.a1 = vm0Var.a1;
                    vm0Var2.Y0 = vm0Var.Y0;
                    vm0Var2.x1 = yl0Var2;
                    vm0Var.presentFragment(vm0Var2, true);
                    break;
                } else {
                    vm0Var.M1(LocaleController.getString(R.string.PassportEmail), tL_error8.text);
                    if (jm0Var != null) {
                        jm0Var.M(tL_error8.text, str7);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj7;
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
                    File w10 = o7.w(UserConfig.selectedAccount, "jpg");
                    c6 c6Var = new c6(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p10 = c6Var.p();
                    c6Var.u();
                    if (p10 != null) {
                        try {
                        } catch (Exception e10) {
                            e = e10;
                        }
                        try {
                            p10.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w10));
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                            w10 = null;
                            m10 = o7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                            m10.k0 = i17;
                            m10.l0 = i18;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            c2Var.c(500L);
                        }
                    }
                    m10 = o7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                    m10.k0 = i17;
                    m10.l0 = i18;
                    m10.A();
                } else {
                    m10 = o7.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
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
                        bg.h1 h1Var = new bg.h1();
                        mediaEntity.linkSettings = h1Var;
                        h1Var.c = str9;
                        if (str10 != null) {
                            h1Var.a |= 2;
                            h1Var.b = str10;
                        }
                        m10.T0.add(mediaEntity);
                    }
                    gb.E(z0Var.S, UserConfig.selectedAccount).U(null, m10);
                    c2Var.c(500L);
                    break;
                } else {
                    c2Var.c(500L);
                }
                break;
        }
    }

    public /* synthetic */ h0(s7 s7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, tc tcVar, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.h = s7Var;
        this.c = tLObject;
        this.d = messageObject;
        this.e = inputInvoice;
        this.f = callback;
        this.n = tcVar;
        this.b = tL_error;
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

    public /* synthetic */ h0(fn fnVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.h = fnVar;
        this.d = c2Var;
        this.c = tLObject;
        this.e = hashSet;
        this.f = tL_inputGroupCallInviteMessage;
        this.n = messageObject;
        this.b = tL_error;
    }

    public /* synthetic */ h0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.a = 9;
        this.h = launchActivity;
        this.d = c2Var;
        this.b = tL_error;
        this.e = str;
        this.f = bundle;
        this.c = tLObject;
        this.n = sendconfirmphonecode;
    }

    public /* synthetic */ h0(xl0 xl0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, org.telegram.ui.yl0 yl0Var, TLRPC.TL_error tL_error, jm0 jm0Var) {
        this.a = 12;
        this.h = xl0Var;
        this.c = tLObject;
        this.d = str;
        this.e = tL_secureRequiredType;
        this.f = yl0Var;
        this.b = tL_error;
        this.n = jm0Var;
    }
}
