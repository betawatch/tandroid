package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class bk0 extends tk0 {
    public boolean E(uk0 uk0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(uk0 uk0Var, float f7, int[] iArr);

    public float H(uk0 uk0Var) {
        return uk0Var.computeVerticalScrollOffset() / ((e() * uk0Var.getChildAt(0).getMeasuredHeight()) - uk0Var.getMeasuredHeight());
    }

    public void J(uk0 uk0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
