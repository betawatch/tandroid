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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ so0 b;

    public /* synthetic */ mn0(so0 so0Var, int i10) {
        this.a = i10;
        this.b = so0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        so0 so0Var = this.b;
        switch (i10) {
            case 0:
                if (so0Var.getParentActivity() != null) {
                    so0Var.G0(null);
                    break;
                }
                break;
            case 1:
                so0 so0Var2 = new so0(so0Var.b1, so0Var.C0, so0Var.N0, so0Var.O0, 0, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.x0, so0Var.I0, so0Var.U0, null, so0Var.r0, so0Var.W0);
                so0Var2.c1 = so0Var.c1;
                so0Var2.d1 = so0Var.d1;
                so0Var2.T = new xn0(so0Var);
                so0Var.presentFragment(so0Var2);
                break;
            case 2:
                so0 so0Var3 = new so0(so0Var.b1, so0Var.C0, so0Var.N0, so0Var.O0, 0, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.x0, so0Var.I0, so0Var.U0, null, so0Var.r0, so0Var.W0);
                so0Var3.c1 = so0Var.c1;
                so0Var3.d1 = so0Var.d1;
                so0Var3.T = new yn0(so0Var);
                so0Var.presentFragment(so0Var3);
                break;
            case 3:
                so0 so0Var4 = new so0(so0Var.b1, so0Var.C0, so0Var.N0, so0Var.O0, 0, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.x0, so0Var.I0, so0Var.U0, null, so0Var.r0, so0Var.W0);
                so0Var4.c1 = so0Var.c1;
                so0Var4.d1 = so0Var.d1;
                so0Var4.T = new zn0(so0Var);
                so0Var.presentFragment(so0Var4);
                break;
            case 4:
                so0 so0Var5 = new so0(so0Var.b1, so0Var.C0, so0Var.N0, so0Var.O0, 0, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.x0, so0Var.I0, so0Var.U0, null, so0Var.r0, so0Var.W0);
                so0Var5.c1 = so0Var.c1;
                so0Var5.d1 = so0Var.d1;
                so0Var5.T = new ao0(so0Var);
                so0Var.presentFragment(so0Var5);
                break;
            case 5:
                if (!so0Var.P0) {
                    boolean z10 = !so0Var.F;
                    so0Var.F = z10;
                    so0Var.V.setChecked(z10);
                    so0Var.W.a(so0Var.F, true);
                    break;
                }
                break;
            case 6:
                so0.Y(so0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(so0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (so0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.q.g(R.string.TurnPasswordOffPassport, sa.e.j(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new qn0(so0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                so0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(so0Var.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !so0Var.T0;
                so0Var.T0 = z11;
                so0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !so0Var.U0;
                so0Var.U0 = z12;
                so0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !so0Var.U0;
                so0Var.U0 = z13;
                so0Var.L.setChecked(z13);
                break;
            case 11:
                so0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = so0Var.h;
                    if (i11 >= k6VarArr.length) {
                        break;
                    } else {
                        k6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                so0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = so0.p0();
                    if (so0Var.K0 == null || so0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new fo0(so0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new fo0(so0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(so0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = so0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, so0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(so0Var.L0)) {
                        jSONObject.put("countryCode", so0Var.L0);
                    }
                    jSONObject.put("currencyCode", so0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", so0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = so0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                    e7.c = new n2.c(jVar, 22);
                    e7.d = new k6.c[]{v8.p.b};
                    e7.b = true;
                    e7.a = 23707;
                    v8.a.a(v0Var.e(1, e7.a()), so0Var.getParentActivity());
                    break;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                so0Var.v0 = false;
                so0Var.t0();
                break;
            default:
                so0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(so0Var.f[0]);
                break;
        }
    }
}
