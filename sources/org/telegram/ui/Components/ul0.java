package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class ul0 extends mm0 {
    public boolean E(nm0 nm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(nm0 nm0Var, float f7, int[] iArr);

    public float H(nm0 nm0Var) {
        return nm0Var.computeVerticalScrollOffset() / ((k() * nm0Var.getChildAt(0).getMeasuredHeight()) - nm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void K() {
    }

    public void J(nm0 nm0Var) {
    }
}
