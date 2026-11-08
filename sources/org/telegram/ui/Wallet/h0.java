package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
