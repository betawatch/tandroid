package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class gl0 extends yl0 {
    public boolean E(zl0 zl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(zl0 zl0Var, float f7, int[] iArr);

    public float H(zl0 zl0Var) {
        return zl0Var.computeVerticalScrollOffset() / ((k() * zl0Var.getChildAt(0).getMeasuredHeight()) - zl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(zl0 zl0Var) {
    }

    public void K() {
    }
}
