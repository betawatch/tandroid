package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class f80 extends yl0 {
    public final /* synthetic */ j80 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(j80 j80Var, Context context) {
        super(context, null);
        this.X2 = j80Var;
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
