// default package

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b25 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;

    public /* synthetic */ b25(c cVar, byte b) {
        this.a = b;
        this.b = cVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        c cVar = this.b;
        switch (b) {
            case 0:
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                cVar.E = -1;
                if (existingbalance != null) {
                    cVar.i = Boolean.valueOf(existingbalance.has_balance);
                    cVar.j = existingbalance.url;
                }
                Boolean bool = cVar.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(cVar.j)) {
                    cVar.T();
                    break;
                }
                break;
            case 1:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                cVar.C = -1;
                if (walletState == null) {
                    StringBuilder sb = new StringBuilder("requesting gasless info: ");
                    sb.append(tL_error != null ? tL_error.text : "NULL_ERROR");
                    c.m(sb.toString());
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (walletState instanceof TL_wallet.TL_walletState) {
                        TL_wallet.WalletState walletState2 = cVar.e;
                        if ((walletState2 instanceof TL_wallet.TL_walletState) && cVar.l) {
                            TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                            TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                            if (currentTimeMillis - cVar.k < 30000) {
                                tL_walletState2.balance = tL_walletState.balance;
                            } else {
                                cVar.l = false;
                            }
                            cVar.e = walletState;
                            cVar.V();
                            cVar.T();
                            break;
                        }
                    }
                    cVar.l = false;
                    cVar.e = walletState;
                    cVar.V();
                    cVar.T();
                }
                break;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                cVar.D = -1;
                if (updates != null) {
                    Utilities.d.c(new se4(cVar, updates, (byte) 15));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    sb2.append(tL_error2 != null ? tL_error2.text : "NULL_ERROR");
                    c.m(sb2.toString());
                    break;
                }
        }
    }
}
