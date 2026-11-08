package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements x10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u(m0 m0Var, c20 c20Var, byte[] bArr, j0 j0Var) {
        this.b = m0Var;
        this.c = c20Var;
        this.d = bArr;
        this.e = j0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                c20 c20Var = (c20) this.c;
                byte[] bArr = (byte[]) this.d;
                j0 j0Var = (j0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m0 m0Var = this.b;
                int i7 = m0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        m0Var.l0(walletState);
                        new q0(i7, m0.w(), m0Var.t()).p(p10.i(i7).e(), bArr, j0Var, c20Var);
                        m0Var.R();
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
                w9 w9Var = (w9) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                c20 c20Var2 = (c20) obj3;
                String str4 = w9Var.f;
                m0 m0Var2 = this.b;
                if (!m0.b(str4, m0Var2.t())) {
                    c20Var2.a("WALLET_CHANGED");
                    break;
                } else {
                    m0Var2.d0(user, str2, 0L, str3, null, w9Var.e, null, new t(11, w9Var, c20Var2), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ u(w9 w9Var, m0 m0Var, TLRPC.User user, String str) {
        this.c = w9Var;
        this.b = m0Var;
        this.d = user;
        this.e = str;
    }
}
