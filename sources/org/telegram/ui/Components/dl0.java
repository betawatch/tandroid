package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class dl0 extends sl0 {
    public boolean E(tl0 tl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(tl0 tl0Var, float f10, int[] iArr);

    public float H(tl0 tl0Var) {
        return tl0Var.computeVerticalScrollOffset() / ((k() * tl0Var.getChildAt(0).getMeasuredHeight()) - tl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(tl0 tl0Var) {
    }

    public void K() {
    }
}
