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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml0 b;

    public /* synthetic */ jk0(ml0 ml0Var, int i7) {
        this.a = i7;
        this.b = ml0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        ml0 ml0Var = this.b;
        switch (i7) {
            case 0:
                ml0Var.f[0].requestFocus();
                org.telegram.messenger.g0.I3(ml0Var.f[0]);
                break;
            case 1:
                if (ml0Var.getParentActivity() != null) {
                    ml0Var.M0(null);
                    break;
                }
                break;
            case 2:
                ml0 ml0Var2 = new ml0(ml0Var.c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 0, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.y0, ml0Var.J0, ml0Var.V0, null, ml0Var.s0, ml0Var.X0);
                ml0Var2.d1 = ml0Var.d1;
                ml0Var2.e1 = ml0Var.e1;
                ml0Var2.U = new uk0(ml0Var);
                ml0Var.presentFragment(ml0Var2);
                break;
            case 3:
                ml0 ml0Var3 = new ml0(ml0Var.c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 0, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.y0, ml0Var.J0, ml0Var.V0, null, ml0Var.s0, ml0Var.X0);
                ml0Var3.d1 = ml0Var.d1;
                ml0Var3.e1 = ml0Var.e1;
                ml0Var3.U = new vk0(ml0Var);
                ml0Var.presentFragment(ml0Var3);
                break;
            case 4:
                ml0 ml0Var4 = new ml0(ml0Var.c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 0, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.y0, ml0Var.J0, ml0Var.V0, null, ml0Var.s0, ml0Var.X0);
                ml0Var4.d1 = ml0Var.d1;
                ml0Var4.e1 = ml0Var.e1;
                ml0Var4.U = new wk0(ml0Var);
                ml0Var.presentFragment(ml0Var4);
                break;
            case 5:
                ml0 ml0Var5 = new ml0(ml0Var.c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 0, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.y0, ml0Var.J0, ml0Var.V0, null, ml0Var.s0, ml0Var.X0);
                ml0Var5.d1 = ml0Var.d1;
                ml0Var5.e1 = ml0Var.e1;
                ml0Var5.U = new xk0(ml0Var);
                ml0Var.presentFragment(ml0Var5);
                break;
            case 6:
                if (!ml0Var.Q0) {
                    boolean z10 = !ml0Var.G;
                    ml0Var.G = z10;
                    ml0Var.W.setChecked(z10);
                    ml0Var.X.a(ml0Var.G, true);
                    break;
                }
                break;
            case 7:
                ml0.e0(ml0Var);
                break;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ml0Var.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743697, null);
                if (ml0Var.b0.has_secure_values) {
                    N0 = i5.c.k(2131743698, null, p5.c.n(N0, "\n\n"));
                }
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.U = N0;
                t1Var.S = org.telegram.messenger.gd.N0(2131743696, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751423, null), new pk0(ml0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                ml0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, ml0Var.Z0);
                    break;
                }
                break;
            case 9:
                boolean z11 = !ml0Var.U0;
                ml0Var.U0 = z11;
                ml0Var.M.setChecked(z11);
                break;
            case 10:
                boolean z12 = !ml0Var.V0;
                ml0Var.V0 = z12;
                ml0Var.M.setChecked(z12);
                break;
            case 11:
                boolean z13 = !ml0Var.V0;
                ml0Var.V0 = z13;
                ml0Var.M.setChecked(z13);
                break;
            case 12:
                ml0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = ml0Var.h;
                    if (i10 >= j6VarArr.length) {
                        break;
                    } else {
                        j6VarArr[i10].a(intValue == i10, true);
                        i10++;
                    }
                }
            case 13:
                ml0Var.Q.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = ml0.u0();
                    if (ml0Var.L0 == null || ml0Var.N0 != null) {
                        u02.put("tokenizationSpecification", new ca.g(ml0Var, 4));
                    } else {
                        u02.put("tokenizationSpecification", new ca.g(ml0Var, 2));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(ml0Var.D0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = ml0Var.H0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", ml0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(ml0Var.M0)) {
                        jSONObject.put("countryCode", ml0Var.M0);
                    }
                    jSONObject.put("currencyCode", ml0Var.D0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", ml0Var.q0));
                    String jSONObject2 = put.toString();
                    y8.j jVar = new y8.j();
                    jVar.r = true;
                    q6.m.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    b9.k0 k0Var = ml0Var.e;
                    k0Var.getClass();
                    com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
                    b10.c = new v4.f0(jVar);
                    b10.d = new n6.c[]{y8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    y8.a.a(k0Var.e(1, b10.a()), ml0Var.getParentActivity());
                    break;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                ml0Var.w0 = false;
                ml0Var.z0();
                break;
        }
    }
}
