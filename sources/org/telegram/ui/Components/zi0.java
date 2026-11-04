package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class zi0 extends sj0 {
    public boolean E(tj0 tj0Var) {
        return true;
    }

    public abstract String F(int i3);

    public abstract void G(tj0 tj0Var, float f10, int[] iArr);

    public float H(tj0 tj0Var) {
        return tj0Var.computeVerticalScrollOffset() / ((e() * tj0Var.getChildAt(0).getMeasuredHeight()) - tj0Var.getMeasuredHeight());
    }

    public void J(tj0 tj0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
