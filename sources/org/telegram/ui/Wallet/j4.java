package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class j4 extends bi.j3 {
    public final /* synthetic */ org.telegram.ui.Cells.v0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.Cells.v0 v0Var2) {
        super(v0Var, 1.0f);
        this.E = v0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
