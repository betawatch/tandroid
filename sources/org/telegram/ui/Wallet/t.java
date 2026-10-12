package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Utilities.Callback3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t(j0 j0Var, Utilities.Callback callback, byte[] bArr, g0 g0Var) {
        this.b = j0Var;
        this.c = callback;
        this.d = bArr;
        this.e = g0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                byte[] bArr = (byte[]) this.d;
                g0 g0Var = (g0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                j0 j0Var = this.b;
                int i10 = j0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        j0Var.g0(walletState);
                        new o0(j0.u(), j0Var.r(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, g0Var, callback);
                        j0Var.O();
                        break;
                    } else {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        callback.run(str);
                        break;
                    }
                }
                break;
            default:
                r8 r8Var = (r8) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = r8Var.e;
                j0 j0Var2 = this.b;
                if (!j0.b(str4, j0Var2.r())) {
                    callback2.run("WALLET_CHANGED");
                    break;
                } else {
                    j0Var2.Z(user, str2, 0L, str3, null, r8Var.d, null, new y6(4, r8Var, callback2), null);
                    break;
                }
        }
    }

    public /* synthetic */ t(r8 r8Var, j0 j0Var, TLRPC.User user, String str) {
        this.c = r8Var;
        this.b = j0Var;
        this.d = user;
        this.e = str;
    }
}
