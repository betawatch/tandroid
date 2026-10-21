package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public abstract class rl0 extends im0 {
    public boolean E(jm0 jm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(jm0 jm0Var, float f7, int[] iArr);

    public float H(jm0 jm0Var) {
        return jm0Var.computeVerticalScrollOffset() / ((k() * jm0Var.getChildAt(0).getMeasuredHeight()) - jm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(jm0 jm0Var) {
    }

    public void K() {
    }
}
