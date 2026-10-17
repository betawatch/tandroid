package ai;

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
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.am0;
import org.telegram.ui.bm0;
import org.telegram.ui.df;
import org.telegram.ui.eg0;
import org.telegram.ui.en;
import org.telegram.ui.fg0;
import org.telegram.ui.fo0;
import org.telegram.ui.mm0;
import org.telegram.ui.of0;
import org.telegram.ui.sn;
import org.telegram.ui.st;
import org.telegram.ui.xm0;
import org.telegram.ui.z40;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ u7(fa faVar, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = faVar;
        this.d = tLObject;
        this.e = messageObject;
        this.f = inputInvoice;
        this.c = callback;
        this.h = xcVar;
        this.n = tL_error;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        ei.a8 m10;
        fo0 fo0Var;
        fo0 fo0Var2;
        int i14 = this.a;
        int i15 = 7;
        int i16 = 2;
        boolean z10 = false;
        int i17 = 1;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i14) {
            case 0:
                ((boolean[]) obj5)[0] = true;
                ((fa) obj7).Z((String) obj3, (TLRPC.ChatInvite) obj2, new w7((boolean[]) obj4, (Utilities.Callback2) obj, (Utilities.Callback) obj6));
                break;
            case 1:
                fa faVar = (fa) obj7;
                TLObject tLObject = (TLObject) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj6;
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    faVar.a0(messageObject, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, callback);
                    break;
                } else {
                    callback.run(Boolean.FALSE);
                    i0.a.s(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_GETTING_FORM"}, xcVar, R.raw.error, 36);
                    break;
                }
            case 2:
                fa faVar2 = (fa) obj7;
                List list = (List) obj5;
                sc scVar = (sc) obj4;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj3;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                c5.i iVar = (c5.i) obj;
                Activity activity = (Activity) obj6;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new g8(scVar, i17));
                    break;
                } else {
                    c5.o oVar = (c5.o) list.get(0);
                    c5.l a2 = oVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new g8(scVar, i16));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(faVar2.a).sendRequest(tL_payments_canPurchaseStore, new e8(oVar, iVar, scVar, activity, tL_inputStorePaymentStarsGift, list, 1));
                        break;
                    }
                }
            case 3:
                ke keVar = (ke) obj7;
                ci.q0[] q0VarArr = (ci.q0[]) obj5;
                int[] iArr = (int[]) obj4;
                RectF rectF = (RectF) obj3;
                View view = (View) obj2;
                ah.j1 j1Var = (ah.j1) obj;
                ah.g1 g1Var = (ah.g1) obj6;
                if (keVar.d) {
                    ci.q0 q0Var = q0VarArr[0];
                    if (q0Var == null) {
                        q0Var = keVar.O.d(keVar.P);
                        q0VarArr[0] = q0Var;
                    }
                    if (q0Var != null) {
                        q0Var.setDrawStar(false);
                        q0Var.getLocationInWindow(iArr);
                        TextView textView = q0Var.E;
                        yq[] yqVarArr = q0Var.G;
                        if (yqVarArr[0] != null && textView.getLayout() != null) {
                            float x10 = textView.getX() + textView.getPaddingLeft() + yqVarArr[0].translateX;
                            float y3 = textView.getY() + textView.getPaddingTop() + yqVarArr[0].translateY;
                            rectF.set(x10, y3, r2.drawable.getBounds().width() + x10, yqVarArr[0].drawable.getBounds().height() + y3);
                        }
                        rectF.offset(iArr[0], iArr[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr);
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr[0] + j1Var.c + g1Var.x, ((g1Var.B - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr[1] + j1Var.d + g1Var.y, AndroidUtilities.dp(26.0f) + iArr[0] + j1Var.c + g1Var.x, ((AndroidUtilities.dp(22.0f) + g1Var.B) / 2.0f) + iArr[1] + j1Var.d + g1Var.y);
                    break;
                }
                break;
            case 4:
                sn snVar = (sn) obj7;
                MessageObject messageObject2 = (MessageObject) obj4;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj;
                ym0 ym0Var = (ym0) obj6;
                snVar.getClass();
                ((i80) obj5).n0 = true;
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    str = u1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject2.messageText)) {
                    str = u1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(snVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                ym0Var.dismiss();
                break;
            case 5:
                sn snVar2 = (sn) obj7;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                t3 t3Var = (t3) obj;
                String str2 = (String) obj3;
                pf.c cVar = (pf.c) obj6;
                if (tL_error2 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error2.text)) {
                    z10 = true;
                }
                if (tLObject2 != null || (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_boolTrue))) {
                    t3Var.run(tLObject2, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    cVar.b = new df(snVar2, snVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new ei.s1(snVar2, cVar, t3Var, z10, 2)), i15);
                    cVar.d();
                    break;
                }
            case 6:
                TLObject tLObject4 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject3 = (MessageObject) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj6;
                sn snVar3 = ((en) obj7).a;
                ((org.telegram.ui.ActionBar.b2) obj5).dismiss();
                if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    snVar3.getMessagesController().putUsers(groupcall.users, false);
                    snVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        snVar3.showDialog(new st(snVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = snVar3.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) snVar3).currentAccount;
                        org.telegram.ui.Components.voip.d2.g(parentActivity, i10, tL_inputGroupCallInviteMessage, messageObject3.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error3 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.xc.a0(snVar3).f0(tL_error3, false);
                        break;
                    }
                } else {
                    snVar3.showDialog(new st(snVar3.getParentActivity(), hashSet));
                    break;
                }
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                String str3 = (String) obj3;
                Bundle bundle = (Bundle) obj2;
                TLObject tLObject5 = (TLObject) obj;
                TL_account.sendConfirmPhoneCode sendconfirmphonecode = (TL_account.sendConfirmPhoneCode) obj6;
                Pattern pattern = LaunchActivity.C1;
                ((org.telegram.ui.ActionBar.b2) obj5).dismiss();
                if (tL_error4 == null) {
                    fg0 fg0Var = new fg0();
                    fg0Var.G = str3;
                    fg0Var.H = bundle;
                    fg0Var.I = (TLRPC.TL_auth_sentCode) tLObject5;
                    fg0Var.F = 1;
                    launchActivity.t0(fg0Var);
                    break;
                } else {
                    org.telegram.ui.Components.f5.e0(launchActivity.O, tL_error4, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 8:
                of0 of0Var = (of0) obj7;
                List<Purchase> list2 = (List) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj;
                i90 i90Var = (i90) obj6;
                if (((c5.i) obj5).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            of0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new s9(of0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, i90Var, 9), 74);
                            break;
                        }
                    }
                }
                i90Var.run();
                break;
            case 9:
                eg0 eg0Var = (eg0) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj2;
                String str5 = (String) obj3;
                m.g3 g3Var = (m.g3) obj;
                TLObject tLObject7 = (TLObject) obj6;
                fg0 fg0Var2 = eg0Var.V;
                eg0Var.K = false;
                if (tL_error5 != null) {
                    String str6 = tL_error5.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((org.telegram.ui.ActionBar.n2) fg0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new z40(12, eg0Var, str5), 10);
                        } else if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                            fg0.m1(fg0Var2, str5, g3Var, false);
                        } else if (tL_error5.text.contains("PHONE_PASSWORD_FLOOD")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_FLOOD")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_BANNED")) {
                            fg0.m1(fg0Var2, str5, g3Var, true);
                        } else if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            fg0Var2.u1(0, true, null, true);
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error5.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.n2) fg0Var2).currentAccount;
                            org.telegram.ui.Components.f5.e0(i11, tL_error5, fg0Var2, tLObject7, (String) g3Var.d);
                        }
                    }
                } else if (tLObject6 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject6).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            fg0Var2.p0 = tL_help_termsOfService;
                        }
                        fg0Var2.u1(5, true, bundle2, false);
                    } else {
                        fg0Var2.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    fg0Var2.g1(bundle2, (TLRPC.auth_SentCode) tLObject6, true);
                }
                if (!fg0Var2.o0) {
                    fg0Var2.k1(false, true);
                    break;
                }
                break;
            case 10:
                TLObject tLObject8 = (TLObject) obj5;
                String str7 = (String) obj3;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj4;
                bm0 bm0Var = (bm0) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                mm0 mm0Var = (mm0) obj6;
                xm0 xm0Var = ((am0) obj7).p.d;
                if (tLObject8 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    xm0 xm0Var2 = new xm0(6, xm0Var.y, xm0Var.J, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount = i13;
                    xm0Var2.T0 = sentemailcode.length;
                    xm0Var2.e1 = xm0Var.e1;
                    xm0Var2.c1 = xm0Var.c1;
                    xm0Var2.B1 = bm0Var;
                    xm0Var.presentFragment(xm0Var2, true);
                    break;
                } else {
                    xm0Var.L1(LocaleController.getString(R.string.PassportEmail), tL_error6.text);
                    if (mm0Var != null) {
                        mm0Var.p(tL_error6.text, str7);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) obj7;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj5;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj4;
                String str8 = (String) obj3;
                byte[] bArr = (byte[]) obj2;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) obj6;
                f2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new l3(f2Var, str8, bArr, xVar, tonconnectsession, org.telegram.ui.Wallet.f2.r(j0Var, tonconnectsession, str8, bArr, tonconnectnexteventid.event_id), 21));
                    break;
                } catch (Exception e) {
                    xVar.run(org.telegram.ui.Wallet.f2.h("prepare disconnect", e));
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) obj7;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj5;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj4;
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) obj;
                byte[] bArr2 = c2Var.b;
                org.telegram.ui.Wallet.x xVar2 = (org.telegram.ui.Wallet.x) obj6;
                if (f2Var2.c(a2Var, tonconnectsession2, (String) obj3, (byte[]) obj2)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession2.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr2;
                    tonconnectsubmitconnectresult.body = c2Var.c;
                    tonconnectsubmitconnectresult.trace_id = a2Var.c;
                    f2Var2.f.sendRequestTyped(tonconnectsubmitconnectresult, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.k(f2Var2, c2Var, xVar2, 8));
                    break;
                } else {
                    Arrays.fill(bArr2, (byte) 0);
                    xVar2.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 13:
                org.telegram.ui.Wallet.f2 f2Var3 = (org.telegram.ui.Wallet.f2) obj7;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) obj5;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj4;
                String str9 = (String) obj3;
                byte[] bArr3 = (byte[]) obj2;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) obj;
                org.telegram.ui.Wallet.x xVar3 = (org.telegram.ui.Wallet.x) obj6;
                f2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new l8(f2Var3, a2Var2, tonconnectsession3, str9, bArr3, org.telegram.ui.Wallet.f2.p(j0Var2, tonconnectsession3, str9, bArr3, a2Var2.a, a2Var2.b, a2Var2.d, null, f2Var3.f.getCurrentTime()), xVar3, j0Var2, 8));
                    break;
                } catch (Exception e7) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.d1(xVar3, org.telegram.ui.Wallet.f2.h("prepare connect", e7), i17));
                    return;
                }
            case 14:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj7;
                int[] iArr2 = (int[]) obj5;
                File file = (File) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                String str10 = (String) obj3;
                String str11 = (String) obj;
                String str12 = (String) obj6;
                if (iArr2[4] > 0) {
                    int i18 = iArr2[1];
                    int i19 = iArr2[2];
                    int photoSize = i18 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i18;
                    int photoSize2 = i19 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i19;
                    File w9 = ei.a8.w(UserConfig.selectedAccount, "jpg");
                    org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p5 = e6Var.p();
                    e6Var.u();
                    if (p5 != null) {
                        try {
                        } catch (Exception e10) {
                            e = e10;
                        }
                        try {
                            p5.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w9));
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                            w9 = null;
                            m10 = ei.a8.o(file, w9 != null ? null : w9.getAbsolutePath(), iArr2[4]);
                            m10.k0 = i18;
                            m10.l0 = i19;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            b2Var.c(500L);
                            return;
                        }
                    }
                    m10 = ei.a8.o(file, w9 != null ? null : w9.getAbsolutePath(), iArr2[4]);
                    m10.k0 = i18;
                    m10.l0 = i19;
                    m10.A();
                } else {
                    m10 = ei.a8.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
                }
                if (m10.k0 <= 0 && m10.l0 > 0) {
                    if (str10 != null) {
                        m10.C0 = str10;
                    }
                    if (!TextUtils.isEmpty(str11) && UserConfig.getInstance(a1Var.M).isPremium()) {
                        if (m10.T0 == null) {
                            m10.T0 = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        rg.n0 n0Var = new rg.n0();
                        mediaEntity.linkSettings = n0Var;
                        n0Var.c = str11;
                        if (str12 != null) {
                            n0Var.a |= 2;
                            n0Var.b = str12;
                        }
                        m10.T0.add(mediaEntity);
                    }
                    ei.vb.D(a1Var.W, UserConfig.selectedAccount).T(null, m10);
                    b2Var.c(500L);
                    break;
                } else {
                    b2Var.c(500L);
                }
                break;
            case 15:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                ug.t tVar = (ug.t) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                ug.t tVar2 = (ug.t) obj6;
                if (tL_error7 != null) {
                    tVar.run(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        fo0Var = new fo0(paymentForm, tL_inputInvoicePremiumGiftCode, n2Var);
                    } else {
                        fo0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new fo0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (fo0Var != null) {
                        fo0Var.Z0 = new org.telegram.ui.web.c0(14, tVar2, tVar);
                        LaunchActivity.R().showAsSheet(fo0Var, new org.telegram.ui.ActionBar.l2());
                        break;
                    } else {
                        tVar.run(null);
                        break;
                    }
                }
            default:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                Utilities.Callback callback2 = (Utilities.Callback) obj6;
                TLObject tLObject10 = (TLObject) obj5;
                MessagesController messagesController2 = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Utilities.Callback callback3 = (Utilities.Callback) obj;
                if (tL_error8 != null) {
                    callback2.run(tL_error8);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        messagesController2.putUsers(paymentForm2.users, false);
                        fo0Var2 = new fo0(paymentForm2, tL_inputInvoicePremiumGiftCode2, n2Var2);
                    } else {
                        fo0Var2 = tLObject10 instanceof TLRPC.PaymentReceipt ? new fo0((TLRPC.PaymentReceipt) tLObject10) : null;
                    }
                    if (fo0Var2 != null) {
                        fo0Var2.Z0 = new org.telegram.ui.web.c0(15, callback3, callback2);
                        LaunchActivity.R().showAsSheet(fo0Var2, new org.telegram.ui.ActionBar.l2());
                        break;
                    } else {
                        callback2.run(null);
                        break;
                    }
                }
        }
    }

    public /* synthetic */ u7(fa faVar, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.a = 0;
        this.b = faVar;
        this.d = zArr;
        this.f = str;
        this.h = chatInvite;
        this.e = zArr2;
        this.n = callback2;
        this.c = callback;
    }

    public /* synthetic */ u7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
        this.c = obj7;
    }

    public /* synthetic */ u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.d = obj;
        this.e = obj2;
        this.h = obj3;
        this.f = str;
        this.n = obj4;
        this.c = obj5;
    }

    public /* synthetic */ u7(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.n2 n2Var, Utilities.Callback callback2) {
        this.a = 16;
        this.b = tL_error;
        this.c = callback;
        this.d = tLObject;
        this.e = messagesController;
        this.f = tL_inputInvoicePremiumGiftCode;
        this.h = n2Var;
        this.n = callback2;
    }

    public /* synthetic */ u7(sn snVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, t3 t3Var, String str, pf.c cVar) {
        this.a = 5;
        this.b = snVar;
        this.d = tL_error;
        this.e = tLObject;
        this.h = tLObject2;
        this.n = t3Var;
        this.f = str;
        this.c = cVar;
    }

    public /* synthetic */ u7(am0 am0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, bm0 bm0Var, TLRPC.TL_error tL_error, mm0 mm0Var) {
        this.a = 10;
        this.b = am0Var;
        this.d = tLObject;
        this.f = str;
        this.e = tL_secureRequiredType;
        this.h = bm0Var;
        this.n = tL_error;
        this.c = mm0Var;
    }
}
