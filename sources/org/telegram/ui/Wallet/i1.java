package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l60;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i1(Object obj, Object obj2, Object obj3, int i7) {
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
                x2 x2Var = (x2) this.c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                if (org.telegram.messenger.g0.g(jSONObject.optString("text"))) {
                    org.telegram.messenger.camera.q.r(null, 2131743009, new hc(x2Var.E, g6Var));
                    break;
                }
                break;
            case 1:
                n3 n3Var = (n3) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!n3Var.R) {
                    if (n3Var.e) {
                        n3Var.U = new i3(1, f2Var);
                    } else if (n3Var.d) {
                        n3Var.U = new i3(i7, f2Var);
                    } else if (n3Var.c && !TextUtils.isEmpty(cardVar.address)) {
                        n3Var.U = new wb1(8, f2Var, cardVar);
                    }
                    n3Var.dismiss();
                    break;
                }
                break;
            case 2:
                l0 l0Var = (l0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                l60 l60Var = (l60) this.d;
                f fVar = l0Var.h;
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
                l60Var.u();
                break;
            default:
                p8 p8Var = (p8) this.b;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.c;
                Runnable runnable = (Runnable) this.d;
                p8Var.getClass();
                u1VarArr[0].dismiss();
                org.telegram.messenger.g0.g(p8Var.s);
                runnable.run();
                break;
        }
    }
}
