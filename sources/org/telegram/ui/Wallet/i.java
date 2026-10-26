package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.zc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ i(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                l0Var.C = -1;
                if (existingbalance != null) {
                    l0Var.i = Boolean.valueOf(existingbalance.has_balance);
                    l0Var.j = existingbalance.url;
                }
                Boolean bool = l0Var.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(l0Var.j)) {
                    l0Var.J();
                    break;
                }
                break;
            case 1:
                l0 l0Var2 = this.b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0Var2.A = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    sb2.append(tL_error != null ? tL_error.text : "NULL_ERROR");
                    l0.i(sb2.toString());
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (walletState instanceof TL_wallet.TL_walletState) {
                        TL_wallet.WalletState walletState2 = l0Var2.e;
                        if ((walletState2 instanceof TL_wallet.TL_walletState) && l0Var2.l) {
                            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                            TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                            if (currentTimeMillis - l0Var2.k < 30000) {
                                tL_walletState2.balance = tL_walletState.balance;
                            } else {
                                l0Var2.l = false;
                            }
                            l0Var2.e = walletState;
                            l0Var2.L();
                            l0Var2.J();
                            break;
                        }
                    }
                    l0Var2.l = false;
                    l0Var2.e = walletState;
                    l0Var2.L();
                    l0Var2.J();
                }
                break;
            default:
                l0 l0Var3 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l0Var3.B = -1;
                if (updates != null) {
                    Utilities.stageQueue.postRunnable(new zc1(13, l0Var3, updates));
                    break;
                } else {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    sb3.append(tL_error2 != null ? tL_error2.text : "NULL_ERROR");
                    l0.i(sb3.toString());
                    break;
                }
        }
    }
}
