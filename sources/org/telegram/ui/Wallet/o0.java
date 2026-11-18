package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class o0 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public r0 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        r0 r0Var = this.b;
        if (r0Var != null) {
            r0Var.close();
        }
    }
}
