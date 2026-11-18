package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class j4 extends bi.f3 {
    public final /* synthetic */ org.telegram.ui.Cells.u0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(org.telegram.ui.Cells.u0 u0Var, org.telegram.ui.Cells.u0 u0Var2) {
        super(u0Var, 1.0f);
        this.E = u0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
