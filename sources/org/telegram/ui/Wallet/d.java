package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        p51 p51Var;
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
                    a1.g.z(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
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
                    k0.j("emulate disable backup, no transaction: ".concat(str2 != null ? str2 : "NULL_ERROR"));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.a(null, str2);
                    break;
                }
            case 2:
                ((j20) this.b).a((h0) obj, (String) obj2);
                break;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((f11) this.b).a((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : e2.z(tL_error2, "closeSession"));
                break;
            case 4:
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
                    k0Var.L();
                    break;
                } else {
                    e2.z(tL_error3, "getSessions");
                    k0Var.L();
                    break;
                }
            case 5:
                ((ArrayList) obj).add(a51.k(((z2) this.b).Q1));
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
                b6 b6Var = (b6) this.b;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    b6Var.R0 = true;
                    b6Var.S0 = password.has_password;
                    ii iiVar = b6Var.a;
                    if (iiVar != null && (p51Var = iiVar.f3) != null) {
                        p51Var.O(true);
                        break;
                    }
                }
                break;
            case 8:
                q20 q20Var = (q20) this.b;
                TL_toncenter.onrampSession onrampsession = (TL_toncenter.onrampSession) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (onrampsession != null && !TextUtils.isEmpty(onrampsession.url)) {
                    q20Var.a(null);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        gf.f.r(T.getContext(), onrampsession.url);
                        break;
                    }
                } else {
                    if (tL_error4 == null || (str = tL_error4.text) == null) {
                        str = "NO_SESSION";
                    }
                    q20Var.a(str);
                    break;
                }
                break;
            case 9:
                WalletEngine2.HttpTransport.lambda$execute$0((p7) this.b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((ba) this.b).h = false;
                break;
        }
    }

    public /* synthetic */ d(k0 k0Var, j jVar) {
        this.a = 1;
        this.b = jVar;
    }
}
