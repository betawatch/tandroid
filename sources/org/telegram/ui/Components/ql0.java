package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class ql0 extends hm0 {
    public boolean E(im0 im0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(im0 im0Var, float f7, int[] iArr);

    public float H(im0 im0Var) {
        return im0Var.computeVerticalScrollOffset() / ((k() * im0Var.getChildAt(0).getMeasuredHeight()) - im0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(im0 im0Var) {
    }

    public void K() {
    }
}
