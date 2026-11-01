package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e0 {
    public String a;
    public h0 b;
    public byte[] c;
    public final /* synthetic */ k0 d;

    public e0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a() {
        h0 h0Var = this.b;
        this.b = null;
        try {
            this.d.U(h0Var, false, new d0(this, 0));
        } finally {
            h0Var.close();
        }
    }
}
