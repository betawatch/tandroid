package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
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
