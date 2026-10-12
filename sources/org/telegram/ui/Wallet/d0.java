package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class d0 {
    public String a;
    public g0 b;
    public byte[] c;
    public final /* synthetic */ j0 d;

    public d0(j0 j0Var) {
        this.d = j0Var;
    }

    public final void a() {
        g0 g0Var = this.b;
        this.b = null;
        try {
            this.d.R(g0Var, false, new c0(this, 0));
        } finally {
            g0Var.close();
        }
    }
}
