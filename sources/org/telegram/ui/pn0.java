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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;

    public /* synthetic */ pn0(vo0 vo0Var, int i10) {
        this.a = i10;
        this.b = vo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        vo0 vo0Var = this.b;
        switch (i10) {
            case 0:
                if (vo0Var.getParentActivity() != null) {
                    vo0Var.G0(null);
                    break;
                }
                break;
            case 1:
                vo0 vo0Var2 = new vo0(vo0Var.b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 0, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.x0, vo0Var.I0, vo0Var.U0, null, vo0Var.r0, vo0Var.W0);
                vo0Var2.c1 = vo0Var.c1;
                vo0Var2.d1 = vo0Var.d1;
                vo0Var2.T = new ao0(vo0Var);
                vo0Var.presentFragment(vo0Var2);
                break;
            case 2:
                vo0 vo0Var3 = new vo0(vo0Var.b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 0, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.x0, vo0Var.I0, vo0Var.U0, null, vo0Var.r0, vo0Var.W0);
                vo0Var3.c1 = vo0Var.c1;
                vo0Var3.d1 = vo0Var.d1;
                vo0Var3.T = new bo0(vo0Var);
                vo0Var.presentFragment(vo0Var3);
                break;
            case 3:
                vo0 vo0Var4 = new vo0(vo0Var.b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 0, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.x0, vo0Var.I0, vo0Var.U0, null, vo0Var.r0, vo0Var.W0);
                vo0Var4.c1 = vo0Var.c1;
                vo0Var4.d1 = vo0Var.d1;
                vo0Var4.T = new co0(vo0Var);
                vo0Var.presentFragment(vo0Var4);
                break;
            case 4:
                vo0 vo0Var5 = new vo0(vo0Var.b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 0, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.x0, vo0Var.I0, vo0Var.U0, null, vo0Var.r0, vo0Var.W0);
                vo0Var5.c1 = vo0Var.c1;
                vo0Var5.d1 = vo0Var.d1;
                vo0Var5.T = new do0(vo0Var);
                vo0Var.presentFragment(vo0Var5);
                break;
            case 5:
                if (!vo0Var.P0) {
                    boolean z10 = !vo0Var.F;
                    vo0Var.F = z10;
                    vo0Var.V.setChecked(z10);
                    vo0Var.W.a(vo0Var.F, true);
                    break;
                }
                break;
            case 6:
                vo0.Z(vo0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (vo0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.q.g(R.string.TurnPasswordOffPassport, sc.v.j(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new tn0(vo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                vo0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(vo0Var.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
                    break;
                }
                break;
            case 8:
                boolean z11 = !vo0Var.T0;
                vo0Var.T0 = z11;
                vo0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !vo0Var.U0;
                vo0Var.U0 = z12;
                vo0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !vo0Var.U0;
                vo0Var.U0 = z13;
                vo0Var.L.setChecked(z13);
                break;
            case 11:
                vo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = vo0Var.h;
                    if (i11 >= k6VarArr.length) {
                        break;
                    } else {
                        k6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                vo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = vo0.p0();
                    if (vo0Var.K0 == null || vo0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new io0(vo0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new io0(vo0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(vo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = vo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, vo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(vo0Var.L0)) {
                        jSONObject.put("countryCode", vo0Var.L0);
                    }
                    jSONObject.put("currencyCode", vo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", vo0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.u0 u0Var = vo0Var.e;
                    u0Var.getClass();
                    com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                    e7.c = new k2.g0(jVar, 29);
                    e7.d = new k6.c[]{v8.p.b};
                    e7.b = true;
                    e7.a = 23707;
                    v8.a.a(u0Var.e(1, e7.a()), vo0Var.getParentActivity());
                    break;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                vo0Var.v0 = false;
                vo0Var.t0();
                break;
            default:
                vo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(vo0Var.f[0]);
                break;
        }
    }
}
