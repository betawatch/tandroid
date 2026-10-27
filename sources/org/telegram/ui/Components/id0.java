package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class id0 implements Runnable {
    public boolean a;
    public final /* synthetic */ nd0 b;

    public id0(nd0 nd0Var) {
        this.b = nd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        nd0 nd0Var = this.b;
        nd0Var.a(z10);
        nd0Var.postDelayed(this, nd0Var.M);
    }
}
