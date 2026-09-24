package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class wo0 extends o6 {
    public final /* synthetic */ int W = 0;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(Runnable runnable) {
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
                ((org.telegram.ui.q21) this.X).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(org.telegram.ui.q21 q21Var) {
        super(false, true, false, false);
        this.X = q21Var;
    }
}
