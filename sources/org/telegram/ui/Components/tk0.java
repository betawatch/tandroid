package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class tk0 extends kl0 {
    public boolean E(ll0 ll0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(ll0 ll0Var, float f7, int[] iArr);

    public float H(ll0 ll0Var) {
        return ll0Var.computeVerticalScrollOffset() / ((k() * ll0Var.getChildAt(0).getMeasuredHeight()) - ll0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(ll0 ll0Var) {
    }

    public void K() {
    }
}
