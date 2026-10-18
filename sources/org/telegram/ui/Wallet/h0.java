package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class h0 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public j0 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        j0 j0Var = this.b;
        if (j0Var != null) {
            j0Var.close();
        }
    }
}
