package org.telegram.ui.Wallet;

import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s(l0 l0Var, Utilities.Callback callback, byte[] bArr, i0 i0Var) {
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
                        l0Var.i0(walletState);
                        new p0(l0.v(), l0Var.s(), i10).p(UserConfig.getInstance(i10).getClientUserId(), bArr, i0Var, callback);
                        l0Var.P();
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
                s9 s9Var = (s9) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                String str4 = s9Var.e;
                l0 l0Var2 = this.b;
                if (!l0.a(str4, l0Var2.s())) {
                    callback2.run("WALLET_CHANGED");
                    break;
                } else {
                    l0Var2.b0(user, str2, 0L, str3, null, s9Var.d, null, new w(11, s9Var, callback2), null, null);
                    break;
                }
        }
    }

    public /* synthetic */ s(s9 s9Var, l0 l0Var, TLRPC.User user, String str) {
        this.c = s9Var;
        this.b = l0Var;
        this.d = user;
        this.e = str;
    }
}
