package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class vi0 extends oj0 {
    public boolean E(pj0 pj0Var) {
        return true;
    }

    public abstract String F(int i7);

    public abstract void G(pj0 pj0Var, float f10, int[] iArr);

    public float H(pj0 pj0Var) {
        return pj0Var.computeVerticalScrollOffset() / ((e() * pj0Var.getChildAt(0).getMeasuredHeight()) - pj0Var.getMeasuredHeight());
    }

    public void J(pj0 pj0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
