package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
