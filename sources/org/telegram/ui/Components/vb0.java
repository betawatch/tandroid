package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vb0 implements Runnable {
    public boolean a;
    public final /* synthetic */ ac0 b;

    public vb0(ac0 ac0Var) {
        this.b = ac0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        ac0 ac0Var = this.b;
        ac0Var.a(z10);
        ac0Var.postDelayed(this, ac0Var.M);
    }
}
