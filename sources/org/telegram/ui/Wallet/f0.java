package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f0 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public h0 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        h0 h0Var = this.b;
        if (h0Var != null) {
            h0Var.close();
        }
    }
}
