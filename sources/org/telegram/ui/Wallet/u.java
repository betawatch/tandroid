package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q10 b;

    public /* synthetic */ u(q10 q10Var, int i7) {
        this.a = i7;
        this.b = q10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0.n("getSecretPhrase: password request closed without a result");
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

    public /* synthetic */ u(u0 u0Var, q10 q10Var) {
        this.a = 0;
        this.b = q10Var;
    }
}
