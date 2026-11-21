package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, int i7) {
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
                d3 d3Var = (d3) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                if (org.telegram.messenger.g0.g(jSONObject.optString("text"))) {
                    n10.t(null, 2131742745, new lc(d3Var.F, h6Var));
                    break;
                }
                break;
            case 1:
                n6.l0((n6) this.b, (Context) this.c, (org.telegram.ui.ActionBar.g5) this.d, view);
                break;
            case 2:
                u0 u0Var = (u0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                a70 a70Var = (a70) this.d;
                g gVar = u0Var.h;
                String str = currencyrate.currency;
                if (!TextUtils.equals(gVar.f, str)) {
                    gVar.f = str;
                    try {
                        org.telegram.messenger.t0.b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", gVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    gVar.b.T();
                }
                a70Var.v();
                break;
            default:
                g9 g9Var = (g9) this.b;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.c;
                Runnable runnable = (Runnable) this.d;
                g9Var.getClass();
                t1VarArr[0].dismiss();
                org.telegram.messenger.g0.g(g9Var.s);
                runnable.run();
                break;
        }
    }
}
