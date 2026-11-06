package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ i(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                n0Var.C = -1;
                if (existingbalance != null) {
                    n0Var.i = Boolean.valueOf(existingbalance.has_balance);
                    n0Var.j = existingbalance.url;
                }
                Boolean bool = n0Var.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(n0Var.j)) {
                    n0Var.L();
                    break;
                }
                break;
            case 1:
                n0 n0Var2 = this.b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n0Var2.A = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    sb2.append(tL_error != null ? tL_error.text : "NULL_ERROR");
                    n0.j(sb2.toString());
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (walletState instanceof TL_wallet.TL_walletState) {
                        TL_wallet.WalletState walletState2 = n0Var2.e;
                        if ((walletState2 instanceof TL_wallet.TL_walletState) && n0Var2.l) {
                            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                            TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                            if (currentTimeMillis - n0Var2.k < 30000) {
                                tL_walletState2.balance = tL_walletState.balance;
                            } else {
                                n0Var2.l = false;
                            }
                            n0Var2.e = walletState;
                            n0Var2.N();
                            n0Var2.L();
                            break;
                        }
                    }
                    n0Var2.l = false;
                    n0Var2.e = walletState;
                    n0Var2.N();
                    n0Var2.L();
                }
                break;
            default:
                n0 n0Var3 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                n0Var3.B = -1;
                if (updates != null) {
                    Utilities.d.c(new n(0, n0Var3, updates));
                    break;
                } else {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    sb3.append(tL_error2 != null ? tL_error2.text : "NULL_ERROR");
                    n0.j(sb3.toString());
                    break;
                }
        }
    }
}
