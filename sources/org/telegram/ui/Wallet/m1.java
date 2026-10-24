package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.o71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                if (AndroidUtilities.addToClipboard(jSONObject.optString("text"))) {
                    sl.p(R.string.WalletSigningDataCopied, new xc(i2Var.topBulletinContainer, g6Var));
                    break;
                }
                break;
            case 1:
                y2 y2Var = (y2) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!y2Var.R) {
                    if (y2Var.e) {
                        y2Var.U = new t2(1, o2Var);
                    } else if (y2Var.d) {
                        y2Var.U = new t2(0, o2Var);
                    } else if (y2Var.c && !TextUtils.isEmpty(cardVar.address)) {
                        y2Var.U = new o71(29, o2Var, cardVar);
                    }
                    y2Var.dismiss();
                    break;
                }
                break;
            case 2:
                l0 l0Var = (l0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                j80 j80Var = (j80) this.d;
                f fVar = l0Var.h;
                String str = currencyrate.currency;
                if (!TextUtils.equals(fVar.f, str)) {
                    fVar.f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.b.J();
                }
                j80Var.u();
                break;
            default:
                l8 l8Var = (l8) this.b;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.c;
                Runnable runnable = (Runnable) this.d;
                l8Var.getClass();
                c2VarArr[0].dismiss();
                AndroidUtilities.addToClipboard(l8Var.s);
                runnable.run();
                break;
        }
    }
}
