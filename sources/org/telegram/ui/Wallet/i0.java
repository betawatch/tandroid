package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class i0 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public k0 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        k0 k0Var = this.b;
        if (k0Var != null) {
            k0Var.close();
        }
    }
}
