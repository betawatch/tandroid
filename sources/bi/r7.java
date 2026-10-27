package bi;

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
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bh1;
import org.telegram.ui.hg0;
import org.telegram.ui.hn;
import org.telegram.ui.ig0;
import org.telegram.ui.kn0;
import org.telegram.ui.l10;
import org.telegram.ui.mm0;
import org.telegram.ui.nm0;
import org.telegram.ui.qf0;
import org.telegram.ui.ro0;
import org.telegram.ui.tt;
import org.telegram.ui.wn;
import org.telegram.ui.ym0;
import org.telegram.ui.ze;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ r7(ca caVar, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = caVar;
        this.d = tLObject;
        this.e = messageObject;
        this.f = inputInvoice;
        this.c = callback;
        this.h = wcVar;
        this.n = tL_error;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        fi.w7 m10;
        ro0 ro0Var;
        ro0 ro0Var2;
        int i14 = this.a;
        int i15 = 7;
        int i16 = 2;
        int i17 = 21;
        boolean z10 = false;
        int i18 = 1;
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
                ((ca) obj7).Z((String) obj3, (TLRPC.ChatInvite) obj2, new t7((boolean[]) obj4, (Utilities.Callback2) obj, (Utilities.Callback) obj6));
                break;
            case 1:
                ca caVar = (ca) obj7;
                TLObject tLObject = (TLObject) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj6;
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    caVar.a0(messageObject, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, callback);
                    break;
                } else {
                    callback.run(Boolean.FALSE);
                    ic.a.s(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_GETTING_FORM"}, wcVar, R.raw.error, 36);
                    break;
                }
            case 2:
                ca caVar2 = (ca) obj7;
                List list = (List) obj5;
                lc lcVar = (lc) obj4;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj3;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                d5.i iVar = (d5.i) obj;
                Activity activity = (Activity) obj6;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new d8(lcVar, i18));
                    break;
                } else {
                    d5.o oVar = (d5.o) list.get(0);
                    d5.l a2 = oVar.a();
                    if (a2 == null) {
                        AndroidUtilities.runOnUIThread(new d8(lcVar, i16));
                        break;
                    } else {
                        tL_inputStorePaymentStarsGift.currency = a2.c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(caVar2.a).sendRequest(tL_payments_canPurchaseStore, new b8(oVar, iVar, lcVar, activity, tL_inputStorePaymentStarsGift, list, 1));
                        break;
                    }
                }
            case 3:
                be beVar = (be) obj7;
                di.q0[] q0VarArr = (di.q0[]) obj5;
                int[] iArr = (int[]) obj4;
                RectF rectF = (RectF) obj3;
                View view = (View) obj2;
                bh.y0 y0Var = (bh.y0) obj;
                bh.v0 v0Var = (bh.v0) obj6;
                if (beVar.d) {
                    di.q0 q0Var = q0VarArr[0];
                    if (q0Var == null) {
                        q0Var = beVar.P.d(beVar.Q);
                        q0VarArr[0] = q0Var;
                    }
                    if (q0Var != null) {
                        q0Var.setDrawStar(false);
                        q0Var.getLocationInWindow(iArr);
                        TextView textView = q0Var.E;
                        zq[] zqVarArr = q0Var.G;
                        if (zqVarArr[0] != null && textView.getLayout() != null) {
                            float x9 = textView.getX() + textView.getPaddingLeft() + zqVarArr[0].translateX;
                            float y3 = textView.getY() + textView.getPaddingTop() + zqVarArr[0].translateY;
                            rectF.set(x9, y3, r2.drawable.getBounds().width() + x9, zqVarArr[0].drawable.getBounds().height() + y3);
                        }
                        rectF.offset(iArr[0], iArr[1]);
                        break;
                    }
                } else {
                    view.getLocationInWindow(iArr);
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr[0] + y0Var.c + v0Var.x, ((v0Var.B - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr[1] + y0Var.d + v0Var.y, AndroidUtilities.dp(26.0f) + iArr[0] + y0Var.c + v0Var.x, ((AndroidUtilities.dp(22.0f) + v0Var.B) / 2.0f) + iArr[1] + y0Var.d + v0Var.y);
                    break;
                }
                break;
            case 4:
                wn wnVar = (wn) obj7;
                MessageObject messageObject2 = (MessageObject) obj4;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                String str = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj;
                in0 in0Var = (in0) obj6;
                wnVar.getClass();
                ((l80) obj5).n0 = true;
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    str = s1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject2.messageText)) {
                    str = s1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(wnVar.getParentActivity(), tL_messageEntityFormattedDate.date * 1000, str.length() > 21 ? str.substring(0, 21) + "..." : str, str, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                in0Var.dismiss();
                break;
            case 5:
                wn wnVar2 = (wn) obj7;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                t3 t3Var = (t3) obj;
                String str2 = (String) obj3;
                qf.c cVar = (qf.c) obj6;
                if (tL_error2 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error2.text)) {
                    z10 = true;
                }
                if (tLObject2 != null || (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_boolTrue))) {
                    t3Var.run(tLObject2, Boolean.valueOf(z10));
                    break;
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str2;
                    cVar.b = new ze(wnVar2, wnVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new d4(wnVar2, cVar, t3Var, z10, 3)), i15);
                    cVar.d();
                    break;
                }
            case 6:
                TLObject tLObject4 = (TLObject) obj4;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject3 = (MessageObject) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj6;
                wn wnVar3 = ((hn) obj7).a;
                ((org.telegram.ui.ActionBar.e2) obj5).dismiss();
                if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    wnVar3.getMessagesController().putUsers(groupcall.users, false);
                    wnVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        wnVar3.showDialog(new tt(wnVar3.getParentActivity(), hashSet));
                        break;
                    } else {
                        Activity parentActivity = wnVar3.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.r2) wnVar3).currentAccount;
                        org.telegram.ui.Components.voip.g2.g(parentActivity, i10, tL_inputGroupCallInviteMessage, messageObject3.messageOwner.action.video, groupcall.call, null);
                        break;
                    }
                } else if (tL_error3 == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.wc.b0(wnVar3).g0(tL_error3, false);
                        break;
                    }
                } else {
                    wnVar3.showDialog(new tt(wnVar3.getParentActivity(), hashSet));
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
                Pattern pattern = LaunchActivity.D1;
                ((org.telegram.ui.ActionBar.e2) obj5).dismiss();
                if (tL_error4 == null) {
                    ig0 ig0Var = new ig0();
                    ig0Var.G = str3;
                    ig0Var.H = bundle;
                    ig0Var.I = (TLRPC.TL_auth_sentCode) tLObject5;
                    ig0Var.F = 1;
                    launchActivity.u0(ig0Var);
                    break;
                } else {
                    org.telegram.ui.Components.g5.e0(launchActivity.O, tL_error4, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                    break;
                }
            case 8:
                qf0 qf0Var = (qf0) obj7;
                List<Purchase> list2 = (List) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj;
                e10 e10Var = (e10) obj6;
                if (((d5.i) obj5).a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str4)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            qf0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new n9(qf0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, e10Var, 9), 74);
                            break;
                        }
                    }
                }
                e10Var.run();
                break;
            case 9:
                hg0 hg0Var = (hg0) obj7;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj2;
                String str5 = (String) obj3;
                k6.c cVar2 = (k6.c) obj;
                TLObject tLObject7 = (TLObject) obj6;
                ig0 ig0Var2 = hg0Var.a0;
                hg0Var.M = false;
                if (tL_error5 != null) {
                    String str6 = tL_error5.text;
                    if (str6 != null) {
                        if (str6.contains("SESSION_PASSWORD_NEEDED")) {
                            TL_account.getPassword getpassword = new TL_account.getPassword();
                            i12 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                            ConnectionsManager.getInstance(i12).sendRequest(getpassword, new l10(13, hg0Var, str5), 10);
                        } else if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                            ig0.r1(ig0Var2, str5, cVar2, false);
                        } else if (tL_error5.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_FLOOD")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error5.text.contains("PHONE_NUMBER_BANNED")) {
                            ig0.r1(ig0Var2, str5, cVar2, true);
                        } else if (tL_error5.text.contains("PHONE_CODE_EMPTY") || tL_error5.text.contains("PHONE_CODE_INVALID")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            ig0Var2.z1(0, true, null, true);
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error5.code != -1000) {
                            i11 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                            org.telegram.ui.Components.g5.e0(i11, tL_error5, ig0Var2, tLObject7, (String) cVar2.c);
                        }
                    }
                } else if (tLObject6 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject6).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ig0Var2.q0 = tL_help_termsOfService;
                        }
                        ig0Var2.z1(5, true, bundle2, false);
                    } else {
                        ig0Var2.t1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    ig0Var2.l1(bundle2, (TLRPC.auth_SentCode) tLObject6, true);
                }
                if (!ig0Var2.p0) {
                    ig0Var2.p1(false, true);
                    break;
                }
                break;
            case 10:
                TLObject tLObject8 = (TLObject) obj5;
                String str7 = (String) obj3;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj4;
                nm0 nm0Var = (nm0) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                ym0 ym0Var = (ym0) obj6;
                kn0 kn0Var = ((mm0) obj7).p.d;
                if (tLObject8 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    HashMap hashMap = new HashMap();
                    hashMap.put("email", str7);
                    hashMap.put("pattern", sentemailcode.email_pattern);
                    kn0 kn0Var2 = new kn0(6, kn0Var.y, kn0Var.J, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
                    i13 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
                    ((org.telegram.ui.ActionBar.r2) kn0Var2).currentAccount = i13;
                    kn0Var2.T0 = sentemailcode.length;
                    kn0Var2.e1 = kn0Var.e1;
                    kn0Var2.c1 = kn0Var.c1;
                    kn0Var2.B1 = nm0Var;
                    kn0Var.presentFragment(kn0Var2, true);
                    break;
                } else {
                    kn0Var.M1(LocaleController.getString(R.string.PassportEmail), tL_error6.text);
                    if (ym0Var != null) {
                        ym0Var.d(tL_error6.text, str7);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj7;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj5;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj4;
                String str8 = (String) obj3;
                byte[] bArr = (byte[]) obj2;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) obj6;
                e2Var.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new c3(e2Var, str8, bArr, sVar, tonconnectsession, org.telegram.ui.Wallet.e2.r(i0Var, tonconnectsession, str8, bArr, tonconnectnexteventid.event_id), 21));
                    break;
                } catch (Exception e) {
                    sVar.run(org.telegram.ui.Wallet.e2.h("prepare disconnect", e));
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) obj7;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj5;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj4;
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) obj;
                byte[] bArr2 = b2Var.b;
                org.telegram.ui.Wallet.s sVar2 = (org.telegram.ui.Wallet.s) obj6;
                if (e2Var2.c(z1Var, tonconnectsession2, (String) obj3, (byte[]) obj2)) {
                    TL_wallet.tonConnectSubmitConnectResult tonconnectsubmitconnectresult = new TL_wallet.tonConnectSubmitConnectResult();
                    tonconnectsubmitconnectresult.session_id = tonconnectsession2.id;
                    tonconnectsubmitconnectresult.challenge_answer = bArr2;
                    tonconnectsubmitconnectresult.body = b2Var.c;
                    tonconnectsubmitconnectresult.trace_id = z1Var.c;
                    e2Var2.f.sendRequestTyped(tonconnectsubmitconnectresult, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.j(e2Var2, b2Var, sVar2, 8));
                    break;
                } else {
                    Arrays.fill(bArr2, (byte) 0);
                    sVar2.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                }
            case 13:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) obj7;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) obj5;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj4;
                String str9 = (String) obj3;
                byte[] bArr3 = (byte[]) obj2;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj;
                org.telegram.ui.Wallet.s sVar3 = (org.telegram.ui.Wallet.s) obj6;
                e2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new i8(e2Var3, z1Var2, tonconnectsession3, str9, bArr3, org.telegram.ui.Wallet.e2.p(i0Var2, tonconnectsession3, str9, bArr3, z1Var2.a, z1Var2.b, z1Var2.d, null, e2Var3.f.getCurrentTime()), sVar3, i0Var2, 8));
                    break;
                } catch (Exception e10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.c1(sVar3, org.telegram.ui.Wallet.e2.h("prepare connect", e10), i18));
                    return;
                }
            case 14:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj7;
                int[] iArr2 = (int[]) obj5;
                File file = (File) obj4;
                org.telegram.ui.ActionBar.e2 e2Var4 = (org.telegram.ui.ActionBar.e2) obj2;
                String str10 = (String) obj3;
                String str11 = (String) obj;
                String str12 = (String) obj6;
                if (iArr2[4] > 0) {
                    int i19 = iArr2[1];
                    int i20 = iArr2[2];
                    int photoSize = i19 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i19;
                    int photoSize2 = i20 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i20;
                    File w10 = fi.w7.w(UserConfig.selectedAccount, "jpg");
                    org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap p10 = g6Var.p();
                    g6Var.u();
                    if (p10 != null) {
                        try {
                        } catch (Exception e11) {
                            e = e11;
                        }
                        try {
                            p10.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(w10));
                        } catch (Exception e12) {
                            e = e12;
                            FileLog.e(e);
                            w10 = null;
                            m10 = fi.w7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                            m10.k0 = i19;
                            m10.l0 = i20;
                            m10.A();
                            if (m10.k0 <= 0) {
                            }
                            e2Var4.c(500L);
                            return;
                        }
                    }
                    m10 = fi.w7.o(file, w10 != null ? null : w10.getAbsolutePath(), iArr2[4]);
                    m10.k0 = i19;
                    m10.l0 = i20;
                    m10.A();
                } else {
                    m10 = fi.w7.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
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
                        sg.n0 n0Var = new sg.n0();
                        mediaEntity.linkSettings = n0Var;
                        n0Var.c = str11;
                        if (str12 != null) {
                            n0Var.a |= 2;
                            n0Var.b = str12;
                        }
                        m10.T0.add(mediaEntity);
                    }
                    fi.sb.D(a1Var.W, UserConfig.selectedAccount).T(null, m10);
                    e2Var4.c(500L);
                    break;
                } else {
                    e2Var4.c(500L);
                }
                break;
            case 15:
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                vg.v vVar = (vg.v) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                vg.v vVar2 = (vg.v) obj6;
                if (tL_error7 != null) {
                    vVar.run(tL_error7);
                    break;
                } else {
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject9;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        ro0Var = new ro0(paymentForm, tL_inputInvoicePremiumGiftCode, r2Var);
                    } else {
                        ro0Var = tLObject9 instanceof TLRPC.PaymentReceipt ? new ro0((TLRPC.PaymentReceipt) tLObject9) : null;
                    }
                    if (ro0Var != null) {
                        ro0Var.Z0 = new bh1(i17, vVar2, vVar);
                        LaunchActivity.R().showAsSheet(ro0Var, new org.telegram.ui.ActionBar.p2());
                        break;
                    } else {
                        vVar.run(null);
                        break;
                    }
                }
            default:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                Utilities.Callback callback2 = (Utilities.Callback) obj6;
                TLObject tLObject10 = (TLObject) obj5;
                MessagesController messagesController2 = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj2;
                Utilities.Callback callback3 = (Utilities.Callback) obj;
                if (tL_error8 != null) {
                    callback2.run(tL_error8);
                    break;
                } else {
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm2.invoice.recurring = true;
                        messagesController2.putUsers(paymentForm2.users, false);
                        ro0Var2 = new ro0(paymentForm2, tL_inputInvoicePremiumGiftCode2, r2Var2);
                    } else {
                        ro0Var2 = tLObject10 instanceof TLRPC.PaymentReceipt ? new ro0((TLRPC.PaymentReceipt) tLObject10) : null;
                    }
                    if (ro0Var2 != null) {
                        ro0Var2.Z0 = new bh1(22, callback3, callback2);
                        LaunchActivity.R().showAsSheet(ro0Var2, new org.telegram.ui.ActionBar.p2());
                        break;
                    } else {
                        callback2.run(null);
                        break;
                    }
                }
        }
    }

    public /* synthetic */ r7(ca caVar, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, boolean[] zArr2, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.a = 0;
        this.b = caVar;
        this.d = zArr;
        this.f = str;
        this.h = chatInvite;
        this.e = zArr2;
        this.n = callback2;
        this.c = callback;
    }

    public /* synthetic */ r7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
        this.c = obj7;
    }

    public /* synthetic */ r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.d = obj;
        this.e = obj2;
        this.h = obj3;
        this.f = str;
        this.n = obj4;
        this.c = obj5;
    }

    public /* synthetic */ r7(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, MessagesController messagesController, TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode, org.telegram.ui.ActionBar.r2 r2Var, Utilities.Callback callback2) {
        this.a = 16;
        this.b = tL_error;
        this.c = callback;
        this.d = tLObject;
        this.e = messagesController;
        this.f = tL_inputInvoicePremiumGiftCode;
        this.h = r2Var;
        this.n = callback2;
    }

    public /* synthetic */ r7(wn wnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, t3 t3Var, String str, qf.c cVar) {
        this.a = 5;
        this.b = wnVar;
        this.d = tL_error;
        this.e = tLObject;
        this.h = tLObject2;
        this.n = t3Var;
        this.f = str;
        this.c = cVar;
    }

    public /* synthetic */ r7(mm0 mm0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, nm0 nm0Var, TLRPC.TL_error tL_error, ym0 ym0Var) {
        this.a = 10;
        this.b = mm0Var;
        this.d = tLObject;
        this.f = str;
        this.e = tL_secureRequiredType;
        this.h = nm0Var;
        this.n = tL_error;
        this.c = ym0Var;
    }
}
