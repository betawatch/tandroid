package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class yl0 extends pm0 {
    public boolean E(qm0 qm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(qm0 qm0Var, float f7, int[] iArr);

    public float H(qm0 qm0Var) {
        return qm0Var.computeVerticalScrollOffset() / ((k() * qm0Var.getChildAt(0).getMeasuredHeight()) - qm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(qm0 qm0Var) {
    }

    public void K() {
    }
}
