package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.Components.i9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ FrameLayout E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(f6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((f7) this.E).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((g7) this.E).a.invalidate();
                break;
        }
    }
}
