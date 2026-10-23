package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public abstract class rl0 extends im0 {
    public boolean E(jm0 jm0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(jm0 jm0Var, float f7, int[] iArr);

    public float H(jm0 jm0Var) {
        return jm0Var.computeVerticalScrollOffset() / ((k() * jm0Var.getChildAt(0).getMeasuredHeight()) - jm0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(jm0 jm0Var) {
    }

    public void K() {
    }
}
