package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.b;
                y2 y2Var = (y2) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                if (org.telegram.messenger.g0.g(jSONObject.optString("text"))) {
                    org.telegram.messenger.camera.q.r(null, 2131743012, new hc(y2Var.E, f6Var));
                    break;
                }
                break;
            case 1:
                o3 o3Var = (o3) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!o3Var.R) {
                    if (o3Var.e) {
                        o3Var.U = new j3(1, f2Var);
                    } else if (o3Var.d) {
                        o3Var.U = new j3(i7, f2Var);
                    } else if (o3Var.c && !TextUtils.isEmpty(cardVar.address)) {
                        o3Var.U = new n(7, f2Var, cardVar);
                    }
                    o3Var.dismiss();
                    break;
                }
                break;
            case 2:
                m0 m0Var = (m0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                k60 k60Var = (k60) this.d;
                f fVar = m0Var.h;
                String str = currencyrate.currency;
                if (!TextUtils.equals(fVar.f, str)) {
                    fVar.f = str;
                    try {
                        org.telegram.messenger.t0.b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    fVar.b.L();
                }
                k60Var.u();
                break;
            default:
                q8 q8Var = (q8) this.b;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.c;
                Runnable runnable = (Runnable) this.d;
                q8Var.getClass();
                u1VarArr[0].dismiss();
                org.telegram.messenger.g0.g(q8Var.s);
                runnable.run();
                break;
        }
    }
}
