package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b7 extends org.telegram.ui.Components.w8 {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(f6Var);
        this.M = i7;
        this.N = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((d7) this.N).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((e7) this.N).a.invalidate();
                break;
        }
    }
}
