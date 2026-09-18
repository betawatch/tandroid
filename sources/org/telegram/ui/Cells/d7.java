package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.Components.f9 {
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
