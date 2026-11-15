package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class aj0 extends tj0 {
    public boolean E(uj0 uj0Var) {
        return true;
    }

    public abstract String F(int i7);

    public abstract void G(uj0 uj0Var, float f10, int[] iArr);

    public float H(uj0 uj0Var) {
        return uj0Var.computeVerticalScrollOffset() / ((e() * uj0Var.getChildAt(0).getMeasuredHeight()) - uj0Var.getMeasuredHeight());
    }

    public void J(uj0 uj0Var) {
    }

    public void I() {
    }

    public void K() {
    }
}
