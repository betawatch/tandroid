package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class bd0 implements Runnable {
    public boolean a;
    public final /* synthetic */ gd0 b;

    public bd0(gd0 gd0Var) {
        this.b = gd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        gd0 gd0Var = this.b;
        gd0Var.a(z10);
        gd0Var.postDelayed(this, gd0Var.L);
    }
}
