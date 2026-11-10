package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
