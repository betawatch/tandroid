package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class op0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ vp0 a;

    public op0(vp0 vp0Var) {
        this.a = vp0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        vp0 vp0Var = this.a;
        if (i10 == -1) {
            vp0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                vp0.U(vp0Var, null);
            }
        } else if (vp0Var.V != null) {
            vp0Var.finishFragment(false);
            vp0Var.V.b();
        }
    }
}
