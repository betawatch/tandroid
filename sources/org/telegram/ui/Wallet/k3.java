package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class k3 extends yh.j1 {
    public final /* synthetic */ org.telegram.ui.Cells.w0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.Cells.w0 w0Var2) {
        super(w0Var);
        this.y = w0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.y.invalidate();
    }
}
