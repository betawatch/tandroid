package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h3 extends yh.k1 {
    public final /* synthetic */ org.telegram.ui.Cells.x0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(org.telegram.ui.Cells.x0 x0Var, org.telegram.ui.Cells.x0 x0Var2) {
        super(x0Var);
        this.y = x0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.y.invalidate();
    }
}
