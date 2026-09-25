package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class e7 extends org.telegram.ui.Components.h9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ FrameLayout E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(d6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((g7) this.E).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((h7) this.E).a.invalidate();
                break;
        }
    }
}
