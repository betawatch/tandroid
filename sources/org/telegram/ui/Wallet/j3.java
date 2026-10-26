package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j3 extends zh.j1 {
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
