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
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        l41 l41Var;
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
                    m0.j("emulate disable backup, no transaction: ".concat(str2 != null ? str2 : "NULL_ERROR"));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    break;
                }
            case 2:
                ((v10) this.b).a((j0) obj, (String) obj2);
                break;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((t) this.b).a((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : e2.z(tL_error2, "closeSession"));
                break;
            case 4:
                e2 e2Var = (e2) this.b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m0 m0Var = e2Var.b;
                ArrayList arrayList = e2Var.d;
                e2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    m0Var.L();
                    break;
                } else {
                    e2.z(tL_error3, "getSessions");
                    m0Var.L();
                    break;
                }
            case 5:
                ((ArrayList) obj).add(x31.k(((z2) this.b).Q1));
                break;
            case 6:
                o3 o3Var = (o3) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!o3Var.S && !o3Var.R) {
                    o3Var.G = bitmap;
                    o3Var.n.invalidate();
                    o3Var.d();
                    o3Var.E.a(bitmap2);
                    o3Var.h.post(new k3(o3Var, 1));
                    break;
                } else {
                    bitmap.recycle();
                    bitmap2.recycle();
                    break;
                }
                break;
            case 7:
                x5 x5Var = (x5) this.b;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    x5Var.R0 = true;
                    x5Var.S0 = password.has_password;
                    fi.w3 w3Var = x5Var.a;
                    if (w3Var != null && (l41Var = w3Var.f3) != null) {
                        l41Var.O(true);
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
                WalletEngine2.HttpTransport.lambda$execute$0((j7) this.b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((w9) this.b).h = false;
                break;
        }
    }

    public /* synthetic */ d(m0 m0Var, j jVar) {
        this.a = 1;
        this.b = jVar;
    }
}
