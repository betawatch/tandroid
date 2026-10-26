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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    public /* synthetic */ kn0(po0 po0Var, int i10) {
        this.a = i10;
        this.b = po0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        po0 po0Var = this.b;
        switch (i10) {
            case 0:
                if (po0Var.getParentActivity() != null) {
                    po0Var.H0(null);
                    break;
                }
                break;
            case 1:
                po0 po0Var2 = new po0(po0Var.b1, po0Var.C0, po0Var.N0, po0Var.O0, 0, po0Var.E0, po0Var.G0, po0Var.H0, null, po0Var.x0, po0Var.I0, po0Var.U0, null, po0Var.r0, po0Var.W0);
                po0Var2.c1 = po0Var.c1;
                po0Var2.d1 = po0Var.d1;
                po0Var2.T = new un0(po0Var);
                po0Var.presentFragment(po0Var2);
                break;
            case 2:
                po0 po0Var3 = new po0(po0Var.b1, po0Var.C0, po0Var.N0, po0Var.O0, 0, po0Var.E0, po0Var.G0, po0Var.H0, null, po0Var.x0, po0Var.I0, po0Var.U0, null, po0Var.r0, po0Var.W0);
                po0Var3.c1 = po0Var.c1;
                po0Var3.d1 = po0Var.d1;
                po0Var3.T = new vn0(po0Var);
                po0Var.presentFragment(po0Var3);
                break;
            case 3:
                po0 po0Var4 = new po0(po0Var.b1, po0Var.C0, po0Var.N0, po0Var.O0, 0, po0Var.E0, po0Var.G0, po0Var.H0, null, po0Var.x0, po0Var.I0, po0Var.U0, null, po0Var.r0, po0Var.W0);
                po0Var4.c1 = po0Var.c1;
                po0Var4.d1 = po0Var.d1;
                po0Var4.T = new wn0(po0Var);
                po0Var.presentFragment(po0Var4);
                break;
            case 4:
                po0 po0Var5 = new po0(po0Var.b1, po0Var.C0, po0Var.N0, po0Var.O0, 0, po0Var.E0, po0Var.G0, po0Var.H0, null, po0Var.x0, po0Var.I0, po0Var.U0, null, po0Var.r0, po0Var.W0);
                po0Var5.c1 = po0Var.c1;
                po0Var5.d1 = po0Var.d1;
                po0Var5.T = new xn0(po0Var);
                po0Var.presentFragment(po0Var5);
                break;
            case 5:
                if (!po0Var.P0) {
                    boolean z10 = !po0Var.F;
                    po0Var.F = z10;
                    po0Var.V.setChecked(z10);
                    po0Var.W.a(po0Var.F, true);
                    break;
                }
                break;
            case 6:
                po0.a0(po0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(po0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (po0Var.a0.has_secure_values) {
                    string = org.telegram.messenger.t.h(R.string.TurnPasswordOffPassport, org.telegram.ui.Components.b10.l(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.T = string;
                e2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new on0(po0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                po0Var.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, po0Var.Y0);
                    break;
                }
                break;
            case 8:
                boolean z11 = !po0Var.T0;
                po0Var.T0 = z11;
                po0Var.L.setChecked(z11);
                break;
            case 9:
                boolean z12 = !po0Var.U0;
                po0Var.U0 = z12;
                po0Var.L.setChecked(z12);
                break;
            case 10:
                boolean z13 = !po0Var.U0;
                po0Var.U0 = z13;
                po0Var.L.setChecked(z13);
                break;
            case 11:
                po0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.o6[] o6VarArr = po0Var.h;
                    if (i11 >= o6VarArr.length) {
                        break;
                    } else {
                        o6VarArr[i11].a(intValue == i11, true);
                        i11++;
                    }
                }
            case 12:
                po0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject q02 = po0.q0();
                    if (po0Var.K0 == null || po0Var.M0 != null) {
                        q02.put("tokenizationSpecification", new co0(po0Var, 3));
                    } else {
                        q02.put("tokenizationSpecification", new co0(po0Var, 1));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(q02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(po0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = po0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, po0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(po0Var.L0)) {
                        jSONObject.put("countryCode", po0Var.L0);
                    }
                    jSONObject.put("currencyCode", po0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", po0Var.p0));
                    String jSONObject2 = put.toString();
                    w8.j jVar = new w8.j();
                    jVar.r = true;
                    o6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    jVar.s = jSONObject2;
                    a6.a aVar = po0Var.e;
                    aVar.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.c = new li.h5(jVar);
                    b10.d = new l6.c[]{w8.p.b};
                    b10.b = true;
                    b10.a = 23707;
                    w8.a.a(aVar.e(1, b10.a()), po0Var.getParentActivity());
                    break;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                po0Var.v0 = false;
                po0Var.u0();
                break;
            default:
                po0Var.f[0].requestFocus();
                AndroidUtilities.showKeyboard(po0Var.f[0]);
                break;
        }
    }
}
