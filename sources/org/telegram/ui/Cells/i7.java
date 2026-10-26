package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i7 extends org.telegram.ui.Components.j9 {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7(FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(u6Var);
        this.M = i10;
        this.N = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((k7) this.N).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((l7) this.N).a.invalidate();
                break;
        }
    }
}
