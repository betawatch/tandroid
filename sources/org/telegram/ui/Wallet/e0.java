package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
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
