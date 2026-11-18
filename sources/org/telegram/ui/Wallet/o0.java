package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
