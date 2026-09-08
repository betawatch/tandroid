package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ vc0 b;

    public qc0(vc0 vc0Var) {
        this.b = vc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        vc0 vc0Var = this.b;
        vc0Var.a(z10);
        vc0Var.postDelayed(this, vc0Var.L);
    }
}
