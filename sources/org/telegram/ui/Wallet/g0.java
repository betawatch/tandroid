package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
