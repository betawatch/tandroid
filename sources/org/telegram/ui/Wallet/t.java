package org.telegram.ui.Wallet;

import org.telegram.messenger.m10;
import org.telegram.messenger.u10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements u10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t(l0 l0Var, z10 z10Var, byte[] bArr, i0 i0Var) {
        this.b = l0Var;
        this.c = z10Var;
        this.d = bArr;
        this.e = i0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                z10 z10Var = (z10) this.c;
                byte[] bArr = (byte[]) this.d;
                i0 i0Var = (i0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0 l0Var = this.b;
                int i7 = l0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        l0Var.l0(walletState);
                        new p0(i7, l0.w(), l0Var.t()).p(m10.i(i7).e(), bArr, i0Var, z10Var);
                        l0Var.R();
                        break;
                    } else {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        z10Var.a(str);
                        break;
                    }
                }
                break;
            default:
                z9 z9Var = (z9) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                z10 z10Var2 = (z10) obj3;
                String str4 = z9Var.f;
                l0 l0Var2 = this.b;
                if (!l0.b(str4, l0Var2.t())) {
                    z10Var2.a("WALLET_CHANGED");
                    break;
                } else {
                    l0Var2.d0(user, str2, 0L, str3, null, z9Var.e, null, new x21(16, z9Var, z10Var2), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ t(z9 z9Var, l0 l0Var, TLRPC.User user, String str) {
        this.c = z9Var;
        this.b = l0Var;
        this.d = user;
        this.e = str;
    }
}
