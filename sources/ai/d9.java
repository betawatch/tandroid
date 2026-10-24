package ai;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an0;
import org.telegram.ui.f80;
import org.telegram.ui.ig0;
import org.telegram.ui.rf0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d9 implements Runnable {
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

    public /* synthetic */ d9(ha haVar, boolean[] zArr, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.a = 0;
        this.c = haVar;
        this.d = zArr;
        this.f = messageObject;
        this.h = inputInvoice;
        this.n = tL_payments_paymentFormStars;
        this.e = zArr2;
        this.b = i10;
        this.r = callback;
        this.s = callback2;
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
                ha haVar = (ha) obj8;
                ((boolean[]) obj7)[0] = true;
                haVar.a0((MessageObject) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new e9(haVar, (boolean[]) obj6, this.b, (Utilities.Callback) obj2, (Utilities.Callback) obj));
                break;
            case 1:
                ((MessagesController) obj8).lambda$processLoadedDialogFilters$23((TLRPC.messages_Dialogs) obj7, (ArrayList) obj6, (TLRPC.messages_Dialogs) obj5, this.b, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (Runnable) obj);
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                f80 f80Var = (f80) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l4 = (Long) obj2;
                Integer num3 = (Integer) obj;
                Pattern pattern = LaunchActivity.E1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.A0(this.b, f80Var, num, num2, l4, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        break;
                    }
                }
                try {
                    f80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                launchActivity.G0(org.telegram.ui.Components.f5.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                break;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                f80 f80Var2 = (f80) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.E1;
                try {
                    f80Var2.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject2 != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    launchActivity2.u0(new an0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            default:
                rf0 rf0Var = (rf0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                c5.l lVar = (c5.l) obj5;
                c5.p pVar = (c5.p) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                ig0 ig0Var = rf0Var.v;
                ei.d dVar = rf0Var.b;
                FileLog.d("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        if (tL_error != null) {
                            rf0Var.e = tL_error.text;
                            new org.telegram.ui.Components.xc(ig0Var.Z, null).f0(tL_error, false);
                            break;
                        }
                    } else {
                        rf0Var.e = "RESPONSE_FALSE";
                        new org.telegram.ui.Components.xc(ig0Var.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
                        break;
                    }
                } else {
                    dVar.i(LocaleController.formatString(R.string.SMSFeePurchaseTitle, lVar.a), false, true);
                    dVar.g(i11 == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i11), false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new ci.e0(rf0Var, pVar, tL_inputStorePaymentAuthCode, str4, tL_payments_canPurchaseStore, 14));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d9(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Serializable serializable, Object obj6, int i11) {
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

    public /* synthetic */ d9(LaunchActivity launchActivity, Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
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
