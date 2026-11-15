package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class z3 extends bi.l2 {
    public final /* synthetic */ org.telegram.ui.Cells.t0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.Cells.t0 t0Var2) {
        super(t0Var);
        this.E = t0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.E.invalidate();
    }
}
