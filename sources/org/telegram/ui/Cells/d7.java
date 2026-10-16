package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class d7 extends org.telegram.ui.Components.k9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ FrameLayout E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(c6Var);
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
