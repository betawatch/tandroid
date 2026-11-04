package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a7 extends org.telegram.ui.Components.u8 {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(e6Var);
        this.M = i3;
        this.N = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((c7) this.N).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((d7) this.N).a.invalidate();
                break;
        }
    }
}
