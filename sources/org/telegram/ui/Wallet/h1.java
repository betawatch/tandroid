package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = 0;
        switch (this.a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.b;
                x2 x2Var = (x2) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                if (org.telegram.messenger.g0.g(jSONObject.optString("text"))) {
                    org.telegram.messenger.camera.q.r(null, 2131743019, new fc(x2Var.F, e6Var));
                    break;
                }
                break;
            case 1:
                n3 n3Var = (n3) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!n3Var.S) {
                    if (n3Var.e) {
                        n3Var.V = new i3(1, d2Var);
                    } else if (n3Var.d) {
                        n3Var.V = new i3(i3, d2Var);
                    } else if (n3Var.c && !TextUtils.isEmpty(cardVar.address)) {
                        n3Var.V = new ma1(12, d2Var, cardVar);
                    }
                    n3Var.dismiss();
                    break;
                }
                break;
            case 2:
                k0 k0Var = (k0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                f60 f60Var = (f60) this.d;
                f fVar = k0Var.h;
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
                f60Var.u();
                break;
            default:
                q8 q8Var = (q8) this.b;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.c;
                Runnable runnable = (Runnable) this.d;
                q8Var.getClass();
                s1VarArr[0].dismiss();
                org.telegram.messenger.g0.g(q8Var.s);
                runnable.run();
                break;
        }
    }
}
