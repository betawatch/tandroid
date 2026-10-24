package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class j3 extends yh.j1 {
    public final /* synthetic */ org.telegram.ui.Cells.v0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.Cells.v0 v0Var2) {
        super(v0Var);
        this.y = v0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.y.invalidate();
    }
}
