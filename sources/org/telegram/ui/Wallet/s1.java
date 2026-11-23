package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, int i7) {
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
                e3 e3Var = (e3) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                if (org.telegram.messenger.g0.g(jSONObject.optString("text"))) {
                    m10.t(null, 2131742738, new kc(e3Var.F, i6Var));
                    break;
                }
                break;
            case 1:
                o6.l0((o6) this.b, (Context) this.c, (org.telegram.ui.ActionBar.g5) this.d, view);
                break;
            case 2:
                v0 v0Var = (v0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                x60 x60Var = (x60) this.d;
                g gVar = v0Var.h;
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
                x60Var.v();
                break;
            default:
                h9 h9Var = (h9) this.b;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.c;
                Runnable runnable = (Runnable) this.d;
                h9Var.getClass();
                t1VarArr[0].dismiss();
                org.telegram.messenger.g0.g(h9Var.s);
                runnable.run();
                break;
        }
    }
}
