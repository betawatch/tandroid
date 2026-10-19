package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
