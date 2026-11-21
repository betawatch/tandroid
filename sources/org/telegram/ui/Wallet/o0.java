package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
