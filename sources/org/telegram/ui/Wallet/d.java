package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        b71 b71Var;
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
                    i2.o1.w(tL_error.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
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
                    l0.i("emulate disable backup, no transaction: ".concat(str2 != null ? str2 : "NULL_ERROR"));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    jVar.run(null, str2);
                    break;
                }
            case 2:
                ((Utilities.Callback2) this.b).run((i0) obj, (String) obj2);
                break;
            case 3:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((w) this.b).run((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : e2.x(tL_error2, "closeSession"));
                break;
            case 4:
                e2 e2Var = (e2) this.b;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                l0 l0Var = e2Var.b;
                ArrayList arrayList = e2Var.d;
                e2Var.e = -1;
                if (tL_error3 == null && tonconnectsessions != null) {
                    arrayList.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList2 = tonconnectsessions.sessions;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    l0Var.J();
                    break;
                } else {
                    e2.x(tL_error3, "getSessions");
                    l0Var.J();
                    break;
                }
            case 5:
                ((ArrayList) obj).add(m61.k(((j2) this.b).Y));
                break;
            case 6:
                y2 y2Var = (y2) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (!y2Var.S && !y2Var.R) {
                    y2Var.G = bitmap;
                    y2Var.n.invalidate();
                    y2Var.d();
                    y2Var.E.a(bitmap2);
                    y2Var.h.post(new u2(y2Var, 1));
                    break;
                } else {
                    bitmap.recycle();
                    bitmap2.recycle();
                    break;
                }
                break;
            case 7:
                o5 o5Var = (o5) this.b;
                TL_account.Password password = (TL_account.Password) obj;
                if (password != null) {
                    o5Var.Q0 = true;
                    o5Var.R0 = password.has_password;
                    d71 d71Var = o5Var.a;
                    if (d71Var != null && (b71Var = d71Var.Z2) != null) {
                        b71Var.N(true);
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
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
                WalletEngine2.HttpTransport.lambda$execute$0((b7) this.b, (TL_toncenter.apiResponse) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((s9) this.b).f = false;
                break;
        }
    }

    public /* synthetic */ d(l0 l0Var, j jVar) {
        this.a = 1;
        this.b = jVar;
    }
}
