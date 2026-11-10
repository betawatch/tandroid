package bi;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ek0;
import org.telegram.ui.f10;
import org.telegram.ui.fe0;
import org.telegram.ui.od0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements Runnable {
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

    public /* synthetic */ p9(ea eaVar, boolean[] zArr, ij ijVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i7, c20 c20Var, c20 c20Var2) {
        this.a = 0;
        this.c = eaVar;
        this.d = zArr;
        this.f = ijVar;
        this.h = inputInvoice;
        this.n = tL_payments_paymentFormStars;
        this.e = zArr2;
        this.b = i7;
        this.r = c20Var;
        this.s = c20Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.b;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.n;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i7) {
            case 0:
                ea eaVar = (ea) obj8;
                ((boolean[]) obj7)[0] = true;
                eaVar.Z((ij) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new z7(eaVar, (boolean[]) obj6, this.b, (c20) obj2, (c20) obj));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                f10 f10Var = (f10) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.B1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        qp.s1(launchActivity.O).S3(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.z0(this.b, f10Var, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        break;
                    }
                }
                try {
                    f10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                launchActivity.F0(org.telegram.ui.Components.u4.E(launchActivity, org.telegram.messenger.id.M0(2131751454, null), org.telegram.messenger.id.M0(2131748895, null)));
                break;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                f10 f10Var2 = (f10) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.B1;
                try {
                    f10Var2.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject2 != null) {
                    qp.s1(i10).Y3(authorizationform.users, false);
                    launchActivity2.t0(new ek0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            default:
                od0 od0Var = (od0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                f5.h hVar = (f5.h) obj5;
                f5.l lVar = (f5.l) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                fe0 fe0Var = od0Var.w;
                fi.d dVar = od0Var.b;
                org.telegram.messenger.a8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        if (tL_error != null) {
                            od0Var.e = tL_error.text;
                            new org.telegram.ui.Components.gc(fe0Var.Z, null).f0(tL_error, false);
                            break;
                        }
                    } else {
                        od0Var.e = "RESPONSE_FALSE";
                        new org.telegram.ui.Components.gc(fe0Var.Z, null).H(R.raw.error, org.telegram.messenger.id.a0(null, null, 2131743878, "RESPONSE_FALSE"));
                        break;
                    }
                } else {
                    dVar.i(org.telegram.messenger.id.a0(null, null, 2131745967, hVar.a), false, true);
                    dVar.g(i10 == 7 ? org.telegram.messenger.id.M0(2131745971, null) : org.telegram.messenger.id.H(',', "SMSFeePurchaseTextDays", i10), false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new di.d0(od0Var, lVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 14));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p9(LaunchActivity launchActivity, Object obj, Object obj2, int i7, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.c = launchActivity;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
        this.r = obj6;
        this.s = obj7;
    }

    public /* synthetic */ p9(od0 od0Var, TLObject tLObject, TLRPC.TL_error tL_error, f5.h hVar, int i7, f5.l lVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = 3;
        this.c = od0Var;
        this.d = tLObject;
        this.e = tL_error;
        this.f = hVar;
        this.b = i7;
        this.h = lVar;
        this.n = tL_inputStorePaymentAuthCode;
        this.r = str;
        this.s = tL_payments_canPurchaseStore;
    }
}
