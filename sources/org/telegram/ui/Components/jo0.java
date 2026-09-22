package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jo0 extends m6 {
    public final /* synthetic */ int W = 0;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo0(Runnable runnable) {
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
                ((org.telegram.ui.z21) this.X).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo0(org.telegram.ui.z21 z21Var) {
        super(false, true, false, false);
        this.X = z21Var;
    }
}
