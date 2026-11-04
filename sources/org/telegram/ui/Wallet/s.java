package org.telegram.ui.Wallet;

import org.telegram.messenger.h10;
import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements p10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s(k0 k0Var, u10 u10Var, byte[] bArr, h0 h0Var) {
        this.b = k0Var;
        this.c = u10Var;
        this.d = bArr;
        this.e = h0Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                u10 u10Var = (u10) this.c;
                byte[] bArr = (byte[]) this.d;
                h0 h0Var = (h0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0 k0Var = this.b;
                int i3 = k0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        k0Var.l0(walletState);
                        new o0(i3, k0.w(), k0Var.t()).p(h10.i(i3).e(), bArr, h0Var, u10Var);
                        k0Var.R();
                        break;
                    } else {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        u10Var.a(str);
                        break;
                    }
                }
                break;
            default:
                w9 w9Var = (w9) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                u10 u10Var2 = (u10) obj3;
                String str4 = w9Var.f;
                k0 k0Var2 = this.b;
                if (!k0.b(str4, k0Var2.t())) {
                    u10Var2.a("WALLET_CHANGED");
                    break;
                } else {
                    k0Var2.d0(user, str2, 0L, str3, null, w9Var.e, null, new e51(14, w9Var, u10Var2), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ s(w9 w9Var, k0 k0Var, TLRPC.User user, String str) {
        this.c = w9Var;
        this.b = k0Var;
        this.d = user;
        this.e = str;
    }
}
