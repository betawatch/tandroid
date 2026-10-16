package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        a71 a71Var;
        String str;
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    Utilities.stageQueue.postRunnable(new e(fVar, currencyrates, 0));
                    break;
                } else {
                    i2.d.v(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    break;
                }
            case 1:
                j jVar = (j) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction != null) {
                    jVar.run(Long.valueOf(wallettransaction.fee), null);
                    break;
                } else {
                    k0.i("emulate disable backup, no transaction: ".concat(str2 != null ? str2 : "NULL_ERROR"));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.run(null, str2);
                    break;
                }
            case 2:
                ((t) this.b).run((TL_wallet.sendTransfer) obj, null, (String) obj2);
                break;
            case 3:
                ((Utilities.Callback2) this.b).run((h0) obj, (String) obj2);
                break;
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((mt) this.b).run((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : e2.x(tL_error2, "closeSession"));
                break;
            case 5:
                e2 e2Var = (e2) this.b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                k0 k0Var = e2Var.b;
                ArrayList arrayList = e2Var.d;
                e2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    k0Var.I();
                    break;
                } else {
                    e2.x(tL_error3, "getSessions");
                    k0Var.I();
                    break;
                }
            case 6:
                ((ArrayList) obj).add(m61.k(((j2) this.b).Y));
                break;
            case 7:
                a5 a5Var = (a5) this.b;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    a5Var.F0 = true;
                    a5Var.G0 = password.has_password;
                    c71 c71Var = a5Var.a;
                    if (c71Var != null && (a71Var = c71Var.W2) != null) {
                        a71Var.N(true);
                        break;
                    }
                }
                break;
            case 8:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    callback.run(null);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        pf.d.r(U.getContext(), onrampsession.url);
                        break;
                    }
                } else {
                    if (tL_error4 == null || (str = tL_error4.text) == null) {
                        str = "NO_SESSION";
                    }
                    callback.run(str);
                    break;
                }
                break;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((s6) this.b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((s8) this.b).f = false;
                break;
        }
    }

    public /* synthetic */ d(k0 k0Var, j jVar) {
        this.a = 1;
        this.b = jVar;
    }
}
