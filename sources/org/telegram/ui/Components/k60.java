package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k60 extends tj0 {
    public final /* synthetic */ o60 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(o60 o60Var, Context context) {
        super(context, null);
        this.f3 = o60Var;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.r1) {
            return;
        }
        super.requestLayout();
    }
}
