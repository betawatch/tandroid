package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
