package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class so0 extends n6 {
    public final /* synthetic */ int W = 0;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so0(Runnable runnable) {
        super(false, true, true, true);
        this.X = runnable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                ((Runnable) this.X).run();
                break;
            default:
                ((org.telegram.ui.e31) this.X).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so0(org.telegram.ui.e31 e31Var) {
        super(false, true, false, false);
        this.X = e31Var;
    }
}
