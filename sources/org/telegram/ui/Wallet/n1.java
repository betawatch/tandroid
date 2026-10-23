package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.nk;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, int i10) {
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
                j2 j2Var = (j2) this.c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                if (AndroidUtilities.addToClipboard(jSONObject.optString("text"))) {
                    nk.p(R.string.WalletSigningDataCopied, new xc(j2Var.topBulletinContainer, d6Var));
                    break;
                }
                break;
            case 1:
                z2 z2Var = (z2) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!z2Var.R) {
                    if (z2Var.e) {
                        z2Var.U = new u2(1, n2Var);
                    } else if (z2Var.d) {
                        z2Var.U = new u2(0, n2Var);
                    } else if (z2Var.c && !TextUtils.isEmpty(cardVar.address)) {
                        z2Var.U = new k71(29, n2Var, cardVar);
                    }
                    z2Var.dismiss();
                    break;
                }
                break;
            case 2:
                m0 m0Var = (m0) this.b;
                TL_wallet.currencyRate currencyrate = (TL_wallet.currencyRate) this.c;
                i80 i80Var = (i80) this.d;
                f fVar = m0Var.h;
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
                i80Var.u();
                break;
            default:
                k8 k8Var = (k8) this.b;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.c;
                Runnable runnable = (Runnable) this.d;
                k8Var.getClass();
                b2VarArr[0].dismiss();
                AndroidUtilities.addToClipboard(k8Var.r);
                runnable.run();
                break;
        }
    }
}
