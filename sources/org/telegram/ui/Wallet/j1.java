package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.a30;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.b;
                z2 z2Var = (z2) this.c;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.d;
                if (org.telegram.messenger.i0.g(jSONObject.optString("text"))) {
                    a30.r(null, 2131743035, new cc(z2Var.E, p6Var));
                    break;
                }
                break;
            case 1:
                p3 p3Var = (p3) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!p3Var.R) {
                    int i11 = 1;
                    if (p3Var.e) {
                        p3Var.U = new k3(i11, k2Var);
                    } else if (p3Var.d) {
                        p3Var.U = new k3(i10, k2Var);
                    } else if (p3Var.c && !TextUtils.isEmpty(cardVar.address)) {
                        p3Var.U = new m2(i11, k2Var, cardVar);
                    }
                    p3Var.dismiss();
                    break;
                }
                break;
            case 2:
                k0 k0Var = (k0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                z60 z60Var = (z60) this.d;
                f fVar = k0Var.h;
                String str = currencyrate.currency;
                if (!TextUtils.equals(fVar.f, str)) {
                    fVar.f = str;
                    try {
                        org.telegram.messenger.w0.b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.b.L();
                }
                z60Var.u();
                break;
            default:
                w8 w8Var = (w8) this.b;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) this.c;
                Runnable runnable = (Runnable) this.d;
                w8Var.getClass();
                x1VarArr[0].dismiss();
                org.telegram.messenger.i0.g(w8Var.s);
                runnable.run();
                break;
        }
    }
}
