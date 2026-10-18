package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        s61 s61Var;
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
                k kVar = (k) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction != null) {
                    kVar.run(Long.valueOf(wallettransaction.fee), null);
                    break;
                } else {
                    m0.i("emulate disable backup, no transaction: ".concat(str2 != null ? str2 : "NULL_ERROR"));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    kVar.run(null, str2);
                    break;
                }
            case 2:
                ((Utilities.Callback2) this.b).run((j0) obj, (String) obj2);
                break;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((x) this.b).run((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : f2.x(tL_error2, "closeSession"));
                break;
            case 4:
                f2 f2Var = (f2) this.b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m0 m0Var = f2Var.b;
                ArrayList arrayList = f2Var.d;
                f2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    m0Var.J();
                    break;
                } else {
                    f2.x(tL_error3, "getSessions");
                    m0Var.J();
                    break;
                }
            case 5:
                ((ArrayList) obj).add(f61.k(((k2) this.b).Y));
                break;
            case 6:
                y2 y2Var = (y2) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!y2Var.P && !y2Var.O) {
                    y2Var.G = bitmap;
                    y2Var.n.invalidate();
                    y2Var.E.a(bitmap2);
                    y2Var.h.post(new n(y2Var, 6));
                    break;
                } else {
                    bitmap.recycle();
                    bitmap2.recycle();
                    break;
                }
            case 7:
                m5 m5Var = (m5) this.b;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    m5Var.Q0 = true;
                    m5Var.R0 = password.has_password;
                    u61 u61Var = m5Var.a;
                    if (u61Var != null && (s61Var = u61Var.W2) != null) {
                        s61Var.N(true);
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
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
                WalletEngine2.HttpTransport.lambda$execute$0((h7) this.b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((w9) this.b).f = false;
                break;
        }
    }

    public /* synthetic */ d(m0 m0Var, k kVar) {
        this.a = 1;
        this.b = kVar;
    }
}
