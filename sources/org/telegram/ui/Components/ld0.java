package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ld0 implements Runnable {
    public boolean a;
    public final /* synthetic */ qd0 b;

    public ld0(qd0 qd0Var) {
        this.b = qd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        qd0 qd0Var = this.b;
        qd0Var.a(z10);
        qd0Var.postDelayed(this, qd0Var.M);
    }
}
