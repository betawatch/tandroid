package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class z3 extends zh.b1 {
    public final /* synthetic */ org.telegram.ui.Cells.t0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.Cells.t0 t0Var2) {
        super(t0Var);
        this.D = t0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.D.invalidate();
    }
}
