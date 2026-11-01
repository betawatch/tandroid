package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f7 extends org.telegram.ui.Components.r8 {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7(FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(p6Var);
        this.M = i10;
        this.N = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((h7) this.N).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((i7) this.N).a.invalidate();
                break;
        }
    }
}
