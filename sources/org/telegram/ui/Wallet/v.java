package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Utilities.Callback3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(m0 m0Var, Utilities.Callback callback, byte[] bArr, j0 j0Var) {
        this.b = m0Var;
        this.c = callback;
        this.d = bArr;
        this.e = j0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                byte[] bArr = (byte[]) this.d;
                j0 j0Var = (j0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m0 m0Var = this.b;
                int i10 = m0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        m0Var.i0(walletState);
                        new q0(m0.v(), m0Var.s(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, j0Var, callback);
                        m0Var.P();
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
                w9 w9Var = (w9) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = w9Var.e;
                m0 m0Var2 = this.b;
                if (!m0.a(str4, m0Var2.s())) {
                    callback2.run("WALLET_CHANGED");
                    break;
                } else {
                    m0Var2.b0(user, str2, 0L, str3, null, w9Var.d, null, new x(11, w9Var, callback2), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ v(w9 w9Var, m0 m0Var, TLRPC.User user, String str) {
        this.c = w9Var;
        this.b = m0Var;
        this.d = user;
        this.e = str;
    }
}
