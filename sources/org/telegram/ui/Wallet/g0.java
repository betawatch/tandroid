package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class g0 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public i0 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        i0 i0Var = this.b;
        if (i0Var != null) {
            i0Var.close();
        }
    }
}
