package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p10 b;

    public /* synthetic */ v(p10 p10Var, int i7) {
        this.a = i7;
        this.b = p10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0.n("getSecretPhrase: password request closed without a result");
                this.b.a(null, "WALLET_SEND_CANCELLED");
                break;
            case 1:
                this.b.a(null, "Wallet engine is closed");
                break;
            case 2:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
            case 3:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
            case 4:
                this.b.a(null, "Recovery phrase is required");
                break;
            case 5:
                this.b.a(null, "Transaction hash is required");
                break;
            case 6:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
            case 7:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
            default:
                this.b.a(null, "NO_WALLET_ENGINE");
                break;
        }
    }

    public /* synthetic */ v(v0 v0Var, p10 p10Var) {
        this.a = 0;
        this.b = p10Var;
    }
}
