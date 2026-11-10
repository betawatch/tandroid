package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b7 extends org.telegram.ui.Components.v8 {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(h6Var);
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
