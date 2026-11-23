package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class k4 extends bi.l3 {
    public final /* synthetic */ org.telegram.ui.Cells.v0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.Cells.v0 v0Var2) {
        super(v0Var, 1.0f);
        this.E = v0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
