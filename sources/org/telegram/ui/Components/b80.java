package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class b80 extends wl0 {
    public final /* synthetic */ f80 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(f80 f80Var, Context context) {
        super(context, null);
        this.X2 = f80Var;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
