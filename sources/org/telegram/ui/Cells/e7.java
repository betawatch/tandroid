package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class e7 extends org.telegram.ui.Components.h9 {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(g6Var);
        this.M = i10;
        this.N = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((g7) this.N).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((h7) this.N).a.invalidate();
                break;
        }
    }
}
