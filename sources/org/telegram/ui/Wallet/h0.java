package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class h0 {
    public String a;
    public k0 b;
    public byte[] c;
    public final /* synthetic */ n0 d;

    public h0(n0 n0Var) {
        this.d = n0Var;
    }

    public final void a() {
        k0 k0Var = this.b;
        this.b = null;
        try {
            this.d.U(k0Var, false, new g0(this, 0));
        } finally {
            k0Var.close();
        }
    }
}
