package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class op0 extends q6 {
    public final /* synthetic */ int d0 = 0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(Runnable runnable) {
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
                ((org.telegram.ui.y21) this.e0).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(org.telegram.ui.y21 y21Var) {
        super(false, true, false);
        this.e0 = y21Var;
    }
}
