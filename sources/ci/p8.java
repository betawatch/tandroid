package ci;

import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.id0;
import org.telegram.ui.ly;
import org.telegram.ui.xd0;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8 implements Runnable {
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

    public /* synthetic */ p8(e9 e9Var, boolean[] zArr, zi ziVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i3, u10 u10Var, u10 u10Var2) {
        this.a = 0;
        this.c = e9Var;
        this.d = zArr;
        this.f = ziVar;
        this.h = inputInvoice;
        this.n = tL_payments_paymentFormStars;
        this.e = zArr2;
        this.b = i3;
        this.r = u10Var;
        this.s = u10Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.b;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.n;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i3) {
            case 0:
                e9 e9Var = (e9) obj8;
                ((boolean[]) obj7)[0] = true;
                e9Var.Z((zi) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new a7(e9Var, (boolean[]) obj6, this.b, (u10) obj2, (u10) obj));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                ly lyVar = (ly) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.E1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        hp.s1(launchActivity.P).S3(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.z0(this.b, lyVar, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        break;
                    }
                }
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                launchActivity.F0(org.telegram.ui.Components.t4.G(launchActivity, bd.M0(2131751455, null), bd.M0(2131748903, null)));
                break;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                ly lyVar2 = (ly) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.E1;
                try {
                    lyVar2.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject2 != null) {
                    hp.s1(i10).Y3(authorizationform.users, false);
                    launchActivity2.t0(new yj0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            default:
                id0 id0Var = (id0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                e5.h hVar = (e5.h) obj5;
                e5.l lVar = (e5.l) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                xd0 xd0Var = id0Var.w;
                gi.d dVar = id0Var.b;
                org.telegram.messenger.a8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        if (tL_error != null) {
                            id0Var.e = tL_error.text;
                            new org.telegram.ui.Components.fc(xd0Var.a0, null).f0(tL_error, false);
                            break;
                        }
                    } else {
                        id0Var.e = "RESPONSE_FALSE";
                        new org.telegram.ui.Components.fc(xd0Var.a0, null).H(R.raw.error, bd.a0(null, null, 2131743888, "RESPONSE_FALSE"));
                        break;
                    }
                } else {
                    dVar.i(bd.a0(null, null, 2131745977, hVar.a), false, true);
                    dVar.g(i10 == 7 ? bd.M0(2131745981, null) : bd.H(',', "SMSFeePurchaseTextDays", i10), false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new ei.f0(id0Var, lVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 14));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p8(LaunchActivity launchActivity, Object obj, Object obj2, int i3, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.a = i10;
        this.c = launchActivity;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
        this.r = obj6;
        this.s = obj7;
    }

    public /* synthetic */ p8(id0 id0Var, TLObject tLObject, TLRPC.TL_error tL_error, e5.h hVar, int i3, e5.l lVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = 3;
        this.c = id0Var;
        this.d = tLObject;
        this.e = tL_error;
        this.f = hVar;
        this.b = i3;
        this.h = lVar;
        this.n = tL_inputStorePaymentAuthCode;
        this.r = str;
        this.s = tL_payments_canPurchaseStore;
    }
}
