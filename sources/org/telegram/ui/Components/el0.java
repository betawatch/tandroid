package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
