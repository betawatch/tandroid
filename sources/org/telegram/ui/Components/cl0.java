package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class cl0 extends rl0 {
    public boolean E(sl0 sl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(sl0 sl0Var, float f10, int[] iArr);

    public float H(sl0 sl0Var) {
        return sl0Var.computeVerticalScrollOffset() / ((k() * sl0Var.getChildAt(0).getMeasuredHeight()) - sl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(sl0 sl0Var) {
    }

    public void K() {
    }
}
