package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class uk0 extends ll0 {
    public boolean E(ml0 ml0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(ml0 ml0Var, float f7, int[] iArr);

    public float H(ml0 ml0Var) {
        return ml0Var.computeVerticalScrollOffset() / ((k() * ml0Var.getChildAt(0).getMeasuredHeight()) - ml0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(ml0 ml0Var) {
    }

    public void K() {
    }
}
