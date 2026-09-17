package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
