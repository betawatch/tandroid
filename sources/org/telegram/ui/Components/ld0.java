package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
