package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class f0 {
    public String a;
    public i0 b;
    public byte[] c;
    public final /* synthetic */ l0 d;

    public f0(l0 l0Var) {
        this.d = l0Var;
    }

    public final void a() {
        i0 i0Var = this.b;
        this.b = null;
        try {
            this.d.S(i0Var, false, new e0(this, 0));
        } finally {
            i0Var.close();
        }
    }
}
