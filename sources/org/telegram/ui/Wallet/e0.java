package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
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
            this.d.R(h0Var, false, new d0(this, 0));
        } finally {
            h0Var.close();
        }
    }
}
