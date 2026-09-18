package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public abstract class el0 extends vl0 {
    public boolean E(wl0 wl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(wl0 wl0Var, float f7, int[] iArr);

    public float H(wl0 wl0Var) {
        return wl0Var.computeVerticalScrollOffset() / ((k() * wl0Var.getChildAt(0).getMeasuredHeight()) - wl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(wl0 wl0Var) {
    }

    public void K() {
    }
}
