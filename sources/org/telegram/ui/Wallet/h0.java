package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
