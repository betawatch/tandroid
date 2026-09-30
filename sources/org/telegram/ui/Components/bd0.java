package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
