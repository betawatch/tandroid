package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Utilities.Callback3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t(l0 l0Var, Utilities.Callback callback, byte[] bArr, i0 i0Var) {
        this.b = l0Var;
        this.c = callback;
        this.d = bArr;
        this.e = i0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                byte[] bArr = (byte[]) this.d;
                i0 i0Var = (i0) this.e;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0 l0Var = this.b;
                int i10 = l0Var.a;
                if (tL_error == null || !"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    if (tL_error == null) {
                        l0Var.l0(walletState);
                        new p0(l0.w(), l0Var.t(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, i0Var, callback);
                        l0Var.R();
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
                r9 r9Var = (r9) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = r9Var.f;
                l0 l0Var2 = this.b;
                if (!l0.b(str4, l0Var2.t())) {
                    callback2.run("WALLET_CHANGED");
                    break;
                } else {
                    l0Var2.d0(user, str2, 0L, str3, null, r9Var.e, null, new s(13, r9Var, callback2), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ t(r9 r9Var, l0 l0Var, TLRPC.User user, String str) {
        this.c = r9Var;
        this.b = l0Var;
        this.d = user;
        this.e = str;
    }
}
