package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
