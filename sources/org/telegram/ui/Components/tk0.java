package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class tk0 extends il0 {
    public boolean E(jl0 jl0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(jl0 jl0Var, float f9, int[] iArr);

    public float H(jl0 jl0Var) {
        return jl0Var.computeVerticalScrollOffset() / ((k() * jl0Var.getChildAt(0).getMeasuredHeight()) - jl0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(jl0 jl0Var) {
    }

    public void K() {
    }
}
