package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class p0 implements AutoCloseable {
    public TL_wallet.sendTransfer a;
    public s0 b;
    public byte[] c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        s0 s0Var = this.b;
        if (s0Var != null) {
            s0Var.close();
        }
    }
}
