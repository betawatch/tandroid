package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
