package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.t11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ i(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                k0Var.C = -1;
                if (existingbalance != null) {
                    k0Var.i = Boolean.valueOf(existingbalance.has_balance);
                    k0Var.j = existingbalance.url;
                }
                Boolean bool = k0Var.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(k0Var.j)) {
                    k0Var.L();
                    break;
                }
                break;
            case 1:
                k0 k0Var2 = this.b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0Var2.A = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    sb2.append(tL_error != null ? tL_error.text : "NULL_ERROR");
                    k0.j(sb2.toString());
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (walletState instanceof TL_wallet.TL_walletState) {
                        TL_wallet.WalletState walletState2 = k0Var2.e;
                        if ((walletState2 instanceof TL_wallet.TL_walletState) && k0Var2.l) {
                            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                            TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                            if (currentTimeMillis - k0Var2.k < 30000) {
                                tL_walletState2.balance = tL_walletState.balance;
                            } else {
                                k0Var2.l = false;
                            }
                            k0Var2.e = walletState;
                            k0Var2.N();
                            k0Var2.L();
                            break;
                        }
                    }
                    k0Var2.l = false;
                    k0Var2.e = walletState;
                    k0Var2.N();
                    k0Var2.L();
                }
                break;
            default:
                k0 k0Var3 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0Var3.B = -1;
                if (updates != null) {
                    Utilities.d.c(new t11(23, k0Var3, updates));
                    break;
                } else {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    sb3.append(tL_error2 != null ? tL_error2.text : "NULL_ERROR");
                    k0.j(sb3.toString());
                    break;
                }
        }
    }
}
