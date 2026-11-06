package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        f41 f41Var;
        String str;
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    Utilities.d.c(new e(fVar, currencyrates, 0));
                    break;
                } else {
                    org.telegram.ui.Cells.f1.u(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    break;
                }
            case 1:
                j jVar = (j) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction != null) {
                    jVar.a(Long.valueOf(wallettransaction.fee), null);
                    break;
                } else {
                    n0.j("emulate disable backup, no transaction: ".concat(str2 != null ? str2 : "NULL_ERROR"));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    break;
                }
            case 2:
                ((v10) this.b).a((k0) obj, (String) obj2);
                break;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((t) this.b).a((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : f2.z(tL_error2, "closeSession"));
                break;
            case 4:
                f2 f2Var = (f2) this.b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                n0 n0Var = f2Var.b;
                ArrayList arrayList = f2Var.d;
                f2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    n0Var.L();
                    break;
                } else {
                    f2.z(tL_error3, "getSessions");
                    n0Var.L();
                    break;
                }
            case 5:
                ((ArrayList) obj).add(r31.k(((a3) this.b).Q1));
                break;
            case 6:
                p3 p3Var = (p3) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!p3Var.S && !p3Var.R) {
                    p3Var.G = bitmap;
                    p3Var.n.invalidate();
                    p3Var.d();
                    p3Var.E.a(bitmap2);
                    p3Var.h.post(new l3(p3Var, 1));
                    break;
                } else {
                    bitmap.recycle();
                    bitmap2.recycle();
                    break;
                }
                break;
            case 7:
                y5 y5Var = (y5) this.b;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    y5Var.R0 = true;
                    y5Var.S0 = password.has_password;
                    fi.w3 w3Var = y5Var.a;
                    if (w3Var != null && (f41Var = w3Var.f3) != null) {
                        f41Var.O(true);
                        break;
                    }
                }
                break;
            case 8:
                c20 c20Var = (c20) this.b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    c20Var.a(null);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        vf.c.t(T.getContext(), onrampsession.url);
                        break;
                    }
                } else {
                    if (tL_error4 == null || (str = tL_error4.text) == null) {
                        str = "NO_SESSION";
                    }
                    c20Var.a(str);
                    break;
                }
                break;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((k7) this.b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((x9) this.b).h = false;
                break;
        }
    }

    public /* synthetic */ d(n0 n0Var, j jVar) {
        this.a = 1;
        this.b = jVar;
    }
}
