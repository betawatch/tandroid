package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements x10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u(n0 n0Var, c20 c20Var, byte[] bArr, k0 k0Var) {
        this.b = n0Var;
        this.c = c20Var;
        this.d = bArr;
        this.e = k0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                c20 c20Var = (c20) this.c;
                byte[] bArr = (byte[]) this.d;
                k0 k0Var = (k0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n0 n0Var = this.b;
                int i7 = n0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        n0Var.l0(walletState);
                        new r0(i7, n0.w(), n0Var.t()).p(p10.i(i7).e(), bArr, k0Var, c20Var);
                        n0Var.R();
                        break;
                    } else {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        c20Var.a(str);
                        break;
                    }
                }
                break;
            default:
                x9 x9Var = (x9) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                c20 c20Var2 = (c20) obj3;
                String str4 = x9Var.f;
                n0 n0Var2 = this.b;
                if (!n0.b(str4, n0Var2.t())) {
                    c20Var2.a("WALLET_CHANGED");
                    break;
                } else {
                    n0Var2.d0(user, str2, 0L, str3, null, x9Var.e, null, new t(11, x9Var, c20Var2), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ u(x9 x9Var, n0 n0Var, TLRPC.User user, String str) {
        this.c = x9Var;
        this.b = n0Var;
        this.d = user;
        this.e = str;
    }
}
