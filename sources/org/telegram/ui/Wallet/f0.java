package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
