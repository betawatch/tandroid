package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements x10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t(l0 l0Var, c20 c20Var, byte[] bArr, i0 i0Var) {
        this.b = l0Var;
        this.c = c20Var;
        this.d = bArr;
        this.e = i0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                c20 c20Var = (c20) this.c;
                byte[] bArr = (byte[]) this.d;
                i0 i0Var = (i0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0 l0Var = this.b;
                int i7 = l0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        l0Var.l0(walletState);
                        new p0(i7, l0.w(), l0Var.t()).p(p10.i(i7).e(), bArr, i0Var, c20Var);
                        l0Var.R();
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
                y9 y9Var = (y9) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                c20 c20Var2 = (c20) obj3;
                String str4 = y9Var.f;
                l0 l0Var2 = this.b;
                if (!l0.b(str4, l0Var2.t())) {
                    c20Var2.a("WALLET_CHANGED");
                    break;
                } else {
                    l0Var2.d0(user, str2, 0L, str3, null, y9Var.e, null, new s(11, y9Var, c20Var2), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ t(y9 y9Var, l0 l0Var, TLRPC.User user, String str) {
        this.c = y9Var;
        this.b = l0Var;
        this.d = user;
        this.e = str;
    }
}
