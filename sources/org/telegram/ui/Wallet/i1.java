package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.i20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                w2 w2Var = (w2) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                if (org.telegram.messenger.g0.g(jSONObject.optString("text"))) {
                    i20.s(null, 2131743009, new cc(w2Var.F, e6Var));
                    break;
                }
                break;
            case 1:
                l0 l0Var = (l0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                m60 m60Var = (m60) this.d;
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
                m60Var.u();
                break;
            default:
                s8 s8Var = (s8) this.b;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.c;
                Runnable runnable = (Runnable) this.d;
                s8Var.getClass();
                t1VarArr[0].dismiss();
                org.telegram.messenger.g0.g(s8Var.s);
                runnable.run();
                break;
        }
    }
}
