package mh;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.og0;
import org.telegram.ui.xf0;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ s6(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Serializable serializable, Object obj6, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.b = i10;
        this.h = obj4;
        this.n = obj5;
        this.r = serializable;
        this.s = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.n;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i10) {
            case 0:
                t7 t7Var = (t7) obj8;
                ((boolean[]) obj7)[0] = true;
                t7Var.a0((MessageObject) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new t6(t7Var, (boolean[]) obj6, this.b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                break;
            case 1:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj6, (TLRPC.messages_Dialogs) obj5, this.b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                break;
            case 2:
                int[] iArr = (int[]) obj7;
                final String[] strArr = (String[]) obj6;
                final String[] strArr2 = (String[]) obj5;
                final qh.d dVar = (qh.d) obj4;
                final org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) obj3;
                final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                final int[] iArr2 = (int[]) obj;
                final String str = ((Object) ((org.telegram.ui.Cells.i3) obj8).getText()) + "bot";
                if (str.length() >= 4) {
                    if (str.length() <= 32) {
                        if (!TextUtils.equals(strArr2[0], str)) {
                            strArr2[0] = str;
                            strArr[0] = null;
                            a9Var.setText(LocaleController.getString(R.string.UsernameChecking));
                            a9Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.B6, g6Var));
                            TL_bots.checkUsername checkusername = new TL_bots.checkUsername();
                            checkusername.username = str;
                            dVar.setLoading(true);
                            iArr[0] = ConnectionsManager.getInstance(i11).sendRequestTyped(checkusername, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Components.zq
                                @Override // org.telegram.messenger.Utilities.Callback2
                                public final void run(Object obj9, Object obj10) {
                                    qh.d dVar2 = qh.d.this;
                                    dVar2.setLoading(false);
                                    strArr2[0] = null;
                                    boolean z4 = ((TLRPC.Bool) obj9) instanceof TLRPC.TL_boolTrue;
                                    String[] strArr3 = strArr;
                                    org.telegram.ui.Cells.a9 a9Var2 = a9Var;
                                    org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                    if (z4) {
                                        String str2 = str;
                                        strArr3[0] = str2;
                                        dVar2.setEnabled(true);
                                        a9Var2.setText(LocaleController.formatString(R.string.UsernameAvailable, org.telegram.ui.yh.k("@", str2)));
                                        a9Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.w6, g6Var2));
                                        return;
                                    }
                                    strArr3[0] = null;
                                    dVar2.setEnabled(false);
                                    a9Var2.setText(LocaleController.getString(R.string.UsernameInUse));
                                    a9Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var2));
                                    int[] iArr3 = iArr2;
                                    int i12 = -iArr3[0];
                                    iArr3[0] = i12;
                                    AndroidUtilities.shakeViewSpring(a9Var2, i12);
                                }
                            });
                            break;
                        }
                    } else {
                        if (iArr[0] >= 0) {
                            ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                            iArr[0] = -1;
                        }
                        strArr2[0] = null;
                        strArr[0] = null;
                        dVar.setLoading(false);
                        dVar.setEnabled(false);
                        a9Var.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                        a9Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var));
                        int i12 = -iArr2[0];
                        iArr2[0] = i12;
                        AndroidUtilities.shakeViewSpring(a9Var, i12);
                        break;
                    }
                } else {
                    if (iArr[0] >= 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                        iArr[0] = -1;
                    }
                    strArr2[0] = null;
                    strArr[0] = null;
                    dVar.setLoading(false);
                    dVar.setEnabled(false);
                    a9Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    a9Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var));
                    int i13 = -iArr2[0];
                    iArr2[0] = i13;
                    AndroidUtilities.shakeViewSpring(a9Var, i13);
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                z10 z10Var = (z10) obj7;
                TLObject tLObject = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                Pattern pattern = LaunchActivity.y1;
                try {
                    z10Var.run();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity.p0(new fn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject));
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                z10 z10Var2 = (z10) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern2 = LaunchActivity.y1;
                if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity2.L).putChats(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity2.v0(this.b, z10Var2, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        break;
                    }
                }
                try {
                    z10Var2.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                launchActivity2.B0(org.telegram.ui.Components.z4.H(launchActivity2, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                break;
            default:
                xf0 xf0Var = (xf0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                p2.j jVar = (p2.j) obj5;
                p2.m mVar = (p2.m) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                og0 og0Var = xf0Var.v;
                qh.d dVar2 = xf0Var.b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        if (tL_error != null) {
                            xf0Var.e = tL_error.text;
                            new qc(og0Var.W, null).d0(tL_error, false);
                            break;
                        }
                    } else {
                        xf0Var.e = "RESPONSE_FALSE";
                        new qc(og0Var.W, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                        break;
                    }
                } else {
                    dVar2.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, jVar.a), false, true);
                    dVar2.f(i11 == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11), false);
                    dVar2.setLoading(false);
                    dVar2.setOnClickListener(new oh.b0(xf0Var, mVar, tL_inputStorePaymentAuthCode, str5, tL_payments_canPurchaseStore, 13));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s6(t7 t7Var, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.a = 0;
        this.c = t7Var;
        this.d = zArr;
        this.f = messageObject;
        this.h = inputInvoice;
        this.n = tL_payments_paymentFormStars;
        this.e = zArr2;
        this.b = i10;
        this.r = callback;
        this.s = callback2;
    }

    public /* synthetic */ s6(org.telegram.ui.Cells.i3 i3Var, int[] iArr, int i10, String[] strArr, String[] strArr2, qh.d dVar, org.telegram.ui.Cells.a9 a9Var, org.telegram.ui.ActionBar.g6 g6Var, int[] iArr2) {
        this.a = 2;
        this.c = i3Var;
        this.d = iArr;
        this.b = i10;
        this.e = strArr;
        this.f = strArr2;
        this.h = dVar;
        this.n = a9Var;
        this.r = g6Var;
        this.s = iArr2;
    }

    public /* synthetic */ s6(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.a = i11;
        this.c = launchActivity;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
        this.r = obj6;
        this.s = obj7;
    }
}
