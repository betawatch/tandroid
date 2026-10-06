package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
