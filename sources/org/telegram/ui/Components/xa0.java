package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xa0 implements Runnable {
    public boolean a;
    public final /* synthetic */ cb0 b;

    public xa0(cb0 cb0Var) {
        this.b = cb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        cb0 cb0Var = this.b;
        cb0Var.a(z10);
        cb0Var.postDelayed(this, cb0Var.N);
    }
}
