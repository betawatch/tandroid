package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class aj0 extends tj0 {
    public boolean E(uj0 uj0Var) {
        return true;
    }

    public abstract String F(int i7);

    public abstract void G(uj0 uj0Var, float f10, int[] iArr);

    public float H(uj0 uj0Var) {
        return uj0Var.computeVerticalScrollOffset() / ((e() * uj0Var.getChildAt(0).getMeasuredHeight()) - uj0Var.getMeasuredHeight());
    }

    public void J(uj0 uj0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
