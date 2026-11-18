package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
