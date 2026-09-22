package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ uc0 b;

    public pc0(uc0 uc0Var) {
        this.b = uc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        uc0 uc0Var = this.b;
        uc0Var.a(z10);
        uc0Var.postDelayed(this, uc0Var.L);
    }
}
