package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class a3 extends yh.k1 {
    public final /* synthetic */ org.telegram.ui.Cells.x0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(org.telegram.ui.Cells.x0 x0Var, org.telegram.ui.Cells.x0 x0Var2) {
        super(x0Var);
        this.y = x0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.y.invalidate();
    }
}
