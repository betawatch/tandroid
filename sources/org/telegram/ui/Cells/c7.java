package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.Components.b9 {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(h6Var);
        this.M = i7;
        this.N = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((e7) this.N).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((f7) this.N).a.invalidate();
                break;
        }
    }
}
