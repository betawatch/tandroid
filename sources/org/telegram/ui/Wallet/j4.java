package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class j4 extends bi.f3 {
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
