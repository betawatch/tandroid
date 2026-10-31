package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a4 extends ph.f1 {
    public final /* synthetic */ org.telegram.ui.Cells.s0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(org.telegram.ui.Cells.s0 s0Var, org.telegram.ui.Cells.s0 s0Var2) {
        super(s0Var);
        this.D = s0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.D.invalidate();
    }
}
