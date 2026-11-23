package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.iy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ i(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                v0Var.E = -1;
                if (existingbalance != null) {
                    v0Var.i = Boolean.valueOf(existingbalance.has_balance);
                    v0Var.j = existingbalance.url;
                }
                Boolean bool = v0Var.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(v0Var.j)) {
                    v0Var.T();
                    break;
                }
                break;
            case 1:
                v0 v0Var2 = this.b;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v0Var2.C = -1;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    sb2.append(tL_error != null ? tL_error.text : "NULL_ERROR");
                    v0.n(sb2.toString());
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (walletState instanceof TL_wallet.TL_walletState) {
                        TL_wallet.WalletState walletState2 = v0Var2.e;
                        if ((walletState2 instanceof TL_wallet.TL_walletState) && v0Var2.l) {
                            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                            TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                            if (currentTimeMillis - v0Var2.k < 30000) {
                                tL_walletState2.balance = tL_walletState.balance;
                            } else {
                                v0Var2.l = false;
                            }
                            v0Var2.e = walletState;
                            v0Var2.V();
                            v0Var2.T();
                            break;
                        }
                    }
                    v0Var2.l = false;
                    v0Var2.e = walletState;
                    v0Var2.V();
                    v0Var2.T();
                }
                break;
            default:
                v0 v0Var3 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                v0Var3.D = -1;
                if (updates != null) {
                    Utilities.d.c(new iy0(29, v0Var3, updates));
                    break;
                } else {
                    StringBuilder sb3 = new StringBuilder("requesting gasless info: ");
                    sb3.append(tL_error2 != null ? tL_error2.text : "NULL_ERROR");
                    v0.n(sb3.toString());
                    break;
                }
        }
    }
}
