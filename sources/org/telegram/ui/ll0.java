package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm0 b;

    public /* synthetic */ ll0(qm0 qm0Var, int i10) {
        this.a = i10;
        this.b = qm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        qm0 qm0Var = this.b;
        switch (i10) {
            case 0:
                qm0Var.f[0].requestFocus();
                org.telegram.messenger.i0.J3(qm0Var.f[0]);
                break;
            case 1:
                if (qm0Var.getParentActivity() != null) {
                    qm0Var.M0(null);
                    break;
                }
                break;
            case 2:
                qm0 qm0Var2 = new qm0(qm0Var.b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 0, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.x0, qm0Var.I0, qm0Var.U0, null, qm0Var.r0, qm0Var.W0);
                qm0Var2.c1 = qm0Var.c1;
                qm0Var2.d1 = qm0Var.d1;
                qm0Var2.T = new xl0(qm0Var);
                qm0Var.presentFragment(qm0Var2);
                break;
            case 3:
                qm0 qm0Var3 = new qm0(qm0Var.b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 0, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.x0, qm0Var.I0, qm0Var.U0, null, qm0Var.r0, qm0Var.W0);
                qm0Var3.c1 = qm0Var.c1;
                qm0Var3.d1 = qm0Var.d1;
                qm0Var3.T = new yl0(qm0Var);
                qm0Var.presentFragment(qm0Var3);
                break;
            case 4:
                qm0 qm0Var4 = new qm0(qm0Var.b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 0, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.x0, qm0Var.I0, qm0Var.U0, null, qm0Var.r0, qm0Var.W0);
                qm0Var4.c1 = qm0Var.c1;
                qm0Var4.d1 = qm0Var.d1;
                qm0Var4.T = new zl0(qm0Var);
                qm0Var.presentFragment(qm0Var4);
                break;
            case 5:
                qm0 qm0Var5 = new qm0(qm0Var.b1, qm0Var.C0, qm0Var.N0, qm0Var.O0, 0, qm0Var.E0, qm0Var.G0, qm0Var.H0, null, qm0Var.x0, qm0Var.I0, qm0Var.U0, null, qm0Var.r0, qm0Var.W0);
                qm0Var5.c1 = qm0Var.c1;
                qm0Var5.d1 = qm0Var.d1;
                qm0Var5.T = new am0(qm0Var);
                qm0Var.presentFragment(qm0Var5);
                break;
            case 6:
                if (!qm0Var.P0) {
                    boolean z10 = !qm0Var.F;
                    qm0Var.F = z10;
                    qm0Var.V.setChecked(z10);
                    qm0Var.W.a(qm0Var.F, true);
                    break;
                }
                break;
            case 7:
                qm0.e0(qm0Var);
                break;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qm0Var.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131743965, null);
                if (qm0Var.a0.has_secure_values) {
                    L0 = a1.g.m(null, 2131743966, sc.e.i(L0, "\n\n"));
                }
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.T = L0;
                x1Var.R = org.telegram.messenger.dd.L0(2131743964, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751436, null), new ql0(qm0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                qm0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, qm0Var.Y0);
                    break;
                }
                break;
            case 9:
                boolean z11 = !qm0Var.T0;
                qm0Var.T0 = z11;
                qm0Var.L.setChecked(z11);
                break;
            case 10:
                boolean z12 = !qm0Var.U0;
                qm0Var.U0 = z12;
                qm0Var.L.setChecked(z12);
                break;
            case 11:
                boolean z13 = !qm0Var.U0;
                qm0Var.U0 = z13;
                qm0Var.L.setChecked(z13);
                break;
            case 12:
                qm0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.m6[] m6VarArr = qm0Var.h;
                    if (i11 >= m6VarArr.length) {
                        break;
                    } else {
                        m6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 13:
                qm0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = qm0.u0();
                    if (qm0Var.K0 == null || qm0Var.M0 != null) {
                        u02.put("tokenizationSpecification", new gm0(qm0Var, 3));
                    } else {
                        u02.put("tokenizationSpecification", new gm0(qm0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(qm0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = qm0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", qm0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(qm0Var.L0)) {
                        jSONObject.put("countryCode", qm0Var.L0);
                    }
                    jSONObject.put("currencyCode", qm0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", qm0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = qm0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.c = new r2.y(jVar, 11);
                    b10.d = new k6.c[]{v8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), qm0Var.getParentActivity());
                    break;
                } catch (JSONException e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
                break;
            default:
                qm0Var.v0 = false;
                qm0Var.z0();
                break;
        }
    }
}
