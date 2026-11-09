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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ fk0(jl0 jl0Var, int i7) {
        this.a = i7;
        this.b = jl0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        jl0 jl0Var = this.b;
        switch (i7) {
            case 0:
                jl0Var.f[0].requestFocus();
                org.telegram.messenger.g0.K3(jl0Var.f[0]);
                break;
            case 1:
                if (jl0Var.getParentActivity() != null) {
                    jl0Var.M0(null);
                    break;
                }
                break;
            case 2:
                jl0 jl0Var2 = new jl0(jl0Var.b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 0, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.x0, jl0Var.I0, jl0Var.U0, null, jl0Var.r0, jl0Var.W0);
                jl0Var2.c1 = jl0Var.c1;
                jl0Var2.d1 = jl0Var.d1;
                jl0Var2.T = new rk0(jl0Var);
                jl0Var.presentFragment(jl0Var2);
                break;
            case 3:
                jl0 jl0Var3 = new jl0(jl0Var.b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 0, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.x0, jl0Var.I0, jl0Var.U0, null, jl0Var.r0, jl0Var.W0);
                jl0Var3.c1 = jl0Var.c1;
                jl0Var3.d1 = jl0Var.d1;
                jl0Var3.T = new sk0(jl0Var);
                jl0Var.presentFragment(jl0Var3);
                break;
            case 4:
                jl0 jl0Var4 = new jl0(jl0Var.b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 0, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.x0, jl0Var.I0, jl0Var.U0, null, jl0Var.r0, jl0Var.W0);
                jl0Var4.c1 = jl0Var.c1;
                jl0Var4.d1 = jl0Var.d1;
                jl0Var4.T = new tk0(jl0Var);
                jl0Var.presentFragment(jl0Var4);
                break;
            case 5:
                jl0 jl0Var5 = new jl0(jl0Var.b1, jl0Var.C0, jl0Var.N0, jl0Var.O0, 0, jl0Var.E0, jl0Var.G0, jl0Var.H0, null, jl0Var.x0, jl0Var.I0, jl0Var.U0, null, jl0Var.r0, jl0Var.W0);
                jl0Var5.c1 = jl0Var.c1;
                jl0Var5.d1 = jl0Var.d1;
                jl0Var5.T = new uk0(jl0Var);
                jl0Var.presentFragment(jl0Var5);
                break;
            case 6:
                if (!jl0Var.P0) {
                    boolean z9 = !jl0Var.F;
                    jl0Var.F = z9;
                    jl0Var.V.setChecked(z9);
                    jl0Var.W.a(jl0Var.F, true);
                    break;
                }
                break;
            case 7:
                jl0.e0(jl0Var);
                break;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131743940, null);
                if (jl0Var.a0.has_secure_values) {
                    M0 = jg.g.l(2131743941, null, rf.b.j(M0, "\n\n"));
                }
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.T = M0;
                u1Var.R = org.telegram.messenger.id.M0(2131743939, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751435, null), new lk0(jl0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                jl0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, jl0Var.Y0);
                    break;
                }
                break;
            case 9:
                boolean z10 = !jl0Var.T0;
                jl0Var.T0 = z10;
                jl0Var.L.setChecked(z10);
                break;
            case 10:
                boolean z11 = !jl0Var.U0;
                jl0Var.U0 = z11;
                jl0Var.L.setChecked(z11);
                break;
            case 11:
                boolean z12 = !jl0Var.U0;
                jl0Var.U0 = z12;
                jl0Var.L.setChecked(z12);
                break;
            case 12:
                jl0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = jl0Var.h;
                    if (i10 >= i6VarArr.length) {
                        break;
                    } else {
                        i6VarArr[i10].a(intValue == i10, true);
                        i10++;
                    }
                }
            case 13:
                jl0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = jl0.u0();
                    if (jl0Var.K0 == null || jl0Var.M0 != null) {
                        u02.put("tokenizationSpecification", new ca.g(jl0Var, 4));
                    } else {
                        u02.put("tokenizationSpecification", new ca.g(jl0Var, 2));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(jl0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = jl0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", jl0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(jl0Var.L0)) {
                        jSONObject.put("countryCode", jl0Var.L0);
                    }
                    jSONObject.put("currencyCode", jl0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", jl0Var.p0));
                    String jSONObject2 = put.toString();
                    y8.j jVar = new y8.j();
                    jVar.r = true;
                    q6.m.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    b9.j0 j0Var = jl0Var.e;
                    j0Var.getClass();
                    com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                    b10.c = new org.telegram.ui.Components.vy(jVar, 29);
                    b10.d = new n6.c[]{y8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    y8.a.a(j0Var.e(1, b10.a()), jl0Var.getParentActivity());
                    break;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                jl0Var.v0 = false;
                jl0Var.z0();
                break;
        }
    }
}
