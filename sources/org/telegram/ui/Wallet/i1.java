package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        switch (this.a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.b;
                x2 x2Var = (x2) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                if (org.telegram.messenger.g0.g(jSONObject.optString("text"))) {
                    org.telegram.messenger.camera.q.r(null, 2131743009, new gc(x2Var.E, h6Var));
                    break;
                }
                break;
            case 1:
                l0 l0Var = (l0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                k60 k60Var = (k60) this.d;
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
                k60Var.u();
                break;
            default:
                s8 s8Var = (s8) this.b;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.c;
                Runnable runnable = (Runnable) this.d;
                s8Var.getClass();
                u1VarArr[0].dismiss();
                org.telegram.messenger.g0.g(s8Var.s);
                runnable.run();
                break;
        }
    }
}
