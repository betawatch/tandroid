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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo0 b;

    public /* synthetic */ kn0(qo0 qo0Var, int i10) {
        this.a = i10;
        this.b = qo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        qo0 qo0Var = this.b;
        switch (i10) {
            case 0:
                if (qo0Var.getParentActivity() != null) {
                    qo0Var.G0(null);
                    break;
                }
                break;
            case 1:
                qo0 qo0Var2 = new qo0(qo0Var.b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 0, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.x0, qo0Var.I0, qo0Var.U0, null, qo0Var.r0, qo0Var.W0);
                qo0Var2.c1 = qo0Var.c1;
                qo0Var2.d1 = qo0Var.d1;
                qo0Var2.T = new vn0(qo0Var);
                qo0Var.presentFragment(qo0Var2);
                break;
            case 2:
                qo0 qo0Var3 = new qo0(qo0Var.b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 0, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.x0, qo0Var.I0, qo0Var.U0, null, qo0Var.r0, qo0Var.W0);
                qo0Var3.c1 = qo0Var.c1;
                qo0Var3.d1 = qo0Var.d1;
                qo0Var3.T = new wn0(qo0Var);
                qo0Var.presentFragment(qo0Var3);
                break;
            case 3:
                qo0 qo0Var4 = new qo0(qo0Var.b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 0, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.x0, qo0Var.I0, qo0Var.U0, null, qo0Var.r0, qo0Var.W0);
                qo0Var4.c1 = qo0Var.c1;
                qo0Var4.d1 = qo0Var.d1;
                qo0Var4.T = new xn0(qo0Var);
                qo0Var.presentFragment(qo0Var4);
                break;
            case 4:
                qo0 qo0Var5 = new qo0(qo0Var.b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 0, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.x0, qo0Var.I0, qo0Var.U0, null, qo0Var.r0, qo0Var.W0);
                qo0Var5.c1 = qo0Var.c1;
                qo0Var5.d1 = qo0Var.d1;
                qo0Var5.T = new yn0(qo0Var);
                qo0Var.presentFragment(qo0Var5);
                break;
            case 5:
                if (!qo0Var.P0) {
                    boolean z10 = !qo0Var.F;
                    qo0Var.F = z10;
                    qo0Var.V.setChecked(z10);
                    qo0Var.W.a(qo0Var.F, true);
                    break;
                }
                break;
            case 6:
                qo0.Z(qo0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (qo0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.z0.h(R.string.TurnPasswordOffPassport, w.c.h(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new on0(qo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                qo0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(qo0Var.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !qo0Var.T0;
                qo0Var.T0 = z11;
                qo0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !qo0Var.U0;
                qo0Var.U0 = z12;
                qo0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !qo0Var.U0;
                qo0Var.U0 = z13;
                qo0Var.L.setChecked(z13);
                break;
            case 11:
                qo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = qo0Var.h;
                    if (i11 >= k6VarArr.length) {
                        break;
                    } else {
                        k6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                qo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = qo0.p0();
                    if (qo0Var.K0 == null || qo0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new do0(qo0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new do0(qo0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(qo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = qo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, qo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(qo0Var.L0)) {
                        jSONObject.put("countryCode", qo0Var.L0);
                    }
                    jSONObject.put("currencyCode", qo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", qo0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = qo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.c = new org.telegram.ui.Cells.ja(jVar, 18);
                    e.d = new k6.c[]{v8.p.b};
                    e.b = true;
                    e.a = 23707;
                    v8.a.a(v0Var.e(1, e.a()), qo0Var.getParentActivity());
                    break;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 13:
                qo0Var.v0 = false;
                qo0Var.t0();
                break;
            default:
                qo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(qo0Var.f[0]);
                break;
        }
    }
}
