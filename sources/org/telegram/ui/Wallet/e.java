package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        c51 c51Var;
        String str;
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    Utilities.d.c(new f(gVar, currencyrates, 0));
                    break;
                } else {
                    p5.c.s(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
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
                    u0.n("emulate disable backup, no transaction: ".concat(str2 != null ? str2 : "NULL_ERROR"));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    break;
                }
            case 2:
                ((q10) this.b).a((r0) obj, (String) obj2);
                break;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((p51) this.b).a((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : l2.z(tL_error2, "closeSession"));
                break;
            case 4:
                l2 l2Var = (l2) this.b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                u0 u0Var = l2Var.b;
                ArrayList arrayList = l2Var.d;
                l2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    u0Var.T();
                    break;
                } else {
                    l2.z(tL_error3, "getSessions");
                    u0Var.T();
                    break;
                }
            case 5:
                ((ArrayList) obj).add(o41.k(((e3) this.b).U1));
                break;
            case 6:
                w3 w3Var = (w3) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!w3Var.T && !w3Var.S) {
                    w3Var.H = bitmap;
                    w3Var.n.invalidate();
                    w3Var.d();
                    w3Var.F.a(bitmap2);
                    w3Var.h.post(new q3(w3Var, 0));
                    break;
                } else {
                    bitmap.recycle();
                    bitmap2.recycle();
                    break;
                }
                break;
            case 7:
                n6 n6Var = (n6) this.b;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    n6Var.V0 = true;
                    n6Var.W0 = password.has_password;
                    bi.g6 g6Var = n6Var.a;
                    if (g6Var != null && (c51Var = g6Var.g3) != null) {
                        c51Var.O(true);
                        break;
                    }
                }
                break;
            case 8:
                x4 x4Var = (x4) this.b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    x4Var.a(null);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        vf.c.t(T.getContext(), onrampsession.url);
                        break;
                    }
                } else {
                    if (tL_error4 == null || (str = tL_error4.text) == null) {
                        str = "NO_SESSION";
                    }
                    x4Var.a(str);
                    break;
                }
                break;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((z7) this.b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((na) this.b).h = false;
                break;
        }
    }

    public /* synthetic */ e(u0 u0Var, j jVar) {
        this.a = 1;
        this.b = jVar;
    }
}
