package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ qc0 b;

    public lc0(qc0 qc0Var) {
        this.b = qc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        qc0 qc0Var = this.b;
        qc0Var.a(z10);
        qc0Var.postDelayed(this, qc0Var.H);
    }
}
