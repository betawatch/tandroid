package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.mz0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ i(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                u0Var.E = -1;
                if (existingbalance != null) {
                    u0Var.i = Boolean.valueOf(existingbalance.has_balance);
                    u0Var.j = existingbalance.url;
                }
                Boolean bool = u0Var.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(u0Var.j)) {
                    u0Var.T();
                    break;
                }
                break;
            case 1:
                u0 u0Var2 = this.b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u0Var2.C = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    sb2.append(tL_error != null ? tL_error.text : "NULL_ERROR");
                    u0.n(sb2.toString());
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (walletState instanceof TL_wallet.TL_walletState) {
                        TL_wallet.WalletState walletState2 = u0Var2.e;
                        if ((walletState2 instanceof TL_wallet.TL_walletState) && u0Var2.l) {
                            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                            TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                            if (currentTimeMillis - u0Var2.k < 30000) {
                                tL_walletState2.balance = tL_walletState.balance;
                            } else {
                                u0Var2.l = false;
                            }
                            u0Var2.e = walletState;
                            u0Var2.V();
                            u0Var2.T();
                            break;
                        }
                    }
                    u0Var2.l = false;
                    u0Var2.e = walletState;
                    u0Var2.V();
                    u0Var2.T();
                }
                break;
            default:
                u0 u0Var3 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                u0Var3.D = -1;
                if (updates != null) {
                    Utilities.d.c(new mz0(25, u0Var3, updates));
                    break;
                } else {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    sb3.append(tL_error2 != null ? tL_error2.text : "NULL_ERROR");
                    u0.n(sb3.toString());
                    break;
                }
        }
    }
}
