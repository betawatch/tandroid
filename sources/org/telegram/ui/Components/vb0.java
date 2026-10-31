package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
