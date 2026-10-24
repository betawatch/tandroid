package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
