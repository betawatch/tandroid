package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.wc;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.b;
                i2 i2Var = (i2) this.c;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                if (AndroidUtilities.addToClipboard(jSONObject.optString("text"))) {
                    wh.m(R.string.WalletSigningDataCopied, new wc(i2Var.topBulletinContainer, u6Var));
                    break;
                }
                break;
            case 1:
                y2 y2Var = (y2) this.b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!y2Var.R) {
                    if (y2Var.e) {
                        y2Var.U = new t2(1, r2Var);
                    } else if (y2Var.d) {
                        y2Var.U = new t2(0, r2Var);
                    } else if (y2Var.c && !TextUtils.isEmpty(cardVar.address)) {
                        y2Var.U = new yc1(20, r2Var, cardVar);
                    }
                    y2Var.dismiss();
                    break;
                }
                break;
            case 2:
                l0 l0Var = (l0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                l80 l80Var = (l80) this.d;
                f fVar = l0Var.h;
                String str = currencyrate.currency;
                if (!TextUtils.equals(fVar.f, str)) {
                    fVar.f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.b.L();
                }
                l80Var.u();
                break;
            default:
                k8 k8Var = (k8) this.b;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) this.c;
                Runnable runnable = (Runnable) this.d;
                k8Var.getClass();
                e2VarArr[0].dismiss();
                AndroidUtilities.addToClipboard(k8Var.s);
                runnable.run();
                break;
        }
    }
}
