package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
