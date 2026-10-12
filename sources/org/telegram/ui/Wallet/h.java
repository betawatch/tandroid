package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.je1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ h(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                j0Var.y = -1;
                if (existingbalance != null) {
                    j0Var.i = Boolean.valueOf(existingbalance.has_balance);
                    j0Var.j = existingbalance.url;
                }
                Boolean bool = j0Var.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(j0Var.j)) {
                    j0Var.I();
                    break;
                }
                break;
            case 1:
                j0 j0Var2 = this.b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                j0Var2.w = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    sb2.append(tL_error != null ? tL_error.text : "NULL_ERROR");
                    j0.i(sb2.toString());
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (walletState instanceof TL_wallet.TL_walletState) {
                        TL_wallet.WalletState walletState2 = j0Var2.e;
                        if ((walletState2 instanceof TL_wallet.TL_walletState) && j0Var2.l) {
                            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                            TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                            if (currentTimeMillis - j0Var2.k < 30000) {
                                tL_walletState2.balance = tL_walletState.balance;
                            } else {
                                j0Var2.l = false;
                            }
                            j0Var2.e = walletState;
                            j0Var2.K();
                            j0Var2.I();
                            break;
                        }
                    }
                    j0Var2.l = false;
                    j0Var2.e = walletState;
                    j0Var2.K();
                    j0Var2.I();
                }
                break;
            default:
                j0 j0Var3 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                j0Var3.x = -1;
                if (updates != null) {
                    Utilities.stageQueue.postRunnable(new je1(12, j0Var3, updates));
                    break;
                } else {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    sb3.append(tL_error2 != null ? tL_error2.text : "NULL_ERROR");
                    j0.i(sb3.toString());
                    break;
                }
        }
    }
}
