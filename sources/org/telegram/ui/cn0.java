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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ io0 b;

    public /* synthetic */ cn0(io0 io0Var, int i10) {
        this.a = i10;
        this.b = io0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 3;
        io0 io0Var = this.b;
        switch (i10) {
            case 0:
                if (io0Var.getParentActivity() != null) {
                    io0Var.G0(null);
                    break;
                }
                break;
            case 1:
                io0 io0Var2 = new io0(io0Var.b1, io0Var.C0, io0Var.N0, io0Var.O0, 0, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.x0, io0Var.I0, io0Var.U0, null, io0Var.r0, io0Var.W0);
                io0Var2.c1 = io0Var.c1;
                io0Var2.d1 = io0Var.d1;
                io0Var2.T = new nn0(io0Var);
                io0Var.presentFragment(io0Var2);
                break;
            case 2:
                io0 io0Var3 = new io0(io0Var.b1, io0Var.C0, io0Var.N0, io0Var.O0, 0, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.x0, io0Var.I0, io0Var.U0, null, io0Var.r0, io0Var.W0);
                io0Var3.c1 = io0Var.c1;
                io0Var3.d1 = io0Var.d1;
                io0Var3.T = new on0(io0Var);
                io0Var.presentFragment(io0Var3);
                break;
            case 3:
                io0 io0Var4 = new io0(io0Var.b1, io0Var.C0, io0Var.N0, io0Var.O0, 0, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.x0, io0Var.I0, io0Var.U0, null, io0Var.r0, io0Var.W0);
                io0Var4.c1 = io0Var.c1;
                io0Var4.d1 = io0Var.d1;
                io0Var4.T = new pn0(io0Var);
                io0Var.presentFragment(io0Var4);
                break;
            case 4:
                io0 io0Var5 = new io0(io0Var.b1, io0Var.C0, io0Var.N0, io0Var.O0, 0, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.x0, io0Var.I0, io0Var.U0, null, io0Var.r0, io0Var.W0);
                io0Var5.c1 = io0Var.c1;
                io0Var5.d1 = io0Var.d1;
                io0Var5.T = new qn0(io0Var);
                io0Var.presentFragment(io0Var5);
                break;
            case 5:
                if (!io0Var.P0) {
                    boolean z10 = !io0Var.F;
                    io0Var.F = z10;
                    io0Var.V.setChecked(z10);
                    io0Var.W.a(io0Var.F, true);
                    break;
                }
                break;
            case 6:
                io0.Z(io0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(io0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (io0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.v0.h(R.string.TurnPasswordOffPassport, si.o0.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.T = string;
                c2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new gn0(io0Var, i11));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                io0Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, io0Var.Y0);
                    break;
                }
                break;
            case 8:
                boolean z11 = !io0Var.T0;
                io0Var.T0 = z11;
                io0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !io0Var.U0;
                io0Var.U0 = z12;
                io0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !io0Var.U0;
                io0Var.U0 = z13;
                io0Var.L.setChecked(z13);
                break;
            case 11:
                io0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i12 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = io0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else {
                        k6VarArr[i12].a(intValue == i12, true);
                        i12++;
                    }
                }
            case 12:
                io0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = io0.p0();
                    if (io0Var.K0 == null || io0Var.M0 != null) {
                        p02.put("tokenizationSpecification", new vn0(io0Var, 3));
                    } else {
                        p02.put("tokenizationSpecification", new vn0(io0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(io0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = io0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i13)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, io0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(io0Var.L0)) {
                        jSONObject.put("countryCode", io0Var.L0);
                    }
                    jSONObject.put("currencyCode", io0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", io0Var.p0));
                    String jSONObject2 = put.toString();
                    v8.j jVar = new v8.j();
                    jVar.r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = io0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.c = new k2.w0(jVar, 27);
                    b10.d = new k6.c[]{v8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), io0Var.getParentActivity());
                    break;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                io0Var.v0 = false;
                io0Var.t0();
                break;
            default:
                io0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(io0Var.f[0]);
                break;
        }
    }
}
