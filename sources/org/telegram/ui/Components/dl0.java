package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class dl0 extends ul0 {
    public boolean E(vl0 vl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(vl0 vl0Var, float f7, int[] iArr);

    public float H(vl0 vl0Var) {
        return vl0Var.computeVerticalScrollOffset() / ((k() * vl0Var.getChildAt(0).getMeasuredHeight()) - vl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(vl0 vl0Var) {
    }

    public void K() {
    }
}
