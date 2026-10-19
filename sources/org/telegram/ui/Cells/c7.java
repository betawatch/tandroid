package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.Components.h9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ FrameLayout E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(d6Var);
        this.D = i10;
        this.E = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.D) {
            case 0:
                super.invalidateSelf();
                ((e7) this.E).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((f7) this.E).a.invalidate();
                break;
        }
    }
}
