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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo0 b;

    public /* synthetic */ hn0(lo0 lo0Var, int i10) {
        this.a = i10;
        this.b = lo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        lo0 lo0Var = this.b;
        switch (i10) {
            case 0:
                if (lo0Var.getParentActivity() != null) {
                    lo0Var.G0(null);
                    break;
                }
                break;
            case 1:
                lo0 lo0Var2 = new lo0(lo0Var.Y0, lo0Var.z0, lo0Var.K0, lo0Var.L0, 0, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.u0, lo0Var.F0, lo0Var.R0, null, lo0Var.o0, lo0Var.T0);
                lo0Var2.Z0 = lo0Var.Z0;
                lo0Var2.a1 = lo0Var.a1;
                lo0Var2.Q = new rn0(lo0Var);
                lo0Var.presentFragment(lo0Var2);
                break;
            case 2:
                lo0 lo0Var3 = new lo0(lo0Var.Y0, lo0Var.z0, lo0Var.K0, lo0Var.L0, 0, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.u0, lo0Var.F0, lo0Var.R0, null, lo0Var.o0, lo0Var.T0);
                lo0Var3.Z0 = lo0Var.Z0;
                lo0Var3.a1 = lo0Var.a1;
                lo0Var3.Q = new sn0(lo0Var);
                lo0Var.presentFragment(lo0Var3);
                break;
            case 3:
                lo0 lo0Var4 = new lo0(lo0Var.Y0, lo0Var.z0, lo0Var.K0, lo0Var.L0, 0, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.u0, lo0Var.F0, lo0Var.R0, null, lo0Var.o0, lo0Var.T0);
                lo0Var4.Z0 = lo0Var.Z0;
                lo0Var4.a1 = lo0Var.a1;
                lo0Var4.Q = new tn0(lo0Var);
                lo0Var.presentFragment(lo0Var4);
                break;
            case 4:
                lo0 lo0Var5 = new lo0(lo0Var.Y0, lo0Var.z0, lo0Var.K0, lo0Var.L0, 0, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.u0, lo0Var.F0, lo0Var.R0, null, lo0Var.o0, lo0Var.T0);
                lo0Var5.Z0 = lo0Var.Z0;
                lo0Var5.a1 = lo0Var.a1;
                lo0Var5.Q = new un0(lo0Var);
                lo0Var.presentFragment(lo0Var5);
                break;
            case 5:
                if (!lo0Var.M0) {
                    boolean z4 = !lo0Var.C;
                    lo0Var.C = z4;
                    lo0Var.S.setChecked(z4);
                    lo0Var.T.a(lo0Var.C, true);
                    break;
                }
                break;
            case 6:
                lo0.Z(lo0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (lo0Var.X.has_secure_values) {
                    string = org.telegram.messenger.y3.h(R.string.TurnPasswordOffPassport, w.c.f(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.Q = string;
                d2Var.O = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new ln0(lo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                lo0Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(lo0Var.getThemedColor(org.telegram.ui.ActionBar.k6.q7));
                    break;
                }
                break;
            case 8:
                boolean z10 = !lo0Var.Q0;
                lo0Var.Q0 = z10;
                lo0Var.I.setChecked(z10);
                break;
            case 9:
                boolean z11 = !lo0Var.R0;
                lo0Var.R0 = z11;
                lo0Var.I.setChecked(z11);
                break;
            case 10:
                boolean z12 = !lo0Var.R0;
                lo0Var.R0 = z12;
                lo0Var.I.setChecked(z12);
                break;
            case 11:
                lo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = lo0Var.h;
                    if (i11 >= j6VarArr.length) {
                        break;
                    } else {
                        j6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                lo0Var.M.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = lo0.p0();
                    if (lo0Var.H0 == null || lo0Var.J0 != null) {
                        p02.put("tokenizationSpecification", new j9.f(lo0Var, 4));
                    } else {
                        p02.put("tokenizationSpecification", new j9.f(lo0Var, 2));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(lo0Var.z0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = lo0Var.D0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, lo0Var.z0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(lo0Var.I0)) {
                        jSONObject.put("countryCode", lo0Var.I0);
                    }
                    jSONObject.put("currencyCode", lo0Var.z0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", lo0Var.m0));
                    String jSONObject2 = put.toString();
                    j8.j jVar = new j8.j();
                    jVar.r = true;
                    b6.m.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    a8.e eVar = lo0Var.e;
                    eVar.getClass();
                    com.google.android.gms.common.api.internal.v e6 = com.google.android.gms.common.api.internal.w.e();
                    e6.c = new y5.h(jVar, 21);
                    e6.d = new y5.c[]{j8.p.b};
                    e6.b = true;
                    e6.a = 23707;
                    j8.a.a(eVar.e(1, e6.e()), lo0Var.getParentActivity());
                    break;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 13:
                lo0Var.s0 = false;
                lo0Var.t0();
                break;
            default:
                lo0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(lo0Var.f[0]);
                break;
        }
    }
}
