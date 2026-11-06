package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ g0(h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                h0 h0Var = this.b;
                n0 n0Var = h0Var.d;
                if (importedWalletProof != null) {
                    TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                    disablebackup.new_public_key = h0Var.c;
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    disablebackup.proof = walletownershipproof;
                    walletownershipproof.signature = importedWalletProof.signature;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    ConnectionsManager.getInstance(n0Var.a).sendRequestTyped(disablebackup, new d3.b(1), new g0(h0Var, 1));
                    break;
                } else {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    n0.j("disable backup: failed to prove challenge: ".concat(str));
                    break;
                }
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                n0 n0Var2 = this.b.d;
                if (walletState != null) {
                    n0Var2.l0(walletState);
                    n0Var2.R();
                    org.telegram.messenger.g0.i3(new z(1), 1000L);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    n0.j(sb2.toString());
                    break;
                }
        }
    }
}
