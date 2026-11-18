package org.telegram.ui.Wallet;

import org.telegram.messenger.j10;
import org.telegram.messenger.s10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements s10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(u0 u0Var, x10 x10Var, byte[] bArr, r0 r0Var) {
        this.b = u0Var;
        this.c = x10Var;
        this.d = bArr;
        this.e = r0Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                x10 x10Var = (x10) this.c;
                byte[] bArr = (byte[]) this.d;
                r0 r0Var = (r0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u0 u0Var = this.b;
                int i7 = u0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        u0Var.w0(walletState);
                        new z0(i7, u0.C(), u0Var.y()).q(j10.i(i7).e(), bArr, r0Var, x10Var);
                        u0Var.Z();
                        break;
                    } else {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        x10Var.a(str);
                        break;
                    }
                }
                break;
            default:
                na naVar = (na) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                x10 x10Var2 = (x10) obj3;
                String str4 = naVar.f;
                u0 u0Var2 = this.b;
                if (!u0.c(str4, u0Var2.y())) {
                    x10Var2.a("WALLET_CHANGED");
                    break;
                } else {
                    u0Var2.m0(user, str2, 0L, str3, null, naVar.e, null, new p51(15, naVar, x10Var2), null);
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
