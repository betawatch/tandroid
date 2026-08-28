package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class gk0 extends vk0 {
    public boolean E(wk0 wk0Var) {
        return true;
    }

    public abstract String F(int i9);

    public abstract void G(wk0 wk0Var, float f10, int[] iArr);

    public float H(wk0 wk0Var) {
        return wk0Var.computeVerticalScrollOffset() / ((k() * wk0Var.getChildAt(0).getMeasuredHeight()) - wk0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(wk0 wk0Var) {
    }

    public void K() {
    }
}
