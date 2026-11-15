package org.telegram.ui.Cells;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a7 extends org.telegram.ui.Components.t8 {
    public final /* synthetic */ int M;
    public final /* synthetic */ FrameLayout N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(e6Var);
        this.M = i7;
        this.N = frameLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        switch (this.M) {
            case 0:
                super.invalidateSelf();
                ((c7) this.N).a.invalidate();
                break;
            default:
                super.invalidateSelf();
                ((d7) this.N).a.invalidate();
                break;
        }
    }
}
