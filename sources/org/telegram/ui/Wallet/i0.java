package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
