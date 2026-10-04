package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
