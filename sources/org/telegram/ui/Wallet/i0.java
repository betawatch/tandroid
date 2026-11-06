package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
