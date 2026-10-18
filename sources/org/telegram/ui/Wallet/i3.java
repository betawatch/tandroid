package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class i3 extends yh.k1 {
    public final /* synthetic */ org.telegram.ui.Cells.w0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.Cells.w0 w0Var2) {
        super(w0Var);
        this.y = w0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.y.invalidate();
    }
}
