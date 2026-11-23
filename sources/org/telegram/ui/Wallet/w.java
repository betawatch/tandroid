package org.telegram.ui.Wallet;

import org.telegram.messenger.i10;
import org.telegram.messenger.r10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements r10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(v0 v0Var, w10 w10Var, byte[] bArr, s0 s0Var) {
        this.b = v0Var;
        this.c = w10Var;
        this.d = bArr;
        this.e = s0Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                w10 w10Var = (w10) this.c;
                byte[] bArr = (byte[]) this.d;
                s0 s0Var = (s0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v0 v0Var = this.b;
                int i7 = v0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        v0Var.w0(walletState);
                        new a1(i7, v0.C(), v0Var.y()).q(i10.i(i7).e(), bArr, s0Var, w10Var);
                        v0Var.Z();
                        break;
                    } else {
                        String str = tL_error.text;
                        if (str == null) {
                            str = "NULL_ERROR";
                        }
                        w10Var.a(str);
                        break;
                    }
                }
                break;
            default:
                oa oaVar = (oa) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                w10 w10Var2 = (w10) obj3;
                String str4 = oaVar.f;
                v0 v0Var2 = this.b;
                if (!v0.c(str4, v0Var2.y())) {
                    w10Var2.a("WALLET_CHANGED");
                    break;
                } else {
                    v0Var2.m0(user, str2, 0L, str3, null, oaVar.e, null, new a31(16, oaVar, w10Var2), null);
                    break;
                }
        }
    }

    public /* synthetic */ w(oa oaVar, v0 v0Var, TLRPC.User user, String str) {
        this.c = oaVar;
        this.b = v0Var;
        this.d = user;
        this.e = str;
    }
}
