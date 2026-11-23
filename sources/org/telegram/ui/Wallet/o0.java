package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
