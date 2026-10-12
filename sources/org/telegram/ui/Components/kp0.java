package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kp0 extends r6 {
    public final /* synthetic */ int d0 = 0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(Runnable runnable) {
        super(false, true, true, true, false);
        this.e0 = runnable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.d0) {
            case 0:
                ((Runnable) this.e0).run();
                break;
            default:
                ((org.telegram.ui.g31) this.e0).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(org.telegram.ui.g31 g31Var) {
        super(false, true, false);
        this.e0 = g31Var;
    }
}
