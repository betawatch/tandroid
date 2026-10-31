package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u0 extends org.telegram.ui.Components.e6 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(y0 y0Var, int i10) {
        super(false, true, true);
        this.d0 = i10;
        this.e0 = y0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.d0) {
            case 0:
                ((y0) this.e0).invalidate();
                break;
            case 1:
                ((y0) this.e0).invalidate();
                break;
            default:
                ((Runnable) this.e0).run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Runnable runnable) {
        super(false, true, true, true, false);
        this.d0 = 2;
        this.e0 = runnable;
    }
}
