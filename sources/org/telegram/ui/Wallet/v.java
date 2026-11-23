package org.telegram.ui.Wallet;

import org.telegram.messenger.k10;
import org.telegram.messenger.t10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements t10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(u0 u0Var, y10 y10Var, byte[] bArr, r0 r0Var) {
        this.b = u0Var;
        this.c = y10Var;
        this.d = bArr;
        this.e = r0Var;
    }

    @Override // org.telegram.messenger.t10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                y10 y10Var = (y10) this.c;
                byte[] bArr = (byte[]) this.d;
                r0 r0Var = (r0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u0 u0Var = this.b;
                int i7 = u0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        u0Var.w0(walletState);
                        new z0(i7, u0.C(), u0Var.y()).q(k10.i(i7).e(), bArr, r0Var, y10Var);
                        u0Var.Z();
                        break;
                    } else {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        y10Var.a(str);
                        break;
                    }
                }
                break;
            default:
                na naVar = (na) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                y10 y10Var2 = (y10) obj3;
                String str4 = naVar.f;
                u0 u0Var2 = this.b;
                if (!u0.c(str4, u0Var2.y())) {
                    y10Var2.a("WALLET_CHANGED");
                    break;
                } else {
                    u0Var2.m0(user, str2, 0L, str3, null, naVar.e, null, new p51(15, naVar, y10Var2), null);
                    break;
                }
        }
    }

    public /* synthetic */ v(na naVar, u0 u0Var, TLRPC.User user, String str) {
        this.c = naVar;
        this.b = u0Var;
        this.d = user;
        this.e = str;
    }
}
