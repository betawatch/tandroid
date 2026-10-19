package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
