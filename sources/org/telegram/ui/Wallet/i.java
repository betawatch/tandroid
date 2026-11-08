package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ i(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                m0Var.C = -1;
                if (existingbalance != null) {
                    m0Var.i = Boolean.valueOf(existingbalance.has_balance);
                    m0Var.j = existingbalance.url;
                }
                Boolean bool = m0Var.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(m0Var.j)) {
                    m0Var.L();
                    break;
                }
                break;
            case 1:
                m0 m0Var2 = this.b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                m0Var2.A = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    sb2.append(tL_error != null ? tL_error.text : "NULL_ERROR");
                    m0.j(sb2.toString());
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (walletState instanceof TL_wallet.TL_walletState) {
                        TL_wallet.WalletState walletState2 = m0Var2.e;
                        if ((walletState2 instanceof TL_wallet.TL_walletState) && m0Var2.l) {
                            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                            TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                            if (currentTimeMillis - m0Var2.k < 30000) {
                                tL_walletState2.balance = tL_walletState.balance;
                            } else {
                                m0Var2.l = false;
                            }
                            m0Var2.e = walletState;
                            m0Var2.N();
                            m0Var2.L();
                            break;
                        }
                    }
                    m0Var2.l = false;
                    m0Var2.e = walletState;
                    m0Var2.N();
                    m0Var2.L();
                }
                break;
            default:
                m0 m0Var3 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m0Var3.B = -1;
                if (updates != null) {
                    Utilities.d.c(new n(0, m0Var3, updates));
                    break;
                } else {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    sb3.append(tL_error2 != null ? tL_error2.text : "NULL_ERROR");
                    m0.j(sb3.toString());
                    break;
                }
        }
    }
}
