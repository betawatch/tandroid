package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a7 extends org.telegram.ui.Components.e9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ FrameLayout E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(c6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((c7) this.E).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((d7) this.E).a.invalidate();
                break;
        }
    }
}
