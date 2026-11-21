package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
