package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class ij0 extends bk0 {
    public boolean E(ck0 ck0Var) {
        return true;
    }

    public abstract String F(int i7);

    public abstract void G(ck0 ck0Var, float f10, int[] iArr);

    public float H(ck0 ck0Var) {
        return ck0Var.computeVerticalScrollOffset() / ((e() * ck0Var.getChildAt(0).getMeasuredHeight()) - ck0Var.getMeasuredHeight());
    }

    public void J(ck0 ck0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
