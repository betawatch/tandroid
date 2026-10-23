package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ld0 implements Runnable {
    public boolean a;
    public final /* synthetic */ qd0 b;

    public ld0(qd0 qd0Var) {
        this.b = qd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        qd0 qd0Var = this.b;
        qd0Var.a(z10);
        qd0Var.postDelayed(this, qd0Var.M);
    }
}
