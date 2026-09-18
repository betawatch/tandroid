package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class yc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ dd0 b;

    public yc0(dd0 dd0Var) {
        this.b = dd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        dd0 dd0Var = this.b;
        dd0Var.a(z10);
        dd0Var.postDelayed(this, dd0Var.L);
    }
}
