package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b7 extends org.telegram.ui.Components.b9 {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(i6Var);
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
