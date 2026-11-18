package di;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ce;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.pf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.de0;
import org.telegram.ui.hk0;
import org.telegram.ui.ld0;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements Runnable {
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

    public /* synthetic */ j8(x8 x8Var, boolean[] zArr, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i7, x10 x10Var, x10 x10Var2) {
        this.a = 0;
        this.c = x8Var;
        this.d = zArr;
        this.f = fjVar;
        this.h = inputInvoice;
        this.n = tL_payments_paymentFormStars;
        this.e = zArr2;
        this.b = i7;
        this.r = x10Var;
        this.s = x10Var2;
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
                x8 x8Var = (x8) obj8;
                ((boolean[]) obj7)[0] = true;
                x8Var.Y((fj) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new u6(x8Var, (boolean[]) obj6, this.b, (x10) obj2, (x10) obj));
                break;
            case 1:
                pf pfVar = (pf) obj8;
                FrameLayout frameLayout = (FrameLayout) obj6;
                View view = (View) obj5;
                RectF rectF = (RectF) obj4;
                pfVar.getClass();
                ((ji.e) obj7).getLocationInWindow(new int[2]);
                frameLayout.getLocationInWindow(new int[2]);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + r2[0]) - r0[0]);
                layoutParams.topMargin = Math.round((rectF.top + r2[1]) - r0[1]);
                view.setLayoutParams(layoutParams);
                view.post(new ce(pfVar, view, frameLayout, layoutParams, (ArrayList) obj3, this.b, (ji.g) obj2, (ji.f) obj, 1));
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                n60 n60Var = (n60) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        mp.u1(launchActivity.P).Z3(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.z0(this.b, n60Var, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        break;
                    }
                }
                try {
                    n60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                launchActivity.F0(org.telegram.ui.Components.b5.E(launchActivity, gd.M0(2131751443, null), gd.M0(2131748703, null)));
                break;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                n60 n60Var2 = (n60) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                try {
                    n60Var2.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject2 != null) {
                    mp.u1(i10).f4(authorizationform.users, false);
                    launchActivity2.t0(new hk0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
                    break;
                }
                break;
            default:
                ld0 ld0Var = (ld0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                f5.i iVar = (f5.i) obj5;
                f5.m mVar = (f5.m) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                de0 de0Var = ld0Var.w;
                hi.d dVar = ld0Var.b;
                org.telegram.messenger.a8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (!(tLObject3 instanceof TLRPC.TL_boolTrue)) {
                    if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                        if (tL_error != null) {
                            ld0Var.e = tL_error.text;
                            new org.telegram.ui.Components.lc(de0Var.a0, null).g0(tL_error, false);
                            break;
                        }
                    } else {
                        ld0Var.e = "RESPONSE_FALSE";
                        new org.telegram.ui.Components.lc(de0Var.a0, null).H(R.raw.error, gd.a0(null, null, 2131743641, "RESPONSE_FALSE"));
                        break;
                    }
                } else {
                    dVar.i(gd.a0(null, null, 2131745772, iVar.a), false, true);
                    dVar.g(i10 == 7 ? gd.M0(2131745776, null) : gd.H(',', "SMSFeePurchaseTextDays", i10), false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new fi.d0(ld0Var, mVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 14));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j8(pf pfVar, ji.e eVar, FrameLayout frameLayout, View view, RectF rectF, ArrayList arrayList, int i7, ji.g gVar, ji.f fVar) {
        this.a = 1;
        this.c = pfVar;
        this.d = eVar;
        this.e = frameLayout;
        this.f = view;
        this.h = rectF;
        this.n = arrayList;
        this.b = i7;
        this.r = gVar;
        this.s = fVar;
    }

    public /* synthetic */ j8(LaunchActivity launchActivity, Object obj, Object obj2, int i7, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
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

    public /* synthetic */ j8(ld0 ld0Var, TLObject tLObject, TLRPC.TL_error tL_error, f5.i iVar, int i7, f5.m mVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = 4;
        this.c = ld0Var;
        this.d = tLObject;
        this.e = tL_error;
        this.f = iVar;
        this.b = i7;
        this.h = mVar;
        this.n = tL_inputStorePaymentAuthCode;
        this.r = str;
        this.s = tL_payments_canPurchaseStore;
    }
}
