package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class ul0 extends lm0 {
    public boolean E(mm0 mm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(mm0 mm0Var, float f7, int[] iArr);

    public float H(mm0 mm0Var) {
        return mm0Var.computeVerticalScrollOffset() / ((k() * mm0Var.getChildAt(0).getMeasuredHeight()) - mm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(mm0 mm0Var) {
    }

    public void K() {
    }
}
