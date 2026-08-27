package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class jk0 extends yk0 {
    public boolean E(zk0 zk0Var) {
        return true;
    }

    public abstract String F(int i10);

    public abstract void G(zk0 zk0Var, float f10, int[] iArr);

    public float H(zk0 zk0Var) {
        return zk0Var.computeVerticalScrollOffset() / ((k() * zk0Var.getChildAt(0).getMeasuredHeight()) - zk0Var.getMeasuredHeight());
    }

    public void I() {
    }

    public void J(zk0 zk0Var) {
    }

    public void K() {
    }
}
