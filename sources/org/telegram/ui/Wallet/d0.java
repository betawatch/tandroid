package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ d0(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                e0 e0Var = this.b;
                k0 k0Var = e0Var.d;
                if (importedWalletProof != null) {
                    TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                    disablebackup.new_public_key = e0Var.c;
                    TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                    disablebackup.proof = walletownershipproof;
                    walletownershipproof.signature = importedWalletProof.signature;
                    walletownershipproof.timestamp = importedWalletProof.timestamp;
                    ConnectionsManager.getInstance(k0Var.a).sendRequestTyped(disablebackup, new a3.b(1), new d0(e0Var, 1));
                    break;
                } else {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    k0.j("disable backup: failed to prove challenge: ".concat(str));
                    break;
                }
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                k0 k0Var2 = this.b.d;
                if (walletState != null) {
                    k0Var2.l0(walletState);
                    k0Var2.R();
                    org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.m0(19), 1000L);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    k0.j(sb2.toString());
                    break;
                }
        }
    }
}
