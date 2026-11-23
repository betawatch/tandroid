package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class kj0 extends dk0 {
    public boolean E(ek0 ek0Var) {
        return true;
    }

    public abstract String F(int i7);

    public abstract void G(ek0 ek0Var, float f10, int[] iArr);

    public float H(ek0 ek0Var) {
        return ek0Var.computeVerticalScrollOffset() / ((e() * ek0Var.getChildAt(0).getMeasuredHeight()) - ek0Var.getMeasuredHeight());
    }

    public void J(ek0 ek0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
