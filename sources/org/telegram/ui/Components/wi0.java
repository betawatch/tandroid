package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class wi0 extends pj0 {
    public boolean E(qj0 qj0Var) {
        return true;
    }

    public abstract String F(int i7);

    public abstract void G(qj0 qj0Var, float f10, int[] iArr);

    public float H(qj0 qj0Var) {
        return qj0Var.computeVerticalScrollOffset() / ((e() * qj0Var.getChildAt(0).getMeasuredHeight()) - qj0Var.getMeasuredHeight());
    }

    public void J(qj0 qj0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
