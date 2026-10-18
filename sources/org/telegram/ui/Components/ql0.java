package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
