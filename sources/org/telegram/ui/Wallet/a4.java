package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class a4 extends zh.c1 {
    public final /* synthetic */ org.telegram.ui.Cells.t0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.Cells.t0 t0Var2) {
        super(t0Var);
        this.D = t0Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.D.invalidate();
    }
}
