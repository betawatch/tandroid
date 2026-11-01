package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
