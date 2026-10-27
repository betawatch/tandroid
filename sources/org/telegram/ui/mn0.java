package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro0 b;

    public /* synthetic */ mn0(ro0 ro0Var, int i10) {
        this.a = i10;
        this.b = ro0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ro0 ro0Var = this.b;
        switch (i10) {
            case 0:
                if (ro0Var.getParentActivity() != null) {
                    ro0Var.H0(null);
                    break;
                }
                break;
            case 1:
                ro0 ro0Var2 = new ro0(ro0Var.b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.x0, ro0Var.I0, ro0Var.U0, null, ro0Var.r0, ro0Var.W0);
                ro0Var2.c1 = ro0Var.c1;
                ro0Var2.d1 = ro0Var.d1;
                ro0Var2.T = new wn0(ro0Var);
                ro0Var.presentFragment(ro0Var2);
                break;
            case 2:
                ro0 ro0Var3 = new ro0(ro0Var.b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.x0, ro0Var.I0, ro0Var.U0, null, ro0Var.r0, ro0Var.W0);
                ro0Var3.c1 = ro0Var.c1;
                ro0Var3.d1 = ro0Var.d1;
                ro0Var3.T = new xn0(ro0Var);
                ro0Var.presentFragment(ro0Var3);
                break;
            case 3:
                ro0 ro0Var4 = new ro0(ro0Var.b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.x0, ro0Var.I0, ro0Var.U0, null, ro0Var.r0, ro0Var.W0);
                ro0Var4.c1 = ro0Var.c1;
                ro0Var4.d1 = ro0Var.d1;
                ro0Var4.T = new yn0(ro0Var);
                ro0Var.presentFragment(ro0Var4);
                break;
            case 4:
                ro0 ro0Var5 = new ro0(ro0Var.b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 0, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.x0, ro0Var.I0, ro0Var.U0, null, ro0Var.r0, ro0Var.W0);
                ro0Var5.c1 = ro0Var.c1;
                ro0Var5.d1 = ro0Var.d1;
                ro0Var5.T = new zn0(ro0Var);
                ro0Var.presentFragment(ro0Var5);
                break;
            case 5:
                if (!ro0Var.P0) {
                    boolean z10 = !ro0Var.F;
                    ro0Var.F = z10;
                    ro0Var.V.setChecked(z10);
                    ro0Var.W.a(ro0Var.F, true);
                    break;
                }
                break;
            case 6:
                ro0.a0(ro0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ro0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (ro0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.t.h(R.string.TurnPasswordOffPassport, org.telegram.ui.Components.b10.l(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.T = string;
                e2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new qn0(ro0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ro0Var.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, ro0Var.Y0);
                    break;
                }
                break;
            case 8:
                boolean z11 = !ro0Var.T0;
                ro0Var.T0 = z11;
                ro0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !ro0Var.U0;
                ro0Var.U0 = z12;
                ro0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !ro0Var.U0;
                ro0Var.U0 = z13;
                ro0Var.L.setChecked(z13);
                break;
            case 11:
                ro0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.o6[] o6VarArr = ro0Var.h;
                    if (i11 >= o6VarArr.length) {
                        break;
                    } else {
                        o6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                ro0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject q02 = ro0.q0();
                    if (ro0Var.K0 == null || ro0Var.M0 != null) {
                        q02.put("tokenizationSpecification", new eo0(ro0Var, 3));
                    } else {
                        q02.put("tokenizationSpecification", new eo0(ro0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(q02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(ro0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = ro0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, ro0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(ro0Var.L0)) {
                        jSONObject.put("countryCode", ro0Var.L0);
                    }
                    jSONObject.put("currencyCode", ro0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", ro0Var.p0));
                    String jSONObject2 = put.toString();
                    w8.j jVar = new w8.j();
                    jVar.r = true;
                    o6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    a6.a aVar = ro0Var.e;
                    aVar.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.c = new li.h5(jVar);
                    b10.d = new l6.c[]{w8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    w8.a.a(aVar.e(1, b10.a()), ro0Var.getParentActivity());
                    break;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                ro0Var.v0 = false;
                ro0Var.u0();
                break;
            default:
                ro0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(ro0Var.f[0]);
                break;
        }
    }
}
