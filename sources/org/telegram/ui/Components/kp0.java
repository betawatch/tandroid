package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
