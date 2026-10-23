package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
