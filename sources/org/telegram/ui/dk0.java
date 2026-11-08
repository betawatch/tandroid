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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl0 b;

    public /* synthetic */ dk0(hl0 hl0Var, int i7) {
        this.a = i7;
        this.b = hl0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        hl0 hl0Var = this.b;
        switch (i7) {
            case 0:
                hl0Var.f[0].requestFocus();
                org.telegram.messenger.g0.K3(hl0Var.f[0]);
                break;
            case 1:
                if (hl0Var.getParentActivity() != null) {
                    hl0Var.M0(null);
                    break;
                }
                break;
            case 2:
                hl0 hl0Var2 = new hl0(hl0Var.b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 0, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.x0, hl0Var.I0, hl0Var.U0, null, hl0Var.r0, hl0Var.W0);
                hl0Var2.c1 = hl0Var.c1;
                hl0Var2.d1 = hl0Var.d1;
                hl0Var2.T = new pk0(hl0Var);
                hl0Var.presentFragment(hl0Var2);
                break;
            case 3:
                hl0 hl0Var3 = new hl0(hl0Var.b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 0, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.x0, hl0Var.I0, hl0Var.U0, null, hl0Var.r0, hl0Var.W0);
                hl0Var3.c1 = hl0Var.c1;
                hl0Var3.d1 = hl0Var.d1;
                hl0Var3.T = new qk0(hl0Var);
                hl0Var.presentFragment(hl0Var3);
                break;
            case 4:
                hl0 hl0Var4 = new hl0(hl0Var.b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 0, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.x0, hl0Var.I0, hl0Var.U0, null, hl0Var.r0, hl0Var.W0);
                hl0Var4.c1 = hl0Var.c1;
                hl0Var4.d1 = hl0Var.d1;
                hl0Var4.T = new rk0(hl0Var);
                hl0Var.presentFragment(hl0Var4);
                break;
            case 5:
                hl0 hl0Var5 = new hl0(hl0Var.b1, hl0Var.C0, hl0Var.N0, hl0Var.O0, 0, hl0Var.E0, hl0Var.G0, hl0Var.H0, null, hl0Var.x0, hl0Var.I0, hl0Var.U0, null, hl0Var.r0, hl0Var.W0);
                hl0Var5.c1 = hl0Var.c1;
                hl0Var5.d1 = hl0Var.d1;
                hl0Var5.T = new sk0(hl0Var);
                hl0Var.presentFragment(hl0Var5);
                break;
            case 6:
                if (!hl0Var.P0) {
                    boolean z9 = !hl0Var.F;
                    hl0Var.F = z9;
                    hl0Var.V.setChecked(z9);
                    hl0Var.W.a(hl0Var.F, true);
                    break;
                }
                break;
            case 7:
                hl0.e0(hl0Var);
                break;
            case 8:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hl0Var.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131743943, null);
                if (hl0Var.a0.has_secure_values) {
                    M0 = jg.g.l(2131743944, null, rf.b.j(M0, "\n\n"));
                }
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.T = M0;
                u1Var.R = org.telegram.messenger.id.M0(2131743942, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751436, null), new jk0(hl0Var, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                hl0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, hl0Var.Y0);
                    break;
                }
                break;
            case 9:
                boolean z10 = !hl0Var.T0;
                hl0Var.T0 = z10;
                hl0Var.L.setChecked(z10);
                break;
            case 10:
                boolean z11 = !hl0Var.U0;
                hl0Var.U0 = z11;
                hl0Var.L.setChecked(z11);
                break;
            case 11:
                boolean z12 = !hl0Var.U0;
                hl0Var.U0 = z12;
                hl0Var.L.setChecked(z12);
                break;
            case 12:
                hl0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = hl0Var.h;
                    if (i10 >= i6VarArr.length) {
                        break;
                    } else {
                        i6VarArr[i10].a(intValue == i10, true);
                        i10++;
                    }
                }
            case 13:
                hl0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject u02 = hl0.u0();
                    if (hl0Var.K0 == null || hl0Var.M0 != null) {
                        u02.put("tokenizationSpecification", new ca.g(hl0Var, 4));
                    } else {
                        u02.put("tokenizationSpecification", new ca.g(hl0Var, 2));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(u02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(hl0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = hl0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    jSONObject.put("totalPrice", hl0Var.x0(arrayList));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(hl0Var.L0)) {
                        jSONObject.put("countryCode", hl0Var.L0);
                    }
                    jSONObject.put("currencyCode", hl0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", hl0Var.p0));
                    String jSONObject2 = put.toString();
                    y8.j jVar = new y8.j();
                    jVar.r = true;
                    q6.m.h(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    b9.j0 j0Var = hl0Var.e;
                    j0Var.getClass();
                    com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                    b10.c = new org.telegram.ui.Components.vy(jVar, 29);
                    b10.d = new n6.c[]{y8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    y8.a.a(j0Var.e(1, b10.a()), hl0Var.getParentActivity());
                    break;
                } catch (JSONException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                hl0Var.v0 = false;
                hl0Var.z0();
                break;
        }
    }
}
