package org.telegram.ui.Wallet;

import org.telegram.messenger.e20;
import org.telegram.messenger.m20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.d01;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements m20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s(k0 k0Var, r20 r20Var, byte[] bArr, h0 h0Var) {
        this.b = k0Var;
        this.c = r20Var;
        this.d = bArr;
        this.e = h0Var;
    }

    @Override // org.telegram.messenger.m20
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                r20 r20Var = (r20) this.c;
                byte[] bArr = (byte[]) this.d;
                h0 h0Var = (h0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0 k0Var = this.b;
                int i10 = k0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        k0Var.l0(walletState);
                        new p0(i10, k0.w(), k0Var.t()).p(e20.i(i10).e(), bArr, h0Var, r20Var);
                        k0Var.R();
                        break;
                    } else {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        r20Var.a(str);
                        break;
                    }
                }
                break;
            default:
                ba baVar = (ba) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                r20 r20Var2 = (r20) obj3;
                String str4 = baVar.f;
                k0 k0Var2 = this.b;
                if (!k0.b(str4, k0Var2.t())) {
                    r20Var2.a("WALLET_CHANGED");
                    break;
                } else {
                    k0Var2.d0(user, str2, 0L, str3, null, baVar.e, null, new d01(18, baVar, r20Var2), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ s(ba baVar, k0 k0Var, TLRPC.User user, String str) {
        this.c = baVar;
        this.b = k0Var;
        this.d = user;
        this.e = str;
    }
}
