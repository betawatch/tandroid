package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
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
