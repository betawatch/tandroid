package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class tk0 extends kl0 {
    public boolean E(ll0 ll0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(ll0 ll0Var, float f7, int[] iArr);

    public float H(ll0 ll0Var) {
        return ll0Var.computeVerticalScrollOffset() / ((k() * ll0Var.getChildAt(0).getMeasuredHeight()) - ll0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(ll0 ll0Var) {
    }

    public void K() {
    }
}
