package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
