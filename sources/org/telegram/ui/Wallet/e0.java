package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class e0 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public g0 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        g0 g0Var = this.b;
        if (g0Var != null) {
            g0Var.close();
        }
    }
}
