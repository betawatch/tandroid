package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Utilities.Callback3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u(k0 k0Var, Utilities.Callback callback, byte[] bArr, h0 h0Var) {
        this.b = k0Var;
        this.c = callback;
        this.d = bArr;
        this.e = h0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                byte[] bArr = (byte[]) this.d;
                h0 h0Var = (h0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0 k0Var = this.b;
                int i10 = k0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        k0Var.g0(walletState);
                        new p0(k0.u(), k0Var.r(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, h0Var, callback);
                        k0Var.O();
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
                s8 s8Var = (s8) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = s8Var.e;
                k0 k0Var2 = this.b;
                if (!k0.b(str4, k0Var2.r())) {
                    callback2.run("WALLET_CHANGED");
                    break;
                } else {
                    k0Var2.Z(user, str2, 0L, str3, null, s8Var.d, null, new z6(4, s8Var, callback2), null);
                    break;
                }
        }
    }

    public /* synthetic */ u(s8 s8Var, k0 k0Var, TLRPC.User user, String str) {
        this.c = s8Var;
        this.b = k0Var;
        this.d = user;
        this.e = str;
    }
}
