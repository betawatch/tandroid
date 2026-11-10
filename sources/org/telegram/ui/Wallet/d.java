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
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        m41 m41Var;
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
                    l0.j("emulate disable backup, no transaction: ".concat(str2 != null ? str2 : "NULL_ERROR"));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    break;
                }
            case 2:
                ((v10) this.b).a((i0) obj, (String) obj2);
                break;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((s) this.b).a((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : d2.z(tL_error2, "closeSession"));
                break;
            case 4:
                d2 d2Var = (d2) this.b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = d2Var.b;
                ArrayList arrayList = d2Var.d;
                d2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    l0Var.L();
                    break;
                } else {
                    d2.z(tL_error3, "getSessions");
                    l0Var.L();
                    break;
                }
            case 5:
                ((ArrayList) obj).add(x31.k(((y2) this.b).T1));
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
                    p3Var.h.post(new j3(p3Var, 0));
                    break;
                } else {
                    bitmap.recycle();
                    bitmap2.recycle();
                    break;
                }
                break;
            case 7:
                z5 z5Var = (z5) this.b;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    z5Var.R0 = true;
                    z5Var.S0 = password.has_password;
                    fi.w3 w3Var = z5Var.a;
                    if (w3Var != null && (m41Var = w3Var.f3) != null) {
                        m41Var.O(true);
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
                WalletEngine2.HttpTransport.lambda$execute$0((l7) this.b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((y9) this.b).h = false;
                break;
        }
    }

    public /* synthetic */ d(l0 l0Var, j jVar) {
        this.a = 1;
        this.b = jVar;
    }
}
