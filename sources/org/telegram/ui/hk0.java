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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl0 b;

    public /* synthetic */ hk0(kl0 kl0Var, int i7) {
        this.a = i7;
        this.b = kl0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        kl0 kl0Var = this.b;
        switch (i7) {
            case 0:
                kl0Var.f[0].requestFocus();
                org.telegram.messenger.g0.I3(kl0Var.f[0]);
                break;
            case 1:
                if (kl0Var.getParentActivity() != null) {
                    kl0Var.M0(null);
                    break;
                }
                break;
            case 2:
                kl0 kl0Var2 = new kl0(kl0Var.c1, kl0Var.D0, kl0Var.O0, kl0Var.P0, 0, kl0Var.F0, kl0Var.H0, kl0Var.I0, null, kl0Var.y0, kl0Var.J0, kl0Var.V0, null, kl0Var.s0, kl0Var.X0);
                kl0Var2.d1 = kl0Var.d1;
                kl0Var2.e1 = kl0Var.e1;
                kl0Var2.U = new sk0(kl0Var);
                kl0Var.presentFragment(kl0Var2);
                break;
            case 3:
                kl0 kl0Var3 = new kl0(kl0Var.c1, kl0Var.D0, kl0Var.O0, kl0Var.P0, 0, kl0Var.F0, kl0Var.H0, kl0Var.I0, null, kl0Var.y0, kl0Var.J0, kl0Var.V0, null, kl0Var.s0, kl0Var.X0);
                kl0Var3.d1 = kl0Var.d1;
                kl0Var3.e1 = kl0Var.e1;
                kl0Var3.U = new tk0(kl0Var);
                kl0Var.presentFragment(kl0Var3);
                break;
            case 4:
                kl0 kl0Var4 = new kl0(kl0Var.c1, kl0Var.D0, kl0Var.O0, kl0Var.P0, 0, kl0Var.F0, kl0Var.H0, kl0Var.I0, null, kl0Var.y0, kl0Var.J0, kl0Var.V0, null, kl0Var.s0, kl0Var.X0);
                kl0Var4.d1 = kl0Var.d1;
                kl0Var4.e1 = kl0Var.e1;
                kl0Var4.U = new uk0(kl0Var);
                kl0Var.presentFragment(kl0Var4);
                break;
            case 5:
                kl0 kl0Var5 = new kl0(kl0Var.c1, kl0Var.D0, kl0Var.O0, kl0Var.P0, 0, kl0Var.F0, kl0Var.H0, kl0Var.I0, null, kl0Var.y0, kl0Var.J0, kl0Var.V0, null, kl0Var.s0, kl0Var.X0);
                kl0Var5.d1 = kl0Var.d1;
                kl0Var5.e1 = kl0Var.e1;
                kl0Var5.U = new vk0(kl0Var);
                kl0Var.presentFragment(kl0Var5);
                break;
            case 6:
                if (!kl0Var.Q0) {
                    boolean z10 = !kl0Var.G;
                    kl0Var.G = z10;
                    kl0Var.W.setChecked(z10);
                    kl0Var.X.a(kl0Var.G, true);
                    break;
                }
                break;
            case 7:
                kl0.e0(kl0Var);
                break;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kl0Var.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743693, null);
                if (kl0Var.b0.has_secure_values) {
                    N0 = i5.c.k(2131743694, null, p5.c.n(N0, "\n\n"));
                }
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.U = N0;
                t1Var.S = org.telegram.messenger.gd.N0(2131743692, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751423, null), new nk0(kl0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                kl0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, kl0Var.Z0);
                    break;
                }
                break;
            case 9:
                boolean z11 = !kl0Var.U0;
                kl0Var.U0 = z11;
                kl0Var.M.setChecked(z11);
                break;
            case 10:
                boolean z12 = !kl0Var.V0;
                kl0Var.V0 = z12;
                kl0Var.M.setChecked(z12);
                break;
            case 11:
                boolean z13 = !kl0Var.V0;
                kl0Var.V0 = z13;
                kl0Var.M.setChecked(z13);
                break;
            case 12:
                kl0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = kl0Var.h;
                    if (i10 >= i6VarArr.length) {
                        break;
                    } else {
                        i6VarArr[i10].a(intValue == i10, true);
                        i10++;
                    }
                }
            case 13:
                kl0Var.Q.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = kl0.u0();
                    if (kl0Var.L0 == null || kl0Var.N0 != null) {
                        u02.put("tokenizationSpecification", new ca.g(kl0Var, 4));
                    } else {
                        u02.put("tokenizationSpecification", new ca.g(kl0Var, 2));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(kl0Var.D0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = kl0Var.H0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", kl0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(kl0Var.M0)) {
                        jSONObject.put("countryCode", kl0Var.M0);
                    }
                    jSONObject.put("currencyCode", kl0Var.D0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", kl0Var.q0));
                    String jSONObject2 = put.toString();
                    y8.j jVar = new y8.j();
                    jVar.r = true;
                    q6.m.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    b9.j0 j0Var = kl0Var.e;
                    j0Var.getClass();
                    com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
                    b10.c = new org.telegram.ui.Components.nd0(jVar, 27);
                    b10.d = new n6.c[]{y8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    y8.a.a(j0Var.e(1, b10.a()), kl0Var.getParentActivity());
                    break;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                kl0Var.w0 = false;
                kl0Var.z0();
                break;
        }
    }
}
