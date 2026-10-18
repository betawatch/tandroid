package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class j3 extends yh.j1 {
    public final /* synthetic */ org.telegram.ui.Cells.w0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.Cells.w0 w0Var2) {
        super(w0Var);
        this.y = w0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.y.invalidate();
    }
}
